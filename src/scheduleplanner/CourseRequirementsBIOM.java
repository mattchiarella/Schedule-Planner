/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import java.util.ArrayList;
import scheduleplanner.Authentication.course;
/**
 *
 * @author Matthew_PC
 */
public class CourseRequirementsBIOM extends javax.swing.JPanel {
    
    static ArrayList<course> core, mathRequirement, bioElectives, singleClassElectives, 
            biodiversityDiscipline, molecularBiologyDiscipline, organismalBiologyDiscipline,
            ecologyDiscipline, capstone, chemistry, 
            languagesElectives, theoElectives, philoElectives, 
            humElectives, fineArtsElectives, scienceElectives;

    static double totalCredits = 120.00;
    //Calls the Operations Class
    Operations op = new Operations();

    /*Every CreateWhatever class creates Requirement ArrayLists of the corresponding subsection*/
    public static ArrayList<Authentication.course> createSingleClassElectives()
    {
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();

        c.add(new Authentication.course("SPE", "101", "","FUNDAMENTALS OF SPEECH","","3","" ));
        c.add(new Authentication.course("COM", "104", "","INTERPERSONAL COMMUNICATION","","3","" ));
        c.add(new Authentication.course("ENG", "111", "","FIRST YEAR COMP/LIT","","3","" ));
        c.add(new Authentication.course("ENG", "112", "","TECHNIQUES OF RESEARCH","","3","" ));
        c.add(new Authentication.course("ENG", "199", "","HONORS SPECIAL TOPICS","","3","" ));
        c.add(new Authentication.course("ENG", "210", "","WRITING ABOUT LITERATURE","","3","" ));
        c.add(new Authentication.course("HIS", "150", "","THE MEANING OF HISTORY","","3","" ));
        c.add(new Authentication.course("SOC", "200", "","PRSPTV CNSCNS & SOC JSTC","","3","" ));
        c.add(new Authentication.course("PSY", "281", "","INTRO TO PSYCHOLOGY","","3","" ));
        c.add(new Authentication.course("POS", "201", "","AMERICAN GOVERNMENT","","3","" ));
        c.add(new Authentication.course("THE", "201", "","THEOLOGY: FAITH, BELIEFS AND TRADITIONS","","3","" ));
        c.add(new Authentication.course("THE", "191", "","JUDEO-CHRISTIAN DOCTRINE","","3","" ));
        c.add(new Authentication.course("PHI", "220", "","INTRO TO PHILOSOPHY","","3","" ));
        c.add(new Authentication.course("PHI", "191", "","JUDEO-CHRISTIAN DOCTRINE","","3","" ));
        return c;
    }
    public static ArrayList<Authentication.course> createLanguagesElectives()
    {
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();

        c.add(new Authentication.course("FRE", "101", "","Elementary French I","","3","" ));
        c.add(new Authentication.course("FRE", "102", "","Elementary French II","","3","" ));
        c.add(new Authentication.course("FRE", "203", "","Intermediate French I","","3","" ));
        c.add(new Authentication.course("FRE", "204", "","Intermediate French II","","3","" ));
        c.add(new Authentication.course("FRE", "250", "","Conversation and Composition","","3","" ));
        c.add(new Authentication.course("SPA", "101", "","Elementary Spanish I","","3","" ));
        c.add(new Authentication.course("SPA", "102", "","Elementary Spanish II","","3","" ));
        c.add(new Authentication.course("SPA", "203", "","Intermediate Spanish I","","3","" ));
        c.add(new Authentication.course("SPA", "204", "","Intermediate Spanish II","","3","" ));
        return c;
    }
    public static ArrayList<Authentication.course> createTheoElectives()
    {
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();
        c.add(new Authentication.course("THE", "303", "","COMPARATIVE RELIGION","","3","" ));
        c.add(new Authentication.course("THE", "304", "","THEOLOGY THROUGH FILM","","3","" ));
        c.add(new Authentication.course("THE", "306", "","DYNAMICS OF FAITH, BELIEFS, AND THEOLOGY","","3","" ));
        c.add(new Authentication.course("THE", "307", "","CHRISTOLOGY","","3","" ));
        c.add(new Authentication.course("THE", "308", "","GOD AND SUFFERING IN THE JEWISH AND CHRISTIAN TRADITIONS","","3","" ));
        c.add(new Authentication.course("THE", "309", "","THE OLD TESTAMENT AND ITS INTERPRETERS","","3","" ));
        c.add(new Authentication.course("THE", "311", "","SEXUALITY, SEX, AND MORALITY","","3","" ));
        c.add(new Authentication.course("THE", "312", "","FREEDOM AND VIRTUE","","3","" ));
        c.add(new Authentication.course("THE", "314", "","JEWISH CIVILIZATION AND PRACTICE","","3","" ));
        c.add(new Authentication.course("THE", "315", "","CHRISTIAN SPIRITUALITY AND PRAYER","","3","" ));
        c.add(new Authentication.course("THE", "321", "","THE NEW TESTAMENT AS CHRISTIAN SCRIPTURE","","3","" ));
        c.add(new Authentication.course("THE", "323", "","THEOLOGY AND SCIENCE: A CONTEMPORARY DIALOGUE","","3","" ));
        c.add(new Authentication.course("THE", "325", "","FEMINIST PERSPECTIVES IN ETHICS","","3","" ));
        c.add(new Authentication.course("THE", "327", "","PEACE AND JUSTICE","","3","" ));
        c.add(new Authentication.course("THE", "331", "","CHRISTIANITY AND CULTURE","","3","" ));
        c.add(new Authentication.course("THE", "333", "","CHRISTIAN UNDERSTANDING OF GOD","","3","" ));
        c.add(new Authentication.course("THE", "334", "","HISTORY OF CHRISTIANITY I","","3","" ));
        c.add(new Authentication.course("THE", "335", "","HISTORY OF CHRISTIANITY II","","3","" ));
        c.add(new Authentication.course("THE", "338", "","THE CHURCH","","3","" ));
        c.add(new Authentication.course("THE", "344", "","SACRAMENTS","","3","" ));
        c.add(new Authentication.course("THE", "353", "","BIOETHICS","","3","" ));
        c.add(new Authentication.course("THE", "360", "","Women IN THE CHURCH","","3","" ));
        c.add(new Authentication.course("THE", "362", "","WOMEN IN THE NEW TESTAMENT","","3","" ));
        c.add(new Authentication.course("THE", "365", "","CREATION AND APOCALYPSE","","3","" ));
        c.add(new Authentication.course("THE", "372", "","MARRIAGE AND THE FAMILY","","3","" ));
        return c;
    }
    public static ArrayList<Authentication.course> createPhiloElectives()
    {
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();
        c.add(new Authentication.course("PHI", "302", "","SPANISH AND HISPANIC-AMERICAN PHILOSOPHERS","","3","" ));
        c.add(new Authentication.course("PHI", "306", "","PHILOSOPHY OF GOD AND RELIGION","","3","" ));
        c.add(new Authentication.course("PHI", "308", "","PHILOSOPHY OF LAW","","3","" ));
        c.add(new Authentication.course("PHI", "310", "","FORMAL LOGIC","","3","" ));
        c.add(new Authentication.course("PHI", "313", "","PHILOSOPHY OF ART-AESTHETICS","","3","" ));
        c.add(new Authentication.course("PHI", "316", "","ANCIENT PHILOSOPHY","","3","" ));
        c.add(new Authentication.course("PHI", "317", "","MEDIEVAL PHILOSOPHY","","3","" ));
        c.add(new Authentication.course("PHI", "318", "","MODERN PHILOSOPHY","","3","" ));
        c.add(new Authentication.course("PHI", "320", "","AMERICAN PHILOSOPHERS","","3","" ));
        c.add(new Authentication.course("PHI", "323", "","PHILOSOPHICAL PERSPECTIVES ON CINEMA","","3","" ));
        c.add(new Authentication.course("PHI", "350", "","FAMILY ETHICS","","3","" ));
        c.add(new Authentication.course("PHI", "353", "","BIO-MEDICAL ETHICS","","3","" ));
        c.add(new Authentication.course("PHI", "354", "","ENVIRONMENTAL ETHICS","","3","" ));
        c.add(new Authentication.course("PHI", "355", "","PHILOSOPHY OF POLITICS","","3","" ));
        c.add(new Authentication.course("PHI", "360", "","ASIAN PHILOSOPHY","","3","" ));
        return c;
    }
    public static ArrayList<Authentication.course> createHumLitElectives()
    {
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();
        c.add(new Authentication.course("HUM", "396", "", "Cultural Studies Special Topics", "", "3", ""));
        c.add(new Authentication.course("HUM", "397", "", "Ethnic Studies Special Topics", "", "3", ""));
        c.add(new Authentication.course("HUM", "398", "", "Gender Studies Special Topics", "", "3", ""));
        c.add(new Authentication.course("HUM", "399", "", "Genre Studies Special Topics", "", "3", ""));
        c.add(new Authentication.course("ENG", "315", "", "The Novel", "", "3", ""));
        c.add(new Authentication.course("ENG", "316", "", "World Literacy Masterpieces", "", "3", ""));
        c.add(new Authentication.course("ENG", "336", "", "Latino/a Literature", "", "3", ""));
        c.add(new Authentication.course("ENG", "340", "", "Women and Literature", "", "3", ""));
        c.add(new Authentication.course("ENG", "348", "", "Caribbean Literature", "", "3", ""));
        c.add(new Authentication.course("ENG", "419", "", "Literature and Film", "", "3", ""));
        c.add(new Authentication.course("ENG", "429", "", "English Studies", "", "3", ""));
        c.add(new Authentication.course("FRE", "379", "", "Culture and Civilization", "", "3", ""));
        c.add(new Authentication.course("FRE", "380", "", "Contemporary Culture and Civilization", "", "3", ""));
        c.add(new Authentication.course("SPA", "333", "", "Spanish Culture", "", "3", ""));
        c.add(new Authentication.course("SPA", "335", "", "Hispanic American Culture", "", "3", ""));
        c.add(new Authentication.course("SPA", "447", "", "Contemporary Hispanic American Fiction", "", "3", ""));
        return c;
    }
    
