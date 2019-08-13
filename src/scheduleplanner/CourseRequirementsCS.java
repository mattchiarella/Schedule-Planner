/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import scheduleplanner.Authentication.course;
import java.util.ArrayList;

/**
 *
 * @author Matthew_PC
 */
public final class CourseRequirementsCS extends javax.swing.JPanel{
static ArrayList<course> core, mathMinor, csElectives, singleClassElectives, 
            languagesElectives, theoElectives, philoElectives, 
            humElectives, fineArtsElectives, scienceElectives;

    //Calls the Operations Class
    Operations op = new Operations();
    
    /*Every CreateWhatever class creates Requirement ArrayLists of the corresponding subsection*/
    public static ArrayList<course> createSingleClassElectives()
    {
        ArrayList<course> c = new ArrayList<course>();

        c.add(new course("SPE", "101", "","FUNDAMENTALS OF SPEECH","","3","" ));
        c.add(new course("COM", "104", "","INTERPERSONAL COMMUNICATION","","3","" ));
        c.add(new course("ENG", "111", "","FIRST YEAR COMP/LIT","","3","" ));
        c.add(new course("ENG", "112", "","TECHNIQUES OF RESEARCH","","3","" ));
        c.add(new course("ENG", "199", "","HONORS SPECIAL TOPICS","","3","" ));
        c.add(new course("ENG", "210", "","WRITING ABOUT LITERATURE","","3","" ));
        c.add(new course("HIS", "150", "","THE MEANING OF HISTORY","","3","" ));
        c.add(new course("SOC", "200", "","PRSPTV CNSCNS & SOC JSTC","","3","" ));
        c.add(new course("PSY", "281", "","INTRO TO PSYCHOLOGY","","3","" ));
        c.add(new course("POS", "201", "","AMERICAN GOVERNMENT","","3","" ));
        c.add(new course("THE", "201", "","THEOLOGY: FAITH, BELIEFS AND TRADITIONS","","3","" ));
        c.add(new course("THE", "191", "","JUDEO-CHRISTIAN DOCTRINE","","3","" ));
        c.add(new course("PHI", "220", "","INTRO TO PHILOSOPHY","","3","" ));
        c.add(new course("PHI", "191", "","JUDEO-CHRISTIAN DOCTRINE","","3","" ));
        return c;
    }
    //creates language electives
    public static ArrayList<course> createLanguagesElectives()
    {
        ArrayList<course> c = new ArrayList<course>();

        c.add(new course("FRE", "101", "","Elementary French I","","3","" ));
        c.add(new course("FRE", "102", "","Elementary French II","","3","" ));
        c.add(new course("FRE", "203", "","Intermediate French I","","3","" ));
        c.add(new course("FRE", "204", "","Intermediate French II","","3","" ));
        c.add(new course("FRE", "250", "","Conversation and Composition","","3","" ));
        c.add(new course("SPA", "101", "","Elementary Spanish I","","3","" ));
        c.add(new course("SPA", "102", "","Elementary Spanish II","","3","" ));
        c.add(new course("SPA", "203", "","Intermediate Spanish I","","3","" ));
        c.add(new course("SPA", "204", "","Intermediate Spanish II","","3","" ));
        return c;
    }
    public static ArrayList<course> createTheoElectives()
    {
        ArrayList<course> c = new ArrayList<course>();
        c.add(new course("THE", "303", "","COMPARATIVE RELIGION","","3","" ));
        c.add(new course("THE", "304", "","THEOLOGY THROUGH FILM","","3","" ));
        c.add(new course("THE", "306", "","DYNAMICS OF FAITH, BELIEFS, AND THEOLOGY","","3","" ));
        c.add(new course("THE", "307", "","CHRISTOLOGY","","3","" ));
        c.add(new course("THE", "308", "","GOD AND SUFFERING IN THE JEWISH AND CHRISTIAN TRADITIONS","","3","" ));
        c.add(new course("THE", "309", "","THE OLD TESTAMENT AND ITS INTERPRETERS","","3","" ));
        c.add(new course("THE", "311", "","SEXUALITY, SEX, AND MORALITY","","3","" ));
        c.add(new course("THE", "312", "","FREEDOM AND VIRTUE","","3","" ));
        c.add(new course("THE", "314", "","JEWISH CIVILIZATION AND PRACTICE","","3","" ));
        c.add(new course("THE", "315", "","CHRISTIAN SPIRITUALITY AND PRAYER","","3","" ));
        c.add(new course("THE", "321", "","THE NEW TESTAMENT AS CHRISTIAN SCRIPTURE","","3","" ));
        c.add(new course("THE", "323", "","THEOLOGY AND SCIENCE: A CONTEMPORARY DIALOGUE","","3","" ));
        c.add(new course("THE", "325", "","FEMINIST PERSPECTIVES IN ETHICS","","3","" ));
        c.add(new course("THE", "327", "","PEACE AND JUSTICE","","3","" ));
        c.add(new course("THE", "331", "","CHRISTIANITY AND CULTURE","","3","" ));
        c.add(new course("THE", "333", "","CHRISTIAN UNDERSTANDING OF GOD","","3","" ));
        c.add(new course("THE", "334", "","HISTORY OF CHRISTIANITY I","","3","" ));
        c.add(new course("THE", "335", "","HISTORY OF CHRISTIANITY II","","3","" ));
        c.add(new course("THE", "338", "","THE CHURCH","","3","" ));
        c.add(new course("THE", "344", "","SACRAMENTS","","3","" ));
        c.add(new course("THE", "353", "","BIOETHICS","","3","" ));
        c.add(new course("THE", "360", "","Women IN THE CHURCH","","3","" ));
        c.add(new course("THE", "362", "","WOMEN IN THE NEW TESTAMENT","","3","" ));
        c.add(new course("THE", "365", "","CREATION AND APOCALYPSE","","3","" ));
        c.add(new course("THE", "372", "","MARRIAGE AND THE FAMILY","","3","" ));
        return c;
    }
    public static ArrayList<course> createPhiloElectives()
    {
        ArrayList<course> c = new ArrayList<course>();
        c.add(new course("PHI", "302", "","SPANISH AND HISPANIC-AMERICAN PHILOSOPHERS","","3","" ));
        c.add(new course("PHI", "306", "","PHILOSOPHY OF GOD AND RELIGION","","3","" ));
        c.add(new course("PHI", "308", "","PHILOSOPHY OF LAW","","3","" ));
        c.add(new course("PHI", "310", "","FORMAL LOGIC","","3","" ));
        c.add(new course("PHI", "313", "","PHILOSOPHY OF ART-AESTHETICS","","3","" ));
        c.add(new course("PHI", "316", "","ANCIENT PHILOSOPHY","","3","" ));
        c.add(new course("PHI", "317", "","MEDIEVAL PHILOSOPHY","","3","" ));
        c.add(new course("PHI", "318", "","MODERN PHILOSOPHY","","3","" ));
        c.add(new course("PHI", "320", "","AMERICAN PHILOSOPHERS","","3","" ));
        c.add(new course("PHI", "323", "","PHILOSOPHICAL PERSPECTIVES ON CINEMA","","3","" ));
        c.add(new course("PHI", "350", "","FAMILY ETHICS","","3","" ));
        c.add(new course("PHI", "353", "","BIO-MEDICAL ETHICS","","3","" ));
        c.add(new course("PHI", "354", "","ENVIRONMENTAL ETHICS","","3","" ));
        c.add(new course("PHI", "355", "","PHILOSOPHY OF POLITICS","","3","" ));
        c.add(new course("PHI", "360", "","ASIAN PHILOSOPHY","","3","" ));
        return c;
    }
    public static ArrayList<course> createHumLitElectives()
    {
        ArrayList<course> c = new ArrayList<course>();
        c.add(new course("HUM", "396", "", "Cultural Studies Special Topics", "", "3", ""));
        c.add(new course("HUM", "397", "", "Ethnic Studies Special Topics", "", "3", ""));
        c.add(new course("HUM", "398", "", "Gender Studies Special Topics", "", "3", ""));
        c.add(new course("HUM", "399", "", "Genre Studies Special Topics", "", "3", ""));
        c.add(new course("ENG", "315", "", "The Novel", "", "3", ""));
        c.add(new course("ENG", "316", "", "World Literacy Masterpieces", "", "3", ""));
        c.add(new course("ENG", "336", "", "Latino/a Literature", "", "3", ""));
        c.add(new course("ENG", "340", "", "Women and Literature", "", "3", ""));
        c.add(new course("ENG", "348", "", "Caribbean Literature", "", "3", ""));
        c.add(new course("ENG", "419", "", "Literature and Film", "", "3", ""));
        c.add(new course("ENG", "429", "", "English Studies", "", "3", ""));
        c.add(new course("FRE", "379", "", "Culture and Civilization", "", "3", ""));
        c.add(new course("FRE", "380", "", "Contemporary Culture and Civilization", "", "3", ""));
        c.add(new course("SPA", "333", "", "Spanish Culture", "", "3", ""));
        c.add(new course("SPA", "335", "", "Hispanic American Culture", "", "3", ""));
        c.add(new course("SPA", "447", "", "Contemporary Hispanic American Fiction", "", "3", ""));
        return c;
    }
    
