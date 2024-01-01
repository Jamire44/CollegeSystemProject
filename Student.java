package University;/*
//Jamie Doyle
//16:43:24/11/2023
//Project : 
*/

public class Student extends Member{

    int studentID = 0;
    String course;
    int mark1, mark2, mark3;
    public static int studentCount = 0;

    public Student(){
        super();
        studentID++;
        studentCount++;
    }

    public Student(String name, String email, String course, int mark1, int mark2, int mark3) {
        super(name, email);
        this.course = course;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        studentCount++;
    }

    public Student(String name, String email, String course){
        super(name, email);
        this.course = course;
        studentCount++;
        setMark1(mark1 - 1);
        setMark2(mark2 - 1);
        setMark3(mark3 - 1);

    }

    public int getStudentID() {
        return studentID;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public int getMark3() {
        return mark3;
    }

    public void setAllMarks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }


    public double averageMark(){
        return (mark1 + mark2 + mark3) / 3;
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    public String toString() {
        return "Student ID: " + getStudentID() + "\n" +
                super.toString() + "\n" +
                "Course: " + getCourse() + "\n" +
                "The students 3 marks are: " + getMark1() + "%" + "," + getMark2() + "%" + "," + getMark3() + "%" + "\n" +
                "The average mark of the student is: " + averageMark();
    }

    public int numberOfStudents(){
        return studentCount;
    }
}//class