    public static ArrayList<Authentication.course> createFineArtsElectives()
    {
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();
        c.add(new Authentication.course("ART", "101A", "", "BASIC DRAWING", "", "3", ""));
        c.add(new Authentication.course("ART", "114", "", "ART APPRECIATION", "", "3", ""));
        c.add(new Authentication.course("ART", "141", "", "BASIC HANDBUILDING", "", "3", ""));
        c.add(new Authentication.course("ART", "205", "", "GRAPHIC DESIGN METHODS AND MATERIALS", "", "3", ""));
        c.add(new Authentication.course("ART", "241", "", "BASIC POTTER'S WHEEL", "", "3", ""));
        c.add(new Authentication.course("ART", "260", "", "BASIC PAINTING I", "", "3", ""));
        c.add(new Authentication.course("ART", "319", "", "HISTORY OF WESTERN ART I", "", "3", ""));
        c.add(new Authentication.course("ART", "320", "", "HISTORY OF ART II", "", "3", ""));
        c.add(new Authentication.course("ART", "329", "", "ART HISTORY I: WORLD ART TO 1400", "", "3", ""));
        c.add(new Authentication.course("ART", "330", "", "ART HISTORY II: WORLD ART SINCE 1400", "", "3", ""));
        c.add(new Authentication.course("DAN", "104", "", "DANCE APPRECIATION", "", "3", ""));
        c.add(new Authentication.course("DAN", "110", "", "MODERN/JAZZ 1", "", "3", ""));
        c.add(new Authentication.course("DAN", "119", "", "LATIN DANCE I", "", "3", ""));
        c.add(new Authentication.course("DAN", "219", "", "LATIN DANCE II", "", "3", ""));
        c.add(new Authentication.course("MUS", "108", "", "LISTENING TO MUSIC", "", "3", ""));
        c.add(new Authentication.course("MUS", "123", "", "APPLIED MUSIC", "", "3", ""));
        c.add(new Authentication.course("MUS", "126", "", "APPLIED MUSIC", "", "3", ""));
        c.add(new Authentication.course("MUS", "186", "", "MUSIC ENSEMBLE", "", "3", ""));
        c.add(new Authentication.course("MUS", "386", "", "MUSIC ENSEMBLE", "", "3", ""));
        c.add(new Authentication.course("PHO", "173", "", "BASIC CAMERA", "", "3", ""));
        c.add(new Authentication.course("PHO", "203", "", "BASIC PHOTOGRAPHY", "", "3", ""));
        c.add(new Authentication.course("PHO", "206", "", "DIGITAL PHOTOGRAPHY I", "", "3", ""));
        c.add(new Authentication.course("PHO", "305", "", "COMPUTING IMAGING I", "", "3", ""));
        c.add(new Authentication.course("PHO", "403", "", "COMPUTING IMAGING I", "", "3", ""));
        c.add(new Authentication.course("TH", "100", "", "INTRODUCTION TO THEATRE", "", "3", ""));
        c.add(new Authentication.course("TH", "155", "", "ACTING I", "", "3", ""));
        c.add(new Authentication.course("TH", "100", "", "S/T: THEATRE OF SOUTHERN AFRICA", "", "3", ""));
        return c;
    }
    
