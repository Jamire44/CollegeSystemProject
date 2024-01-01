package University;/*
//Jamie Doyle
//16:42:24/11/2023
//Project : 
*/

public class Member {
    String name;
    String email;
    String status;


    // Default Constructor
    public Member(){

    }

    public Member(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "Email: " + getEmail();
    }
}//class
