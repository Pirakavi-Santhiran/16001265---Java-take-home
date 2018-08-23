
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.accessibility.AccessibleContext;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pirakavi
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    
    
    public MainMenu() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        
        
    }
    
    public ArrayList<User>userList(){
        ArrayList<User> usersList = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String query1 = "SELECT * FROM undergraduatestudent";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User user;
            while (rs.next()){
                    user = new User(rs.getString("full_name"),rs.getString("student_id"),rs.getString("birth_date"),rs.getString("e_mail"),rs.getInt("index_no"),rs.getString("intake"),rs.getInt("year"),rs.getString("contact_no"),rs.getString("gender"),rs.getString("al_stream"),rs.getString("z_score"),rs.getInt("island_rank"),rs.getString("faculty"),rs.getString("course"),rs.getString("address"));
                usersList.add(user);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return usersList;
    }
    public void show_user(){
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) table_display.getModel();
        model.setRowCount(0);
        Object[] row = new Object[15];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getFullname();
            row[1] = list.get(i).getStudentid();
            row[2] = list.get(i).getBirthdate();
            row[3] = list.get(i).getEmail();
            row[4] = list.get(i).getIndexno();
            row[5] = list.get(i).getIntake();
            row[6] = list.get(i).getYear();
            row[7] = list.get(i).getContactno();
            row[8] = list.get(i).getGender();
            row[9] = list.get(i).getStream();
            row[10] = list.get(i).getZscore();
            row[11] = list.get(i).getIslandrank();
            row[12] = list.get(i).getFaculty();
            row[13] = list.get(i).getCourse();
            row[14] = list.get(i).getAddress();
            model.addRow(row);
        }
    }
    
    
    
public void show_user2(){
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) table_display2.getModel();
        model.setRowCount(0);
        Object[] row = new Object[15];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getFullname();
            row[1] = list.get(i).getStudentid();
            row[2] = list.get(i).getBirthdate();
            row[3] = list.get(i).getEmail();
            row[4] = list.get(i).getIndexno();
            row[5] = list.get(i).getIntake();
            row[6] = list.get(i).getYear();
            row[7] = list.get(i).getContactno();
            row[8] = list.get(i).getGender();
            row[9] = list.get(i).getStream();
            row[10] = list.get(i).getZscore();
            row[11] = list.get(i).getIslandrank();
            row[12] = list.get(i).getFaculty();
            row[13] = list.get(i).getCourse();
            row[14] = list.get(i).getAddress();
            model.addRow(row);
        }
    }
