package Models;
    import java.util.ArrayList;
import java.util.List;

    public class Classroom {
        private String roomNumber;
        private Course course;
        private List<Student> students;

        public Classroom(String roomNumber, Course course) {
            this.roomNumber = roomNumber;
            this.course = course;
            this.students = new ArrayList<>();
        }

        public void addStudentToClass(Student student) {
            students.add(student);
            System.out.println(student.getName() + " has been added to the classroom.");
        }

        public void listStudents() {
            System.out.println("Students in the " + course.getCourseName() + " class:");
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }


