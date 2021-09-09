# Pengantar Collection Type

Collection adalah kumpulan interface yang digunakan sebagai wadah untuk mengumpulkan beberapa elemen menjadi satu kesatuan. Dari definisi tersebut bisa ditafsirkan Collection mirip dengan Array karena keduanya merepresentasikan struktur data. Java Collections Framework terdiri dari tiga komponen, yaitu:

**1. Interface:** Tipe abstrak dari Collection yang membentuk suatu hierarki.

**2.Implementation:** Tipe konkrit yang mengimplementasikan Interface dari Collection serta dan merupakan suatu struktur data yang bisa langsung digunakan.

**3.Algorithm:** Ini adalah method yang melakukan komputasi berguna, misal sorting atau searching.

Dari komponen pembentuk Java Collections Framework bisa kita lihat salah satu perbedaan Collection dengan Array. Misalnya Array tidak mempunyai method untuk sorting atau jumlah elemen di Array tidak bisa dinamis. Sementara Collection bisa dinamis.

Dapat disimpulkan bahwa Collection adalah struktur data yang lebih kompleks dan lebih canggih dibanding Array. Untuk itu setiap programmer wajib menguasai Java Collections Framework. Sebabnya, kita akan selalu berurusan dengan data saat membuat aplikasi.

Core Collection Interface dapat dirangkum pada gambar di bawah ini.

![gabar](https://d17ivq9b7rppb3.cloudfront.net/original/academy/20180418160722b18fe9f2319573eefbdb65fac60eb29a.)

Dalam materi ini kita hanya akan membahas Java Collections Framework yang paling sering digunakan yaitu List, Set, dan Map. Sebagian Implementasi dari ketiga interface tersebut bisa kita lihat di tabel di bawah ini.

| List       | Set           | Map           |
| ---------- | ------------- | ------------- |
| ArrayList  | TreeSet       | TreeMap       |
| LinkedList | HashSet       | HashMap       |
|            | LinkedHashSet | LinkedHashMap |

# Rangkuman

## **List**

List adalah suatu Collection di mana data yang masuk akan disimpan secara teratur. List mempunyai index berdasarkan urutan objek yang dimasukkan ke dalam List. Objek di dalam List bisa duplikat artinya objek yang sama bisa dimasukkan beberapa kali ke dalam List dan akan mempunyai index yang berbeda. Objek dikatakan sama jika dibandingkan menggunakan method equals() menghasilkan nilai true. Hal ini akan berbeda dengan Set yang akan kita bahas berikutnya. Salah satu implementasi dari interface List adalah class ArrayList. ArrayList mirip dengan Array hanya saja ArrayList ukurannya tidak tetap atau fleksibel.

## **Set**

Set mirip dengan List hanya saja objek di dalam Set tidak bisa diduplikasi. Yang artinya jika objek yang sama dimasukkan beberapa kali ke dalam Set maka Set hanya akan menyimpan objek tersebut satu kali saja. Coba ingat kembali materi Inheritance bagian Overriding dan Overloading. Perbedaan lain antara Set dengan List adalah penyimpanan pada Set tidak teratur.

## **Map**

Map adalah struktur data dalam bentuk pasangan key-value. Map sama dengan “associative array “ dalam bahasa PHP. Objek disimpan di Map sebagai value menggunakan key yang harus unik dan harus berupa objek juga. Salah satu implementasi dari interface Map adalah class HashMap.

# Akhir kata

Pada dasarnya Collection adalah struktur data. Makin kompleks struktur datanya maka akan dibutuhkan implementasi Collection yang lebih kompleks lagi. Pada materi ini kita hanya membahas Collection yang sudah ada di JDK tanpa menambahkan library apapun. Di luar sana ada banyak library Collection untuk keperluan yang kompleks misal Apache Common Collection dan Google Collection (sekarang menjadi bagian dari Guava).

Baca beberapa tautan di bawah ini untuk menambah pengetahuan Anda.

    https://commons.apache.org/proper/commons-collections/
    https://code.google.com/archive/p/google-collections/
    https://github.com/google/guava
