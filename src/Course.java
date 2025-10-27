public class Course {
    private String courseName;
    private int credit;
    private String instructorName;

    //SOAL 1 - PERBEDAAN CLASS DAN OBJECT
    //Class adalah blueprint yang mendefinisikan atribut dan perilaku suatu entitas,
    //Sedangkan object adalah hasil nyata dari rancangan itu. Misalnya, class Course menjelaskan bahwa
    //setiap mata kuliah memiliki nama, jumlah kredit, dan nama dosen.
    //Ketika kita membuat course1 = new Course("PBO", 3, "Aziz, S.Kom., M.Kom.");
    //maka course1 adalah object nyata dari class Course yang menyimpan data konkret sesuai rancangan tersebut.

    // Constructor (untuk membuat objek Course baru dengan nilai awal)
    public Course(String courseName, int credit, String instructorName) {
        this.courseName = courseName;
        setCredit(credit);
        this.instructorName = instructorName;
    }

    //SOAL 2 - TAMBAHKAN VALIDASI DAN JELASKAN MENGAPA ENKAPSULASI PENTING
    // Encapsulation adalah prinsip OOP yang menyembunyikan detail internal suatu class
    // agar data tetap aman dan hanya bisa diakses melalui method yang dikontrol (getter/setter).
    // Hal ini mencegah data tidak valid masuk ke dalam object,menjaga konsistensi logika program,
    // dan memberi kontrol penuh atas bagaimana data dimodifikasi dari luar class.


    // Getter dan Setter
    public String getCourseName() {return courseName;}
    public void setCourseName(String courseName) {this.courseName = courseName;}

    public int getCredit() {return credit;}
    public void setCredit(int credit) {
        if (credit < 0) {
            System.out.println("Nilai credit tidak boleh negatif! Otomatis diset ke 0.");
            this.credit = 0;
        } else {
            this.credit = credit;
        }
    }

    public String getInstructorName() {return instructorName;}
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }


    // Method (perilaku/aksi dari class)
    public void displayInfo() {
        System.out.println("Matakuliah: " + courseName);
        System.out.println("Kredit: " + credit);
        System.out.println("Lecturer: " + instructorName);
    }
}