public void show_user3(){
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) table_display4.getModel();
        model.setRowCount(0);
        Object[] row = new Object[15];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getFullname();
            row[1] = list.get(i).getStudentid();
            row[2] = list.get(i).getBirthdate();
            row[3] = list.get(i).getEmail();
            row[4] = list.get(i).getIndexno();
            row[5] = list.get(i).getIntake();
            row[6] = list.get(i).getYear();
            row[7] = list.get(i).getContactno();
            row[8] = list.get(i).getGender();
            row[9] = list.get(i).getStream();
            row[10] = list.get(i).getZscore();
            row[11] = list.get(i).getIslandrank();
            row[12] = list.get(i).getFaculty();
            row[13] = list.get(i).getCourse();
            row[14] = list.get(i).getAddress();
            model.addRow(row);
        }
    }

    public ArrayList<PgUser>userListpg(){
        ArrayList<PgUser> usersListpg = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String query2 = "SELECT * FROM postgraduatestudent";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query2);
            PgUser pguser;
            while (rs.next()){
                    pguser = new PgUser(rs.getString("full_name"),rs.getString("student_id"),rs.getString("birth_date"),rs.getString("e_mail"),rs.getInt("index_no"),rs.getString("intake"),rs.getInt("year"),rs.getString("contact_no"),rs.getString("gender"),rs.getString("al_stream"),rs.getString("z_score"),rs.getInt("island_rank"),rs.getString("faculty"),rs.getString("course"),rs.getString("address"),rs.getString("qualification"),rs.getString("institution"),rs.getInt("passed_year"));
                usersListpg.add(pguser);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return usersListpg;
    }
    
    public void show_pguser1(){
        ArrayList<PgUser> list = userListpg();
        DefaultTableModel model = (DefaultTableModel) table_display3.getModel();
        model.setRowCount(0);
        Object[] row = new Object[18];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getFullname();
            row[1] = list.get(i).getStudentid();
            row[2] = list.get(i).getBirthdate();
            row[3] = list.get(i).getEmail();
            row[4] = list.get(i).getIndexno();
            row[5] = list.get(i).getIntake();
            row[6] = list.get(i).getYear();
            row[7] = list.get(i).getContactno();
            row[8] = list.get(i).getGender();
            row[9] = list.get(i).getStream();
            row[10] = list.get(i).getZscore();
            row[11] = list.get(i).getIslandrank();
            row[12] = list.get(i).getFaculty();
            row[13] = list.get(i).getCourse();
            row[14] = list.get(i).getAddress();
            row[15] = list.get(i).getQualification();
            row[16] = list.get(i).getInstitute();
            row[17] = list.get(i).getPassedyear();
            model.addRow(row);
        }
    }
    
    
    public void show_pguser(){
        ArrayList<PgUser> list = userListpg();
        DefaultTableModel model = (DefaultTableModel) table_display1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[18];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getFullname();
            row[1] = list.get(i).getStudentid();
            row[2] = list.get(i).getBirthdate();
            row[3] = list.get(i).getEmail();
            row[4] = list.get(i).getIndexno();
            row[5] = list.get(i).getIntake();
            row[6] = list.get(i).getYear();
            row[7] = list.get(i).getContactno();
            row[8] = list.get(i).getGender();
            row[9] = list.get(i).getStream();
            row[10] = list.get(i).getZscore();
            row[11] = list.get(i).getIslandrank();
            row[12] = list.get(i).getFaculty();
            row[13] = list.get(i).getCourse();
            row[14] = list.get(i).getAddress();
            row[15] = list.get(i).getQualification();
            row[16] = list.get(i).getInstitute();
            row[17] = list.get(i).getPassedyear();
            model.addRow(row);
        }
    }
    
    public void show_pguser5(){
        ArrayList<PgUser> list = userListpg();
        DefaultTableModel model = (DefaultTableModel) table_display5.getModel();
        model.setRowCount(0);
        Object[] row = new Object[18];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getFullname();
            row[1] = list.get(i).getStudentid();
            row[2] = list.get(i).getBirthdate();
            row[3] = list.get(i).getEmail();
            row[4] = list.get(i).getIndexno();
            row[5] = list.get(i).getIntake();
            row[6] = list.get(i).getYear();
            row[7] = list.get(i).getContactno();
            row[8] = list.get(i).getGender();
            row[9] = list.get(i).getStream();
            row[10] = list.get(i).getZscore();
            row[11] = list.get(i).getIslandrank();
            row[12] = list.get(i).getFaculty();
            row[13] = list.get(i).getCourse();
            row[14] = list.get(i).getAddress();
            row[15] = list.get(i).getQualification();
            row[16] = list.get(i).getInstitute();
            row[17] = list.get(i).getPassedyear();
            model.addRow(row);
        }
    }
    
    public void show_user6(){
        ArrayList<Subject> list = userListsub();
        DefaultTableModel model = (DefaultTableModel) table_display6.getModel();
        model.setRowCount(0);
        Object[] row = new Object[10];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getFaculty();
            row[1] = list.get(i).getCourse();
            row[2] = list.get(i).getSubname();
            row[3] = list.get(i).getSubid();
            row[4] = list.get(i).getType();
            row[5] = list.get(i).getYear();
            row[6] = list.get(i).getSeme();
            row[7] = list.get(i).getLect();
            row[8] = list.get(i).getCredit();
            row[9] = list.get(i).getFees();
            model.addRow(row);
        }
    }
    
    public void show_user7(){
        ArrayList<Subject> list = userListsub();
        DefaultTableModel model = (DefaultTableModel) table_display7.getModel();
        model.setRowCount(0);
        Object[] row = new Object[10];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getFaculty();
            row[1] = list.get(i).getCourse();
            row[2] = list.get(i).getSubname();
            row[3] = list.get(i).getSubid();
            row[4] = list.get(i).getType();
            row[5] = list.get(i).getYear();
            row[6] = list.get(i).getSeme();
            row[7] = list.get(i).getLect();
            row[8] = list.get(i).getCredit();
            row[9] = list.get(i).getFees();
            model.addRow(row);
        }
    }
    
    public void show_user8(){
        ArrayList<Subject> list = userListsub();
        DefaultTableModel model = (DefaultTableModel) table_display8.getModel();
        model.setRowCount(0);
        Object[] row = new Object[10];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getFaculty();
            row[1] = list.get(i).getCourse();
            row[2] = list.get(i).getSubname();
            row[3] = list.get(i).getSubid();
            row[4] = list.get(i).getType();
            row[5] = list.get(i).getYear();
            row[6] = list.get(i).getSeme();
            row[7] = list.get(i).getLect();
            row[8] = list.get(i).getCredit();
            row[9] = list.get(i).getFees();
            model.addRow(row);
        }
    }
    
    public ArrayList<Subject>userListsub(){
        ArrayList<Subject> usersListsub = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String query2 = "SELECT * FROM subjectdetails";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query2);
            Subject subject;
            while (rs.next()){
                    subject = new Subject(rs.getString("faculty"),rs.getString("course"),rs.getString("sub_name"),rs.getString("sub_id"),rs.getString("type"),rs.getString("academic_year"),rs.getString("semester"),rs.getInt("sub_credits"),rs.getString("fees"),rs.getString("lecturer"));
                usersListsub.add(subject);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return usersListsub;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        instructor = new javax.swing.JButton();
        lecturer = new javax.swing.JButton();
        home = new javax.swing.JButton();
        student = new javax.swing.JButton();
        timeslot = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        result = new javax.swing.JButton();
        card = new javax.swing.JPanel();
        homebu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        studentbu = new javax.swing.JPanel();
        registrationForm = new javax.swing.JButton();
        CourseRegistrationForm = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        viewstudentdetail = new javax.swing.JButton();
        updatestudentdetail = new javax.swing.JButton();
        deletestudentdetail = new javax.swing.JButton();
        deletebu = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        deleteug = new javax.swing.JButton();
        deletepg = new javax.swing.JButton();
        back5 = new javax.swing.JButton();
        lecturerbu = new javax.swing.JPanel();
        newlecturerug = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        newlecturerpg = new javax.swing.JButton();
        instructorbu = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        newInstructor = new javax.swing.JButton();
        newInstructorpg = new javax.swing.JButton();
        timeslotbu = new javax.swing.JPanel();
        scofcomputing = new javax.swing.JButton();
        scofbusiness = new javax.swing.JButton();
        scofengineering = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        studentIntakebu = new javax.swing.JPanel();
        pgstudent = new javax.swing.JButton();
        ugstudent = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        TimeSlot_Soc = new javax.swing.JPanel();
        newadmin1 = new javax.swing.JLabel();
        backSOC = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        type1 = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        year1 = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        semester1 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        subject1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        lecOrins1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        day1 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tymfrom1 = new javax.swing.JComboBox();
        tymto1 = new javax.swing.JComboBox();
        lecRoom1 = new javax.swing.JComboBox();
        add1 = new javax.swing.JButton();
        TimeSlot_Soe = new javax.swing.JPanel();
        newadmin = new javax.swing.JLabel();
        backSOE = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        subject = new javax.swing.JTextField();
        type = new javax.swing.JComboBox();
        lecORins = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        year = new javax.swing.JComboBox();
        semester = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox();
        tymfrom = new javax.swing.JComboBox();
        tymto = new javax.swing.JComboBox();
        lecRoom = new javax.swing.JComboBox();
        viewugstu = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        stdId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_display = new javax.swing.JTable();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        viewpgstu = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        stdId1 = new javax.swing.JTextField();
        search1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_display1 = new javax.swing.JTable();
        back2 = new javax.swing.JButton();
        Update2 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        viewbu = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        viewpg = new javax.swing.JButton();
        viewug = new javax.swing.JButton();
        back3 = new javax.swing.JButton();
        updateugstudent = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        stdId2 = new javax.swing.JTextField();
        search2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_display2 = new javax.swing.JTable();
        update1 = new javax.swing.JButton();
        back6 = new javax.swing.JButton();
        updatepgstudent = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        stdId3 = new javax.swing.JTextField();
        search3 = new javax.swing.JButton();
        updatek = new javax.swing.JButton();
        back7 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        table_display3 = new javax.swing.JTable();
        deleteugstudent = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        stdId4 = new javax.swing.JTextField();
        search4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_display4 = new javax.swing.JTable();
        update3 = new javax.swing.JButton();
        back8 = new javax.swing.JButton();
        deletepgstudent = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        stdId5 = new javax.swing.JTextField();
        search5 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_display5 = new javax.swing.JTable();
        update4 = new javax.swing.JButton();
        back9 = new javax.swing.JButton();
        updatebu = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        updateug = new javax.swing.JButton();
        updatepg = new javax.swing.JButton();
        back4 = new javax.swing.JButton();
        subjectbu = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        addbu = new javax.swing.JButton();
        viewsub = new javax.swing.JButton();
        updatesub = new javax.swing.JButton();
        deletesub = new javax.swing.JButton();
        courseregister = new javax.swing.JPanel();
        pgregi = new javax.swing.JButton();
        viewug1 = new javax.swing.JButton();
        back13 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        viewsubject = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        back10 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        subId = new javax.swing.JTextField();
        search6 = new javax.swing.JButton();
        update5 = new javax.swing.JButton();
        delete2 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        table_display6 = new javax.swing.JTable();
        updatesubject = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        back11 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        subId7 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        table_display7 = new javax.swing.JTable();
        search7 = new javax.swing.JButton();
        update6 = new javax.swing.JButton();
        deletesubject = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        back12 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        subId8 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        table_display8 = new javax.swing.JTable();
        search8 = new javax.swing.JButton();
        delete6 = new javax.swing.JButton();
        updatecourses = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        pgfees = new javax.swing.JButton();
        ugfees = new javax.swing.JButton();
        back14 = new javax.swing.JButton();
        coursesbu = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        fees = new javax.swing.JButton();
        regi = new javax.swing.JButton();
        back16 = new javax.swing.JButton();
        results = new javax.swing.JPanel();
        pgstudent1 = new javax.swing.JButton();
        ugstudent1 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        back15 = new javax.swing.JButton();
        TimeSlot_Sob = new javax.swing.JPanel();
        newadmin2 = new javax.swing.JLabel();
        backSOB = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        type2 = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        year2 = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        semester2 = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        subject2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        lecORins2 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        day2 = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tymform2 = new javax.swing.JComboBox();
        tymto2 = new javax.swing.JComboBox();
        lecRoom2 = new javax.swing.JComboBox();
        add2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_display9 = new javax.swing.JTable();
        add3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1472541558_nsbm-logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NSBM GREEN UNIVERSITY");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Student Entrolment System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        instructor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructor.setText("Instructor");
        instructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorActionPerformed(evt);
            }
        });

        lecturer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lecturer.setText("Lecturer");
        lecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(204, 255, 255));
        home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        student.setBackground(new java.awt.Color(204, 255, 255));
        student.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        student.setText("Student");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        timeslot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timeslot.setText("Time Slots");
        timeslot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeslotActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sub.setText("Subject");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        result.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        result.setText("Results");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeslot, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lecturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instructor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(home)
                .addGap(18, 18, 18)
                .addComponent(student)
                .addGap(18, 18, 18)
                .addComponent(lecturer)
                .addGap(18, 18, 18)
                .addComponent(instructor)
                .addGap(18, 18, 18)
                .addComponent(timeslot)
                .addGap(18, 18, 18)
                .addComponent(sub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(result)
                .addGap(103, 103, 103))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        card.setLayout(new java.awt.CardLayout());

        homebu.setBackground(new java.awt.Color(0, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Vision");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome to NSBM Green University");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Mission");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("To develop globally competitive and responsible graduates that businesses demand, ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("To be Sri Lanka’s best performing Graduate School and to be recognized internationally");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("working in synergy with all our stakeholder and contributing to our society");

        javax.swing.GroupLayout homebuLayout = new javax.swing.GroupLayout(homebu);
        homebu.setLayout(homebuLayout);
        homebuLayout.setHorizontalGroup(
            homebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homebuLayout.createSequentialGroup()
                .addGroup(homebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homebuLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homebuLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homebuLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homebuLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homebuLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel9))
                    .addGroup(homebuLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        homebuLayout.setVerticalGroup(
            homebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homebuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        card.add(homebu, "card2");

        studentbu.setBackground(new java.awt.Color(0, 204, 204));

        registrationForm.setBackground(new java.awt.Color(153, 255, 255));
        registrationForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrationForm.setForeground(new java.awt.Color(51, 0, 153));
        registrationForm.setText("Registration Form");
        registrationForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationFormActionPerformed(evt);
            }
        });

        CourseRegistrationForm.setBackground(new java.awt.Color(153, 255, 255));
        CourseRegistrationForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CourseRegistrationForm.setForeground(new java.awt.Color(51, 0, 153));
        CourseRegistrationForm.setText("Course Registration Form");
        CourseRegistrationForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseRegistrationFormActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 5));
        jLabel12.setText("Students");

        viewstudentdetail.setBackground(new java.awt.Color(153, 255, 255));
        viewstudentdetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewstudentdetail.setForeground(new java.awt.Color(51, 0, 153));
        viewstudentdetail.setText("View Student Details");
        viewstudentdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstudentdetailActionPerformed(evt);
            }
        });

        updatestudentdetail.setBackground(new java.awt.Color(153, 255, 255));
        updatestudentdetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatestudentdetail.setForeground(new java.awt.Color(51, 0, 153));
        updatestudentdetail.setText("Update Student Details");
        updatestudentdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestudentdetailActionPerformed(evt);
            }
        });

        deletestudentdetail.setBackground(new java.awt.Color(153, 255, 255));
        deletestudentdetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletestudentdetail.setForeground(new java.awt.Color(51, 0, 153));
        deletestudentdetail.setText("Delete Student Details");
        deletestudentdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestudentdetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentbuLayout = new javax.swing.GroupLayout(studentbu);
        studentbu.setLayout(studentbuLayout);
        studentbuLayout.setHorizontalGroup(
            studentbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentbuLayout.createSequentialGroup()
                .addGroup(studentbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentbuLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(studentbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CourseRegistrationForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewstudentdetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrationForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatestudentdetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletestudentdetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(studentbuLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel12)))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        studentbuLayout.setVerticalGroup(
            studentbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentbuLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel12)
                .addGap(44, 44, 44)
                .addComponent(registrationForm)
                .addGap(18, 18, 18)
                .addComponent(CourseRegistrationForm)
                .addGap(26, 26, 26)
                .addComponent(viewstudentdetail)
                .addGap(25, 25, 25)
                .addComponent(updatestudentdetail)
                .addGap(18, 18, 18)
                .addComponent(deletestudentdetail)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        card.add(studentbu, "card2");

        deletebu.setBackground(new java.awt.Color(0, 204, 204));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("DELETE STUDENT DETAILS");

        deleteug.setBackground(new java.awt.Color(51, 255, 204));
        deleteug.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteug.setText("Delete Undergraduates");
        deleteug.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteugActionPerformed(evt);
            }
        });

        deletepg.setBackground(new java.awt.Color(51, 255, 204));
        deletepg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletepg.setText("Delete Postgraduates");
        deletepg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletepg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletepgActionPerformed(evt);
            }
        });

        back5.setBackground(new java.awt.Color(0, 0, 255));
        back5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back5.setText("Back");
        back5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletebuLayout = new javax.swing.GroupLayout(deletebu);
        deletebu.setLayout(deletebuLayout);
        deletebuLayout.setHorizontalGroup(
            deletebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletebuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back5)
                .addGap(106, 106, 106))
            .addGroup(deletebuLayout.createSequentialGroup()
                .addGroup(deletebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deletebuLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deletebuLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(deletebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteug, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(deletepg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        deletebuLayout.setVerticalGroup(
            deletebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletebuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(deleteug)
                .addGap(41, 41, 41)
                .addComponent(deletepg)
                .addGap(107, 107, 107)
                .addComponent(back5)
                .addGap(65, 65, 65))
        );

        card.add(deletebu, "card14");

        lecturerbu.setBackground(new java.awt.Color(0, 204, 204));

        newlecturerug.setBackground(new java.awt.Color(204, 255, 255));
        newlecturerug.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newlecturerug.setForeground(new java.awt.Color(0, 0, 102));
        newlecturerug.setText("New Lecturer for Undergraduates");
        newlecturerug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newlecturerugActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 0, 204));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("LECTURER DETAILS");

        newlecturerpg.setBackground(new java.awt.Color(204, 255, 255));
        newlecturerpg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newlecturerpg.setForeground(new java.awt.Color(0, 0, 102));
        newlecturerpg.setText("New Lecturer for Postgraduates");
        newlecturerpg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newlecturerpgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lecturerbuLayout = new javax.swing.GroupLayout(lecturerbu);
        lecturerbu.setLayout(lecturerbuLayout);
        lecturerbuLayout.setHorizontalGroup(
            lecturerbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecturerbuLayout.createSequentialGroup()
                .addGroup(lecturerbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lecturerbuLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(lecturerbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newlecturerpg, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newlecturerug)))
                    .addGroup(lecturerbuLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        lecturerbuLayout.setVerticalGroup(
            lecturerbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecturerbuLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel41)
                .addGap(76, 76, 76)
                .addComponent(newlecturerug, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(newlecturerpg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        card.add(lecturerbu, "card2");

        instructorbu.setBackground(new java.awt.Color(0, 204, 204));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(153, 0, 51));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("INSTRUCTOR DETAILS");

        newInstructor.setBackground(new java.awt.Color(102, 255, 204));
        newInstructor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newInstructor.setForeground(new java.awt.Color(51, 51, 51));
        newInstructor.setText("New Instructor For Undergraduates");
        newInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInstructorActionPerformed(evt);
            }
        });

        newInstructorpg.setBackground(new java.awt.Color(102, 255, 204));
        newInstructorpg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newInstructorpg.setForeground(new java.awt.Color(51, 51, 51));
        newInstructorpg.setText("New Instructor For Postgraduates");
        newInstructorpg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInstructorpgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout instructorbuLayout = new javax.swing.GroupLayout(instructorbu);
        instructorbu.setLayout(instructorbuLayout);
        instructorbuLayout.setHorizontalGroup(
            instructorbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructorbuLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addGroup(instructorbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, instructorbuLayout.createSequentialGroup()
                        .addGroup(instructorbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newInstructor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newInstructorpg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, instructorbuLayout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))))
        );
        instructorbuLayout.setVerticalGroup(
            instructorbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructorbuLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(newInstructor)
                .addGap(50, 50, 50)
                .addComponent(newInstructorpg)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        card.add(instructorbu, "card2");

        timeslotbu.setBackground(new java.awt.Color(0, 204, 204));

        scofcomputing.setBackground(new java.awt.Color(102, 102, 255));
        scofcomputing.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scofcomputing.setForeground(new java.awt.Color(0, 51, 51));
        scofcomputing.setText("School of Computing");
        scofcomputing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scofcomputingActionPerformed(evt);
            }
        });

        scofbusiness.setBackground(new java.awt.Color(102, 102, 255));
        scofbusiness.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scofbusiness.setForeground(new java.awt.Color(0, 51, 51));
        scofbusiness.setText("School of Business");
        scofbusiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scofbusinessActionPerformed(evt);
            }
        });

        scofengineering.setBackground(new java.awt.Color(102, 102, 255));
        scofengineering.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scofengineering.setForeground(new java.awt.Color(0, 51, 51));
        scofengineering.setText("School of Engineering");
        scofengineering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scofengineeringActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Time Slots");

        javax.swing.GroupLayout timeslotbuLayout = new javax.swing.GroupLayout(timeslotbu);
        timeslotbu.setLayout(timeslotbuLayout);
        timeslotbuLayout.setHorizontalGroup(
            timeslotbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeslotbuLayout.createSequentialGroup()
                .addGroup(timeslotbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timeslotbuLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(timeslotbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scofcomputing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scofbusiness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scofengineering)))
                    .addGroup(timeslotbuLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        timeslotbuLayout.setVerticalGroup(
            timeslotbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timeslotbuLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(39, 39, 39)
                .addComponent(scofbusiness)
                .addGap(29, 29, 29)
                .addComponent(scofcomputing)
                .addGap(28, 28, 28)
                .addComponent(scofengineering)
                .addGap(110, 110, 110))
        );

        card.add(timeslotbu, "card2");

        studentIntakebu.setBackground(new java.awt.Color(0, 204, 204));

        pgstudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pgstudent.setText("Postgraduate Student");
        pgstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstudentActionPerformed(evt);
            }
        });

        ugstudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ugstudent.setText("Undergraduate Student");
        ugstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ugstudentActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("STUDENT REGISTRATION");

        back.setBackground(new java.awt.Color(0, 0, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentIntakebuLayout = new javax.swing.GroupLayout(studentIntakebu);
        studentIntakebu.setLayout(studentIntakebuLayout);
        studentIntakebuLayout.setHorizontalGroup(
            studentIntakebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentIntakebuLayout.createSequentialGroup()
                .addGroup(studentIntakebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentIntakebuLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(studentIntakebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pgstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ugstudent)))
                    .addGroup(studentIntakebuLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(back))
                    .addGroup(studentIntakebuLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        studentIntakebuLayout.setVerticalGroup(
            studentIntakebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentIntakebuLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(ugstudent)
                .addGap(53, 53, 53)
                .addComponent(pgstudent)
                .addGap(52, 52, 52)
                .addComponent(back)
                .addGap(100, 100, 100))
        );

        card.add(studentIntakebu, "card7");

        TimeSlot_Soc.setBackground(new java.awt.Color(0, 204, 204));

        newadmin1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        newadmin1.setForeground(new java.awt.Color(0, 0, 102));
        newadmin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newadmin1.setText("ALLOCATE ROOMS AND LABS FOR SCHOOL OF COMPUTING ");

        backSOC.setBackground(new java.awt.Color(0, 0, 255));
        backSOC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backSOC.setText("Back");
        backSOC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backSOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSOCActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Type");

        type1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Undergraduate", "Postgraduate" }));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Year");

        year1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        year1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st year", "2nd year", "3rd year", "4th year" }));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Semester");

        semester1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        semester1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st Semester", "2nd Semester" }));
        semester1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semester1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Subject");

        subject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Lecturer/Instructor");

        lecOrins1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecOrins1ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Day");

        day1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        day1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        day1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day1ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Time from");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Time to");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Lecturer Room/ Lab");

        tymfrom1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tymfrom1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00", "9.00", "10.00", "11.00", "12.00", "1.00", "2.00", "3.00", "4.00", " " }));
        tymfrom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tymfrom1ActionPerformed(evt);
            }
        });

        tymto1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tymto1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9.00", "10.00", "11.00", "12.00", "1.00", "2.00", "3.00", "4.00", "5.00" }));
        tymto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tymto1ActionPerformed(evt);
            }
        });

        lecRoom1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lecRoom1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LAB A", "LAB B", "LAB C", "LAB D", "LAB E", "LECR A", "LECR B", "LECR C", "LECR D", "LECR E", " " }));
        lecRoom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecRoom1ActionPerformed(evt);
            }
        });

        add1.setBackground(new java.awt.Color(0, 0, 255));
        add1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add1.setText("Add");
        add1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TimeSlot_SocLayout = new javax.swing.GroupLayout(TimeSlot_Soc);
        TimeSlot_Soc.setLayout(TimeSlot_SocLayout);
        TimeSlot_SocLayout.setHorizontalGroup(
            TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeSlot_SocLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(newadmin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(191, 191, 191))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeSlot_SocLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeSlot_SocLayout.createSequentialGroup()
                        .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30))
                        .addGap(71, 71, 71)
                        .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lecOrins1)
                                .addComponent(year1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subject1)
                                .addComponent(semester1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(day1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tymfrom1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tymto1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lecRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(type1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeSlot_SocLayout.createSequentialGroup()
                        .addComponent(add1)
                        .addGap(56, 56, 56)))
                .addComponent(backSOC)
                .addGap(111, 111, 111))
        );
        TimeSlot_SocLayout.setVerticalGroup(
            TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeSlot_SocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newadmin1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TimeSlot_SocLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(semester1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subject1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecOrins1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tymfrom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tymto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(TimeSlot_SocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backSOC)
                    .addComponent(add1))
                .addGap(20, 20, 20))
        );

        card.add(TimeSlot_Soc, "card8");

        TimeSlot_Soe.setBackground(new java.awt.Color(0, 204, 204));

        newadmin.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        newadmin.setForeground(new java.awt.Color(0, 0, 102));
        newadmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newadmin.setText("ALLOCATE ROOMS AND LABS FOR SCHOOL OF ENGINEERING");

        backSOE.setBackground(new java.awt.Color(0, 0, 255));
        backSOE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backSOE.setText("Back");
        backSOE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backSOE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSOEActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Semester");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Subject");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Type");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Year");

        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });

        type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Undergraduate", "Postgraduate" }));

        lecORins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecORinsActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(0, 0, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setText("Add");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        year.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st year", "2nd year", "3rd year", "4th year" }));

        semester.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        semester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st Semester", "2nd Semester" }));
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Lecturer/Instructor");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Time to");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Time from");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Day");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Lecturer Room/ Lab");

        day.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        tymfrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tymfrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00", "9.00", "10.00", "11.00", "12.00", "1.00", "2.00", "3.00", "4.00", " " }));
        tymfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tymfromActionPerformed(evt);
            }
        });

        tymto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tymto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9.00", "10.00", "11.00", "12.00", "1.00", "2.00", "3.00", "4.00", "5.00" }));
        tymto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tymtoActionPerformed(evt);
            }
        });

        lecRoom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lecRoom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LAB A", "LAB B", "LAB C", "LAB D", "LAB E", "LECR A", "LECR B", "LECR C", "LECR D", "LECR E", " " }));
        lecRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TimeSlot_SoeLayout = new javax.swing.GroupLayout(TimeSlot_Soe);
        TimeSlot_Soe.setLayout(TimeSlot_SoeLayout);
        TimeSlot_SoeLayout.setHorizontalGroup(
            TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeSlot_SoeLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(newadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(191, 191, 191))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeSlot_SoeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeSlot_SoeLayout.createSequentialGroup()
                        .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lecORins)
                                .addComponent(year, 0, 164, Short.MAX_VALUE)
                                .addComponent(subject)
                                .addComponent(semester, 0, 164, Short.MAX_VALUE)
                                .addComponent(day, javax.swing.GroupLayout.Alignment.TRAILING, 0, 164, Short.MAX_VALUE)
                                .addComponent(tymfrom, 0, 164, Short.MAX_VALUE)
                                .addComponent(tymto, 0, 164, Short.MAX_VALUE)
                                .addComponent(lecRoom, 0, 164, Short.MAX_VALUE))
                            .addComponent(type, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(355, 355, 355))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeSlot_SoeLayout.createSequentialGroup()
                        .addComponent(backSOE)
                        .addGap(77, 77, 77)
                        .addComponent(add)
                        .addGap(53, 53, 53))))
        );
        TimeSlot_SoeLayout.setVerticalGroup(
            TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeSlot_SoeLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(newadmin, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TimeSlot_SoeLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecORins, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tymfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tymto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(TimeSlot_SoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(backSOE))
                .addGap(24, 24, 24))
        );

        card.add(TimeSlot_Soe, "card8");

        viewugstu.setBackground(new java.awt.Color(0, 204, 204));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("VIEW UNDERGRADUATE STUDENT");

        back1.setBackground(new java.awt.Color(0, 0, 255));
        back1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back1.setText("Back");
        back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Student Id");

        stdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdIdActionPerformed(evt);
            }
        });
        stdId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stdIdKeyReleased(evt);
            }
        });

        table_display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Student Id", "Birth Date", "E-mail", "Index No", "Intake", "Year", "Contact No", "Gender", "AL Stream", "Z-Score", "Island Rank", "Faculty", "Course", "Address"
            }
        ){public boolean isCellEditable(int row, int column){return false;}});
        table_display.setEditingColumn(0);
        table_display.setEditingRow(0);
        table_display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_displayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_display);
        if (table_display.getColumnModel().getColumnCount() > 0) {
            table_display.getColumnModel().getColumn(0).setResizable(false);
            table_display.getColumnModel().getColumn(10).setHeaderValue("Z-Score");
            table_display.getColumnModel().getColumn(11).setHeaderValue("Island Rank");
            table_display.getColumnModel().getColumn(12).setHeaderValue("Faculty");
            table_display.getColumnModel().getColumn(13).setHeaderValue("Course");
            table_display.getColumnModel().getColumn(14).setHeaderValue("Address");
        }

        search.setBackground(new java.awt.Color(0, 0, 255));
        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setText("Search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 0, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("Update");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 0, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewugstuLayout = new javax.swing.GroupLayout(viewugstu);
        viewugstu.setLayout(viewugstuLayout);
        viewugstuLayout.setHorizontalGroup(
            viewugstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewugstuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(viewugstuLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(stdId, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(search)
                .addGap(67, 67, 67))
            .addGroup(viewugstuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewugstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewugstuLayout.createSequentialGroup()
                        .addComponent(delete)
                        .addGap(28, 28, 28)
                        .addComponent(update)
                        .addGap(30, 30, 30)
                        .addComponent(back1)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewugstuLayout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        viewugstuLayout.setVerticalGroup(
            viewugstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewugstuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(viewugstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stdId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(viewugstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back1)
                    .addComponent(update)
                    .addComponent(delete))
                .addContainerGap())
        );

        card.add(viewugstu, "card11");

        viewpgstu.setBackground(new java.awt.Color(0, 204, 204));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("VIEW POSTGRADUATE STUDENT");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Student Id");

        stdId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdId1ActionPerformed(evt);
            }
        });
        stdId1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stdId1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stdId1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stdId1KeyTyped(evt);
            }
        });

        search1.setBackground(new java.awt.Color(0, 0, 255));
        search1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search1.setText("Search");
        search1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        table_display1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Student Id", "Birth Date", "E-mail", "Index No", "Intake", "Year", "Contact No", "Gender", "AL Stream", "Z-Score", "Island Rank", "Faculty", "Course", "Address", "Qualification", "Institute", "Passed year"
            }
        ){public boolean isCellEditable(int row, int column){return false;}});
        jScrollPane2.setViewportView(table_display1);

        back2.setBackground(new java.awt.Color(0, 0, 255));
        back2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back2.setText("Back");
        back2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });

        Update2.setBackground(new java.awt.Color(0, 0, 255));
        Update2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update2.setText("Update");
        Update2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update2ActionPerformed(evt);
            }
        });

        delete1.setBackground(new java.awt.Color(0, 0, 255));
        delete1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete1.setText("Delete");
        delete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewpgstuLayout = new javax.swing.GroupLayout(viewpgstu);
        viewpgstu.setLayout(viewpgstuLayout);
        viewpgstuLayout.setHorizontalGroup(
            viewpgstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewpgstuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(viewpgstuLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(stdId1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(search1)
                .addGap(67, 67, 67))
            .addGroup(viewpgstuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewpgstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewpgstuLayout.createSequentialGroup()
                        .addComponent(delete1)
                        .addGap(47, 47, 47)
                        .addComponent(Update2)
                        .addGap(40, 40, 40)
                        .addComponent(back2)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewpgstuLayout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        viewpgstuLayout.setVerticalGroup(
            viewpgstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpgstuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(viewpgstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stdId1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search1))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(viewpgstuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back2)
                    .addComponent(Update2)
                    .addComponent(delete1))
                .addContainerGap())
        );

        card.add(viewpgstu, "card12");

        viewbu.setBackground(new java.awt.Color(0, 204, 204));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("VIEW STUDENT DETAILS");

        viewpg.setBackground(new java.awt.Color(51, 255, 204));
        viewpg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewpg.setText("View Postgraduates");
        viewpg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewpg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpgActionPerformed(evt);
            }
        });

        viewug.setBackground(new java.awt.Color(51, 255, 204));
        viewug.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewug.setText("View Undergraduates");
        viewug.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewugActionPerformed(evt);
            }
        });

        back3.setBackground(new java.awt.Color(0, 0, 255));
        back3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back3.setText("Back");
        back3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewbuLayout = new javax.swing.GroupLayout(viewbu);
        viewbu.setLayout(viewbuLayout);
        viewbuLayout.setHorizontalGroup(
            viewbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewbuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back3)
                .addGap(106, 106, 106))
            .addGroup(viewbuLayout.createSequentialGroup()
                .addGroup(viewbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewbuLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(viewbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewug, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewpg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(viewbuLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        viewbuLayout.setVerticalGroup(
            viewbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewbuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(viewug)
                .addGap(41, 41, 41)
                .addComponent(viewpg)
                .addGap(106, 106, 106)
                .addComponent(back3)
                .addGap(65, 65, 65))
        );

        card.add(viewbu, "card13");

        updateugstudent.setBackground(new java.awt.Color(0, 204, 204));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(204, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("UPDATE UNDERGRADUATE STUDENT");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Student Id");

        stdId2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stdId2KeyReleased(evt);
            }
        });

        search2.setBackground(new java.awt.Color(0, 0, 255));
        search2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search2.setText("Search");
        search2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });

        table_display2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Student Id", "Birth Date", "E-mail", "Index No", "Intake", "Year", "Contact No", "Gender", "AL Stream", "Z-Score", "Island Rank", "Faculty", "Course", "Address"
            }
        ){public boolean isCellEditable(int row, int column){return false;}});
        table_display2.setEditingColumn(0);
        table_display2.setEditingRow(0);
        table_display2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_display2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_display2);
        if (table_display2.getColumnModel().getColumnCount() > 0) {
            table_display2.getColumnModel().getColumn(0).setResizable(false);
        }

        update1.setBackground(new java.awt.Color(0, 0, 255));
        update1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update1.setText("Update");
        update1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        back6.setBackground(new java.awt.Color(0, 0, 255));
        back6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back6.setText("Back");
        back6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateugstudentLayout = new javax.swing.GroupLayout(updateugstudent);
        updateugstudent.setLayout(updateugstudentLayout);
        updateugstudentLayout.setHorizontalGroup(
            updateugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
            .addGroup(updateugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateugstudentLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(updateugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(updateugstudentLayout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(82, 82, 82)
                            .addComponent(stdId2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search2)
                            .addGap(57, 57, 57))
                        .addGroup(updateugstudentLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(updateugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateugstudentLayout.createSequentialGroup()
                                    .addComponent(update1)
                                    .addGap(30, 30, 30)
                                    .addComponent(back6)
                                    .addGap(41, 41, 41))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateugstudentLayout.createSequentialGroup()
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(209, 209, 209)))))
                    .addContainerGap()))
        );
        updateugstudentLayout.setVerticalGroup(
            updateugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
            .addGroup(updateugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateugstudentLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(updateugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stdId2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search2))
                    .addGap(64, 64, 64)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addGroup(updateugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back6)
                        .addComponent(update1))
                    .addGap(21, 21, 21)))
        );

        card.add(updateugstudent, "card14");

        updatepgstudent.setBackground(new java.awt.Color(0, 204, 204));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("UPDATE POSTGRADUATE STUDENT");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Student Id");

        stdId3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stdId3KeyReleased(evt);
            }
        });

        search3.setBackground(new java.awt.Color(0, 0, 255));
        search3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search3.setText("Search");
        search3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search3ActionPerformed(evt);
            }
        });

        updatek.setBackground(new java.awt.Color(0, 0, 255));
        updatek.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatek.setText("Update");
        updatek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatekActionPerformed(evt);
            }
        });

        back7.setBackground(new java.awt.Color(0, 0, 255));
        back7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back7.setText("Back");
        back7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back7ActionPerformed(evt);
            }
        });

        table_display3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Student Id", "Birth Date", "E-mail", "Index No", "Intake", "Year", "Contact No", "Gender", "AL Stream", "Z-Score", "Island Rank", "Faculty", "Course", "Address", "Qualification", "Institute", "Passed year"
            }
        ){public boolean isCellEditable(int row, int column){return false;}});
        jScrollPane10.setViewportView(table_display3);

        javax.swing.GroupLayout updatepgstudentLayout = new javax.swing.GroupLayout(updatepgstudent);
        updatepgstudent.setLayout(updatepgstudentLayout);
        updatepgstudentLayout.setHorizontalGroup(
            updatepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
            .addGroup(updatepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updatepgstudentLayout.createSequentialGroup()
                    .addGap(151, 151, 151)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82)
                    .addComponent(stdId3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search3)
                    .addGap(67, 67, 67))
                .addGroup(updatepgstudentLayout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addGroup(updatepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatepgstudentLayout.createSequentialGroup()
                            .addComponent(updatek)
                            .addGap(30, 30, 30)
                            .addComponent(back7)
                            .addGap(51, 51, 51))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatepgstudentLayout.createSequentialGroup()
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(219, 219, 219)))))
            .addGroup(updatepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updatepgstudentLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane10)
                    .addContainerGap()))
        );
        updatepgstudentLayout.setVerticalGroup(
            updatepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
            .addGroup(updatepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updatepgstudentLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(updatepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stdId3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                    .addGroup(updatepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back7)
                        .addComponent(updatek))
                    .addGap(21, 21, 21)))
            .addGroup(updatepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updatepgstudentLayout.createSequentialGroup()
                    .addGap(183, 183, 183)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(184, Short.MAX_VALUE)))
        );

        card.add(updatepgstudent, "card14");

        deleteugstudent.setBackground(new java.awt.Color(0, 204, 204));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 0, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("DELETE UNDERGRADUATE STUDENT");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Student Id");

        stdId4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stdId4KeyReleased(evt);
            }
        });

        search4.setBackground(new java.awt.Color(0, 0, 255));
        search4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search4.setText("Search");
        search4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search4ActionPerformed(evt);
            }
        });

        table_display4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Student Id", "Birth Date", "E-mail", "Index No", "Intake", "Year", "Contact No", "Gender", "AL Stream", "Z-Score", "Island Rank", "Faculty", "Course", "Address"
            }
        ){public boolean isCellEditable(int row, int column){return false;}});
        table_display4.setEditingColumn(0);
        table_display4.setEditingRow(0);
        table_display4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_display4MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_display4);

        update3.setBackground(new java.awt.Color(0, 0, 255));
        update3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update3.setText("Delete");
        update3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update3ActionPerformed(evt);
            }
        });

        back8.setBackground(new java.awt.Color(0, 0, 255));
        back8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back8.setText("Back");
        back8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteugstudentLayout = new javax.swing.GroupLayout(deleteugstudent);
        deleteugstudent.setLayout(deleteugstudentLayout);
        deleteugstudentLayout.setHorizontalGroup(
            deleteugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
            .addGroup(deleteugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteugstudentLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(deleteugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(deleteugstudentLayout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(82, 82, 82)
                            .addComponent(stdId4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search4)
                            .addGap(57, 57, 57))
                        .addGroup(deleteugstudentLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(deleteugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteugstudentLayout.createSequentialGroup()
                                    .addComponent(update3)
                                    .addGap(30, 30, 30)
                                    .addComponent(back8)
                                    .addGap(41, 41, 41))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteugstudentLayout.createSequentialGroup()
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(209, 209, 209)))))
                    .addContainerGap()))
        );
        deleteugstudentLayout.setVerticalGroup(
            deleteugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
            .addGroup(deleteugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deleteugstudentLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(deleteugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stdId4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search4))
                    .addGap(64, 64, 64)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addGroup(deleteugstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back8)
                        .addComponent(update3))
                    .addGap(21, 21, 21)))
        );

        card.add(deleteugstudent, "card14");

        deletepgstudent.setBackground(new java.awt.Color(0, 204, 204));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 0, 0));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("DELETE POSTGRADUATE STUDENT");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Student Id");

        stdId5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stdId5KeyReleased(evt);
            }
        });

        search5.setBackground(new java.awt.Color(0, 0, 255));
        search5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search5.setText("Search");
        search5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search5ActionPerformed(evt);
            }
        });

        table_display5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Student Id", "Birth Date", "E-mail", "Index No", "Intake", "Year", "Contact No", "Gender", "AL Stream", "Z-Score", "Island Rank", "Faculty", "Course", "Address", "Qualification", "Institute", "Passed year"
            }
        ));
        table_display5.setEditingColumn(0);
        table_display5.setEditingRow(0);
        table_display5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_display5MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(table_display5);
        if (table_display5.getColumnModel().getColumnCount() > 0) {
            table_display5.getColumnModel().getColumn(0).setResizable(false);
        }

        update4.setBackground(new java.awt.Color(0, 0, 255));
        update4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update4.setText("Delete");
        update4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update4ActionPerformed(evt);
            }
        });

        back9.setBackground(new java.awt.Color(0, 0, 255));
        back9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back9.setText("Back");
        back9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletepgstudentLayout = new javax.swing.GroupLayout(deletepgstudent);
        deletepgstudent.setLayout(deletepgstudentLayout);
        deletepgstudentLayout.setHorizontalGroup(
            deletepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
            .addGroup(deletepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletepgstudentLayout.createSequentialGroup()
                    .addGap(151, 151, 151)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82)
                    .addComponent(stdId5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search5)
                    .addGap(67, 67, 67))
                .addGroup(deletepgstudentLayout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addGroup(deletepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletepgstudentLayout.createSequentialGroup()
                            .addComponent(update4)
                            .addGap(30, 30, 30)
                            .addComponent(back9)
                            .addGap(51, 51, 51))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletepgstudentLayout.createSequentialGroup()
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(219, 219, 219)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(deletepgstudentLayout.createSequentialGroup()
                    .addComponent(jScrollPane6)
                    .addContainerGap()))
        );
        deletepgstudentLayout.setVerticalGroup(
            deletepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
            .addGroup(deletepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletepgstudentLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(deletepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stdId5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(80, 80, 80)
                    .addGroup(deletepgstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back9)
                        .addComponent(update4))
                    .addGap(21, 21, 21)))
        );

        card.add(deletepgstudent, "card14");

        updatebu.setBackground(new java.awt.Color(0, 204, 204));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("UPDATE STUDENT DETAILS");

        updateug.setBackground(new java.awt.Color(51, 255, 204));
        updateug.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateug.setText("Update Undergraduates");
        updateug.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateugActionPerformed(evt);
            }
        });

        updatepg.setBackground(new java.awt.Color(51, 255, 204));
        updatepg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatepg.setText("Update Postgraduates");
        updatepg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatepg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatepgActionPerformed(evt);
            }
        });

        back4.setBackground(new java.awt.Color(0, 0, 255));
        back4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back4.setText("Back");
        back4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatebuLayout = new javax.swing.GroupLayout(updatebu);
        updatebu.setLayout(updatebuLayout);
        updatebuLayout.setHorizontalGroup(
            updatebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatebuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back4)
                .addGap(106, 106, 106))
            .addGroup(updatebuLayout.createSequentialGroup()
                .addGroup(updatebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatebuLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updatebuLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(updatebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateug, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(updatepg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        updatebuLayout.setVerticalGroup(
            updatebuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatebuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(updateug)
                .addGap(41, 41, 41)
                .addComponent(updatepg)
                .addGap(107, 107, 107)
                .addComponent(back4)
                .addGap(65, 65, 65))
        );

        card.add(updatebu, "card14");

        subjectbu.setBackground(new java.awt.Color(0, 204, 204));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(204, 0, 0));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("SUBJECT DETAILS");

        addbu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addbu.setText("Add Subject");
        addbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuActionPerformed(evt);
            }
        });

        viewsub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewsub.setText("View Subjects");
        viewsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewsubActionPerformed(evt);
            }
        });

        updatesub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatesub.setText("Update Subjects");
        updatesub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatesubActionPerformed(evt);
            }
        });

        deletesub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletesub.setText("Delete Subjects");
        deletesub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletesubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subjectbuLayout = new javax.swing.GroupLayout(subjectbu);
        subjectbu.setLayout(subjectbuLayout);
        subjectbuLayout.setHorizontalGroup(
            subjectbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectbuLayout.createSequentialGroup()
                .addGroup(subjectbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subjectbuLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subjectbuLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addGroup(subjectbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addbu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatesub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletesub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        subjectbuLayout.setVerticalGroup(
            subjectbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectbuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(addbu)
                .addGap(18, 18, 18)
                .addComponent(viewsub)
                .addGap(18, 18, 18)
                .addComponent(updatesub)
                .addGap(18, 18, 18)
                .addComponent(deletesub)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        card.add(subjectbu, "card14");

        courseregister.setBackground(new java.awt.Color(0, 204, 204));

        pgregi.setBackground(new java.awt.Color(51, 255, 204));
        pgregi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pgregi.setText("Register Postgraduates");
        pgregi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgregi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgregiActionPerformed(evt);
            }
        });

        viewug1.setBackground(new java.awt.Color(51, 255, 204));
        viewug1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewug1.setText("Register Undergraduates");
        viewug1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewug1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewug1ActionPerformed(evt);
            }
        });

        back13.setBackground(new java.awt.Color(0, 0, 255));
        back13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back13.setText("Back");
        back13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back13ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("COURSE REGISTER");

        javax.swing.GroupLayout courseregisterLayout = new javax.swing.GroupLayout(courseregister);
        courseregister.setLayout(courseregisterLayout);
        courseregisterLayout.setHorizontalGroup(
            courseregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseregisterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back13)
                .addGap(106, 106, 106))
            .addGroup(courseregisterLayout.createSequentialGroup()
                .addGroup(courseregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(courseregisterLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(courseregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewug1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(pgregi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(courseregisterLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        courseregisterLayout.setVerticalGroup(
            courseregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseregisterLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(viewug1)
                .addGap(40, 40, 40)
                .addComponent(pgregi)
                .addGap(106, 106, 106)
                .addComponent(back13)
                .addGap(65, 65, 65))
        );

        card.add(courseregister, "card13");

        viewsubject.setBackground(new java.awt.Color(0, 204, 204));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 0, 0));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("VIEW SUBJECT DETAILS");

        back10.setBackground(new java.awt.Color(0, 0, 255));
        back10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back10.setText("Back");
        back10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back10ActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Subject Id");

        subId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subIdActionPerformed(evt);
            }
        });
        subId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subIdKeyReleased(evt);
            }
        });

        search6.setBackground(new java.awt.Color(0, 0, 255));
        search6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search6.setText("Search");
        search6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search6ActionPerformed(evt);
            }
        });

        update5.setBackground(new java.awt.Color(0, 0, 255));
        update5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update5.setText("Update");
        update5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update5ActionPerformed(evt);
            }
        });

        delete2.setBackground(new java.awt.Color(0, 0, 255));
        delete2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete2.setText("Delete");
        delete2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete2ActionPerformed(evt);
            }
        });

        table_display6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Faculty", "Course", "Subject Name", "Subject Id", "Type", "Academic Year", "Semester", "Subject Credits", "Subject Fees", "Lecturer"
            }
        ){public boolean isCellEditable(int row, int column){return false;}});
        table_display6.setEditingColumn(0);
        table_display6.setEditingRow(0);
        table_display6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_display6MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(table_display6);

        javax.swing.GroupLayout viewsubjectLayout = new javax.swing.GroupLayout(viewsubject);
        viewsubject.setLayout(viewsubjectLayout);
        viewsubjectLayout.setHorizontalGroup(
            viewsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewsubjectLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(subId, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(search6)
                .addGap(67, 67, 67))
            .addGroup(viewsubjectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewsubjectLayout.createSequentialGroup()
                        .addComponent(delete2)
                        .addGap(28, 28, 28)
                        .addComponent(update5)
                        .addGap(30, 30, 30)
                        .addComponent(back10)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewsubjectLayout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
            .addGroup(viewsubjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11)
                .addContainerGap())
        );
        viewsubjectLayout.setVerticalGroup(
            viewsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewsubjectLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(viewsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search6))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(viewsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back10)
                    .addComponent(update5)
                    .addComponent(delete2))
                .addContainerGap())
        );

        card.add(viewsubject, "card11");

        updatesubject.setBackground(new java.awt.Color(0, 204, 204));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(204, 0, 0));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("UPDATE SUBJECT DETAILS");

        back11.setBackground(new java.awt.Color(0, 0, 255));
        back11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back11.setText("Back");
        back11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back11ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Subject Id");

        subId7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subId7KeyReleased(evt);
            }
        });

        table_display7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Faculty", "Course", "Subject Name", "Subject Id", "Type", "Academic Year", "Semester", "Subject Credits", "Subject Fees", "Lecturer"
            }
        ) {public boolean isCellEditable(int row, int column){return false;}});
        table_display7.setEditingColumn(0);
        table_display7.setEditingRow(0);
        table_display7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_display7MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(table_display7);

        search7.setBackground(new java.awt.Color(0, 0, 255));
        search7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search7.setText("Search");
        search7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search7ActionPerformed(evt);
            }
        });

        update6.setBackground(new java.awt.Color(0, 0, 255));
        update6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update6.setText("Update");
        update6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatesubjectLayout = new javax.swing.GroupLayout(updatesubject);
        updatesubject.setLayout(updatesubjectLayout);
        updatesubjectLayout.setHorizontalGroup(
            updatesubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatesubjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
            .addGroup(updatesubjectLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(subId7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(search7)
                .addGap(67, 67, 67))
            .addGroup(updatesubjectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(updatesubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatesubjectLayout.createSequentialGroup()
                        .addComponent(update6)
                        .addGap(30, 30, 30)
                        .addComponent(back11)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatesubjectLayout.createSequentialGroup()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        updatesubjectLayout.setVerticalGroup(
            updatesubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatesubjectLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(updatesubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subId7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(updatesubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back11)
                    .addComponent(update6))
                .addContainerGap())
        );

        card.add(updatesubject, "card11");

        deletesubject.setBackground(new java.awt.Color(0, 204, 204));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(204, 0, 0));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("DELETE SUBJECT DETAILS");

        back12.setBackground(new java.awt.Color(0, 0, 255));
        back12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back12.setText("Back");
        back12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back12ActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Subject Id");

        subId8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subId8KeyReleased(evt);
            }
        });

        table_display8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Faculty", "Course", "Subject Name", "Subject Id", "Type", "Academic Year", "Semester", "Subject Credits", "Subject Fees", "Lecturer"
            }
        ){public boolean isCellEditable(int row, int column){return false;}});
        table_display8.setEditingColumn(0);
        table_display8.setEditingRow(0);
        table_display8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_display8MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(table_display8);
        if (table_display8.getColumnModel().getColumnCount() > 0) {
            table_display8.getColumnModel().getColumn(0).setResizable(false);
        }

        search8.setBackground(new java.awt.Color(0, 0, 255));
        search8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search8.setText("Search");
        search8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search8ActionPerformed(evt);
            }
        });

        delete6.setBackground(new java.awt.Color(0, 0, 255));
        delete6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete6.setText("Delete");
        delete6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletesubjectLayout = new javax.swing.GroupLayout(deletesubject);
        deletesubject.setLayout(deletesubjectLayout);
        deletesubjectLayout.setHorizontalGroup(
            deletesubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletesubjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9)
                .addContainerGap())
            .addGroup(deletesubjectLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(subId8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(search8)
                .addGap(67, 67, 67))
            .addGroup(deletesubjectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(deletesubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletesubjectLayout.createSequentialGroup()
                        .addComponent(delete6)
                        .addGap(30, 30, 30)
                        .addComponent(back12)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletesubjectLayout.createSequentialGroup()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        deletesubjectLayout.setVerticalGroup(
            deletesubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletesubjectLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(deletesubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subId8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(deletesubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back12)
                    .addComponent(delete6))
                .addContainerGap())
        );

        card.add(deletesubject, "card11");

        updatecourses.setBackground(new java.awt.Color(0, 204, 204));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("FEES DETAILS");

        pgfees.setBackground(new java.awt.Color(51, 255, 204));
        pgfees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pgfees.setText("Postgraduates Fees Details");
        pgfees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pgfees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgfeesActionPerformed(evt);
            }
        });

        ugfees.setBackground(new java.awt.Color(51, 255, 204));
        ugfees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ugfees.setText("Undergraduates Fees Details");
        ugfees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ugfees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ugfeesActionPerformed(evt);
            }
        });

        back14.setBackground(new java.awt.Color(0, 0, 255));
        back14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back14.setText("Back");
        back14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatecoursesLayout = new javax.swing.GroupLayout(updatecourses);
        updatecourses.setLayout(updatecoursesLayout);
        updatecoursesLayout.setHorizontalGroup(
            updatecoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatecoursesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back14)
                .addGap(106, 106, 106))
            .addGroup(updatecoursesLayout.createSequentialGroup()
                .addGroup(updatecoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatecoursesLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updatecoursesLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(updatecoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ugfees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pgfees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        updatecoursesLayout.setVerticalGroup(
            updatecoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatecoursesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(ugfees)
                .addGap(39, 39, 39)
                .addComponent(pgfees)
                .addGap(106, 106, 106)
                .addComponent(back14)
                .addGap(65, 65, 65))
        );

        card.add(updatecourses, "card13");

        coursesbu.setBackground(new java.awt.Color(0, 204, 204));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("COURSES");

        fees.setBackground(new java.awt.Color(51, 255, 204));
        fees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fees.setText("Calculate Fees");
        fees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesActionPerformed(evt);
            }
        });

        regi.setBackground(new java.awt.Color(51, 255, 204));
        regi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        regi.setText("Register");
        regi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regiActionPerformed(evt);
            }
        });

        back16.setBackground(new java.awt.Color(0, 0, 255));
        back16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back16.setText("Back");
        back16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout coursesbuLayout = new javax.swing.GroupLayout(coursesbu);
        coursesbu.setLayout(coursesbuLayout);
        coursesbuLayout.setHorizontalGroup(
            coursesbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursesbuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back16)
                .addGap(106, 106, 106))
            .addGroup(coursesbuLayout.createSequentialGroup()
                .addGroup(coursesbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coursesbuLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(coursesbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(coursesbuLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        coursesbuLayout.setVerticalGroup(
            coursesbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursesbuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(regi)
                .addGap(41, 41, 41)
                .addComponent(fees)
                .addGap(106, 106, 106)
                .addComponent(back16)
                .addGap(65, 65, 65))
        );

        card.add(coursesbu, "card13");

        results.setBackground(new java.awt.Color(0, 204, 204));

        pgstudent1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pgstudent1.setText("Postgraduate Student");
        pgstudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgstudent1ActionPerformed(evt);
            }
        });

        ugstudent1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ugstudent1.setText("Undergraduate Student");
        ugstudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ugstudent1ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 102));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("STUDENT RESULTS");

        back15.setBackground(new java.awt.Color(0, 0, 255));
        back15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back15.setText("Back");
        back15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultsLayout = new javax.swing.GroupLayout(results);
        results.setLayout(resultsLayout);
        resultsLayout.setHorizontalGroup(
            resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsLayout.createSequentialGroup()
                .addGroup(resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultsLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pgstudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ugstudent1)))
                    .addGroup(resultsLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(back15))
                    .addGroup(resultsLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        resultsLayout.setVerticalGroup(
            resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultsLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(ugstudent1)
                .addGap(53, 53, 53)
                .addComponent(pgstudent1)
                .addGap(52, 52, 52)
                .addComponent(back15)
                .addGap(100, 100, 100))
        );

        card.add(results, "card7");

        TimeSlot_Sob.setBackground(new java.awt.Color(0, 204, 204));

        newadmin2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        newadmin2.setForeground(new java.awt.Color(0, 0, 102));
        newadmin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newadmin2.setText("ALLOCATE ROOMS AND LABS FOR SCHOOL OF BUSINESS ");

        backSOB.setBackground(new java.awt.Color(0, 0, 255));
        backSOB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backSOB.setText("Back");
        backSOB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backSOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSOBActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Type");

        type2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Undergraduate", "Postgraduate" }));
        type2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                type2ItemStateChanged(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Year");

        year2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        year2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st year", "2nd year", "3rd year", "4th year" }));
        year2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                year2ItemStateChanged(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Semester");

        semester2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        semester2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st Semester", "2nd Semester" }));
        semester2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semester2ItemStateChanged(evt);
            }
        });
        semester2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semester2ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Subject");

        subject2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject2ActionPerformed(evt);
            }
        });
        subject2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subject2KeyReleased(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Lecturer/Instructor");

        lecORins2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecORins2ActionPerformed(evt);
            }
        });
        lecORins2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lecORins2KeyReleased(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Day");

        day2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        day2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        day2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                day2ItemStateChanged(evt);
            }
        });
        day2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day2ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Time from");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Time to");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("Lecturer Room/ Lab");

        tymform2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tymform2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00", "9.00", "10.00", "11.00", "12.00", "1.00", "2.00", "3.00", "4.00", " " }));
        tymform2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tymform2ItemStateChanged(evt);
            }
        });
        tymform2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tymform2ActionPerformed(evt);
            }
        });

        tymto2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tymto2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9.00", "10.00", "11.00", "12.00", "1.00", "2.00", "3.00", "4.00", "5.00" }));
        tymto2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tymto2ItemStateChanged(evt);
            }
        });
        tymto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tymto2ActionPerformed(evt);
            }
        });

        lecRoom2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lecRoom2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LAB A", "LAB B", "LAB C", "LAB D", "LAB E", "LECR A", "LECR B", "LECR C", "LECR D", "LECR E", " " }));
        lecRoom2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lecRoom2ItemStateChanged(evt);
            }
        });
        lecRoom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecRoom2ActionPerformed(evt);
            }
        });

        add2.setBackground(new java.awt.Color(0, 0, 255));
        add2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add2.setText("Add");
        add2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        table_display9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Year", "Semester", "Subject", "Lecturer/ Instructor", "Day", "Time From", "Time To", "Lecturer Room/ Lab"
            }
        ){public boolean isCellEditable(int row, int column){return false;}});
        table_display9.setEditingColumn(0);
        table_display9.setEditingRow(0);
        table_display9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_display9MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_display9);

        add3.setBackground(new java.awt.Color(0, 0, 255));
        add3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add3.setText("Refresh");
        add3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TimeSlot_SobLayout = new javax.swing.GroupLayout(TimeSlot_Sob);
        TimeSlot_Sob.setLayout(TimeSlot_SobLayout);
        TimeSlot_SobLayout.setHorizontalGroup(
            TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeSlot_SobLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39))
                .addGap(22, 22, 22)
                .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tymform2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tymto2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lecRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(type2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(year2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semester2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subject2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecORins2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TimeSlot_SobLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(newadmin2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addGap(206, 206, 206))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeSlot_SobLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add2)
                .addGap(29, 29, 29)
                .addComponent(add3)
                .addGap(18, 18, 18)
                .addComponent(backSOB)
                .addGap(320, 320, 320))
        );
        TimeSlot_SobLayout.setVerticalGroup(
            TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeSlot_SobLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(newadmin2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TimeSlot_SobLayout.createSequentialGroup()
                        .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semester2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subject2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lecORins2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeSlot_SobLayout.createSequentialGroup()
                                .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tymform2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tymto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lecRoom2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TimeSlot_SobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backSOB)
                    .addComponent(add3)
                    .addComponent(add2)))
        );

        card.add(TimeSlot_Sob, "card8");

        getContentPane().add(card, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void instructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorActionPerformed
        homebu.setVisible(false);
        studentbu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(true);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
    }//GEN-LAST:event_instructorActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        homebu.setVisible(true);
        studentbu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
    }//GEN-LAST:event_homeActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        homebu.setVisible(false);
        studentbu.setVisible(true);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
    }//GEN-LAST:event_studentActionPerformed

    private void lecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerActionPerformed
        homebu.setVisible(false);
        studentbu.setVisible(false);
        lecturerbu.setVisible(true);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);

        
    }//GEN-LAST:event_lecturerActionPerformed

    private void registrationFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationFormActionPerformed
        homebu.setVisible(false);
        studentbu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(true);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);

    }//GEN-LAST:event_registrationFormActionPerformed

    private void CourseRegistrationFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseRegistrationFormActionPerformed
        homebu.setVisible(false);
        studentbu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(true);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        results.setVisible(false);
        
        
    }//GEN-LAST:event_CourseRegistrationFormActionPerformed

    private void newlecturerugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newlecturerugActionPerformed
        NewLecturer nl= new NewLecturer();
        nl.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_newlecturerugActionPerformed

    private void timeslotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeslotActionPerformed
        homebu.setVisible(false);
        studentbu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(true);
        studentIntakebu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_timeslotActionPerformed

    private void scofcomputingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scofcomputingActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(true);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_scofcomputingActionPerformed

    private void scofbusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scofbusinessActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(true);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_scofbusinessActionPerformed

    private void scofengineeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scofengineeringActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(true);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_scofengineeringActionPerformed

    private void pgstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstudentActionPerformed
        PGstudentIntake pg= new PGstudentIntake();
        pg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_pgstudentActionPerformed

    private void ugstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ugstudentActionPerformed
        UGstudentIntake ug= new UGstudentIntake();
        ug.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ugstudentActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(true);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
    }//GEN-LAST:event_backActionPerformed

    private void backSOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSOCActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(true);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_backSOCActionPerformed

    private void backSOEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSOEActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(true);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_backSOEActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectActionPerformed

    private void lecORinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecORinsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecORinsActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

    }//GEN-LAST:event_addActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void tymfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tymfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tymfromActionPerformed

    private void tymtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tymtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tymtoActionPerformed

    private void lecRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecRoomActionPerformed

    private void semester1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semester1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semester1ActionPerformed

    private void subject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subject1ActionPerformed

    private void lecOrins1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecOrins1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecOrins1ActionPerformed

    private void day1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_day1ActionPerformed

    private void tymfrom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tymfrom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tymfrom1ActionPerformed

    private void tymto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tymto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tymto1ActionPerformed

    private void lecRoom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecRoom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecRoom1ActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add1ActionPerformed

    private void newInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInstructorActionPerformed
        NewInstruct kk= new NewInstruct();
        kk.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_newInstructorActionPerformed

    private void newInstructorpgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInstructorpgActionPerformed
        NewInstructerForPG k3= new NewInstructerForPG();
        k3.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_newInstructorpgActionPerformed

    private void newlecturerpgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newlecturerpgActionPerformed
        NewLecturerForPG k5 = new NewLecturerForPG();
        k5.setVisible(true);
        setVisible(false);
                       
    }//GEN-LAST:event_newlecturerpgActionPerformed

    private void viewstudentdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstudentdetailActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(true);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_viewstudentdetailActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        //show_user();
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(true);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_back1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
    DefaultTableModel tbl=(DefaultTableModel)table_display.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+stdId.getText().toString()+"'";
            String sql="SELECT * FROM undergraduatestudent Where student_id="+a;
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);

            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Full Name","Student Id","Birth Date","E-mail","Index No","Intake","Year","Contact No","Gender","AL Stream","Z-Score","Island Rank","Faculty","Course","Address"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}
                   // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        DefaultTableModel tbl=(DefaultTableModel)table_display1.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+stdId1.getText().toString()+"'";
            String sql="SELECT * FROM postgraduatestudent Where student_id="+a;
            PreparedStatement pst=con.prepareStatement(sql);

            ResultSet result_s=pst.executeQuery();
            String col_name3[]={"Full Name","Student Id","Birth Date","E-mail","Index No","Intake","Year","Contact No","Gender","AL Stream","Z-Score","Island Rank","Faculty","Course","Address","Qualification","Institute","Passed year"};
            tbl.setColumnIdentifiers(col_name3);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols2=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj3=new Object[cols2];
                int j;
                for(j=0;j<cols2;j++){
                    obj3[j]=result_s.getObject(j+1);

                }
                tbl.addRow(obj3);

            }
            stdId1.setText("");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}// TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        //show_pguser();
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(true);
        updateug.setVisible(false);
        updatepg.setVisible(false);
        deleteug.setVisible(false);
        deletepg.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_back2ActionPerformed

    private void viewpgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpgActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(true);
        viewbu.setVisible(false);
        updateug.setVisible(false);
        updatepg.setVisible(false);
        deleteug.setVisible(false);
        deletepg.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
        show_pguser();
    }//GEN-LAST:event_viewpgActionPerformed

    private void viewugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewugActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(true);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
        show_user();
    }//GEN-LAST:event_viewugActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(true);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_back3ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     updateundergradute ne = new updateundergradute();
     ne.setVisible(true);
     setVisible(false);
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display.getSelectedRow();
            TableModel model = table_display.getModel();
            String tblclick = "'"+model.getValueAt(row, 1).toString()+"'";
            
            String sql = "select * from undergraduatestudent where student_id ="+tblclick;
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                String a= "'"+ne.fullname.getText().toString()+"'";
                a = rs.getString("full_name");
                ne.fullname.setText(a);
                
                a = rs.getString("student_id");
                ne.studentid.setText(a);
                Date date;
                date = new SimpleDateFormat ("yyyy-MM-dd").parse((String)model.getValueAt(row, 2).toString());
                a = rs.getString("birth_date");
                ne.birthdate.setDate(date);
                a = rs.getString("e_mail");
                ne.email.setText(a);
                a = rs.getString("index_no");
                ne.indexno.setText(a);
                a = rs.getString("intake");
                ne.intake.setSelectedItem(a);
                a = rs.getString("year");
                ne.year.setText(a);
                a = rs.getString("contact_no");
                ne.contactno.setText(a);
                a = rs.getString("gender");
                ne.gender.setSelectedItem(a);
                a = rs.getString("al_stream");
                ne.stream.setSelectedItem(a);
                a = rs.getString("z_score");
                ne.zscore.setText(a);
                a = rs.getString("island_rank");
                ne.islandrank.setText(a);
                a = rs.getString("faculty");
                ne.faculty.setSelectedItem(a);
                a = rs.getString("course");
                ne.course.setSelectedItem(a);
                a = rs.getString("address");
                ne.address.setText(a);
                ne.studentid.enable(false);
                ne.intake.setEnabled(false);

            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
     
     
     
           // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void table_displayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_displayMouseClicked
        
    }//GEN-LAST:event_table_displayMouseClicked

    private void stdId1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stdId1KeyPressed
      // TODO add your handling code here:
    }//GEN-LAST:event_stdId1KeyPressed

    private void stdId1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stdId1KeyTyped
         // TODO add your handling code here:
    }//GEN-LAST:event_stdId1KeyTyped

    private void Update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update2ActionPerformed
        updatepostgraduate ne = new updatepostgraduate();
        ne.setVisible(true);
        setVisible(false);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display1.getSelectedRow();
            TableModel model = table_display1.getModel();
            String tblclick = "'"+model.getValueAt(row, 1).toString()+"'";
            
            String sql = "select * from postgraduatestudent where student_id ="+tblclick;
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs = pst.executeQuery();
            
           
            if(rs.next())
            {
                String a= "'"+ne.fullname.getText().toString()+"'";
                a = rs.getString("full_name");
                ne.fullname.setText(a);
                //a= "'"+f.studentid.getText().toString()+"'";
                a = rs.getString("student_id");
                ne.studentid.setText(a);
                Date date;
                date = new SimpleDateFormat ("yyyy-MM-dd").parse((String)model.getValueAt(row, 2).toString());
                a = rs.getString("birth_date");
                ne.birthdate.setDate(date);
                a = rs.getString("e_mail");
                ne.email.setText(a);
                a = rs.getString("index_no");
                ne.indexno.setText(a);
                a = rs.getString("intake");
                ne.intake.setSelectedItem(a);
                a = rs.getString("year");
                ne.year.setText(a);
                a = rs.getString("contact_no");
                ne.contactno.setText(a);
                a = rs.getString("gender");
                ne.gender.setSelectedItem(a);
                a = rs.getString("al_stream");
                ne.stream.setSelectedItem(a);
                a = rs.getString("z_score");
                ne.zscore.setText(a);
                a = rs.getString("island_rank");
                ne.islandrank.setText(a);
                a = rs.getString("course");
                ne.course.setSelectedItem(a);
                a = rs.getString("address");
                ne.address.setText(a);
                a = rs.getString("qualification");
                ne.qualification.setText(a);
                a = rs.getString("institution");
                ne.institute.setText(a);
                a = rs.getString("passed_year");
                ne.passedyear.setText(a);
                /*String b = rs.getString("faculty");
                ne.faculty.setSelectedItem(b);*/
                ne.studentid.enable(false);
                ne.intake.setEnabled(false);

            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_Update2ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       DefaultTableModel model1= (DefaultTableModel)table_display.getModel();
       try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display.getSelectedRow();
            //TableModel model = table_display4.getModel();
            //AccessibleContext ae= table_display4.getAccessibleContext();
            String tblclick = "'"+model1.getValueAt(row, 1).toString()+"'";
            if (row >= 0) {

                model1.removeRow(row);

                
                    //Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo", "root", "");
                    PreparedStatement ps = con.prepareStatement("delete from undergraduatestudent where student_id ="+tblclick);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Deleted Successfully");
                }           
            }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Please Select to want to delete row and click Delete");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void stdIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stdIdKeyReleased
    DefaultTableModel tbl=(DefaultTableModel)table_display.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+stdId.getText().toString()+"'";
            String sql="select * from undergraduatestudent where student_id like ?";
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, stdId.getText() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Full Name","Student Id","Birth Date","E-mail","Index No","Intake","Year","Contact No","Gender","AL Stream","Z-Score","Island Rank","Faculty","Course","Address"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}        // TODO add your handling code here:
    }//GEN-LAST:event_stdIdKeyReleased

    private void updatestudentdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestudentdetailActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(true);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_updatestudentdetailActionPerformed

    private void deletestudentdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestudentdetailActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(true);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_deletestudentdetailActionPerformed

    private void updateugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateugActionPerformed

        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(true);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
         
        show_user2();
    }//GEN-LAST:event_updateugActionPerformed

    private void updatepgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatepgActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(true);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
        show_pguser1();
    }//GEN-LAST:event_updatepgActionPerformed

    private void back4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back4ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(true);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_back4ActionPerformed

    private void deleteugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteugActionPerformed

        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(true);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
        show_user3();
    }//GEN-LAST:event_deleteugActionPerformed

    private void deletepgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletepgActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(true);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        show_pguser5();
    }//GEN-LAST:event_deletepgActionPerformed

    private void back5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back5ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(true);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
    }//GEN-LAST:event_back5ActionPerformed

    private void stdId2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stdId2KeyReleased
