package University;/*
//Jamie Doyle
//16:43:24/11/2023
//Project : 
*/

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TestMember {
    public static void main(String[] args) {

        // Staff
        Staff staffBlank = new Staff();

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name: ");
        staffBlank.setName(input.next());
        System.out.println("What is your email: ");
        staffBlank.setEmail(input.next());
        System.out.println("What is your Job Title: ");
        staffBlank.setJobTitle(input.next());
        System.out.println("What room are you in?: ");
        staffBlank.setRoom(input.nextInt());
        staffBlank.setSalary(60000);

        System.out.println("\nNew Staff Member Details: ");
        System.out.println(staffBlank.toString());


        System.out.println("\nNumber of Staff: " + staffBlank.numberOfStaff());

        System.out.println("\n\n");

        Student studentBlank = new Student("Caitlin Johnston", "johnston-c1@kwetb.ie", "Computing", 56, 67, 44);
        System.out.println("\nFirst Student: \n" + studentBlank.toString());


        //Student Two
        Student studentBlank2 = new Student();
        studentBlank2.setName("Caitlin Johnston");
        studentBlank2.setEmail("johnston-c1@kwetb.ie");
        studentBlank2.setCourse("Computing");
        studentBlank2.setMark1(56);
        studentBlank2.setMark2(67);
        studentBlank2.setMark3(44);
        System.out.println("\n" + "Second Student: \n" + studentBlank2.toString());


    }//main
}//class