    public static ArrayList<Authentication.course> createScienceElectives()
    {
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();
        c.add(new Authentication.course("PHY", "201", "", "GENERAL COLLEGE PHYSICS I", "", "3", ""));
        c.add(new Authentication.course("PHY", "201L", "", "GENERAL COLLEGE PHYSICS I LAB", "", "1", ""));
        c.add(new Authentication.course("PHY", "202", "", "GENERAL COLLEGE PHYSICS II", "", "3", ""));
        c.add(new Authentication.course("PHY", "202L", "", "GENERAL COLLEGE PHYSICS II LAB", "", "1", ""));
        return c;
    }
    
    public static ArrayList<Authentication.course> createCore(){
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();
        c.add(new Authentication.course("BIO","110","","Biological Foundations I","","3",""));
        c.add(new Authentication.course("BIO","110L","","Biological Foundations I Lab","","1",""));
        c.add(new Authentication.course("BIO","111","","Biological Foundations II","","3",""));
        c.add(new Authentication.course("BIO","111L","","Biological Foundations II Lab","","1",""));
        c.add(new Authentication.course("BIO","112","","Botany","","3",""));
        c.add(new Authentication.course("BIO","112L","","Botany Lab","","1",""));
        c.add(new Authentication.course("BIO","303","","Human Genetics","","3",""));
        c.add(new Authentication.course("BIO","341","","Genetics","","3",""));
        c.add(new Authentication.course("BIO","341L","","Genetics Lab","","1",""));
        c.add(new Authentication.course("BIO","216","","Zoology","","3",""));
        c.add(new Authentication.course("BIO","216L","","Zoology Lab","","1",""));
        c.add(new Authentication.course("BIO","225","","Comparative Anatomy","","3",""));
        c.add(new Authentication.course("BIO","225L","","Comparative Anatomy Lab","","1",""));
        c.add(new Authentication.course("BIO","305","","Introduction to Oceanography","","3",""));
        c.add(new Authentication.course("BIO","330","","Cell Biology","","3",""));
        c.add(new Authentication.course("BIO","330L","","Cell Biology Lab","","1",""));
        c.add(new Authentication.course("BIO","335","","Comparative Physiology","","3",""));
        c.add(new Authentication.course("BIO","335L","","Comparative Physiology Lab","","1",""));
        c.add(new Authentication.course("BIO","474","","Marine Seminar","","3",""));
        c.add(new Authentication.course("BIO","475","","Seminar","","3",""));
        c.add(new Authentication.course("BIO","420","","Marine Internship","","1",""));
        return c;
    }
    
    public static ArrayList<Authentication.course> createCapstone(){
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();
        c.add(new Authentication.course("BIO","440","","Evolution","","3",""));
        c.add(new Authentication.course("BIO","454","","Virology","","3",""));
        c.add(new Authentication.course("BIO","474","","Marine Seminar","","3",""));
        c.add(new Authentication.course("BIO","475","","Seminar","","3",""));
        return c;
    }
    
    public static ArrayList<Authentication.course> createMathRequirements(){
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();
        c.add(new Authentication.course("MAT","211","","Calculus I","","4",""));
        return c;
    }
    
    public static ArrayList<Authentication.course> createChemistry(){
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();
        c.add(new Authentication.course("CHE","111","","General Chemistry I","","3",""));
        c.add(new Authentication.course("CHE","111L","","General Chemistry I Lab","","1",""));
        c.add(new Authentication.course("CHE","112","","General Chemistry II","","3",""));
        c.add(new Authentication.course("CHE","112L","","General Chemisry II Lab","","3",""));
        c.add(new Authentication.course("CHE","343","","Organic Chemistry I","","3",""));
        c.add(new Authentication.course("CHE","343L","","Organic Chemistry I Lab","","1",""));
        c.add(new Authentication.course("CHE","344","","Organic Chemistry II","","3",""));
        c.add(new Authentication.course("CHE","344L","","Organic Cheistry II Lab","","1",""));
        c.add(new Authentication.course("CHE","352","","Biochemistry I","","3",""));
        c.add(new Authentication.course("CHE","352L","","Biochemistry I Lab","","1",""));
        return c;
    }
    
