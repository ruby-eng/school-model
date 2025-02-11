package Models;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private List<Course> courses;

    public Student(String name, int age) {
        super(name, age);
        courses = new ArrayList<>();
    }
    public void enrollInCourse(Course course){
     courses.add(course);
        System.out.println(getName() + "is enrolled in " + course.getCourseName());
    }
    public List<Course> getCourses() {

        return courses;
    }
}