DefaultTableModel tbl=(DefaultTableModel)table_display2.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+stdId2.getText().toString()+"'";
           String sql="select * from undergraduatestudent where student_id like ?";
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, stdId2.getText() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Full Name","Student Id","Birth Date","E-mail","Index No","Intake","Year","Contact No","Gender","AL Stream","Z-Score","Island Rank","Faculty","Course","Address"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}          // TODO add your handling code here:
    }//GEN-LAST:event_stdId2KeyReleased

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
    DefaultTableModel tbl=(DefaultTableModel)table_display2.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+stdId2.getText().toString()+"'";
           String sql="SELECT * FROM undergraduatestudent Where student_id="+a;
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);

            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Full Name","Student Id","Birth Date","E-mail","Index No","Intake","Year","Contact No","Gender","AL Stream","Z-Score","Island Rank","Faculty","Course","Address"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            stdId2.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}
    }//GEN-LAST:event_search2ActionPerformed

    private void table_display2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_display2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_display2MouseClicked

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
     updateundergradute ne = new updateundergradute();
     ne.setVisible(true);
     setVisible(false);
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display2.getSelectedRow();
            TableModel model = table_display2.getModel();
            String tblclick = "'"+model.getValueAt(row, 1).toString()+"'";
            
            String sql = "select * from undergraduatestudent where student_id ="+tblclick;
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                String a= "'"+ne.fullname.getText().toString()+"'";
                a = rs.getString("full_name");
                ne.fullname.setText(a);
                //a= "'"+f.studentid.getText().toString()+"'";
                a = rs.getString("student_id");
                ne.studentid.setText(a);
                Date date;
                date = new SimpleDateFormat ("yyyy-MM-dd").parse((String)model.getValueAt(row, 2).toString());
                a = rs.getString("birth_date");
                ne.birthdate.setDate(date);
                a = rs.getString("e_mail");
                ne.email.setText(a);
                a = rs.getString("index_no");
                ne.indexno.setText(a);
                a = rs.getString("intake");
                ne.intake.setSelectedItem(a);
                a = rs.getString("year");
                ne.year.setText(a);
                a = rs.getString("contact_no");
                ne.contactno.setText(a);
                a = rs.getString("gender");
                ne.gender.setSelectedItem(a);
                a = rs.getString("al_stream");
                ne.stream.setSelectedItem(a);
                a = rs.getString("z_score");
                ne.zscore.setText(a);
                a = rs.getString("island_rank");
                ne.islandrank.setText(a);
                a = rs.getString("faculty");
                ne.faculty.setSelectedItem(a);
                a = rs.getString("course");
                ne.course.setSelectedItem(a);
                a = rs.getString("address");
                ne.address.setText(a);
                ne.studentid.enable(false);
                ne.intake.setEnabled(false);

            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
     
             // TODO add your handling code here:
    }//GEN-LAST:event_update1ActionPerformed

    private void back6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back6ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(true);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_back6ActionPerformed

    private void stdId3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stdId3KeyReleased
