package com.example.databaselearn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by artur on 09.10.2017.
 */

public class Employee {
    String lname;
    String fname;
    int age;
    //int id;
    public Employee(){

    }
    public Employee( String fname, String lname, int age){

        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
    public String getLname(){
        return this.lname;
    }
    public String getFname(){
        return this.fname;
    }
    public int getAge(){
        return this.age;
    }

    public void setLname(String lname){
        this.lname = lname;
    }
    public void setFname(String fname){
        this.fname = fname;
    }
    public void setAge(int age){
        this.age = age;
    }
}
