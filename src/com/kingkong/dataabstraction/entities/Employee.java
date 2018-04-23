/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.dataabstraction.entities;

/**
 *
 * @author kiran
 */
public class Employee {
    private int id;
    private String firstName,lastName;
    private Boolean status;
    private char gender;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName,char gender, Boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender=gender;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
    public char getGender() {
        return gender;
    }

    public void setGender(int id) {
        this.gender = gender;
    }
}
