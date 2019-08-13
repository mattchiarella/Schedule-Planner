/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import java.util.ArrayList;
import scheduleplanner.Authentication.course;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblLayoutType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblLayoutType;

/**
 *
 * @author Matthew_PC
 */

public class Operations {
    
        //Credits for Major Completion
    static double totalCreditsA = 120;
    static double totalCreditsB = 120;
    
        //Checks if the course requirement has the transcript prefix and number then removes the matching element from the Requirement ArrayList
    public boolean containsCourseRemove(ArrayList<course> requirement, String prefix, String num)
    {
        boolean con = false;
        for (int i=0;i<requirement.size();i++)
        {
            if ((requirement.get(i).prefix.equals(prefix))&&(requirement.get(i).number.equals(num)))
            {
                requirement.remove(i);
                con = true;
                break;
            }
        }
        return con;
    }
    
        //Checks if the course requirement has the transcript prefix and number then aggrigates the matching element 
        //from the Requirement ArrayList to a temporary ArrayList then returns a boolean when true
    public boolean containsCourseAggrigate(ArrayList<course> requirement, String prefix, String num, ArrayList<course> temporary)
    {
        boolean con = false;
        for (int i=0;i<requirement.size();i++)
        {
            if ((requirement.get(i).prefix.equals(prefix))&&(requirement.get(i).number.equals(num)))
            {   
                temporary.add(requirement.get(i));
                con = true;
                break;
            }
        }
        return con;
    }
    
        //Prints any ArrayList to a JTextArea
    public void printList(ArrayList<course> a, JTextArea txtA)
    {
        for (int i=0;i<a.size();i++){
            String prefix = a.get(i).prefix;
            String number = a.get(i).number;
            String title = a.get(i).title;
            txtA.append(prefix + " " + number + " " + title + "\n");
        }
    }
    
