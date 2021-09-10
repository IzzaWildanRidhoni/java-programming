# Function

Fungsi pada Java dideklarasikan di dalam sebuah kelas. Fungsi pada Java bertugas untuk mengembalikan nilai. Sedangkan untuk fungsi yang tidak mengembalikan nilai (void) disebut sebagai prosedur. Baik fungsi maupun prosedur di dalam suatu kelas kita sebut sebagai metode. Metode merupakan aspek yang penting di dalam Java. Dalam sebuah kelas bisa terdapat banyak metode sesuai dengan kegunaannya masing-masing.

# Mendeklarasikan Fungsi

Cara membuat sebuah fungsi di dalam kelas adalah sebagai berikut :
```java
    modifier returnType nameOfFunction(parameters) {
     
    }
```
- **modifier** menunjukkan sifat yang dimiliki pada suatu fungsi seperti public, private, protected.
- **returnType** merupakan nilai balik yang diberikan oleh fungsi. Apabila fungsi tidak memiliki nilai balik maka menggunakan void.
    nameOfFunction adalah nama dari sebuah fungsi.
- **parameters** bersifat opsional, Suatu fungsi dapat mempunyai banyak parameters atau pun tidak sama sekali.

# Memanggil Fungsi

Berikut adalah contoh cara mengimplementasikan fungsi secara sederhana di dalam sebuah kelas secara statis. Artinya penggunaan fungsi ini hanya dilakukan pada kelas tersebut tanpa membuat objek.


Java mengizinkan menggunakan dua atau lebih fungsi dengan nama yang sama dalam satu kelas. Namun, yang membedakan adalah parameternya. Konsep ini disebut dengan method overloading. Sebagai contoh kita membuat fungsi dengan nama yang sama pada kode sebelumnya dengan membedakan tipe datanya menjadi int.

# Method Overloading

Java mengizinkan menggunakan dua atau lebih fungsi dengan nama yang sama dalam satu kelas. Namun, yang membedakan adalah parameternya. Konsep ini disebut dengan *method overloading*. Sebagai contoh kita membuat fungsi dengan nama yang sama pada kode sebelumnya dengan membedakan tipe datanya menjadi int.



