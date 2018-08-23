/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pirakavi
 */
public class PgUser {
    int indexno, year, islandrank, passedyear;
    String studentid, birthdate, email, intake, fullname, contactno, gender, stream, zscore, faculty, course, address, qualification, institute;
    
    public PgUser(String fullname, String studentid, String birthdate, String email, int indexno, String intake, int year, String contactno, String gender, String stream, String zscore, int islandrank, String faculty, String course, String address, String qualification, String institute, int passedyear)
    {
        this.fullname = fullname;
        this.studentid = studentid;
        this.birthdate = birthdate;
        this.email = email;
        this.indexno = indexno;
        this.intake = intake;
        this.year = year;
        this.contactno = contactno;
        this.gender = gender;
        this.stream = stream;
        this.zscore = zscore;
        this.islandrank = islandrank;
        this.faculty = faculty;
        this.course = course;
        this.address = address;
        this.qualification = qualification;
        this.institute = institute;
        this.passedyear = passedyear;
    }
    
    public String getFullname(){
        return fullname;
    }
    
    public String getStudentid(){
        return studentid;
    }
    
    public String getBirthdate(){
        return birthdate;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getIndexno(){
        return indexno;
    }
    
    public String getIntake(){
        return intake;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getContactno(){
        return contactno;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getStream(){
        return stream;
    }
    
    public String getZscore(){
        return zscore;
    }
    
    public int getIslandrank(){
        return islandrank;
    }
    
    public String getFaculty(){
        return faculty;
    }
    
    public String getCourse(){
        return course;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getQualification(){
        return qualification;
    }
    
    public String getInstitute(){
        return institute;
    }
    
    public int getPassedyear(){
        return passedyear;
    }
    
}
