/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pirakavi
 */
class Subject {
    int credit;
    String faculty, course, subname, subid, type, year, seme, lect, fees  ;
    
    public Subject(String faculty, String course, String subname, String subid, String type, String year, String seme, int credit, String fees, String lect )
    {
        this.faculty = faculty;
        this.course = course;
        this.subname = subname;
        this.subid = subid;
        this.type = type;
        this.year = year;
        this.seme = seme;
        this.credit = credit;
        this.fees = fees;
        this.lect = lect;
                
    }
    
    public String getFaculty(){
        return faculty;
    }
    
    public String getCourse(){
        return course;
    }
    
    public String getSubname(){
        return subname;
    }
    
    public String getSubid(){
        return subid;
    }
    
    public String getType(){
        return type;
    }
    
    public String getYear(){
        return year;
    }
    
    public String getSeme(){
        return seme;
    }
    
    public int getCredit(){
        return credit;
    }
    
    public String getFees(){
        return fees;
    }
    
    public String getLect(){
        return lect;
    }
   
    
    
}
