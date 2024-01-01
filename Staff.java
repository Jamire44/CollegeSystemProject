package University;/*
//Jamie Doyle
//16:43:24/11/2023
//Project : 
*/

public class Staff extends Member{

    public static int staffID = 1000;
    String jobTitle;
    int room;
    double salary;
    public static int staffCount = 0;

    public Staff(){
        super();
        staffID++;
        staffCount++;
    }

    public Staff(String name, String email, String jobTitle, int room, double salary){
        super(name, email);
        this.jobTitle = jobTitle;
        this.room = room;
        this.salary = salary;
        staffID++;
        staffCount++;
    }

    public Staff(String name, String email) {
        super(name, email);
        staffID++;
        staffCount++;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getRoom() {
        return room;
    }

    public void setSalary(double salary) {
        salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }

    @Override
    public String toString() {
        return "Staff ID: " + staffID + "\n" +
                "Name: " + getName() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Job Title: " + getJobTitle() + "\n" +
                "Room: " + getRoom() + "\n" +
                "Salary: " + "€" + getSalary();
    }

    public int numberOfStaff(){
        return staffCount;
    }
}//class
