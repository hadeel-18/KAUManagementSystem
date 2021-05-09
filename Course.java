/*name: Hadee Saeed ALoufi /  Section: DA1 / Assignment number 3*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Course {
private int courseCode;
private String courseTitle;
private double hours;

Course(int courseCode,String courseTitle,double hours){
this.courseCode = courseCode;
this.courseTitle = courseTitle;
this.hours=hours;
}

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

@Override
 public String toString(){
        return " Course Code: "+getCourseCode()+", Course Title: "+getCourseTitle()+", Credit Hour :"+getHours();

}
// NOTE: name: Hadeel Saeed ALoufi, ID: 1805645, and section number DA1
}
