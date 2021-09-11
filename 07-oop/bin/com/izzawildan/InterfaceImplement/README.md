# Implement

Setelah kita mempelajari cara dan ketentuan dalam membuat interface, berikutnya kita akan mempelajari cara menggunakan interface tersebut. Interface harus dapat digunakan ke kelas lain. Cara untuk mengimplementasi interface yaitu menggunakan keyword implements pada kelas yang mengimplementasikannya. Kelas yang mengimplementasi interface (bisa lebih dari 1 interface) harus mendefinisikan isi kode semua deklarasi metode yang ada pada interface tersebut.


# Code to Interface not Implementation

Dari latihan sebelumnya kita membuat interface Hewan. Kemudian kita membuat kelas Kucing yang menerapkan interface tersebut. Maka tiap metode yang berada pada interface harus diimplementasikan. Interface terlihat sebagai suatu aturan atau kontrak bagi kelas yang mengimplementasikannya.

Salah satu contoh implementasi interface adalah JDBC API. Java Database Connectivity (JDBC) adalah package (java.sql dan javax.sql) yang menyediakan akses ke database. Sedangkan Application Programming Interface (API), dari namanya sudah bisa ditebak adalah kumpulan Interface.

Jadi JDBC API adalah kumpulan interface untuk mengakses database sedangkan implementasinya akan dibuat oleh masing-masing merk database misal MySql, SqlServer, Oracle dan lain-lain. Implementasi tersebut biasa disebut JDBC Driver. JDBC Driver akan kita unduh (dalam bentuk jar) tergantung dari database yang digunakan untuk dimasukkan ke classpath.

Silakan buka tautan https://www.javatpoint.com/example-to-connect-to-the-mysql-database untuk melihat contoh JDBC API. Perhatikan penggunaan interface java.sql.Connection bukan menggunakan kelas com.mysql.jdbc.Connection dari JDBC Driver.

Dalam coding Java ada istilah best practice (design pattern) “code to interface not implementation”. Salah satu maksudnya adalah seperti contoh JDBC API di paragraf sebelumnya. Contoh lainnya adalah ketika kita membuat aplikasi yang terdiri dari beberapa layer. Maka lebih baik gunakan interface untuk komunikasi antar layernya.

Silakan baca beberapa tautan ini untuk menambah pengetahuan Anda.

https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/

https://en.wikipedia.org/wiki/Design_Patterns

