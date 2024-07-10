package lab2_3B;

import java.util.*;

public class Course {

    private String courseName;
    private Course preRequisiteCourse;
    private List<Course> courseList;

    public Course(String courseName) {
        this.courseName = courseName;
        this.courseList = new ArrayList<>();
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addCourse(Course course) {
        this.courseList.add(course);
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setPreCourse(Course precourse) {

        if(precourse == null){

            this.preRequisiteCourse = null;
            this.addCourse(this);

        }else {

            if(this == precourse){
                throw new IllegalArgumentException("Same Course couldn't be pre requisite!!");
            }
            this.preRequisiteCourse = precourse;
            this.addCourse(precourse);
        }

    }

}
