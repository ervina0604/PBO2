# 📚 Konsep Pemrograman Berbasis Obyek - Pertemuan Kedua

**Topik Utama:** Konsep OOP - *Constructor*, *Interface*, *This*, *Super*, dan *Casting*

---

## 📑 Table of Contents
- [🔨 Constructor](https://github.com/ervina0604/PBO2/blob/main/Kendaraan.java)
- [📝 Interface](https://github.com/ervina0604/PBO2/blob/main/Driver.java)
- [🔑 This](https://github.com/ervina0604/PBO2/blob/main/Pengemudi.java)
- [🧭 Super](https://github.com/ervina0604/PBO2/blob/main/Taxi.java)
- [🎯 Casting](https://github.com/ervina0604/PBO2/blob/main/Utama.java)

---

## 🔨 Constructor
**Constructor** adalah metode khusus untuk menginisialisasi objek saat objek tersebut dibuat. Dalam kelas Kendaraan, terdapat konstruktor tanpa parameter yang mengatur nilai default untuk atribut. Ketika objek Kendaraan dibuat, konstruktor ini secara otomatis dipanggil, mencetak pesan ke konsol dan menetapkan nilai tipe menjadi "Umum" dan jumlah roda menjadi 4.

### ⚙️ Ciri-Ciri Constructor:
- Nama method **sama dengan nama class**.
- **Tidak memiliki return type**.
- Bisa memiliki parameter untuk menginisialisasi properti objek.

#### 📌 Kapan Digunakan:
Setiap kali objek dibuat menggunakan keyword `new`, constructor akan dipanggil untuk menginisialisasi properti objek tersebut.



---

## 📝 Interface
**Interface** Driver mendefinisikan satu metode: mengemudi(). Kelas yang mengimplementasikan antarmuka ini harus menyediakan implementasi untuk metode tersebut. Ini menunjukkan bahwa setiap objek yang dianggap sebagai Driver harus memiliki kemampuan untuk mengemudikan kendaraan.

### 🔍 Ciri-Ciri Interface:
- Semua method bersifat **abstract** (tanpa implementasi).
- **Tidak memiliki properti non-konstanta**.
- Dapat diimplementasikan oleh lebih dari satu class.

#### 📌 Kapan Digunakan:
Saat ingin memaksa class lain untuk mengimplementasikan method tertentu tanpa memberikan implementasi spesifik.

---

## 🔑 This
**This** adalah keyword yang merujuk ke **instance objek saat ini**.Dalam konstruktor Pengemudi, kata kunci this digunakan untuk merujuk pada atribut nama dari objek saat ini. Namun, pada contoh ini, parameter nama tidak digunakan secara langsung. Sebagai gantinya, nilai "Andi" yang ditetapkan ke atribut nama. 

### 📌 Kapan Digunakan:
- Untuk membedakan variabel instance dari parameter method yang memiliki nama yang sama.
- Untuk memanggil constructor lain dalam class yang sama.

---

## 🧭 Super
**Super** adalah keyword yang digunakan untuk **merujuk ke class induk (parent class)**. Ini digunakan untuk memanggil konstruktor atau metode dari kelas induk. Dalam konstruktor Taxi, super.setTipe("Taxi") dan super.setJenisMesin("Bensin") digunakan untuk memanggil metode dari kelas induk (Mobil), sehingga objek Taxi dapat mewarisi dan menggunakan atribut serta metode tersebut.
### 📌 Kapan Digunakan:
- Ketika ingin mengakses method atau constructor dari parent class yang telah di-override di subclass.
- Untuk menghindari nama method yang tumpang tindih antara parent dan subclass.

---

## 🎯 Casting
**Casting** adalah proses **mengubah tipe data** suatu objek menjadi tipe data lain. Dalam OOP, casting digunakan untuk mengonversi objek dalam hierarki inheritance.
Casting: Objek taxiKuning yang merupakan instansi dari kelas Taxi di-cast menjadi objek bertipe Mobil dengan (Mobil) taxiKuning. Ini memungkinkan akses ke metode dan atribut dari kelas Mobil.
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
