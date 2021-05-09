/*name: Hadee Saeed ALoufi / Section: DA1 / Assignment number 3*/
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Person {
    private int id;
    private String name;
    private String nationaly;
    Date dateOfBirth;
    private char gender;
    private int phone;
    private String addres;

Person(int id,String name,String nationaly,int dateOfBirthYear,int dateOfBirthMonth,int dateOfBirthDay,char gender, int phone,String addres){
    this.id = id;
    this.name = name;
    this.nationaly = nationaly;
    this.dateOfBirth = new Date(dateOfBirthYear,dateOfBirthMonth,dateOfBirthDay);
    this.gender = gender;
    this.phone = phone;
    this.addres = addres;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationaly() {
        return nationaly;
    }

    public void setNationaly(String nationaly) {
        this.nationaly = nationaly;
    }

    public String getDateOfBirth() {
        if (dateOfBirth.getMonth()==0){
            return dateOfBirth.getYear()-1+"-"+"12"+"-"+dateOfBirth.getDate();
        }
        return dateOfBirth.getYear()+"-"+dateOfBirth.getMonth()+"-"+dateOfBirth.getDate(); 
    }

    public void setDateOfBirth(int dateOfBirthYear,int dateOfBirthMonth,int dateOfBirthDay) {
        this.dateOfBirth = new Date(dateOfBirthYear,dateOfBirthMonth,dateOfBirthDay);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
    
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.nationaly+" "+this.getDateOfBirth()+" "+this.gender+" "+this.phone+" "+this.addres;
}
    // NOTE: name: Hadeel Saeed ALoufi, ID: 1805645, and section number DA1
}