    public static ArrayList<course> createFineArtsElectives()
    {
        ArrayList<course> c = new ArrayList<course>();
        c.add(new course("ART", "101A", "", "BASIC DRAWING", "", "3", ""));
        c.add(new course("ART", "114", "", "ART APPRECIATION", "", "3", ""));
        c.add(new course("ART", "141", "", "BASIC HANDBUILDING", "", "3", ""));
        c.add(new course("ART", "205", "", "GRAPHIC DESIGN METHODS AND MATERIALS", "", "3", ""));
        c.add(new course("ART", "241", "", "BASIC POTTER'S WHEEL", "", "3", ""));
        c.add(new course("ART", "260", "", "BASIC PAINTING I", "", "3", ""));
        c.add(new course("ART", "319", "", "HISTORY OF WESTERN ART I", "", "3", ""));
        c.add(new course("ART", "320", "", "HISTORY OF ART II", "", "3", ""));
        c.add(new course("ART", "329", "", "ART HISTORY I: WORLD ART TO 1400", "", "3", ""));
        c.add(new course("ART", "330", "", "ART HISTORY II: WORLD ART SINCE 1400", "", "3", ""));
        c.add(new course("DAN", "104", "", "DANCE APPRECIATION", "", "3", ""));
        c.add(new course("DAN", "110", "", "MODERN/JAZZ 1", "", "3", ""));
        c.add(new course("DAN", "119", "", "LATIN DANCE I", "", "3", ""));
        c.add(new course("DAN", "219", "", "LATIN DANCE II", "", "3", ""));
        c.add(new course("MUS", "108", "", "LISTENING TO MUSIC", "", "3", ""));
        c.add(new course("MUS", "123", "", "APPLIED MUSIC", "", "3", ""));
        c.add(new course("MUS", "126", "", "APPLIED MUSIC", "", "3", ""));
        c.add(new course("MUS", "186", "", "MUSIC ENSEMBLE", "", "3", ""));
        c.add(new course("MUS", "386", "", "MUSIC ENSEMBLE", "", "3", ""));
        c.add(new course("PHO", "173", "", "BASIC CAMERA", "", "3", ""));
        c.add(new course("PHO", "203", "", "BASIC PHOTOGRAPHY", "", "3", ""));
        c.add(new course("PHO", "206", "", "DIGITAL PHOTOGRAPHY I", "", "3", ""));
        c.add(new course("PHO", "305", "", "COMPUTING IMAGING I", "", "3", ""));
        c.add(new course("PHO", "403", "", "COMPUTING IMAGING I", "", "3", ""));
        c.add(new course("TH", "100", "", "INTRODUCTION TO THEATRE", "", "3", ""));
        c.add(new course("TH", "155", "", "ACTING I", "", "3", ""));
        c.add(new course("TH", "100", "", "S/T: THEATRE OF SOUTHERN AFRICA", "", "3", ""));
        return c;
    }
    
