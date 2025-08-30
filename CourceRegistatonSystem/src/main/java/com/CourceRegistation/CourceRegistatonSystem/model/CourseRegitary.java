package com.CourceRegistation.CourceRegistatonSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CourseRegitary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String U_name;
    private String U_email;
    private String college;
    private String courceName;

    public CourseRegitary() {
    }

    public CourseRegitary(String u_name, String u_email, String college, String courceName) {
        U_name = u_name;
        U_email = u_email;
        this.college = college;
        this.courceName = courceName;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getU_name() {return U_name;}
    public void setU_name(String u_name) {U_name = u_name;}
    public String getU_email() {return U_email;}
    public void setU_email(String u_email) {U_email = u_email;}
    public String getCollege() {return college;}
    public void setCollege(String college) {this.college = college;}
    public String getCourceName() {return courceName;}
    public void setCourceName(String courceName) {this.courceName = courceName;}
}