    public static ArrayList<Authentication.course> createBioElectives(){
        ArrayList<Authentication.course> c = new ArrayList<Authentication.course>();
        c.add(new Authentication.course("BIO","110","","Biological Foundations I","","3",""));
        c.add(new Authentication.course("BIO","110L","","Biological Foundations Lab","","1",""));
        c.add(new Authentication.course("BIO","111","","Biological Foundations II","","3",""));
        c.add(new Authentication.course("BIO","111L","","Biological Foundations II Lab","","1",""));
        c.add(new Authentication.course("BIO","303","","Human Genetics","","3",""));
        c.add(new Authentication.course("BIO","341","","Genetics","","3",""));
        c.add(new Authentication.course("BIO","341L","","Genetics Lab","","1",""));
        c.add(new Authentication.course("BIO","440","","Evolution","","3",""));
        c.add(new Authentication.course("BIO","454","","Virology","","3",""));
        c.add(new Authentication.course("BIO","475","","Seminar","","3",""));
        c.add(new Authentication.course("BIO","308","","Environmental Science","","3",""));
        c.add(new Authentication.course("BIO","308L","","Environmental Science","","1",""));
        c.add(new Authentication.course("BIO","310","","Marine Biology","","3",""));
        c.add(new Authentication.course("BIO","310L","","Marine Biology Lab","","1",""));
        c.add(new Authentication.course("BIO","312","","Ecology","","3",""));
        c.add(new Authentication.course("BIO","312L","","Ecology Lab","","1",""));
        c.add(new Authentication.course("BIO","339","","Animal Behavior","","3",""));
        c.add(new Authentication.course("BIO","220","","Introductory Anatomy","","3",""));
        c.add(new Authentication.course("BIO","220L","","Introductory Anatomy Lab","","1",""));
        c.add(new Authentication.course("BIO","225","","Comparative Anatomy","","3",""));
        c.add(new Authentication.course("BIO","225L","","Comparative Anatomy Lab","","1",""));
        c.add(new Authentication.course("BIO","335","","Comparative Physiology","","3",""));
        c.add(new Authentication.course("BIO","335L","","Comparative Physiology Lab","","1",""));
        c.add(new Authentication.course("BIO","313","","Human Nutrition","","3",""));
        c.add(new Authentication.course("BIO","328","","Animal Nutrition","","3",""));
        c.add(new Authentication.course("BIO","451","","Embryology","","3",""));
        c.add(new Authentication.course("BIO","253","","Introductory Microbiology","","3",""));
        c.add(new Authentication.course("BIO","253L","","Introductory Microbiology Lab","","1",""));
        c.add(new Authentication.course("BIO","325","","Microbiology","","3",""));
        c.add(new Authentication.course("BIO","325L","","Microbiology Lab","","1",""));
        c.add(new Authentication.course("BIO","330","","Cell Biology","","3",""));
        c.add(new Authentication.course("BIO","330L","","Cell Biology Lab","","1",""));
        c.add(new Authentication.course("BIO","337","","Neurobiology","","3",""));
        c.add(new Authentication.course("BIO","450","","Histology","","3",""));
        c.add(new Authentication.course("BIO","455","","Immunology","","3",""));
        c.add(new Authentication.course("BIO","112","","Botany","","3",""));
        c.add(new Authentication.course("BIO","112L","","Botany Lab","","1",""));
        c.add(new Authentication.course("BIO","216","","Zoology","","3",""));
        c.add(new Authentication.course("BIO","216L","","Zoology Lab","","1",""));
        c.add(new Authentication.course("BIO","346","","Parasitology","","3",""));
        c.add(new Authentication.course("BIO","440","","Evolution","","3",""));
        c.add(new Authentication.course("BIO","474","","Marine Seminar","","3",""));
        c.add(new Authentication.course("BIO","199","","Special Topics","","3",""));
        c.add(new Authentication.course("BIO","199L","","Special Topics Lab","","1",""));
        c.add(new Authentication.course("BIO","240","","Introduction to Human Physiology","","3",""));
        c.add(new Authentication.course("BIO","240L","","Introduction to Human Physiology Lab","","1",""));
        c.add(new Authentication.course("BIO","300","","Special Topics","","3",""));
        c.add(new Authentication.course("BIO","305","","Introduction to Oceanography","","3",""));
        c.add(new Authentication.course("BIO","307","","Biology of Crime","","3",""));
        c.add(new Authentication.course("BIO","307L","","Biology of Crime Lab","","3",""));
        c.add(new Authentication.course("BIO","309","","Disease Detectives","","3",""));
        c.add(new Authentication.course("BIO","309L","","Disease Detectives","","1",""));
        c.add(new Authentication.course("BIO","314","","Fishes","","3",""));
        c.add(new Authentication.course("BIO","314L","","Fishes Lab","","1",""));
        c.add(new Authentication.course("BIO","316","","Brainworks","","3",""));
        c.add(new Authentication.course("BIO","316L","","Brainworks Lab","","1",""));
        c.add(new Authentication.course("BIO","323","","Tropical Marine Ecosystems","","3",""));
        c.add(new Authentication.course("BIO","323L","","Tropical Marine Ecosystems Lab","","1",""));
        c.add(new Authentication.course("BIO","306","","Dynamics of Resoration Ecology","","3",""));
        c.add(new Authentication.course("BIO","365","","Molecular Biology","","3",""));
        c.add(new Authentication.course("BIO","404","","Epidermology","","3",""));
        c.add(new Authentication.course("BIO","420","","Marine Internship","","1",""));
        c.add(new Authentication.course("BIO","440","","Evolution","","3",""));
        c.add(new Authentication.course("BIO","465","","Environmental Field Study","","1",""));
        c.add(new Authentication.course("BIO","476","","Teaching of Biology in the Secondary School","","3",""));
        c.add(new Authentication.course("BIO","295","","Research","","3",""));
        c.add(new Authentication.course("BIO","395","","Research","","3",""));
        c.add(new Authentication.course("BIO","495","","Research","","3",""));
        c.add(new Authentication.course("","","","","","",""));
        return c;
    }
    public CourseRequirementsBIOM() {
        initComponents();
        
        //calls the transcript from the Authentication class
        ArrayList<course> transcript = (ArrayList<course>) Authentication.transcript.clone();
        
        /*All of these clusters check if the Requirement list course matches Transcript list course,
        if there is a match then it removes the match from the Requirements list 
        then once the subsection is completed it prints the remaining courses to be 
        taken in the subsection to the correspoding JTextArea*/
        
        core = createCore();
        op.courseElim(corelbl, 39.00, core, transcript);
        op.printList(core, coretxt);
        
        mathRequirement = createMathRequirements();
        op.courseElim(mathlbl, 4, mathRequirement, transcript);
        op.printList(mathRequirement, mathtxt);
        
        bioElectives = createBioElectives();
        op.courseElim(eleclbl, 40.00, bioElectives, transcript);
        op.printList(bioElectives, electxt);
        
        capstone = createCapstone();
        op.courseElim(capslbl, 3.00, capstone, transcript);
        op.printList(capstone, capstxt);
        
        chemistry = createChemistry();
        op.courseElim(chemlbl, 16.00, chemistry, transcript);
        op.printList(chemistry, chemtxt);
        
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
        
        scienceElectives = createScienceElectives();
        op.courseTaken(physlbl, 8.00, scienceElectives, transcript);
        op.printList(scienceElectives, phystxt);
        
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
        capslbl = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        capstxt = new javax.swing.JTextArea();
        chemlbl = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        chemtxt = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Courses Required Per Major Subsection");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        corelbl.setText("Major Core Courses");
        add(corelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, -1, -1));