DefaultTableModel tbl=(DefaultTableModel)table_display.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+stdId.getText().toString()+"'";
           String sql="select * from undergraduatestudent where student_id like ?";
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, stdId.getText() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Full Name","Student Id","Birth Date","E-mail","Index No","Intake","Year","Contact No","Gender","AL Stream","Z-Score","Island Rank","Faculty","Course","Address"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}         // TODO add your handling code here:
    }//GEN-LAST:event_stdId3KeyReleased

    private void search3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search3ActionPerformed

    private void updatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatekActionPerformed
        updatepostgraduate ne = new updatepostgraduate();
        ne.setVisible(true);
        setVisible(false);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display3.getSelectedRow();
            TableModel model = table_display3.getModel();
            String tblclick = "'"+model.getValueAt(row, 1).toString()+"'";
            
            String sql = "select * from postgraduatestudent where student_id ="+tblclick;
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs = pst.executeQuery();
            
           
            if(rs.next())
            {
                String a= "'"+ne.fullname.getText().toString()+"'";
                a = rs.getString("full_name");
                ne.fullname.setText(a);
                //a= "'"+f.studentid.getText().toString()+"'";
                a = rs.getString("student_id");
                ne.studentid.setText(a);
                Date date;
                date = new SimpleDateFormat ("yyyy-MM-dd").parse((String)model.getValueAt(row, 2).toString());
                a = rs.getString("birth_date");
                ne.birthdate.setDate(date);
                a = rs.getString("e_mail");
                ne.email.setText(a);
                a = rs.getString("index_no");
                ne.indexno.setText(a);
                a = rs.getString("intake");
                ne.intake.setSelectedItem(a);
                a = rs.getString("year");
                ne.year.setText(a);
                a = rs.getString("contact_no");
                ne.contactno.setText(a);
                a = rs.getString("gender");
                ne.gender.setSelectedItem(a);
                a = rs.getString("al_stream");
                ne.stream.setSelectedItem(a);
                a = rs.getString("z_score");
                ne.zscore.setText(a);
                a = rs.getString("island_rank");
                ne.islandrank.setText(a);
                a = rs.getString("course");
                ne.course.setSelectedItem(a);
                a = rs.getString("address");
                ne.address.setText(a);
                a = rs.getString("qualification");
                ne.qualification.setText(a);
                a = rs.getString("institution");
                ne.institute.setText(a);
                a = rs.getString("passed_year");
                ne.passedyear.setText(a);
                /*String b = rs.getString("faculty");
                ne.faculty.setSelectedItem(b);*/
                ne.studentid.enable(false);
                ne.intake.setEnabled(false);

            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }//GEN-LAST:event_updatekActionPerformed

    private void back7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back7ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(true);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_back7ActionPerformed

    private void stdId4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stdId4KeyReleased
