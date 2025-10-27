import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Course> courses;

    public Student(String name, String id) {
        super(name, id);
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    // Override method introduce()
    @Override
    public void introduce() {
        System.out.println("Saya " + name + ", seorang mahasiswa dengan NIM " + id + ".");
    }

    public void displayCourses() {
        System.out.println("Daftar mata kuliah yang diambil:");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName() + " (" + c.getCredit() + " SKS)");
        }
    }
}
