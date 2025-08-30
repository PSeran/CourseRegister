package com.CourceRegistation.CourceRegistatonSystem.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CourceDetail {

    @Id
    private String CourseId;
    private String CourseName;
    private String Trainer;
    private int durationInWeek;
    public CourceDetail(  String courseId,String courseName,String trainer,int durationInWeek) {
        this.durationInWeek = durationInWeek;
        Trainer = trainer;
        CourseName = courseName;
        CourseId = courseId;
    }
    public CourceDetail() {}
    public String getCourseId() {return CourseId;}
    public void setCourseId(String courseId) {CourseId = courseId;}
    public String getCourseName() {return CourseName;}
    public void setCourseName(String courseName) {CourseName = courseName;}
    public String getTrainer() {return Trainer;}
    public void setTrainer(String trainer) {Trainer = trainer;}
    public int getDurationInWeek() {return durationInWeek;}
    public void setDurationInWeek(int durationInWeek) {this.durationInWeek = durationInWeek;}
}
