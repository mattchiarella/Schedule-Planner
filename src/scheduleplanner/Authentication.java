/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import java.util.ArrayList;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.PasswordAuthentication;
import java.util.List;
import javax.swing.JTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Matthew_PC
 */

public class Authentication{

    static ArrayList<WebElement> rows;
    static ArrayList<course> transcript = new ArrayList();
    static ArrayList<course> transcript2;
    public static JTable tran;
    public static void main(String[] args) {
        //Starting Chrome Driver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //Chrome Driver options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        //Start Webdriver as a headless Chrome Driver
        WebDriver driver = new ChromeDriver(options);
        String baseUrl = "https://webadvisor.barry.edu:443/WebAdvisor/WebAdvisor";
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        //Login Dialog Call and Setting to visible
        LoginDialog lf = new LoginDialog(null,true);
        lf.setVisible(true);
    //                String uname = "";
    //                String pword = "";                
        String uname = LoginDialog.username;
        String pword = LoginDialog.password;
        //Wait for the Webdriver to complete login (without this the program will "step over" this step)
        WebDriverWait wait = new WebDriverWait(driver, 30);// 1 minute 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("acctLogin")));
        WebElement lgn = driver.findElement(By.id("acctLogin"));
        lgn.click();
        //Automating the clicks by finding elements
        WebElement username = driver.findElement(By.id("USER_NAME"));
        username.sendKeys(uname);
        WebElement pass = driver.findElement(By.id("CURR_PWD"));
        pass.sendKeys(pword);
        WebElement submit = driver.findElement(By.name("SUBMIT2"));
        submit.click();
        WebElement flist = driver.findElement(By.className("WBST_Bars"));
        flist.click();
        WebElement alist = driver.findElement(By.xpath("//*[@id=\"bodyForm\"]/div[3]/div[2]/ul[2]/li[3]/a"));
        alist.click();
        WebElement semSubmit = driver.findElement(By.name("SUBMIT2"));
        semSubmit.click();


        rows = (ArrayList)driver.findElements(By.xpath("//*[starts-with(@id,'LIST_VAR1')]"));

        WebElement table = driver.findElement(By.xpath("//*[@id=\"bodyForm\"]/div[4]/form/table/tbody/tr[1]/td/div/table/tbody"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row:rows)
        {
            //Searching through the webadvisor table
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.isEmpty()) continue;
            String prefix="", number="", section="", title="", grade="", credits = "", term="";
            String compound = "";
            int dashIndex = 0, fSpace = 0, sSpace = 0; boolean skip = false;
            for (int i=1;i<cells.size();i++) 
            {
                //System.out.println("i="+i);

                switch(i)
                {
                    case 1: 
                        compound = cells.get(i).getText(); 

                        if (compound.isEmpty()) continue;

                        dashIndex = compound.indexOf('-');
                        if(dashIndex == -1)
                        {
                            dashIndex = 0;
                            skip = true;
                            continue;
                        }
                        prefix = compound.substring(0,dashIndex);
                        if(prefix.isEmpty())
                        {
                            skip = true;
                            continue;
                        }
                        fSpace = compound.indexOf(' ');
                        number = compound.substring(dashIndex+1,fSpace);
                        sSpace = compound.indexOf(' ', fSpace+1);
                        section = compound.substring(fSpace+1, sSpace);
                        title = compound.substring(sSpace+1);

                        break;
                    case 2: grade = cells.get(i).getText(); break;
                    case 3: credits = cells.get(i).getText();break;
                    case 6: term = cells.get(i).getText(); break;
                    default: break;
                }
            }
            if(!skip)
            {
                if (term.isEmpty())
                    if (title.isEmpty())//one-word title
                        transcript.add(new course(prefix,number,"",section,"",grade,"TR"));
                    else//multi-word title
                        transcript.add(new course(prefix,number,"",section+" "+title,"",credits,"TR"));
                else
                    transcript.add(new course(prefix,number,section,title,grade,credits,term));
            }  
        }
        //Removes the unwanted invalid Course that is added to the transcript
        transcript.remove(0);

        System.out.println("Number of classes on transcript: " + transcript.size() + "\n");

        String[][] transcriptData = new String[transcript.size()][6];
        for (int i=0;i<transcript.size();i++)
        {
            transcript.get(i).print();
            transcriptData[i][0] = transcript.get(i).term;
            transcriptData[i][1] = transcript.get(i).prefix;
            transcriptData[i][2] = transcript.get(i).number;
            transcriptData[i][3] = transcript.get(i).title;
            transcriptData[i][4] = transcript.get(i).credits;
            transcriptData[i][5] = transcript.get(i).grade;
            System.out.println();
        }
        //Setting and Starting Main Window
        MainWindow window = new MainWindow();
        //sending the transcript data to MainWindow
        window.tran.setModel(new javax.swing.table.DefaultTableModel(transcriptData, window.columnNames));
        driver.quit();
        window.setVisible(true);
    }
    
    //Creates Transcript course object
    public static class course {
        public String prefix, number, section, title, grade, credits, term;
        public course(String pref, String num, String sect, String ttl, 
                String crd, String gp, String trm)
        {
            prefix = pref;
            number = num;
            section = sect;
            title = ttl;
            grade = crd;
            credits = gp;
            term = trm;
        }
        public course(String pref, String num)
        {
            prefix = pref; number = num;
        }
        public String prefixNum(){
            return prefix + number;
        }
        public void print()
        {
            System.out.print("prefix = " + prefix + " number = " + number + " section = " + section + 
                    " title = " + title + " grade = " + grade + " credits = " + credits + " term = " + term);
        }
        public String printString()
        {
            return "prefix = " + prefix + " number = " + number + " section = " + section + 
                    " title = " + title + " grade = " + grade + " credits = " + credits + " term = " + term;
        }
    }
}
