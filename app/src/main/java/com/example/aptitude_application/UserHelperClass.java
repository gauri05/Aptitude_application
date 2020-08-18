package com.example.aptitude_application;

public class UserHelperClass {

    String fullname,rollno,phoneno,email,password,conformpass;

    public UserHelperClass(){

    }

    public UserHelperClass(String fullname, String rollno, String phoneno, String email, String password, String conformpass) {
        this.fullname = fullname;
        this.rollno = rollno;
        this.phoneno = phoneno;
        this.email = email;
        this.password = password;
        this.conformpass = conformpass;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConformpass() {
        return conformpass;
    }

    public void setConformpass(String conformpass) {
        this.conformpass = conformpass;
    }
}
