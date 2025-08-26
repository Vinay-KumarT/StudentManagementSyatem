import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("✅ Student added successfully!");
    }

    // View all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Update student by ID
    public void updateStudent(int id, String newName, int newAge, String newCourse) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setAge(newAge);
                s.setCourse(newCourse);
                System.out.println("✅ Student updated successfully!");
                return;
            }
        }
        System.out.println("❌ Student with ID " + id + " not found.");
    }

    // Delete student by ID
    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("✅ Student deleted successfully!");
                return;
            }
        }
        System.out.println("❌ Student with ID " + id + " not found.");
    }
}
