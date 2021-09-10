# **Access Modifier**

Access modifier di dalam Object Oriented Programming (OOP) akan menentukan apakah kelas lain dapat menggunakan field atau meng-invoke methods dari suatu kelas. Ada beberapa macam access modifier yang dapat digunakan yaitu private, default, protected, dan public.

# Private

Access modifier private akan membatasi akses hanya di dalam class. Private biasanya digunakan sebagai **modifier dari member dan metode suatu class.** 

# Default

Default modifier berarti penulisan kodenya tanpa atribut modifier. Ini berlaku untuk semua kelas, member, atau fungsi yang kita tuliskan tanpa access modifier.

**Modifier default bisa diakses selama masih dalam satu package.**

# Protected

Access modifier protected bisa diakses selama masih dalam **satu package.** Protected memiliki sedikit perbedaan dengan default modifier. Perbedaannya adalah protected bisa diakses dari **luar package**. **Akan tetapi**, satu-satunya cara untuk akses dari luar package adalah kelas yang hendak mengakses, **merupakan kelas turunannya.**

# Public

Access modifier public bisa kita sebut sebagai modifier global. Artinya bisa diakses dari manapun bahkan package yang berbeda.

Seperti pada contoh kode sebelumnya, KelasA ditambahkan modifier public. Karena modifiernya public maka bisa diakses dari package lainnya.

Ada 4 access modifier yang masing-masing memiliki batasan akses yang berbeda-beda. Berikut ini tabel perbandingan antara keempatnya.

| Modifier | Class | Package | Subclass | World | 
|----------|----------|----------|----------|----------|
| Private | Yes | No | No | No | 
| Default | Yes | Yes | No | No | 
| Protected | Yes | Yes | Yes | No | 
| Public | Yes | Yes | Yes | Yes | 

Dimulai dari private yang hanya memiliki batasan akses dari dalam kelas. Kemudian default modifier yang memiliki batasan dalam satu package. Protected memiliki akses dari luar package selama kelas tersebut merupakan turunannya. Dan terakhir, public, yang dapat diakses secara global.

# Non Access Modifier

Java juga mengenal modifier lainnya yaitu tipe non access modifier. Ada beberapa non access modifier yaitu static, final, transient,  dan synchronize.

Non access modifier memiliki fungsi yang beragam tergantung dari kebutuhannya. Mari kita bahas satu per satu.

# Static

Yang pertama adalah static. Ia digunakan untuk mendeklarasikan variabel atau metode yang berdiri sendiri tanpa perlu instance dari suatu kelas. Ada dua macam non access modifier static yaitu static variable dan static methods.


# Static Variable

Variabel yang berdiri sendiri tanpa perlu instance dari kelas. 




