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
public class CourseLab {
    
private int labID;
private String labName;
private double hours;

CourseLab(int labID,String labName,double hours){
this.labID=labID;
this.labName=labName;
this.hours=hours;
}

    public int getLabID() {
        return labID;
    }

    public void setLabID(int labID) {
        this.labID = labID;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

@Override
  public String toString(){
        return" Labe Code: "+getLabID()+", Lab Name: "+getLabName()+", Credit Hour :"+getHours();

}
// NOTE: name: Hadeel Saeed ALoufi, ID: 1805645, and section number DA1
}
