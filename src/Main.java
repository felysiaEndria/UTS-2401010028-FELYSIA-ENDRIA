//Jawaban penejelasan soal ada di README.md

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SOAL 1 & 2: CLASS, OBJECT, DAN ENCAPSULATION ===");
        Course c1 = new Course("Pemrograman Berorientasi Objek", 3, "Aziz, S.Kom., M.Kom.");
        c1.displayInfo();

        System.out.println("---------------------------");
        Course c2 = new Course("Sistem Basis Data", -4, "Widya, S.Pd., M.Kom.");
        c2.displayInfo();

        System.out.println("\n=== SOAL 3: RELATIONSHIP (AGGREGATION) ANTAR CLASS ===");
        Student s1 = new Student("Budi Santoso", "2301010011");
        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.introduce(); // override dari Person
        s1.displayCourses();

        System.out.println("\n=== SOAL 4: INHERITANCE & POLYMORPHISM ===");
        Person[] people = {
                new Lecturer("Dr. Andi", "L001", "Artificial Intelligence"),
                new Student("Siti Nurianti", "2301010020")
        };
        for (Person p : people) {
            // Polimorfisme: method introduce() dipanggil dari kelas aslinya (Student/Lecturer)
            p.introduce();
        }

        System.out.println("\n=== SOAL 5: ABSTRACT CLASS & INTERFACE ===");
        Assessment[] assessments = {
                new Exam("Ujian Akhir Semester", 80, 0.7),
                new Assignment("Tugas Pemrograman", 85, 4)
        };

        // Abstraksi: kita bekerja dengan tipe umum (Assessment), tanpa peduli subclass-nya
        for (Assessment a : assessments) {
            System.out.println("Judul: " + a.title);
            System.out.println("Nilai Akhir: " + a.calculateFinalScore());
            System.out.println("Grade: " + a.getGrade());
            System.out.println("--------------------------");
        }
    }
}
