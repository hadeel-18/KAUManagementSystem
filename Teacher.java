/*name: Hadee Saeed ALoufi /Section: DA1 / Assignment number 3*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Teacher extends Employee {
    
private String degree ;
private String department;
private double teachingHours;

Teacher(String degree , String department , double teachingHours,String jobTitle,int officeNumber,Boolean onLeave,int id, String name, String nationaly, int dateOfBirthYear, int dateOfBirthMonth, int dateOfBirthDay, char gender, int phone, String addres){
super(jobTitle,officeNumber,onLeave,id,name,nationaly,dateOfBirthYear,dateOfBirthMonth,dateOfBirthDay,gender,phone,addres);    
this.degree=degree;
this.department = department;
this.teachingHours = teachingHours;

}

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(double teachingHours) {
        this.teachingHours = teachingHours;
    }

 public String toString(){
        return "ID: "+super.getId()+", Name: "+super.getName()+", Nationality :"+super.getNationaly()+", Date of Birth :"+getDateOfBirth()+" Gender: "+super.getGender()+" Phone: "+super.getPhone()+", Address: "+super.getAddres()+
              "\n\r"+""+
              "\n\r" + "Job Title "+super.getJobTitle()+", Office Number: "+super.getOfficeNumber()+", On Leave : "+super.getOnLeave()+
                "\n\r"+""+
               "\n\r" + ", Degree: "+getDegree()+", Department: "+getDepartment()+", Teaching Hours :"+getTeachingHours();

}
// NOTE: name: Hadeel Saeed ALoufi, ID: 1805645, and section number DA1
}
