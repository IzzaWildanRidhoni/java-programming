# Exception

Exception adalah event (kejadian) yang mengacaukan jalannya suatu program. Worst case scenario ketika suatu program mengalami exception adalah termination. Termination (penutupan) program adalah hal yang harus dihindari. Untuk itu kita harus menangani exception yang terjadi di program, atau yang biasa disebut sebagai handle exception.

Kode yang baik adalah yang terhindar dari segala bentuk kejadian yang menyebabkan efek buruk kepada program. Oleh karena itu mari kita kenali dulu berbagai macam exception yang ada di Java.

Pada dasarnya ada 3 jenis exception berdasarkan kategorinya.

- **Checked Exception**, adalah exception yang terjadi saat compile time. Di sini programmer harus menambahkan kode untuk meng-handle exception kategori ini. Jika tidak di-handle maka kode yang dituliskan akan error dan tidak akan bisa dikompilasi. Contohnya adalah exception java.io.FileNotFoundException.

- **Unchecked Exception**, adalah exception yang terjadi saat execution time. Eror ini terjadi dalam lingkup internal dari aplikasi kita, biasanya terjadi karena salah penulisan kode atau penggunaan salah terhadap satu API. Contohnya adalah NullPointerException.

- **Error**, adalah exception yang diluar kendali user atau programmer. Eror ini terjadi di lingkup eksternal dari aplikasi kita. Ketika exception ini terjadi maka tidak ada yang bisa kita lakukan untuk mengatasinya, contohnya ketika perangkat kerasnya rusak saat kita ingin membaca data.

Dari definisi di atas maka error exception dan unchecked exception termasuk dari exception yang berada pada execution time. Sebabnya, keduanya hanya dialami ketika program sudah berjalan. Perbedaanya adalah unchecked berada di dalam internal program kita, sedangkan error exception berada di eksternal program kita.

Kemudian kode apa yang harus kita tambahkan untuk mengatasi berbagai macam exception tersebut? Kita harus kenal dengan 3 block kode yaitu try, catch, dan finally.

## Try-Catch

Kode yang rawan dengan exception kita masukkan ke dalam block try-catch. Kode yang kita masukkan ke dalam block try-catch biasa disebut sebagai protected code. Kodenya sepert ini.

```java
    try{
       // Protected code
    } catch (Exception e){
       // Catch block
    }
```

## Multiple catch

Dari kode sebelumnya kita menggunakan Exception untuk menangani semua exception yang terjadi. Sebenarnya, kita bisa memilih tipe exception apa saja yang hanya ingin kita handle. Ini sangat berguna ketika kita ingin meng-handle tiap exception dengan perlakuan yang berbeda.

Lebih lanjut, tidak hanya 1 exception saja yang bisa kita tangani. Kita bisa menambahkan lebih dari 1 block catch. Misalnya seperti ini.

```java
    try {

    } catch (ExceptionType name) {

    } catch (ExceptionType name) {

    }
```

## Finally

Block finally adalah block yang di tambahkan di akhir block try-catch. Finally akan selalu dijalankan setelah try-catch baik terjadi exception atau tidak. Finally bermanfaat ketika kita ingin melakukan cleanup code. Cleanup code di sini maksudnya adalah de-alokasi sumber daya, Artinya semua sumber daya yang dibuka atau digunakan pada blok try seperti koneksi jaringan, database, berkas, stream, dll akan ditutup dengan menjalankan instruksi yang ditulis pada blok finally.

Contohnya adalah seperti ini.

```java
    package com.dicoding.javafundamental.exception;

    public class Main {
        public static void main(String[] args) {
            int[] a = new int[5];
            try {
                System.out.println("Akses elemen ke 5 :" + a[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception thrown :" + e);
            } finally {
                a[4] = 10;
                System.out.println("Nilai elemen terakhir: " + a[4]);
            }
        }
    }
```
