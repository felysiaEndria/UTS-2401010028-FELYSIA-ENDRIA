# PBO-UTS-2401010028-FELYSIA-ENDRIA

File ini berisi penjelasan dan demonstrasi kode Java untuk lima konsep dasar OOP:
1. Class & Object
2. Encapsulation
3. Relationship (Aggregation)
4. Inheritance & Polymorphism
5. Abstract Class & Interface
---

## 🔹 Soal 1 – Class dan Object

### 🧠 Penjelasan
Class adalah rancangan atau cetak biru (blueprint) yang mendefinisikan atribut dan perilaku suatu entitas,  
sedangkan object adalah hasil nyata dari rancangan itu.

Misalnya, class `Course` menjelaskan bahwa setiap mata kuliah memiliki nama, jumlah kredit, dan nama dosen.  
Ketika kita membuat objek seperti `Course course1 = new Course("PBO", 3, "Aziz, S.Kom., M.Kom.");`,  
maka `course1` adalah perwujudan konkret dari rancangan tersebut, dengan data yang benar-benar tersimpan di memori.

Dengan kata lain, **class adalah definisi**, sementara **object adalah realisasi dari definisi itu.**

---

## 🔹 Soal 2 – Encapsulation

### 🧠 Penjelasan
Encapsulation adalah prinsip OOP yang menyembunyikan detail internal suatu class agar data di dalamnya tetap aman  
dan hanya bisa diakses atau diubah melalui method yang dikontrol (getter dan setter).

Prinsip ini penting karena:
- Mencegah data tidak valid masuk ke dalam objek (misalnya nilai kredit negatif).
- Menjaga konsistensi logika program, karena semua perubahan data melewati aturan tertentu.
- Memberi fleksibilitas untuk mengubah implementasi internal tanpa mengubah cara class digunakan dari luar.

Dengan encapsulation, kita memastikan objek tidak bisa dimanipulasi secara sembarangan.

---

## 🔹 Soal 3 – Relationship antar Class (Aggregation)

### 🧠 Penjelasan
Aggregation menggambarkan hubungan **“memiliki” (has-a)** antara dua class,  
namun objek yang dimiliki tetap bisa eksis secara independen.

Dalam contoh `Student` dan `Course`, seorang mahasiswa **memiliki daftar mata kuliah**,  
tetapi `Course` tetap bisa berdiri sendiri meskipun objek `Student` dihapus.

Hubungan ini memperlihatkan fleksibilitas antar objek dalam sistem — mereka bisa saling terhubung  
tanpa ketergantungan penuh satu sama lain.  
Ini berbeda dengan **composition**, di mana objek bagian (child) akan ikut hilang jika objek utama (parent) dihapus.

---

## 🔹 Soal 4 – Inheritance & Polymorphism

### 🧠 Penjelasan
**Inheritance** (pewarisan) memungkinkan sebuah class mewarisi atribut dan method dari class lain.  
Misalnya, `Student` dan `Lecturer` adalah turunan dari class `Person`,  
sehingga keduanya mewarisi atribut `name` dan `id` dari `Person`.

Keduanya juga dapat **menimpa (override)** method `introduce()` untuk menampilkan perilaku berbeda  
sesuai peran masing-masing.

**Polymorphism** (banyak bentuk) terjadi ketika objek `Student` dan `Lecturer` disimpan dalam array bertipe `Person[]`,  
namun saat `introduce()` dipanggil, yang dijalankan tetap versi sesuai tipe objek aslinya.

Dengan demikian, polymorphism memungkinkan kita menggunakan satu tipe umum (`Person`)  
untuk menangani berbagai objek dengan perilaku berbeda secara dinamis.

---

## 🔹 Soal 5 – Abstract Class & Interface

### 🧠 Penjelasan
**Abstract class** digunakan ketika beberapa class memiliki struktur dan perilaku dasar yang sama.  
Class abstrak dapat memiliki atribut, konstruktor, dan method yang bisa diwariskan atau ditimpa (override) oleh subclass.

Sebaliknya, **interface** digunakan ketika beberapa class berbeda perlu memiliki kemampuan yang sama,  
tanpa harus berada dalam hierarki turunan yang sama. Interface hanya berisi deklarasi method (kontrak)  
tanpa implementasi, dan class lain dapat mengimplementasikan banyak interface sekaligus.

Singkatnya:
- Gunakan **abstract class** jika ada hubungan **“adalah jenis dari…”** (is-a).
  > Contoh: `Exam` dan `Assignment` adalah jenis dari `Assessment`.
- Gunakan **interface** jika ada hubungan **“bisa melakukan…”** (can-do).
  > Contoh: `Gradable` berarti class tersebut bisa memberikan nilai (getGrade).

Abstract class berfokus pada *struktur umum dan perilaku dasar*,  
sedangkan interface berfokus pada *kemampuan yang dapat dimiliki berbagai class berbeda.*
