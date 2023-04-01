# (8) RESTful API Introduction & Testing
## Pengenalan RESTful API
### Poin 1
API atau yang dikenal sebagai Application Programming Interface adalah sebuah mekanisme dimana memungkinkan dua komponen perangkat lunak untuk saling berkomunikasi satu sama lainnya. Singkatnya API digunakan untuk menghubungkan aplikasi aplikasi yanmg berbeda untuk dapat saling berinteraksi. Contohnya adalah seperti aplikasi Zenly yang menggunakan API untuk mengintergasikan Google Maps didalamnya. Dalam API ada workflow yang digunakan untuk berkomunikasi dengan perangkat lunak lain.
### Poin 2
REST API atau Representational State Transfer API adalah salah satu jenis API yang mengikuti struktur REST yang merupakan sebuah model arsitektur aplikasi web berbasis data. ada beberapa komponen utama dalam REST API yaitu :
1. URL/Unifrom Resource Locator sebagai endpoint akses untuk data dari server.
2. HTTP methods sebagai metode untuk mengakses data. Salah satunya ada GET, POST, PUT, DELETE untuk mengakses dan memanipulasi data yang ada pada server.
3. HTTP headers sebagai informasi tambahan.
4. Response sebagai umpan balik atau balasan dari server atas request yang dikirimkan.
### Poin 3
JSON atau JavaScript Object Notation adalah sebuah format data yang biasa digunakan untuk mentransmisikan dan menyimpan data dan sering digunakan dalam REST API untuk mengirimkan data. Sesuai namanya struktur JSON mirip dengan objek pada JavaScript.
## REST API Testing
### Poin 1
Tetsing pada API bertujuan untuk memastikan API yang digunakan sudah berjalan dengan baik dan sesuai dengan tujuan. Seperti testing pada umumnya API Testing terbagi menjadi pengujian fungsional dan non fungsional yang meliputi unit testing, integration tetsing, performance testing, dan lainnya. Tools yang digunakan bisa dengan Postman.
### Poin 2
Seperti pada testing umumnya API Testing menghasilkan output dan beberapanya bisa menghasilkan bug. Output dari API Testing sendiri ada JSON (Paling umum), XML, PDF. Untuk bug yang bisa dihasilkan seperti pada bagian security dimana kurang adanya keamanan data. Kemudian bisa jadi ada error disaan handling dan juga masalah performance.
### Poin 3
Keuntungan dari melakukan API Testing adalah kualitas dari API itu sendiri terjamin dan meningkat karena dievaluasi jika terjadi bug atau kesalahan. Selain itu juga meningkatkan performa API yang dipakai dalam suatu sistem.