    public static ArrayList<course> createScienceElectives()
    {
        ArrayList<course> c = new ArrayList<course>();
        c.add(new course("PHY", "201", "", "GENERAL COLLEGE PHYSICS I", "", "3", ""));
        c.add(new course("PHY", "201L", "", "GENERAL COLLEGE PHYSICS I LAB", "", "1", ""));
        c.add(new course("PHY", "202", "", "GENERAL COLLEGE PHYSICS II", "", "3", ""));
        c.add(new course("PHY", "202L", "", "GENERAL COLLEGE PHYSICS II LAB", "", "1", ""));
        return c;
    }
    
    public static ArrayList<course> createMathMinor()
    {
        ArrayList<course> c = new ArrayList();
        c.add(new course("MAT","211","","Calculus I","","4",""));
        c.add(new course("MAT","212","","Calculus II","","4",""));
        c.add(new course("MAT","253","","Discrete Mathematics I","","3",""));
        c.add(new course("MAT","354","","Discrete Mathematics II","","3",""));
        c.add(new course("MAT","356","","Statistics for Science","","3",""));
        c.add(new course("MAT","213","","Calculus III","","4",""));
        c.add(new course("MAT","314","","Differential Equations","","4",""));
        c.add(new course("MAT","332","","Linear Algebra","","3",""));
        c.add(new course("MAT","374","","Theory of Computation","","3",""));
        c.add(new course("MAT","451","","Probability Theory","","3",""));
        c.add(new course("MAT","452","","Mathematical Statistics","","3",""));
        c.add(new course("MAT","456","","Numerical Analysis","","3",""));
        return c;
    }
    public static ArrayList<course> createCSElectives()
    {
        ArrayList<course> c = new ArrayList();
        c.add(new course("CS","328","","Unix and System Concepts","","3",""));
        c.add(new course("CS","338","","Web Design, Authoring, and Publishing","","3",""));
        c.add(new course("CS","341","","Interactive Multimedia Systems","","3",""));
        c.add(new course("CS","428","","Object-Oriented Design and Software Development","","3",""));
        c.add(new course("CS","437","","Computer Graphics","","3",""));
        c.add(new course("CS","438","","Statistics for Science","","3",""));
        c.add(new course("CS","453","","Artificial Intelligence","","3",""));
        c.add(new course("CS","454","","Robotics","","3",""));
        c.add(new course("CS","456","","Introduction to Expert Systems","","3",""));
        c.add(new course("CS","473","","Network Programming","","3",""));
        c.add(new course("CS","478","","Applied Cryptography","","3",""));
        c.add(new course("CS","326","","Human Computer Interactions","","3",""));
        c.add(new course("CS","317","","Ethics and Digital Technology","","3",""));
        c.add(new course("CS","412","","Embedded Multimedia Systems","","3",""));
        return c;
    }
    public static ArrayList<course> createCore()
    {
        ArrayList<course> c = new ArrayList();
        c.add(new course("CS","231","","Computer Science I","","4",""));
        c.add(new course("CS","232","","Computer Science II","","4",""));
        c.add(new course("CS","311","","Assembly Language","","3",""));
        c.add(new course("CS","331","","Data Structures & Algorithms","","3",""));
        c.add(new course("CS","332","","Computer Hardware Organization","","3",""));
        c.add(new course("CS","372","","Software Engineering","","3",""));
        c.add(new course("CS","413","","Operating Systems","","3",""));
        c.add(new course("CS","414","","Computer Architecture","","3",""));
        c.add(new course("CS","426","","Databases","","3",""));
        c.add(new course("CS","431","","Concepts of Programming Languages","","3",""));
        c.add(new course("CS","471","","Computer Networks","","3",""));
        c.add(new course("CS","477","","Computer Security","","3",""));
        c.add(new course("CS","306","","DBase Anyls/Logic Dsgn","","3",""));
        c.add(new course("CS","487","","Seminar","","1",""));
        c.add(new course("CS","499","","Internship","","3",""));
        c.add(new course("CS","487","","Seminar","","1",""));
        c.add(new course("CS","499","","Internship","","3",""));
        c.add(new course("CS","487","","Seminar","","1",""));
        c.add(new course("CS","499","","Internship","","3",""));
        return c;
    }

    public CourseRequirementsCS() {
        initComponents();
        System.out.println("CourseRequirementsCS");
        
        //calls the transcript from the Authentication class
        ArrayList<course> transcript = (ArrayList<course>) Authentication.transcript.clone();
        
        /*All of these clusters check if the Requirement list course matches Transcript list course,
        if there is a match then it removes the match from the Requirements list 
        then once the subsection is completed it prints the remaining courses to be 
        taken in the subsection to the correspoding JTextArea*/
        
        core = createCore();
        op.courseElim(corelbl, 38.00,core, transcript);
        op.printList(core, coretxt);
 
        csElectives = createCSElectives();
        op.courseElim(eleclbl, 12.00,csElectives, transcript);
        op.printList(csElectives, electxt);
        
        mathMinor = createMathMinor();
        op.courseElim(mathlbl, 20.00,mathMinor, transcript);
        op.printList(mathMinor, mathtxt);
        
        scienceElectives = createScienceElectives();
        op.courseElim(physlbl, 8.00, scienceElectives, transcript);
        op.printList(scienceElectives, phystxt);
        
        philoElectives = createPhiloElectives();
        op.courseElim(phillbl, 3.00, philoElectives, transcript);
        op.printList(philoElectives, philtxt);
        
        languagesElectives = createLanguagesElectives();
        op.courseElim(forelbl, 3.00, languagesElectives, transcript);
        op.printList(languagesElectives, foretxt);
        
        singleClassElectives = createSingleClassElectives();
        op.courseElim(genelbl, 27.00, singleClassElectives, transcript);
        op.printList(singleClassElectives, genetxt);
        
        fineArtsElectives = createFineArtsElectives();
        op.courseElim(finelbl, 3.00, fineArtsElectives, transcript);
        op.printList(fineArtsElectives, finetxt);
        
        humElectives = createHumLitElectives();
        op.courseElim(humalbl, 3.00, humElectives, transcript);
        op.printList(humElectives, humatxt);
        
        theoElectives = createTheoElectives();
        op.courseElim(theolbl, 3.00, theoElectives, transcript);
        op.printList(theoElectives, theotxt);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        corelbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coretxt = new javax.swing.JTextArea();
        eleclbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        electxt = new javax.swing.JTextArea();
        mathlbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mathtxt = new javax.swing.JTextArea();
        physlbl = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        phystxt = new javax.swing.JTextArea();
        forelbl = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        foretxt = new javax.swing.JTextArea();
        cpyrtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        psretxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        finelbl = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        finetxt = new javax.swing.JTextArea();
        theolbl = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        theotxt = new javax.swing.JTextArea();
        phillbl = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        philtxt = new javax.swing.JTextArea();
        humalbl = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        humatxt = new javax.swing.JTextArea();
        genelbl = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        genetxt = new javax.swing.JTextArea();

        jLabel1.setText("Courses Required Per Major Subsection");

        corelbl.setText("Major Core Courses");

        coretxt.setColumns(20);
        coretxt.setRows(5);
        jScrollPane1.setViewportView(coretxt);

        eleclbl.setText("Major Electives");

        electxt.setColumns(20);
        electxt.setRows(5);
        jScrollPane2.setViewportView(electxt);

        mathlbl.setText("Mathematics Minor");

        mathtxt.setColumns(20);
        mathtxt.setRows(5);
        jScrollPane3.setViewportView(mathtxt);

        physlbl.setText("Physics Requirement");

        phystxt.setColumns(20);
        phystxt.setRows(5);
        jScrollPane4.setViewportView(phystxt);

        forelbl.setText("Foreign Language Requirement");

        foretxt.setColumns(20);
        foretxt.setRows(5);
        jScrollPane5.setViewportView(foretxt);

        jLabel7.setText("Intended Credits per Semester");

        jLabel8.setText("Projected Semesters Remaining");

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        finelbl.setText("Fine Art Requirement");

        finetxt.setColumns(20);
        finetxt.setRows(5);
        jScrollPane7.setViewportView(finetxt);

        theolbl.setText("Theology Requirement");

        theotxt.setColumns(20);
        theotxt.setRows(5);
        jScrollPane8.setViewportView(theotxt);

        phillbl.setText("Philosophy Requirement");

        philtxt.setColumns(20);
        philtxt.setRows(5);
        jScrollPane9.setViewportView(philtxt);

        humalbl.setText("Humanities Requirement");

        humatxt.setColumns(20);
        humatxt.setRows(5);
        jScrollPane10.setViewportView(humatxt);

        genelbl.setText("General Ed Requirements");

        genetxt.setColumns(20);
        genetxt.setRows(5);
        jScrollPane11.setViewportView(genetxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(corelbl)
                    .addComponent(eleclbl)
                    .addComponent(jScrollPane2)
                    .addComponent(mathlbl)
                    .addComponent(jScrollPane3)
                    .addComponent(physlbl)
                    .addComponent(jScrollPane4)
                    .addComponent(forelbl)
                    .addComponent(jScrollPane5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cpyrtxt))
                                        .addComponent(jLabel8)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(jButton1)))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(finelbl)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phillbl))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                                    .addComponent(humalbl)
                                    .addComponent(jScrollPane11)
                                    .addComponent(genelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(psretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(theolbl))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(corelbl)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(eleclbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mathlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(physlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(forelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpyrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(psretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(finelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(theolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(phillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(humalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(genelbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Gives the number of semesters left to graduate based on credits per semester provided by the user
        double credPerSem = Double.parseDouble(cpyrtxt.getText());
        double remainingCred = op.totalCreditsB;
        int semestersRemain = (int)Math.ceil(remainingCred/credPerSem);

        psretxt.setText(Integer.toString(semestersRemain));
        System.out.println(remainingCred);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel corelbl;
    private javax.swing.JTextArea coretxt;
    private javax.swing.JTextField cpyrtxt;
    private javax.swing.JLabel eleclbl;
    private javax.swing.JTextArea electxt;
    private javax.swing.JLabel finelbl;
    private javax.swing.JTextArea finetxt;
    private javax.swing.JLabel forelbl;
    private javax.swing.JTextArea foretxt;
    private javax.swing.JLabel genelbl;
    private javax.swing.JTextArea genetxt;
    private javax.swing.JLabel humalbl;
    private javax.swing.JTextArea humatxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel mathlbl;
    private javax.swing.JTextArea mathtxt;
    private javax.swing.JLabel phillbl;
    private javax.swing.JTextArea philtxt;
    private javax.swing.JLabel physlbl;
    private javax.swing.JTextArea phystxt;
    private javax.swing.JTextField psretxt;
    private javax.swing.JLabel theolbl;
    private javax.swing.JTextArea theotxt;
    // End of variables declaration//GEN-END:variables
}