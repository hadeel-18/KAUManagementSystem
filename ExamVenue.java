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
public class ExamVenue {
    
private int examVenueNo;
private String floor;
private int buildingNo;

ExamVenue(int examVenueNo,String floor,int buildingNo){
this.examVenueNo=examVenueNo;
this.floor=floor;
this.buildingNo=buildingNo;
}

    public int getExamVenueNo() {
        return examVenueNo;
    }

    public void setExamVenueNo(int examVenueNo) {
        this.examVenueNo = examVenueNo;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

public String toString(){
        return"Exam Venue Details are as follows:" +
                "\n\r"+
                
"\n\r"+" Exam Venue No.: "+getExamVenueNo()+", Floor: "+getFloor()+", Building No.:"+getBuildingNo();

}
// NOTE: name: Hadeel Saeed ALoufi, ID: 1805645, and section number DA1
}