DefaultTableModel tbl=(DefaultTableModel)table_display4.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+stdId4.getText().toString()+"'";
           String sql="select * from undergraduatestudent where student_id like ?";
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, stdId4.getText() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Full Name","Student Id","Birth Date","E-mail","Index No","Intake","Year","Contact No","Gender","AL Stream","Z-Score","Island Rank","Faculty","Course","Address"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}         // TODO add your handling code here:
    }//GEN-LAST:event_stdId4KeyReleased

    private void search4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search4ActionPerformed
DefaultTableModel tbl=(DefaultTableModel)table_display4.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+stdId4.getText().toString()+"'";
           String sql="SELECT * FROM undergraduatestudent Where student_id="+a;
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);

            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Full Name","Student Id","Birth Date","E-mail","Index No","Intake","Year","Contact No","Gender","AL Stream","Z-Score","Island Rank","Faculty","Course","Address"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            stdId4.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}        // TODO add your handling code here:
    }//GEN-LAST:event_search4ActionPerformed

    private void table_display4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_display4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_display4MouseClicked

    private void update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update3ActionPerformed

     DefaultTableModel model1= (DefaultTableModel)table_display4.getModel();
     try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display4.getSelectedRow();
            //TableModel model = table_display4.getModel();
            //AccessibleContext ae= table_display4.getAccessibleContext();
            String tblclick = "'"+model1.getValueAt(row, 1).toString()+"'";
     if (row >= 0) {

                model1.removeRow(row);

                
                    //Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo", "root", "");
                    PreparedStatement ps = con.prepareStatement("delete from undergraduatestudent where student_id ="+tblclick);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Deleted Successfully");
                }           
            }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Please Select to want to delete row and click Delete");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_update3ActionPerformed

    private void back8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back8ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(true);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_back8ActionPerformed

    private void stdId5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stdId5KeyReleased
        DefaultTableModel tbl=(DefaultTableModel)table_display5.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+stdId5.getText().toString()+"'";
            String sql ="select * from postgraduatestudent where student_id like ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, stdId5.getText() + "%");
            
            ResultSet result_s=pst.executeQuery();
            String col_name3[]={"Full Name","Student Id","Birth Date","E-mail","Index No","Intake","Year","Contact No","Gender","AL Stream","Z-Score","Island Rank","Faculty","Course","Address","Qualification","Institute","Passed year"};
            tbl.setColumnIdentifiers(col_name3);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols2=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj3=new Object[cols2];
                int j;
                for(j=0;j<cols2;j++){
                    obj3[j]=result_s.getObject(j+1);

                }
                tbl.addRow(obj3);

            }
            //stdId1.setText("");
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_stdId5KeyReleased

    private void search5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search5ActionPerformed
       DefaultTableModel tbl=(DefaultTableModel)table_display5.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+stdId5.getText().toString()+"'";
            String sql="SELECT * FROM postgraduatestudent Where student_id="+a;
            PreparedStatement pst=con.prepareStatement(sql);

            ResultSet result_s=pst.executeQuery();
            String col_name3[]={"Full Name","Student Id","Birth Date","E-mail","Index No","Intake","Year","Contact No","Gender","AL Stream","Z-Score","Island Rank","Faculty","Course","Address","Qualification","Institute","Passed year"};
            tbl.setColumnIdentifiers(col_name3);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols2=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj3=new Object[cols2];
                int j;
                for(j=0;j<cols2;j++){
                    obj3[j]=result_s.getObject(j+1);

                }
                tbl.addRow(obj3);

            }
            stdId5.setText("");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}// TODO add your handling code here:
    
    }//GEN-LAST:event_search5ActionPerformed

    private void table_display5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_display5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_display5MouseClicked

    private void update4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update4ActionPerformed
        DefaultTableModel model1= (DefaultTableModel)table_display5.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display5.getSelectedRow();
            //TableModel model = table_display4.getModel();
            //AccessibleContext ae= table_display4.getAccessibleContext();
            String tblclick = "'"+model1.getValueAt(row, 1).toString()+"'";
        if (row >= 0) {

                model1.removeRow(row);

                
                    //Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo", "root", "");
                    PreparedStatement ps = con.prepareStatement("delete from postgraduatestudent where student_id ="+tblclick);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Deleted Successfully");
                }           
            }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Please Select to want to delete row and click Delete");
        }
    }//GEN-LAST:event_update4ActionPerformed

    private void back9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back9ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(true);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
    }//GEN-LAST:event_back9ActionPerformed

    private void stdId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdId1ActionPerformed

    private void stdId1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stdId1KeyReleased
        DefaultTableModel tbl=(DefaultTableModel)table_display1.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+stdId1.getText().toString()+"'";
            String sql ="select * from postgraduatestudent where student_id like ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, stdId1.getText() + "%");
            
            ResultSet result_s=pst.executeQuery();
            String col_name3[]={"Full Name","Student Id","Birth Date","E-mail","Index No","Intake","Year","Contact No","Gender","AL Stream","Z-Score","Island Rank","Faculty","Course","Address","Qualification","Institute","Passed year"};
            tbl.setColumnIdentifiers(col_name3);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols2=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj3=new Object[cols2];
                int j;
                for(j=0;j<cols2;j++){
                    obj3[j]=result_s.getObject(j+1);

                }
                tbl.addRow(obj3);

            }
            //stdId1.setText("");
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_stdId1KeyReleased

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        DefaultTableModel model1= (DefaultTableModel)table_display1.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display1.getSelectedRow();
            //TableModel model = table_display4.getModel();
            //AccessibleContext ae= table_display4.getAccessibleContext();
            String tblclick = "'"+model1.getValueAt(row, 1).toString()+"'";
            if (row >= 0) {

                model1.removeRow(row);

                
                    //Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo", "root", "");
                    PreparedStatement ps = con.prepareStatement("delete from postgraduatestudent where student_id ="+tblclick);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Deleted Successfully");
                }           
            }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Please Select to want to delete row and click Delete");
        }
    }//GEN-LAST:event_delete1ActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        homebu.setVisible(false);
        studentbu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(true);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
    }//GEN-LAST:event_subActionPerformed

    private void addbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuActionPerformed
        this.hide();
        NewSubject h = new NewSubject();
        h.setVisible(true);
    }//GEN-LAST:event_addbuActionPerformed

    private void viewsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewsubActionPerformed
        homebu.setVisible(false);
        studentbu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(true);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
        show_user6();
    }//GEN-LAST:event_viewsubActionPerformed

    private void updatesubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatesubActionPerformed
        homebu.setVisible(false);
        studentbu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(true);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
        show_user7();
    }//GEN-LAST:event_updatesubActionPerformed

    private void deletesubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletesubActionPerformed
        homebu.setVisible(false);
        studentbu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(true);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
        
        show_user8();
    }//GEN-LAST:event_deletesubActionPerformed

    private void back10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back10ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(true);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_back10ActionPerformed

    private void subIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subIdKeyReleased
        DefaultTableModel tbl=(DefaultTableModel)table_display6.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+subId.getText().toString()+"'";
            String sql="select * from subjectdetails where sub_id like ?";
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, subId.getText() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Faculty","Course","Subject Name","Subject Id","Type","Academic Year","Semester","Subject Credits","Subject Fees","Lecturer"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }        
    
    }//GEN-LAST:event_subIdKeyReleased

    private void search6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search6ActionPerformed
        DefaultTableModel tbl=(DefaultTableModel)table_display6.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+subId.getText().toString()+"'";
            String sql="SELECT * FROM subjectdetails Where sub_id="+a;
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);

            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Faculty","Course","Subject Name","Subject Id","Type","Academic Year","Semester","Subject Credits","Subject Fees","Lecturer"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            subId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}
                   // TODO add your handling code here:
    
    }//GEN-LAST:event_search6ActionPerformed

    private void update5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update5ActionPerformed
        updateSubject uh = new updateSubject();
        uh.setVisible(true);
        setVisible(false);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display6.getSelectedRow();
            TableModel model = table_display6.getModel();
            String tblclick = "'"+model.getValueAt(row, 3).toString()+"'";
            
            String sql = "select * from subjectdetails where sub_id ="+tblclick;
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs = pst.executeQuery();
            
           
            if(rs.next())
            {
                String a= "'"+uh.subname.getText().toString()+"'";
                a = rs.getString("sub_name");
                uh.subname.setText(a);
                
                a = rs.getString("sub_id");
                uh.subid.setText(a);
                a = rs.getString("faculty");
                uh.faculty.setSelectedItem(a);
                a = rs.getString("course");
                uh.course.setSelectedItem(a);
                a = rs.getString("type");
                uh.type.setSelectedItem(a);
                a = rs.getString("academic_year");
                uh.year.setText(a);
                a = rs.getString("semester");
                uh.seme.setSelectedItem(a);
                a = rs.getString("lecturer");
                uh.lect.setText(a);
                a = rs.getString("sub_credits");
                uh.credit.setText(a);
                a = rs.getString("fees");
                uh.fees.setText(a);
              
                uh.subid.enable(false);
                
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_update5ActionPerformed

    private void delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete2ActionPerformed
        DefaultTableModel model1= (DefaultTableModel)table_display6.getModel();
     try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display6.getSelectedRow();
            //TableModel model = table_display4.getModel();
            //AccessibleContext ae= table_display4.getAccessibleContext();
            String tblclick = "'"+model1.getValueAt(row, 3).toString()+"'";
     if (row >= 0) {

                model1.removeRow(row);
                

                
                    //Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo", "root", "");
                    PreparedStatement ps = con.prepareStatement("delete from subjectdetails where sub_id ="+tblclick);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Deleted Successfully");
                }           
            }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Please Select to want to delete row and click Delete");
        }  
    }//GEN-LAST:event_delete2ActionPerformed

    private void back11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back11ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(true);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_back11ActionPerformed

    private void subId7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subId7KeyReleased
        DefaultTableModel tbl=(DefaultTableModel)table_display7.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+subId7.getText().toString()+"'";
            String sql="select * from subjectdetails where sub_id like ?";
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, subId7.getText() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Faculty","Course","Subject Name","Subject Id","Type","Academic Year","Semester","Subject Credits","Subject Fees","Lecturer"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }        
    }//GEN-LAST:event_subId7KeyReleased

    private void table_display7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_display7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_display7MouseClicked

    private void search7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search7ActionPerformed
        DefaultTableModel tbl=(DefaultTableModel)table_display7.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+subId7.getText().toString()+"'";
            String sql="SELECT * FROM subjectdetails Where sub_id="+a;
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);

            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Faculty","Course","Subject Name","Subject Id","Type","Academic Year","Semester","Subject Credits","Subject Fees","Lecturer"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            subId7.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}
    }//GEN-LAST:event_search7ActionPerformed

    private void update6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update6ActionPerformed
        updateSubject uh = new updateSubject();
        uh.setVisible(true);
        setVisible(false);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display7.getSelectedRow();
            TableModel model = table_display7.getModel();
            String tblclick = "'"+model.getValueAt(row, 3).toString()+"'";
            
            String sql = "select * from subjectdetails where sub_id ="+tblclick;
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs = pst.executeQuery();
            
           
            if(rs.next())
            {
                String a= "'"+uh.subname.getText().toString()+"'";
                a = rs.getString("sub_name");
                uh.subname.setText(a);
                
                a = rs.getString("sub_id");
                uh.subid.setText(a);
                a = rs.getString("faculty");
                uh.faculty.setSelectedItem(a);
                a = rs.getString("course");
                uh.course.setSelectedItem(a);
                a = rs.getString("type");
                uh.type.setSelectedItem(a);
                a = rs.getString("academic_year");
                uh.year.setText(a);
                a = rs.getString("semester");
                uh.seme.setSelectedItem(a);
                a = rs.getString("lecturer");
                uh.lect.setText(a);
                a = rs.getString("sub_credits");
                uh.credit.setText(a);
                a = rs.getString("fees");
                uh.fees.setText(a);
              
                uh.subid.enable(false);
                
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_update6ActionPerformed

    private void back12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back12ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(true);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_back12ActionPerformed

    private void subId8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subId8KeyReleased
        DefaultTableModel tbl=(DefaultTableModel)table_display8.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+subId8.getText().toString()+"'";
            String sql="select * from subjectdetails where sub_id like ?";
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, subId8.getText() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Faculty","Course","Subject Name","Subject Id","Type","Academic Year","Semester","Subject Credits","Subject Fees","Lecturer"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }        
    }//GEN-LAST:event_subId8KeyReleased

    private void table_display8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_display8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_display8MouseClicked

    private void search8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search8ActionPerformed
        DefaultTableModel tbl=(DefaultTableModel)table_display8.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String a= "'"+subId8.getText().toString()+"'";
            String sql="SELECT * FROM subjectdetails Where sub_id="+a;
            //String sql="SELECT * FROM undergraduatestudent Where student_id"+'UG/2017/F001';
            PreparedStatement pst=con.prepareStatement(sql);

            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Faculty","Course","Subject Name","Subject Id","Type","Academic Year","Semester","Subject Credits","Subject Fees","Lecturer"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            subId8.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}
    }//GEN-LAST:event_search8ActionPerformed

    private void delete6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete6ActionPerformed
        DefaultTableModel model1= (DefaultTableModel)table_display8.getModel();
     try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            int row = table_display8.getSelectedRow();
            //TableModel model = table_display4.getModel();
            //AccessibleContext ae= table_display4.getAccessibleContext();
            String tblclick = "'"+model1.getValueAt(row, 3).toString()+"'";
     if (row >= 0) {

                model1.removeRow(row);
                

                
                    //Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo", "root", "");
                    PreparedStatement ps = con.prepareStatement("delete from subjectdetails where sub_id ="+tblclick);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Deleted Successfully");
                }           
            }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Please Select to want to delete row and click Delete");
        }  
    }//GEN-LAST:event_delete6ActionPerformed

    private void stdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdIdActionPerformed

    private void subIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subIdActionPerformed

    private void table_display6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_display6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_display6MouseClicked

    private void back13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back13ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(true);
        results.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_back13ActionPerformed

    private void viewug1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewug1ActionPerformed
        coursedetails kt = new coursedetails();
        kt.setVisible(true);
        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_viewug1ActionPerformed

    private void pgregiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgregiActionPerformed
        PGcoursedetails kt1 = new PGcoursedetails();
        kt1.setVisible(true);
        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_pgregiActionPerformed

    private void pgfeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgfeesActionPerformed
        pgcourseRegi hh = new pgcourseRegi();
        hh.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_pgfeesActionPerformed

    private void ugfeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ugfeesActionPerformed
        ugcourseRegi kt3 = new ugcourseRegi();
        kt3.setVisible(true);
        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_ugfeesActionPerformed

    private void back14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back14ActionPerformed
       homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(true); 
        results.setVisible(false);
    }//GEN-LAST:event_back14ActionPerformed

    private void feesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(true);
        coursesbu.setVisible(false);
        results.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_feesActionPerformed

    private void regiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(true);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_regiActionPerformed

    private void back16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back16ActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(true);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_back16ActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(false);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(true);
        
    }//GEN-LAST:event_resultActionPerformed

    private void pgstudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgstudent1ActionPerformed
        PGResult kk = new PGResult();
        kk.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_pgstudent1ActionPerformed

    private void ugstudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ugstudent1ActionPerformed
        UGResult h = new UGResult();
        h.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ugstudent1ActionPerformed

    private void back15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_back15ActionPerformed

    private void backSOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSOBActionPerformed
        homebu.setVisible(false);
        lecturerbu.setVisible(false);
        instructorbu.setVisible(false);
        timeslotbu.setVisible(true);
        studentIntakebu.setVisible(false);
        studentbu.setVisible(false);
        TimeSlot_Sob.setVisible(false);
        TimeSlot_Soc.setVisible(false);
        TimeSlot_Soe.setVisible(false);
        viewugstu.setVisible(false);
        viewpgstu.setVisible(false);
        viewbu.setVisible(false);
        updateugstudent.setVisible(false);
        updatepgstudent.setVisible(false);
        deleteugstudent.setVisible(false);
        deletepgstudent.setVisible(false);
        updatebu.setVisible(false);
        deletebu.setVisible(false);
        subjectbu.setVisible(false);
        viewsubject.setVisible(false);
        updatesubject.setVisible(false);
        deletesubject.setVisible(false);
        courseregister.setVisible(false);
        updatecourses.setVisible(false);
        coursesbu.setVisible(false);
        results.setVisible(false);
    }//GEN-LAST:event_backSOBActionPerformed

    private void type2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_type2ItemStateChanged

        DefaultTableModel tbl=(DefaultTableModel)table_display9.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String sql="select * from sobtimeslot where type like ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, type2.getSelectedItem() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Type", "Year", "Semester", "Subject", "Lecturer/ Instructor", "Day", "Time From", "Time To", "Lecturer Room/ Lab"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}       // TODO add your handling code here:
    }//GEN-LAST:event_type2ItemStateChanged

    private void year2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_year2ItemStateChanged

        DefaultTableModel tbl=(DefaultTableModel)table_display9.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String sql="select * from sobtimeslot where year like ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, year2.getSelectedItem() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Type", "Year", "Semester", "Subject", "Lecturer/ Instructor", "Day", "Time From", "Time To", "Lecturer Room/ Lab"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}       // TODO add your handling code here:
    }//GEN-LAST:event_year2ItemStateChanged

    private void semester2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semester2ItemStateChanged
        DefaultTableModel tbl=(DefaultTableModel)table_display9.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String sql="select * from sobtimeslot where semester like ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, semester2.getSelectedItem() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Type", "Year", "Semester", "Subject", "Lecturer/ Instructor", "Day", "Time From", "Time To", "Lecturer Room/ Lab"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}        // TODO add your handling code here:
    }//GEN-LAST:event_semester2ItemStateChanged

    private void semester2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semester2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semester2ActionPerformed

    private void subject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subject2ActionPerformed

    private void subject2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subject2KeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_subject2KeyReleased

    private void lecORins2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecORins2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecORins2ActionPerformed

    private void lecORins2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lecORins2KeyReleased

        DefaultTableModel tbl=(DefaultTableModel)table_display9.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String sql="select * from sobtimeslot where lecturer_instructor like ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, lecORins2.getText()+ "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Type", "Year", "Semester", "Subject", "Lecturer/ Instructor", "Day", "Time From", "Time To", "Lecturer Room/ Lab"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);     }   // TODO add your handling code here:
    }//GEN-LAST:event_lecORins2KeyReleased

    private void day2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_day2ItemStateChanged

        DefaultTableModel tbl=(DefaultTableModel)table_display9.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String sql="select * from sobtimeslot where Day like ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, day2.getSelectedItem() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Type", "Year", "Semester", "Subject", "Lecturer/ Instructor", "Day", "Time From", "Time To", "Lecturer Room/ Lab"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}// TODO add your handling code here:
    }//GEN-LAST:event_day2ItemStateChanged

    private void day2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_day2ActionPerformed

    private void tymform2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tymform2ItemStateChanged

        DefaultTableModel tbl=(DefaultTableModel)table_display9.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String sql="select * from sobtimeslot where time_from like ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, tymform2.getSelectedItem() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Type", "Year", "Semester", "Subject", "Lecturer/ Instructor", "Day", "Time From", "Time To", "Lecturer Room/ Lab"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}        // TODO add your handling code here:
    }//GEN-LAST:event_tymform2ItemStateChanged

    private void tymform2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tymform2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tymform2ActionPerformed

    private void tymto2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tymto2ItemStateChanged
        DefaultTableModel tbl=(DefaultTableModel)table_display9.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String sql="select * from sobtimeslot where time_to like ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, tymto2.getSelectedItem() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Type", "Year", "Semester", "Subject", "Lecturer/ Instructor", "Day", "Time From", "Time To", "Lecturer Room/ Lab"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}      // TODO add your handling code here:
    }//GEN-LAST:event_tymto2ItemStateChanged

    private void tymto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tymto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tymto2ActionPerformed

    private void lecRoom2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lecRoom2ItemStateChanged

        DefaultTableModel tbl=(DefaultTableModel)table_display9.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String sql="select * from sobtimeslot where lecturer_room_lab like ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, lecRoom2.getSelectedItem() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Type", "Year", "Semester", "Subject", "Lecturer/ Instructor", "Day", "Time From", "Time To", "Lecturer Room/ Lab"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);}         // TODO add your handling code here:
    }//GEN-LAST:event_lecRoom2ItemStateChanged

    private void lecRoom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecRoom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecRoom2ActionPerformed
