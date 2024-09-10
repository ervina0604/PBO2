# 📚 Konsep Pemrograman Berbasis Obyek - Pertemuan Kedua

**Topik Utama:** Konsep OOP - *Constructor*, *Interface*, *This*, *Super*, dan *Casting*

---

## 📑 Table of Contents
- [🔨 Constructor](#constructor)
- [📝 Interface](#interface)
- [🔑 This](#this)
- [🧭 Super](#super)
- [🎯 Casting](#casting)
- [🔍 Kesimpulan](#kesimpulan)

---

## 🔨 Constructor
**Constructor** adalah method khusus yang digunakan untuk **menginisialisasi objek** saat dibuat. Nama constructor harus sama dengan nama kelas dan **tidak memiliki tipe return**.

### ⚙️ Ciri-Ciri Constructor:
- Nama method **sama dengan nama class**.
- **Tidak memiliki return type**.
- Bisa memiliki parameter untuk menginisialisasi properti objek.

#### 📌 Kapan Digunakan:
Setiap kali objek dibuat menggunakan keyword `new`, constructor akan dipanggil untuk menginisialisasi properti objek tersebut.

---

## 📝 Interface
**Interface** adalah blueprint yang berisi **deklarasi method tanpa implementasi** dan hanya mendefinisikan **konstanta**. Interface digunakan untuk **multiple inheritance**, memungkinkan class mengimplementasikan beberapa interface.

### 🔍 Ciri-Ciri Interface:
- Semua method bersifat **abstract** (tanpa implementasi).
- **Tidak memiliki properti non-konstanta**.
- Dapat diimplementasikan oleh lebih dari satu class.

#### 📌 Kapan Digunakan:
Saat ingin memaksa class lain untuk mengimplementasikan method tertentu tanpa memberikan implementasi spesifik.

---

## 🔑 This
**This** adalah keyword yang merujuk ke **instance objek saat ini**. Digunakan untuk membedakan antara variabel instance dan parameter yang memiliki nama sama atau untuk memanggil constructor lain dalam class yang sama.

### 📌 Kapan Digunakan:
- Untuk membedakan variabel instance dari parameter method yang memiliki nama yang sama.
- Untuk memanggil constructor lain dalam class yang sama.

---

## 🧭 Super
**Super** adalah keyword yang digunakan untuk **merujuk ke class induk (parent class)**. Digunakan untuk memanggil constructor atau method dari parent class.

### 📌 Kapan Digunakan:
- Ketika ingin mengakses method atau constructor dari parent class yang telah di-override di subclass.
- Untuk menghindari nama method yang tumpang tindih antara parent dan subclass.

---

## 🎯 Casting
**Casting** adalah proses **mengubah tipe data** suatu objek menjadi tipe data lain. Dalam OOP, casting digunakan untuk mengonversi objek dalam hierarki inheritance.

### 📌 Kapan Digunakan:
- **Upcasting:** Mengonversi subclass ke superclass (otomatis dan aman).
- **Downcasting:** Mengonversi superclass ke subclass (perlu dicek agar aman dan dilakukan secara eksplisit).

---

## 🔍 Kesimpulan
- **Constructor** digunakan untuk **menginisialisasi objek** saat objek dibuat.
- **Interface** memungkinkan **multiple inheritance** dan memastikan method tertentu diimplementasikan oleh class.
- **This** merujuk ke **instance objek saat ini** untuk membedakan variabel atau memanggil constructor lain.
- **Super** digunakan untuk **mengakses method** atau **constructor dari parent class**.
- **Casting** digunakan untuk **mengonversi tipe objek** dalam hierarki class.

---

### 🚀 Selamat Bereksplorasi dengan Konsep OOP di Java! 💻
