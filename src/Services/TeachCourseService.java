package Services;

import Models.Course;
import Models.Teacher;

public class TeachCourseService {
    public void teach(Course course, Teacher teacher) {
        teacher.teachCourse(course);
    }
}