        coretxt.setColumns(20);
        coretxt.setRows(5);
        jScrollPane1.setViewportView(coretxt);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 416, 82));

        eleclbl.setText("Major Electives");
        add(eleclbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, -1, -1));

        electxt.setColumns(20);
        electxt.setRows(5);
        jScrollPane2.setViewportView(electxt);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 202, 416, 79));

        mathlbl.setText("Mathematics Requirement");
        add(mathlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, -1, -1));

        mathtxt.setColumns(20);
        mathtxt.setRows(5);
        jScrollPane3.setViewportView(mathtxt);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 319, 416, 73));

        physlbl.setText("Physics Requirement");
        add(physlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        phystxt.setColumns(20);
        phystxt.setRows(5);
        jScrollPane4.setViewportView(phystxt);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 416, 67));

        forelbl.setText("Foreign Language Requirement");
        add(forelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 515, -1, -1));

        foretxt.setColumns(20);
        foretxt.setRows(5);
        jScrollPane5.setViewportView(foretxt);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 535, 416, 78));
        add(cpyrtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 68, 148, -1));

        jLabel7.setText("Intended Credits per Semester");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 48, -1, -1));

        jLabel8.setText("Projected Semesters Remaining");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 124, -1, -1));
        add(psretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 149, 69, -1));

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 95, -1, -1));

        finelbl.setText("Fine Art Requirement");
        add(finelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 48, -1, -1));

        finetxt.setColumns(20);
        finetxt.setRows(5);
        jScrollPane7.setViewportView(finetxt);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 68, 416, 78));

        theolbl.setText("Theology Requirement");
        add(theolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 164, -1, -1));

        theotxt.setColumns(20);
        theotxt.setRows(5);
        jScrollPane8.setViewportView(theotxt);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 184, 416, 78));

        phillbl.setText("Philosophy Requirement");
        add(phillbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 280, -1, -1));

        philtxt.setColumns(20);
        philtxt.setRows(5);
        jScrollPane9.setViewportView(philtxt);

        add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 300, 416, 78));

        humalbl.setText("Humanities Requirement");
        add(humalbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 396, -1, -1));

        humatxt.setColumns(20);
        humatxt.setRows(5);
        jScrollPane10.setViewportView(humatxt);

        add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 416, 416, 78));

        genelbl.setText("General Ed Requirements");
        add(genelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 512, 138, -1));

        genetxt.setColumns(20);
        genetxt.setRows(5);
        jScrollPane11.setViewportView(genetxt);

        add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 532, 416, 81));

        capslbl.setText("Capstone");
        add(capslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));

        capstxt.setColumns(20);
        capstxt.setRows(5);
        jScrollPane14.setViewportView(capstxt);

        add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 416, 78));

        chemlbl.setText("Chemistry Requirement");
        add(chemlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, -1, -1));

        chemtxt.setColumns(20);
        chemtxt.setRows(5);
        jScrollPane16.setViewportView(chemtxt);

        add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 650, 416, 78));
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
    private javax.swing.JLabel capslbl;
    private javax.swing.JTextArea capstxt;
    private javax.swing.JLabel chemlbl;
    private javax.swing.JTextArea chemtxt;
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
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
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
