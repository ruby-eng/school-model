package Models;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }
    public void teachCourse(Course course){
        System.out.println(getName() +" is now teaching" + course.getCourseName());
    }
}
