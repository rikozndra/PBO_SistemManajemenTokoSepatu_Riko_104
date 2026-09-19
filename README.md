# Sistem Manajemen Toko Sepatu Running & Lifestyle

- **Nama:** Riko Azkarazendra Russianto
- **NIM:** 2509116104
- **Kelas:** C - 2025
- **Program Studi:** Sistem Informasi
- **Mata Kuliah:** Pemrograman Berorientasi Objek


## 1. Penjelasan Studi Kasus

Studi kasus yang dipilih adalah **Sistem Manajemen Toko Sepatu Running & Lifestyle**.

Program ini merupakan aplikasi berbasis console yang dibuat menggunakan bahasa pemrograman Java. Aplikasi ini digunakan untuk mengelola data sepatu dari berbagai merek, seperti Adidas, ASICS, Nike, New Balance, On, dan Saucony.

Pengguna dapat memilih model sepatu running atau lifestyle yang tersedia dalam katalog. Program juga menyediakan fitur untuk menampilkan, mengubah, dan menghapus data sepatu.

Studi kasus ini dipilih karena toko sepatu memiliki berbagai jenis produk dengan informasi yang berbeda, seperti merek, nama sepatu, ukuran, harga, jenis lari, dan gaya sepatu. Konsep Object-Oriented Programming (OOP) digunakan untuk mengatur data dan fungsi program ke dalam beberapa class yang saling berhubungan.


## 2. Fitur Program

Program memiliki beberapa fitur utama:

1. **Tambah Sepatu Running**
   - Memilih model sepatu running dari katalog.
   - Memasukkan ukuran sepatu.
   - Memasukkan jenis lari.

2. **Tambah Sepatu Lifestyle**
   - Memilih model sepatu lifestyle dari katalog.
   - Memasukkan ukuran sepatu.
   - Memasukkan gaya sepatu.

3. **Tampilkan Semua Sepatu**
   - Menampilkan seluruh data sepatu yang telah ditambahkan.

4. **Ubah Data Sepatu**
   - Mengubah ukuran sepatu berdasarkan nomor data.

5. **Hapus Data Sepatu**
   - Menghapus data sepatu berdasarkan nomor data.


## 3. Diagram dan Hierarki Class

Hierarki class yang digunakan dalam program:

```text
                    Sepatu
                  (Superclass)
                       |
             ---------------------
             |                   |
      SepatuRunning      SepatuLifestyle
       (Subclass)          (Subclass)
```

### Penjelasan Class

#### Sepatu.java

Class `Sepatu` berfungsi sebagai superclass yang menyimpan atribut umum sepatu, yaitu:

- Merek
- Nama
- Ukuran
- Harga

Class ini juga memiliki constructor, getter, setter, dan method `tampilkanInfo()`.

#### SepatuRunning.java

Class `SepatuRunning` merupakan subclass dari class `Sepatu`.

Class ini memiliki atribut tambahan berupa `jenisLari` yang digunakan untuk menyimpan informasi khusus sepatu running.

#### SepatuLifestyle.java

Class `SepatuLifestyle` merupakan subclass dari class `Sepatu`.

Class ini memiliki atribut tambahan berupa `gaya` yang digunakan untuk menyimpan informasi khusus sepatu lifestyle.

#### Main.java

Class `Main` merupakan class utama yang menjalankan program. Class ini mengatur menu, input pengguna, penyimpanan data menggunakan `ArrayList`, serta proses CRUD.

---

## 4. Penerapan Inheritance

Inheritance diterapkan dengan menjadikan class `Sepatu` sebagai superclass dan class `SepatuRunning` serta `SepatuLifestyle` sebagai subclass.

Penerapan inheritance dapat dilihat pada kode berikut:

### Class SepatuRunning

```java
public class SepatuRunning extends Sepatu {
```

### Class SepatuLifestyle

```java
public class SepatuLifestyle extends Sepatu {
```

