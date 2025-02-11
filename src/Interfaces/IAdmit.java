package Interfaces;

import Models.Applicant;
import Models.Student;

public interface IAdmit {
    void admitStudent(Applicant applicant);
    void expelStudent(Student student);
}
