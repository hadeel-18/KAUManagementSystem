/*name: Hadee Saeed ALoufi / Section: DA1 / Assignment number 3*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Employee extends Person {

private String jobTitle;
private int officeNumber;
private Boolean onLeave;

 Employee(String jobTitle,int officeNumber,Boolean onLeave,int id, String name, String nationaly, int dateOfBirthYear, int dateOfBirthMonth, int dateOfBirthDay, char gender, int phone, String addres){
     
     super(id, name, nationaly, dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay, gender, phone, addres);
     this.jobTitle=jobTitle;
     this.officeNumber=officeNumber;
     this.onLeave=onLeave;
}

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public Boolean getOnLeave() {
        return onLeave;
    }

    public void setOnLeave(Boolean onLeave) {
        this.onLeave = onLeave;
    }

 public String toString(){
        return super.getId()+""+super.getName()+""+super.getNationaly()+""+super.dateOfBirth+""+super.getGender()+""+super.getPhone()+""+super.getAddres()+""+this.jobTitle+""+this.officeNumber+""+this.onLeave;
}
    // NOTE: name: Hadeel Saeed ALoufi, ID: 1805645, and section number DA1
}