Keyword `extends` digunakan untuk menunjukkan bahwa class `SepatuRunning` dan `SepatuLifestyle` mewarisi atribut serta method dari class `Sepatu`.

Constructor pada subclass menggunakan keyword `super()` untuk memanggil constructor dari superclass.

```java
super(merek, nama, ukuran, harga);
```

Dengan inheritance, atribut umum seperti merek, nama, ukuran, dan harga dapat digunakan kembali oleh subclass tanpa harus ditulis ulang.

Program juga menerapkan method overriding melalui method `tampilkanInfo()` pada class `SepatuRunning` dan `SepatuLifestyle`. Method tersebut digunakan untuk menampilkan informasi sesuai dengan kategori sepatu.

---

## 5. Penerapan CRUD

Program menerapkan operasi CRUD sebagai berikut:

| Operasi | Implementasi |
|---|---|
| Create | Menambahkan data sepatu running dan lifestyle |
| Read | Menampilkan seluruh data sepatu |
| Update | Mengubah ukuran sepatu |
| Delete | Menghapus data sepatu |

Data sepatu disimpan menggunakan struktur data `ArrayList<Sepatu>`.

---

## 6. Screenshot Running Program

Bagian ini berisi tangkapan layar program ketika dijalankan melalui NetBeans.

### 7.1 Screenshot Menu Utama

<img width="175" height="104" alt="image" src="https://github.com/user-attachments/assets/029606df-9cdb-48b9-ad01-4041a6db1785" />

*Keterangan: Tampilan menu utama Sistem Manajemen Toko Sepatu.*

---

### 7.2 Screenshot Katalog Sepatu Running & LifeStyle

<img width="193" height="67" alt="image" src="https://github.com/user-attachments/assets/d8bf6e02-978e-4fa8-8546-75b4a0dba72e" />

<img width="164" height="64" alt="image" src="https://github.com/user-attachments/assets/701d7516-c1c9-47de-9c68-8ea6f32f1fde" />

*Keterangan: Tampilan pilihan model sepatu running dan sepatu lifestyle beserta harganya.*

---

### 7.3 Screenshot Proses Tambah Sepatu

<img width="195" height="211" alt="image" src="https://github.com/user-attachments/assets/9e9593a8-f8dd-4ff4-befd-b79532a1acb4" />

<img width="174" height="212" alt="image" src="https://github.com/user-attachments/assets/986a0977-a53f-4957-b9f2-1004eba20523" />

*Keterangan: Proses memilih model serta memasukkan ukuran dan informasi tambahan sepatu.*

---

### 7.4 Screenshot Tampilan Semua Data Sepatu

<img width="150" height="215" alt="image" src="https://github.com/user-attachments/assets/88c52c4e-2940-44aa-a516-c2e74c9fac5c" />

*Keterangan: Tampilan seluruh data sepatu yang telah ditambahkan.*

---

### 7.5 Screenshot Proses Update

<img width="195" height="215" alt="image" src="https://github.com/user-attachments/assets/9891a02a-be29-417f-baf1-2892222f4a16" />

*Keterangan: Proses mengubah ukuran sepatu berdasarkan nomor data.*

---

### 7.6 Screenshot Proses Delete

<img width="152" height="232" alt="image" src="https://github.com/user-attachments/assets/ddd83e8f-ae6f-43aa-ab2e-e2417c0f819d" />

*Keterangan: Proses menghapus data sepatu berdasarkan nomor data.*

---

## 8. Kesimpulan

Sistem Manajemen Toko Sepatu Running & Lifestyle merupakan aplikasi sederhana berbasis Java yang digunakan untuk mengelola data sepatu.

Program ini menerapkan konsep Object-Oriented Programming, seperti inheritance, encapsulation, polymorphism, constructor, dan ArrayList.

Selain itu, program memiliki fitur CRUD yang memungkinkan pengguna menambahkan, menampilkan, mengubah, dan menghapus data sepatu.
