package Models;

import Interfaces.IAdmit;

public class Principal extends Person implements IAdmit {

    public Principal(String name, int age){
        super(name, age);
    }
    @Override
    public void admitStudent(Applicant applicant) {
        Student student = new Student(applicant.getName(), applicant.getAge());;
        if (applicant.getAge() >= 16) {
            System.out.println(student.getName() + " has  been admitted");
        } else {
            System.out.println(student.getName() + " is too young to be admitted");
        }
    }

    @Override
    public void expelStudent(Student student) {
        System.out.println(student.getName() +" has been expelled");
    }
}
