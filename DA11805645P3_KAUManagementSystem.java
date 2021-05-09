/*name: Hadee Saeed ALoufi  / Section: DA1 / Assignment number 3*/
import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class DA11805645P3_KAUManagementSystem {

    /**
     * @param args the command line arguments
     */
    private static Teacher getTeacher(Scanner input) {
        String degree = input.next();
        String department = input.next();
        double teachingHours = input.nextDouble();
        String jobTitle = input.next();
        int officeNumber = input.nextInt();
        Boolean onLeave = input.nextBoolean();
        int id = input.nextInt();
        String name = input.next();
        String nationaly = input.next();
        int dateOfBirthYear = input.nextInt();
        int dateOfBirthMonth = input.nextInt();
        int dateOfBirthDay = input.nextInt();
        char gender = input.next().charAt(0);
        int phone = input.nextInt();
        String addres = input.next();
        Teacher getTeacher = new Teacher(degree, department, teachingHours, jobTitle, officeNumber, onLeave, id, name, nationaly, dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay, gender, phone, addres);
        return getTeacher;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static Invigilator getInvigilator(Scanner input) {
        int inviilatonExperienceYears = input.nextInt();
        String inviilatonSkill = input.next();
        String jobTitle = input.next();
        int officeNumber = input.nextInt();
        boolean onLeave = input.nextBoolean();
        int id = input.nextInt();
        String name = input.next();
        String nationaly = input.next();
        int dateOfBirthYear = input.nextInt();
        int dateOfBirthMonth = input.nextInt();
        int dateOfBirthDay = input.nextInt();
        char gender = input.next().charAt(0);
        int phone = input.nextInt();
        String addres = input.next();
        Invigilator getInvigilator = new Invigilator(inviilatonExperienceYears, inviilatonSkill, jobTitle, officeNumber, onLeave, id, name, nationaly, dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay, gender, phone, addres);
        return getInvigilator;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static ExamVenue getExamVenue(Scanner input) {
        int examvenueNo = input.nextInt();
        String floor = input.next();
        int buildingNo = input.nextInt();
        ExamVenue getExamVenue = new ExamVenue(examvenueNo, floor, buildingNo);
        return getExamVenue;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static CourseLab getCourseLab(Scanner input) {
        int labID = input.nextInt();
        String name = input.next();
        double hours = input.nextDouble();
        CourseLab getCourseLab = new CourseLab(labID, name, hours);
        return getCourseLab;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static Course getCourse(Scanner input) {
        int courseID = input.nextInt();
        String courseTitle = input.next();
        double hours = input.nextDouble();
        Course getCourse = new Course(courseID, courseTitle, hours);
        return getCourse;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static Student getStudent(Scanner input) {
        String department = input.next();
        int semester = input.nextInt();
        double cgpa = input.nextDouble();
        int YearOfEnrollment = input.nextInt();
        int MonthOfEnrollment = input.nextInt();
        int DayOfEnrollment = input.nextInt();
        Date enrollDate = new Date(YearOfEnrollment, MonthOfEnrollment, DayOfEnrollment);
        int id = input.nextInt();
        String name = input.next();
        String nationaly = input.next();
        int dateOfBirthYear = input.nextInt();
        int dateOfBirthMonth = input.nextInt();
        int dateOfBirthDay = input.nextInt();
        char gender = input.next().charAt(0);
        int phone = input.nextInt();
        String addres = input.next();
        int totalCourse = input.nextInt();
        int totalCourseLab = input.nextInt();
        Student getStudent = new Student(department, semester, cgpa, enrollDate, id, name, nationaly, dateOfBirthYear, dateOfBirthMonth, dateOfBirthDay, gender, phone, addres, totalCourse, totalCourseLab);
        return getStudent;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static void printReport(Student stud, File file) throws FileNotFoundException {
        PrintWriter write = new PrintWriter(file);
        write.println("--------------- Welcome to KAU Management System ---------------");
        // Current Date
        write.println("--------- Current Date :  " + new Date() + "--------");
        write.println("Command: Print_Report");
        write.println();
        write.println("		--- Student Detail are as Follows: ---");
        write.println(stud.printStudentBasicInfo());
        write.println("		--- Teacher Detail are as Follows: ---");
        write.println(stud.getTeacher().toString());
        write.println("-------------------------------------------------------------------------------------------");
        write.println("		--- Invigilator Detail are as Follows: ---");
        write.println(stud.getInvigilator().toString());
        write.println("-------------------------------------------------------------------------------------------");
        write.println("Course Lab Details are as follows:");
        //print information for courses labs for each students 
        for (int i = 0; i < stud.getTotalCourseLabHrs(); i++) {
            write.println(stud.getCourseLab(i).toString());
        }
        write.println("-------------------------------------------------------------------------------------------");
        write.println("Course Details are as follows:");
        //print information for courses for each students 
        for (int i = 0; i < stud.getTotalCourseHrs(); i++) {
            write.println(stud.getCourse(i).toString());
        }
        write.println("-------------------------------------------------------------------------------------------");
        //print information exam venue for each students 
        write.println(stud.getExamVenue().toString());
        write.println("-------------------------------------------------------------------------------------------");
        //print total hours for all courses and courses labs
        write.println("		Total Hours :" + stud.calTotalHours());
        write.println("	-----------------------------------");
        write.flush();
        write.close();
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) throws FileNotFoundException {
        // Create a file instance 
        File inputFile = new File("input.txt");
        // Check if input file exists
        if (!inputFile.exists()) {
            System.out.println("the file doesn't exist");
            System.exit(0);
        }
        // Create a file
        File StudentWrite = new File("print.txt");
        // Create a Scaner for the file
        Scanner input = new Scanner(inputFile);
        // Create a Print Writer for the file
        PrintWriter write = new PrintWriter(StudentWrite);
        int Teachres = input.nextInt();
        int Invigilator = input.nextInt();
        int ExamVenues = input.nextInt();
        int courseLab = input.nextInt();
        int Course = input.nextInt();
        int Students = input.nextInt();
        //Ceate array of object
        Teacher[] Teacher = new Teacher[Teachres];
        //Ceate array of object
        Invigilator[] invigilator = new Invigilator[Invigilator];
        //Ceate array of object
        ExamVenue[] examVenue = new ExamVenue[ExamVenues];
        //Ceate array of object
        CourseLab[] courseLabs = new CourseLab[courseLab];
        //Ceate array of object
        Course[] course = new Course[Course];
        //Ceate array of object
        Student[] students = new Student[Students];
        // Read data from a file
        write.println("--------------- Welcome to KAU Management System ---------------");
        //index 
        int t = 0;
        //index
        int i = 0;
        //index
        int e = 0;
        //index
        int cL = 0;
        //index
        int c = 0;
        //index
        int s = 0;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        while (input.hasNext()) {
            String command = input.next();
            if (command.equalsIgnoreCase("Add_Teacher")) {
                write.println("Command " + command + ": " + "Add a new doctor record in the System");
                Teacher[t] = getTeacher(input);
                write.println("\n" + Teacher[t].toString());
                write.println();
                write.println("----------------------------------------------------------------");
                t++;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
            } else if (command.equalsIgnoreCase("Add_Invigilator")) {
                StringBuilder remove = new StringBuilder(command);
                StringBuilder removing = remove.delete(0, 4);
                String theNewCommand = removing.toString().toLowerCase();
                write.println("Command " + command + ": " + "Add a new " + theNewCommand + " record in the System");
                invigilator[i] = getInvigilator(input);
                write.println("\n" + invigilator[i].toString());
                write.println();
                write.println("----------------------------------------------------------------");
                i++;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
            } else if (command.equalsIgnoreCase("Add_ExamVenue")) {
                StringBuilder remove = new StringBuilder(command);
                StringBuilder removing = remove.delete(0, 4).insert(4, " ");
                String theNewCommand = removing.toString().toLowerCase();
                write.println("Command " + command + ": " + "Add a new " + theNewCommand + " record in the System");
                examVenue[e] = getExamVenue(input);
                write.println("\n" + examVenue[e].toString());
                write.println("----------------------------------------------------------------");
                e++;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
            } else if (command.equalsIgnoreCase("Add_CourseLab")) {
                StringBuilder remove = new StringBuilder(command);
                StringBuilder removing = remove.delete(0, 4).insert(6, " ");
                String theNewCommand = removing.toString().toLowerCase();
                write.println("Command " + command + ": " + "Add a new " + theNewCommand + " record in the System");
                courseLabs[cL] = getCourseLab(input);
                write.println("\n" + courseLabs[cL].toString());
                write.println();
                write.println("----------------------------------------------------------------");
                cL++;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
            } else if (command.equalsIgnoreCase("Add_Course")) {
                StringBuilder remove = new StringBuilder(command);
                StringBuilder removing = remove.delete(0, 4);
                String theNewCommand = removing.toString().toLowerCase();
                write.println("Command " + command + ": " + "Add a new " + theNewCommand + " record in the System");
                course[c] = getCourse(input);
                write.println("\n" + course[c].toString());
                write.println();
                write.println("----------------------------------------------------------------");
                c++;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
            } else if (command.equalsIgnoreCase("Add_Student")) {
                StringBuilder remove = new StringBuilder(command);
                StringBuilder removing = remove.delete(0, 4);
                String theNewCommand = removing.toString();
                write.println("Command " + command + ": " + "Add a new Student record in the System");
                students[s] = getStudent(input);
                write.println("\n" + students[s].toString());
                write.println("----------------------------------------------------------------");
                s++;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
            } else if (command.equalsIgnoreCase("Assign_Teacher_Student")) {
                write.println("Command " + command + ": " + " Successfully Processed by the System, Following are the details:");
                int teacherID = input.nextInt();
                int studentID = input.nextInt();
                int indextForcompare = 0;
                int indextForcompare1 = 0;
                for (int st = 0; st < students.length; st++) {
                    //combare id
                    if (students[st].getId() == studentID) {
                        indextForcompare = st;
                    }
                }
                for (int k = 0; k < Teacher.length; k++) {
                    //combare id
                    if (Teacher[k].getId() == teacherID) {
                        indextForcompare1 = k;
                    }
                }

                students[indextForcompare].setTeacher(Teacher[indextForcompare1]);
                write.println("		Student: " + students[indextForcompare].getName());
                write.println("		Assigned to Teacher: " + Teacher[indextForcompare1].getName());
                write.println("----------------------------------------------------------------");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
            } else if (command.equalsIgnoreCase("Assign_ExamVenue_Student")) {
                write.println("Command " + command + ": " + " Successfully Processed by the System, Following are the details:");
                int ExamenueNumber = input.nextInt();
                int studentID = input.nextInt();
                int indextForcompare = 0;
                int indextForcompare1 = 0;
                for (int st = 0; st < students.length; st++) {
                    //combare id
                    if (students[st].getId() == studentID) {
                        indextForcompare = st;
                    }
                }
                for (int k = 0; k < examVenue.length; k++) {
                    //combare Exam Venue number
                    if (examVenue[k].getExamVenueNo() == ExamenueNumber) {
                        indextForcompare1 = k;
                    }
                }

                students[indextForcompare].setExamVenue(examVenue[indextForcompare1]);
                write.println("		Student: " + students[indextForcompare].getName());
                write.println("		Assigned to ExamVenue:" + examVenue[indextForcompare1]);
                write.println("----------------------------------------------------------------");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
            } else if (command.equalsIgnoreCase("Assign_Invigilator_Student")) {
                write.println("Command " + command + ": " + " Successfully Processed by the System, Following are the details:");
                int invigilatorID = input.nextInt();
                int studentID = input.nextInt();
                int indextForcompare = 0;
                int indextForcompare1 = 0;
                for (int st = 0; st < students.length; st++) {
                    //combare id
                    if (students[st].getId() == studentID) {
                        indextForcompare = st;
                    }
                }
                for (int k = 0; k < invigilator.length; k++) {
                    //combare id
                    if (invigilator[k].getId() == invigilatorID) {
                        indextForcompare1 = k;
                    }
                }

                students[indextForcompare].setInvigilator(invigilator[indextForcompare1]);
                write.println("		Student: " + students[indextForcompare].getName());
                write.println("		Assigned to Invigilator: " + invigilator[indextForcompare1].getName());
                write.println("----------------------------------------------------------------");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
            } else if (command.equalsIgnoreCase("Assign_CourseLab_Student")) {
                write.println("Command " + command + ": " + " Successfully Processed by the System, Following are the details:");
                int studentID = input.nextInt();
                int indextForcompare = 0;
                int indextForcompare1 = 0;
                for (int st = 0; st < students.length; st++) {
                    //combare id
                    if (students[st].getId() == studentID) {
                        indextForcompare = st;
                        write.println("		Student: " + students[indextForcompare].getName());
                    }
                }
                for (int s2 = 0; s2 < students[indextForcompare].getTotalCourseLabHrs(); s2++) {
                    int labID = input.nextInt();

                    for (int k = 0; k < courseLabs.length; k++) {
                        //combare id
                        if (courseLabs[k].getLabID() == labID) {
                            indextForcompare1 = k;
                            write.println("		 Course Lab added:  " + courseLabs[indextForcompare1]);
                            write.println();
                        }
                    }
                    students[indextForcompare].setCourseLab(courseLabs[indextForcompare1], s2);
                }
                write.println("----------------------------------------------------------------");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            } else if (command.equalsIgnoreCase("Assign_Course_Student")) {
                write.println("Command " + command + ": " + " Successfully Processed by the System, Following are the details:");
                int studentID = input.nextInt();
                int indextForcompare = 0;
                int indextForcompare1 = 0;
                for (int st = 0; st < students.length; st++) {
                    if (students[st].getId() == studentID) {
                        indextForcompare = st;
                        write.println("		Student: " + students[indextForcompare].getName());
                    }
                }
                for (int s2 = 0; s2 < students[indextForcompare].getTotalCourseHrs(); s2++) {
                    int courseID = input.nextInt();
                    for (int k = 0; k < course.length; k++) {
                        //combare CourseCode
                        if (course[k].getCourseCode() == courseID) {
                            indextForcompare1 = k;
                            write.println("		 Course added:  " + course[indextForcompare1]);
                            write.println();
                        }
                    }
                    students[indextForcompare].setCourse(course[indextForcompare1], s2);
                }
                write.println("----------------------------------------------------------------");
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            } else if (command.equalsIgnoreCase("Print_Report")) {
                for (int r = 0; r < students.length; r++) {
                    //rename file from StringBuilder two letter and id number _Student_Report.txt
                    StringBuilder nameOfFile = new StringBuilder().append(students[r].getName().toUpperCase().charAt(0)).append(students[r].getName().toLowerCase().charAt(1)).append(students[r].getId()).append("_Student_Report.txt");
                    String file = nameOfFile.toString();
                    File fileStudent = new File(file);
                    printReport(students[r], fileStudent);
                }
                //Repeat the program until command=Quit.
            } else if (command.equalsIgnoreCase("Quit")) {
                write.print("Thank you for using KAU Management System, Good Bye!");
                System.exit(0);
            }
        }
        write.close();
        input.close();
    }

}

// NOTE: name: Hadeel Saeed ALoufi, ID: 1805645, and section number DA1
