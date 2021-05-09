/*name: Hadee Saeed ALoufi / ection: DA1 / Assignment number 3*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Invigilator extends Employee {
    
    private int inviilatonExperienceYears;
    private String inviilatonSkill;
    
    Invigilator(int inviilatonExperienceYears,String inviilatonSkill,String jobTitle,int officeNumber,Boolean onLeave,int id, String name, String nationaly, int dateOfBirthYear, int dateOfBirthMonth, int dateOfBirthDay, char gender, int phone, String addres){
        super(jobTitle,officeNumber,onLeave,id,name,nationaly,dateOfBirthYear,dateOfBirthMonth,dateOfBirthDay,gender,phone,addres); 
        this.inviilatonExperienceYears=inviilatonExperienceYears;
        this.inviilatonSkill=inviilatonSkill;        
    }

    public int getInviilatonExperienceYears() {
        return inviilatonExperienceYears;
    }

    public void setInviilatonExperienceYears(int inviilatonExperienceYears) {
        this.inviilatonExperienceYears = inviilatonExperienceYears;
    }

    public String getInviilatonSkill() {
        return inviilatonSkill;
    }

    public void setInviilatonSkill(String inviilatonSkill) {
        this.inviilatonSkill = inviilatonSkill;
    }
    
     public String toString(){
        return  "ID: "+super.getId()+", Name: "+super.getName()+", Nationality :"+super.getNationaly()+", Date of Birth :"+getDateOfBirth()+" Gender: "+super.getGender()+" Phone: "+super.getPhone()+", Address: "+super.getAddres()+
                "\n\r"+""
                + "\n\r"+"Job Title: "+super.getJobTitle()+", Office Number: "+super.getOfficeNumber()+", On Leave : "+super.getOnLeave()+
                "\n\r"+""+
                "\n\r"+"Year(s) of Invigilaton Experience: "+getInviilatonExperienceYears()+", Invigilaton Expertise: "+getInviilatonSkill();

}
// NOTE: name: Hadeel Saeed ALoufi, ID: 1805645, and section number DA1
}

