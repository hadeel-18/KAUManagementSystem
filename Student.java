/*name: Hadee Saeed ALoufi /Section: DA1 / Assignment number 3*/
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
public class Student extends Person {

    private String department;
    private int semester;
    private double cgpa;
    private Teacher teacher;
    private Invigilator invigilator;
    Course[] course;
    CourseLab[] courseLab;
    private ExamVenue examVenue;
    private Date enrollDate;

    Student(String department, int semester, double cgpa,Date enrollDate, int id, String name, String nationaly, int dateOfBirthYear, int dateOfBirthMonth, int dateOfBirthDay, char gender, int phone, String addres, int totCourse, int totCourseLab) {
        super(id, name, nationaly, dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay, gender, phone, addres);
        this.department = department;
        this.semester = semester;
        this.cgpa = cgpa;
        this.enrollDate = enrollDate;
        this.course=new Course[totCourse];
        this.courseLab=new CourseLab[totCourseLab];
    }
    
   public int getTotalCourseHrs(){
      return course.length;
   }
    public int getTotalCourseLabHrs(){
    return courseLab.length;
    }
    

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Invigilator getInvigilator() {
        return invigilator;
    }

    public void setInvigilator(Invigilator invigilator) {
        this.invigilator = invigilator;
    }

    public Course getCourse(int index) {
        return course[index];
    }

    public void setCourse(Course course,int index) {
        this.course [index] = course;
    }

    public CourseLab getCourseLab(int index) {
        return courseLab[index];
    }

    public void setCourseLab(CourseLab courseLab,int index) {
           this.courseLab[index]=courseLab;
    }

    public ExamVenue getExamVenue() {
        return examVenue;
    }

    public void setExamVenue(ExamVenue examVenue) {
        this.examVenue = examVenue;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public double calTotalHours(){
      double totalHours = 0;
      for(int i = 0;i<courseLab.length;i++){
          totalHours+=courseLab[i].getHours();
      }
      for(int i = 0;i<course.length;i++){
          totalHours+=course[i].getHours();
      }
      return totalHours;
    }
    
    public String printStudentBasicInfo(){
     return "ID: "+super.getId()+", Name: "+super.getName()+", Nationality :"+super.getNationaly()+", Date of Birth :"+super.dateOfBirth.getYear()+"-"+super.dateOfBirth.getMonth()+"-"+super.dateOfBirth.getDate()+" Gender: "+super.getGender()+" Phone: "+super.getPhone()+", Address: "+super.getAddres()+"\n\r"
                + "\n\r"+"-------------------------------------------------------------------------------------------"+""+"\n\r"
                + "\n\r"+"Department: "+getDepartment()+", Semester: "+getSemester()+""
                + "\n\r"+""
                + "\n\r"+", CGPA: "+getCgpa()+""+ "\n\r"+""
                + "\n\r"+", Enrollment Date: "+getEnrollDate()+""+"\n\r"
                + "\n\r"+"-------------------------------------------------------------------------------------------";   
}
    
    @Override
  public String toString(){
        return "ID: "+super.getId()+", Name: "+super.getName()+", Nationality :"+super.getNationaly()+", Date of Birth :"+super.getDateOfBirth()+" Gender: "+super.getGender()+" Phone: "+super.getPhone()+", Address: "+super.getAddres()+"\n\r"
                + "\n\r"+"-------------------------------------------------------------------------------------------"+""+"\n\r"
                + "\n\r"+"Department: "+getDepartment()+", Semester: "+getSemester()+""
                + "\n\r"+""
                + "\n\r"+"CGPA: "+getCgpa()+""+ "\n\r"+""
                + "\n\r"+"Enrollment Date: "+getEnrollDate()+""+"\n\r"
                + "\n\r"+"-------------------------------------------------------------------------------------------";

}
  // NOTE: name: Hadeel Saeed ALoufi, ID: 1805645, and section number DA1
}