        //Prints the matching course of an the Transcript and Requirement ArrayList to a JLabel
        //If the Transcript and Requirements ArrayLists match the course credit is tallied
        //If the tallied credits meets or exceeds the credit requirement the Jlabel is highlighed and marked as completed
    public ArrayList<course> courseTaken(JLabel label, double f, ArrayList<course> requirement, ArrayList<course> transcript)
    {
        ArrayList<course> temp = new ArrayList<course>();
        double h = f;
        for(int j=0;j<transcript.size();j++){
            String prefix = transcript.get(j).prefix;
            String number = transcript.get(j).number;
            String grade = transcript.get(j).grade;
            String credit = transcript.get(j).credits;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'D')) continue;//non-passing grade for minor
            if ((containsCourseAggrigate(requirement, prefix, number, temp)))
            {
                if (!credit.isEmpty()){ 
                    h = h - Double.parseDouble(credit);
                    totalCreditsA = totalCreditsA - Double.parseDouble(credit);
                }
                if (h <= 0){
                    label.setOpaque(true);
                    label.setBackground(Color.yellow);
                    label.setText(label.getText()+" **Completed**");
                    return temp;
                }
            }
        }
        label.setText(label.getText() + " " + h + " Credits left");
        return temp;
    }
    
        //Eliminates the matching Transcript and Requirement from the Requirements ArrayList
        //If the tallied credits meets or exceeds the credit requirement the Jlabel is highlighed and marked as completed
    public void courseElim(JLabel a, double f, ArrayList<course> requirement, ArrayList<course> transcript)
    {
        double h = f;
        for(int j=transcript.size()-1;j>=0;j--){
            String prefix = transcript.get(j).prefix;
            String number = transcript.get(j).number;
            String grade = transcript.get(j).grade;
            String credit = transcript.get(j).credits;
            if ((!grade.isEmpty())&&(grade.charAt(0)>'D')) continue;//non-passing grade for minor
            if ((containsCourseRemove(requirement, prefix, number)))
            {
                System.out.println(transcript.size());
                if (!credit.isEmpty()){ 
                    h = h - Double.parseDouble(credit);
                    totalCreditsB = totalCreditsB - Double.parseDouble(credit);
                    transcript.remove(j);
                }
                if (h <= 0){
                    a.setOpaque(true);
                    a.setBackground(Color.yellow);
                    a.setText(a.getText()+" **Completed**");
                    requirement.clear();
                    h = h - Double.parseDouble(credit);
                    return;
                }
            }
        }
        a.setText(a.getText() + " " + h + " Credits left");
    }
    
    
        //Formatting of the Word Document Table height and width(If you mess with this get ready for a hastle)
    public void setTableColumnWidths(XWPFTable table) {
        
    CTTblLayoutType type = table.getCTTbl().getTblPr().addNewTblLayout();
    type.setType(STTblLayoutType.FIXED);
    table.getCTTbl().addNewTblGrid().addNewGridCol().setW(BigInteger.valueOf(650));
    table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(600));
    table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(800));
    table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(800));
    table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(4000));
    table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(600));
    table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(700));
    table.getCTTbl().getTblGrid().addNewGridCol().setW(BigInteger.valueOf(900));
}
    
        //Creates an Audit Document exported to a Word Document (Do not mess with if you do not have a few hours)
    public void createDocumentAudit(String s, ArrayList<course> requirement, ArrayList<course> transcript, XWPFDocument doc) throws FileNotFoundException, IOException{
        //creates the document
        XWPFParagraph lol = doc.createParagraph();
        XWPFRun run = lol.createRun();
        run.setText(s);
        ArrayList<course> temp = requirement;
        //creates table
        XWPFTable table = doc.createTable();
        //Creates a ROW
        XWPFTableRow row = table.getRow(0);
        //row.getCell(0).setText(""); sets the original COLUMN in the ROW(Strange naming convention, I know)
        row.getCell(0).setText("Term");
        //row.addNewTableCell().setText(""); Aggrigates another COLUMN to the ROW
        row.addNewTableCell().setText("Prefix");
        row.addNewTableCell().setText("Number");
        row.addNewTableCell().setText("Section");
        row.addNewTableCell().setText("Title");
        row.addNewTableCell().setText("Grade");
        row.addNewTableCell().setText("Credits");
        row.addNewTableCell().setText("Status");
        //Call of the Table format method above
        setTableColumnWidths(table);
        
        //for loop iterates through the Transcript ArrayList 
        for(int j=transcript.size()-1;j>=0;j--){
            String term = transcript.get(j).term;
                String prefix = transcript.get(j).prefix;
                String number = transcript.get(j).number;
                String section = transcript.get(j).section;
                String grade = transcript.get(j).grade;
                String credit = transcript.get(j).credits;
                String title = transcript.get(j).title;
                String registered = "Registered";
        //If there is a match, remove the match from Requiremtent ArrayList and 
        //add the Transcript course in the removed element's place
            if(containsCourseRemove(requirement, prefix, number)){
                requirement.add(transcript.get(j));
            }
        }
        for(int i=requirement.size()-1;i>=0;i--){
            row = table.createRow();
            row.getCell(0).setText(requirement.get(i).term);
            row.getCell(1).setText(requirement.get(i).prefix);
            row.getCell(2).setText(requirement.get(i).number);
            row.getCell(3).setText(requirement.get(i).section);
            row.getCell(4).setText(requirement.get(i).title);
            row.getCell(5).setText(requirement.get(i).grade);
            row.getCell(6).setText(requirement.get(i).credits);
            //Bunch of If statements that check if you are currently taking a class, passed a class, or Failed a class (Dun Dun Dun)
            if(!requirement.get(i).term.isEmpty() && requirement.get(i).grade.isEmpty()){
            row.getCell(7).setText("Active");
            }
            else if(!requirement.get(i).grade.isEmpty()&& (requirement.get(i).grade.charAt(0)<'D')){
            row.getCell(7).setText("Passed");
            }
            else if(requirement.get(i).term.isEmpty()){
                row.getCell(7).setText("Open");
            }
            else{
                row.getCell(7).setText("Failed");
            }
        }
    }
}
