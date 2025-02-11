import Models.*;

public class SchoolModel {
            public static void main(String[] args) {
                // Creating Principal
                Principal principal = new Principal("Mr. John", 45);

                // Creating Applicants
                Applicant applicant1 = new Applicant("Alice", 16);
                Applicant applicant2 = new Applicant("Bob", 13);

                // Principal admitting students based on age
                principal.admitStudent(applicant1);
                principal.admitStudent(applicant2);

                // Creating Teacher and Courses
                Teacher teacher = new Teacher("Ms. Sarah", 35);
                Course course1 = new Course("Mathematics", teacher);
                Course course2 = new Course("Science", teacher);

                // Teacher teaching courses
                teacher.teachCourse(course1);
                teacher.teachCourse(course2);

                // Creating Students and enrolling them in courses
                Student student1 = new Student("Alice", 16);
                Student student2 = new Student("Bob", 13);

                student1.enrollInCourse(course1);
                student2.enrollInCourse(course2);

                // Creating Classrooms and adding students to them
                Classroom classroom1 = new Classroom("101", course1);
                Classroom classroom2 = new Classroom("102", course2);

                classroom1.addStudentToClass(student1); // Alice in Math class
                classroom2.addStudentToClass(student2); // Bob in Science class

                // Listing students in each classroom
                classroom1.listStudents(); // List students in Math class
                classroom2.listStudents(); // List students in Science class

                // Principal expelling a student
                principal.expelStudent(student2);  // Bob is expelled
            }
        }

    
