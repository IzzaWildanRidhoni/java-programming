# Interface

Apa itu interface? Di materi sebelumnya kita sudah mempelajari class. 

Pada bahasa pemrograman Java interface sangat ***mirip dengan kelas*, *tapi tanpa atribut kelas*** dan memiliki metode yang ***dideklarasikan tanpa isi***. Deklarasi metode pada sebuah interface dapat diimplementasikan oleh kelas lain. 

Sebuah kelas dapat mengimplementasikan lebih dari satu interface. Kelas ini akan mendeklarasikan metode pada interface yang dibutuhkan oleh kelas itu sekaligus mendefinisikan isinya pada kode program. 

Metode pada interface yang diimplementasikan pada suatu kelas harus sama persis dengan yang ada pada interface tersebut. **Property/Field** di interface **akan menjadi static final atau konstanta.** Method dan field di interface akan selalu bersifat public. Perhatikan kata-kata yang diberi huruf tebal.