public void view()
{
DefaultTableModel tbl=(DefaultTableModel)table_display9.getModel();
        tbl.setRowCount(0);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String sql="select * from sobtimeslot where type like ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, type2.getSelectedItem() + "%");
            ResultSet result_s=pst.executeQuery();
            String col_name2[]={"Type", "Year", "Semester", "Subject", "Lecturer/ Instructor", "Day", "Time From", "Time To", "Lecturer Room/ Lab"};
            tbl.setColumnIdentifiers(col_name2);
            ResultSetMetaData RS=result_s.getMetaData();
            int cols1=RS.getColumnCount();
            while(result_s.next()){
                Object[] obj2=new Object[cols1];
                int i;
                for(i=0;i<cols1;i++){
                    obj2[i]=result_s.getObject(i+1);

                }
                tbl.addRow(obj2);

            }
            //stdId.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);} 
}
    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logininfo","root","");
            String query = "insert into sobtimeslot(type,year,semester,subject,lecturer_instructor,day,time_from,time_to, lecturer_room_lab)values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);

            String typ = type2.getSelectedItem().toString();
            pst.setString(1, typ);
            String ye = year2.getSelectedItem().toString();
            pst.setString(2, ye);
            String sem = semester2.getSelectedItem().toString();
            pst.setString(3, sem);
            pst.setString(4, subject2.getText());
            pst.setString(5, lecORins2.getText());
            String day = day2.getSelectedItem().toString();
            pst.setString(6, day);
            String tymform = tymform2.getSelectedItem().toString();
            pst.setString(7, tymform);
            String tymto = tymto2.getSelectedItem().toString();
            pst.setString(8, tymto);
            String lecRoom = lecRoom2.getSelectedItem().toString();
            pst.setString(9, lecRoom);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Inserted Sucessfully!");
            view();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_add2ActionPerformed

    private void table_display9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_display9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_display9MouseClicked

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed

        view();
        return;

        // TODO add your handling code here:
    }//GEN-LAST:event_add3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CourseRegistrationForm;
    private javax.swing.JPanel TimeSlot_Sob;
    private javax.swing.JPanel TimeSlot_Soc;
    private javax.swing.JPanel TimeSlot_Soe;
    private javax.swing.JButton Update2;
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton addbu;
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JButton back10;
    private javax.swing.JButton back11;
    private javax.swing.JButton back12;
    private javax.swing.JButton back13;
    private javax.swing.JButton back14;
    private javax.swing.JButton back15;
    private javax.swing.JButton back16;
    private javax.swing.JButton back2;
    private javax.swing.JButton back3;
    private javax.swing.JButton back4;
    private javax.swing.JButton back5;
    private javax.swing.JButton back6;
    private javax.swing.JButton back7;
    private javax.swing.JButton back8;
    private javax.swing.JButton back9;
    private javax.swing.JButton backSOB;
    private javax.swing.JButton backSOC;
    private javax.swing.JButton backSOE;
    private javax.swing.JPanel card;
    private javax.swing.JPanel courseregister;
    private javax.swing.JPanel coursesbu;
    private javax.swing.JComboBox day;
    private javax.swing.JComboBox day1;
    private javax.swing.JComboBox day2;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JButton delete2;
    private javax.swing.JButton delete6;
    private javax.swing.JPanel deletebu;
    private javax.swing.JButton deletepg;
    private javax.swing.JPanel deletepgstudent;
    private javax.swing.JButton deletestudentdetail;
    private javax.swing.JButton deletesub;
    private javax.swing.JPanel deletesubject;
    private javax.swing.JButton deleteug;
    private javax.swing.JPanel deleteugstudent;
    private javax.swing.JButton fees;
    private javax.swing.JButton home;
    private javax.swing.JPanel homebu;
    private javax.swing.JButton instructor;
    private javax.swing.JPanel instructorbu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField lecORins;
    private javax.swing.JTextField lecORins2;
    private javax.swing.JTextField lecOrins1;
    private javax.swing.JComboBox lecRoom;
    private javax.swing.JComboBox lecRoom1;
    private javax.swing.JComboBox lecRoom2;
    private javax.swing.JButton lecturer;
    private javax.swing.JPanel lecturerbu;
    private javax.swing.JButton newInstructor;
    private javax.swing.JButton newInstructorpg;
    private javax.swing.JLabel newadmin;
    private javax.swing.JLabel newadmin1;
    private javax.swing.JLabel newadmin2;
    private javax.swing.JButton newlecturerpg;
    private javax.swing.JButton newlecturerug;
    private javax.swing.JButton pgfees;
    private javax.swing.JButton pgregi;
    private javax.swing.JButton pgstudent;
    private javax.swing.JButton pgstudent1;
    private javax.swing.JButton regi;
    private javax.swing.JButton registrationForm;
    private javax.swing.JButton result;
    private javax.swing.JPanel results;
    private javax.swing.JButton scofbusiness;
    private javax.swing.JButton scofcomputing;
    private javax.swing.JButton scofengineering;
    private javax.swing.JButton search;
    private javax.swing.JButton search1;
    private javax.swing.JButton search2;
    private javax.swing.JButton search3;
    private javax.swing.JButton search4;
    private javax.swing.JButton search5;
    private javax.swing.JButton search6;
    private javax.swing.JButton search7;
    private javax.swing.JButton search8;
    private javax.swing.JComboBox semester;
    private javax.swing.JComboBox semester1;
    private javax.swing.JComboBox semester2;
    private javax.swing.JTextField stdId;
    private javax.swing.JTextField stdId1;
    private javax.swing.JTextField stdId2;
    private javax.swing.JTextField stdId3;
    private javax.swing.JTextField stdId4;
    private javax.swing.JTextField stdId5;
    private javax.swing.JButton student;
    private javax.swing.JPanel studentIntakebu;
    private javax.swing.JPanel studentbu;
    private javax.swing.JButton sub;
    private javax.swing.JTextField subId;
    private javax.swing.JTextField subId7;
    private javax.swing.JTextField subId8;
    private javax.swing.JTextField subject;
    private javax.swing.JTextField subject1;
    private javax.swing.JTextField subject2;
    private javax.swing.JPanel subjectbu;
    private javax.swing.JTable table_display;
    private javax.swing.JTable table_display1;
    private javax.swing.JTable table_display2;
    private javax.swing.JTable table_display3;
    private javax.swing.JTable table_display4;
    private javax.swing.JTable table_display5;
    private javax.swing.JTable table_display6;
    private javax.swing.JTable table_display7;
    private javax.swing.JTable table_display8;
    private javax.swing.JTable table_display9;
    private javax.swing.JButton timeslot;
    private javax.swing.JPanel timeslotbu;
    private javax.swing.JComboBox tymform2;
    private javax.swing.JComboBox tymfrom;
    private javax.swing.JComboBox tymfrom1;
    private javax.swing.JComboBox tymto;
    private javax.swing.JComboBox tymto1;
    private javax.swing.JComboBox tymto2;
    private javax.swing.JComboBox type;
    private javax.swing.JComboBox type1;
    private javax.swing.JComboBox type2;
    private javax.swing.JButton ugfees;
    private javax.swing.JButton ugstudent;
    private javax.swing.JButton ugstudent1;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    private javax.swing.JButton update3;
    private javax.swing.JButton update4;
    private javax.swing.JButton update5;
    private javax.swing.JButton update6;
    private javax.swing.JPanel updatebu;
    private javax.swing.JPanel updatecourses;
    private javax.swing.JButton updatek;
    private javax.swing.JButton updatepg;
    private javax.swing.JPanel updatepgstudent;
    private javax.swing.JButton updatestudentdetail;
    private javax.swing.JButton updatesub;
    private javax.swing.JPanel updatesubject;
    private javax.swing.JButton updateug;
    private javax.swing.JPanel updateugstudent;
    private javax.swing.JPanel viewbu;
    private javax.swing.JButton viewpg;
    private javax.swing.JPanel viewpgstu;
    private javax.swing.JButton viewstudentdetail;
    private javax.swing.JButton viewsub;
    private javax.swing.JPanel viewsubject;
    private javax.swing.JButton viewug;
    private javax.swing.JButton viewug1;
    private javax.swing.JPanel viewugstu;
    private javax.swing.JComboBox year;
    private javax.swing.JComboBox year1;
    private javax.swing.JComboBox year2;
    // End of variables declaration//GEN-END:variables

    

    
}
