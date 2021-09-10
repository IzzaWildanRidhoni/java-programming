# Constructor

Constructor adalah method yang secara default sudah terbentuk ketika kelas dibuat. Ketika suatu kelas dibuat (instansiasi) maka konstruktor akan terpanggil juga. Constructor harus memiliki nama yang sama dengan nama kelasnya. Lalu apa kegunaan Constructor?

- Memberikan nilai awal terhadap suatu data atau obyek
- Mengalokasikan ruang sebuah kelas dalam obyek

Terdapat dua tipe constructor pada Java:

- **No-argument constructor**, apabila kita tidak mendeklarasikan konstruktor dalam suatu kelas, kompiler Java akan membuat default constructor(tanpa parameter) dan pada body constructor tersebut kosong. Sementara jika kita mendeklarasikan konstruktor tanpa paramter , baik menuliskan kode pada body-nya atau tidak, maka itu bukan default constructor. Itu adalah no-argument constructor.

- **Parameterized constructor**, konstruktor yang memiliki parameter untuk menginisiasi atau memberikan nilai awal data dengan nilai yang kita tentukan.
  Berikut ini adalah contoh parameterized constructor pada suatu kelas.
