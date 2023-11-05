# PBO2023
PBO Pertemuan Ke-1
1. Buat proyek baru dengan nama MahklukHidup di Net Beans.
2. Kemudian buat syntax turunan sesuai dengan mahluk hidup yang dipilih, disini 
saya memilih Chinchilla, kemudian klik kanan untuk menggunakan Refactor lalu 
klik Encapsulate Fields.
3. Kemudian pada kolom Getter dan Setter, klik select all dan rubah fields visibility 
menjadi private, public untuk Habitat, serta protected untuk Mandi.
4. Dalam package yang sama, buat kelas bernama Hewan kemudian masukkan 
extends untuk menghubungkan kelas tersebut dengan kelas MahlukHidup. Selain 
itu, tambahkan syntax untuk mengakses syntax protected Mandi.
5. Masih di package yang sama, buat kelas bernama PBO dimana kelas ini 
merupakan kelas utama. Kemudian susun syntax dengan mengatur setter dan juga 
getter, serta syntax untuk Mandi.
6. Setelah memastikan tidak ada eror dalam program, klik Run. Jika program sukses 
dibuat, maka outputnya akan seperti ini.
7. Kemudian buat package lain di bawah proyek yang sama dengan nama PBO1, 
lalu buat kelas bernama PBOQ dan susun syntax sama seperti dengan kelas PBO. 
Namun dalam kelas ini, kita tambahkan import untuk memasukkan kelas lain ke 
dalam kelas PBOQ. Tambahkan syntax untuk mengakses syntax protected. 
8. Jika program sudah tidak ada eror, maka jalankan program. Outputnya akan sama 
seperti output kelas PBO jika program berjalan dengan sempurna.
9. Kemudian hapus syntax akses yang berada di kelas PBOQ lalu jalankan program.
10. Output program akan terlihat seperti ini, dimana syntax Mandi tidak akan muncul 
karena kelas PBOQ tidak memiliki akses.

Penjelasan Lanjutan
Refactor = proses mengubah kode agar lebih terstruktur, mudah dimengerti, dan efisien 
tanpa mengubah perilaku fungsionalnya. Tujuannya adalah meningkatkan kualitas dan 
kebersihan kode.
Encapsulate Fields = praktik mengatur atribut sebagai private/public/protected dalam 
suatu kelas, kemudian menyediakan metode getter dan setter untuk mengakses dan
memodifikasinya. Ini menjaga pengendalian data dan mencegah akses langsung dari 
luar yang dapat mengganggu integritas data.

PBO Pertemuan Ke-2
1. Membuat diagram kelas untuk lebih memudahkan kita melakukan pemrogaman.
Disini saya menggunakan nama kelas MakhlukHidup dengan turunan yang dipilih 
Hewan.
2. Membuat package dengan nama MakhlukHidup.
3. Kemudian buat syntax yang diinginkan, disini saya menggunakan tipe data String 
dan Int. Saya juga menambahkan konstruktor sebanyak 3.
4. Dalam package yang sama, buat kelas bernama Hewan kemudian masukkan 
extends untuk menghubungkan kelas tersebut dengan kelas MahlukHidup. Selain 
itu, tambahkan syntax lain sesuai yang diinginkan. Disini saya juga menambahkan 
3 konstruktor serta syntax super untuk terhubung dengan superclass 
(MakhlukHidup).
5. Dalam package yang sama, buat kelas bernama Tumbuhan kemudian masukkan 
extends untuk menghubungkan kelas tersebut dengan kelas MahlukHidup. Selain 
itu, tambahkan syntax lain sesuai yang diinginkan. Disini saya juga menambahkan 
3 konstruktor serta syntax super untuk terhubung dengan superclass 
(MakhlukHidup).
6. Kemudian, di dalam package yang sama, kita akan membuat kelas turunan dari 
kelas Hewan dan juga kelas Tumbuhan dengan nama kelas Mamalia & kelas 
Berbunga. Disini saya juga menggunakan 3 konstruktor serta menghubungkan 
kelas ini dengan Superclass.
7. Kemudian buat kelas lain dengan nama PBO dimana kelas inilah yang akan 
menjadi main class dari program kita. Disini saya memilih untuk mengisi program 
dengan hewan, yaitu Chinchilla. 
8. Kemudian kita susun syntax dengan menyesuaikan syntax program dengan data.
hewan yang kita pilih.
9. Jika program sudah selesai dan tidak ada eror, maka klik Run untuk mengetahui 
output program.

PBO Pertemuan Ke-3
1. Membuat diagram kelas untuk lebih memudahkan kita melakukan pemrogaman.
Disini saya membuat package food, dengan Food sebagai superclass, Kuah dan 
Tumis sebagai subclass. Untuk interface nya terdapat di dalam kelas Kuah, yaitu 
Ramen, Wonton Soup, dan Bakso.
2. Pertama buat package dengan nama Food. Kemudian buat syntax sesuai 
keinginan, disini saya menggunakan tipe data string dan juga overload method.
3. Kemudian kita buat kelas baru dengan nama Tumis (masih dalam package yang 
sama) dan tidak lupa untuk menghubungkan kelas ini dengan superclass. Lalu kita 
menambahkan syntax super untuk memanggil superclass.
4. Dalam package yang sama, buat kelas bernama Ramen, Bakso, Wonton Soup
kemudian kita ganti syntax class menjadi interface. Kemudian setel kode pada 
setiap kelas agar method dapat diakses dari luar.
5. Masih di package yang sama, buat kelas bernama Kuah dimana kelas ini akan kita 
gunakan untuk mengakses interface. Kita memanggil interface dengan cara 
menambahkan syntax implements. Kemudian klik icon lampu yang ada di sebelah 
kiri, lalu klik Implement all abstract methods. Dengan ini, kita tidak perlu menulis 
syntax satu persatu. Method ini dinamakan dengan Override.
6. Kemudian buat package baru dengan nama Pbolagi dengan kelas bernama Jalan. 
Kelas inilah yang akan menjadi main class dari seluruh coding yang telah kita 
buat. Susun syntax sesuai dengan yang sudah kita buat di kelas sebelumnya,
jangan lupa untuk mengimporkan package Food agar kita bisa mengakses syntax 
di kelas tersebut.
7. Jika dirasa seluruh syntax sudah benar dan tersusun rapi, maka klik Run dan lihat
output dari program tersebut.

PBO Pertemuan Ke-4
1. Pertama, buka Netbeans kemudian klik pada bagian service > database, 
lalu pilih Postgres yang akan digunakan. Disini saya menggunakan 
Postgres yang sudah disediakan oleh Netbeans, klik kanan lalu pilih 
connect using.
2. Lalu atur setelan Postgres dengan menyertakan nama database yang akan 
digunakan serta password dari PgAdmin. Disini saya menggunakan 
database yang sudah ada sehingga memudahkan pengerjaan. Jika sudah, 
klik test conecction dan jika database sudah terhubung sempurna klik next 
> pilih schema public > lalu klik finish.
3. Kemudian akan muncul JDBC url yang sudah kita buat, klik kanan 
kemudian pilih connect lalu masukkan password PgAdmin.
4. Selesai menghubungkan PgAdmin, klik new project lalu buat dengan 
nama Crud. Buka project lalu pada bagian libraries, klik kanan dan pilih 
add library lalu pilih library dengan nama Postgres dan klik add library.
5. Pada project Crud, buat kelas dengan nama Select. Susun query kelas 
tersebut untuk bisa melihat tabel dari database. Jika tidak ada error, klik 
run dan hasil outputnya akan seperti dibawah ini.
6. Dalam package yang sama, buat kelas yang baru dengan nama Insert. 
Susun query kelas tersebut agar kita bisa memasukkan data ke tabel yang 
ada di database. Jika tidak ada eror klik run dan outputnya akan seperti di 
bawah ini.
7. Buat kelas baru lagi dengan nama Update. Susun query kelas tersebut agar 
kita bisa merubah isi data dari tabel yang ada di database. Klik run jika 
tidak terdapat eror dan hasil nya akan seperti ini.
8. Masih dalam package yang sama, buat kelas baru bernama Delete. Susun 
query kelas tersebut agar kita bisa menghapus salah satu data yang ada di 
database. Jika tidak terdapat eror, klik run dan outputnya akan seperti ini.
9. Pada bagan service klik 2x di jdbc url > public > tables > pilih tabel 
Pembayaran, klik kanan lalu pilih view data. Gambar di bawah ini 
merupakan hasil tabel sebelum dirubah dan sesudah dirubah.

PBO Pertemuan Ke-5
1. Membuat Jframe di dalam project baru bernama TampilanGUI. Kemudian buat 
tampilan yang diinginkan.
2. Pada source, berikan tambahan query untuk bisa melakukan INSERT.
3. Tambahkan query di bagian bawah source untuk bisa menyimpan data yang 
dimasukkan.
4. Run program dan masukkan data.
5. Setelah INSERT, buat query untuk UPDATE.
6. Run program lalu ubah data.
7. Kemudian setelah INSERT dan UPDATE, buat query untuk DELETE.
8. Run program dan hapus data.

PBO Pertemuan Ke-6
1. Menggunakan project yang sama yaitu project TampilanGUI, pastikan data masih 
tersimpan.
2. Sebelumnya pastikan untuk mengesktrak file pustaka dan menambahkannya di 
library.
3. Kemudian klik new pada project, lalu pilih other > Report Wizard.
4. Pilih jenis report yang akan digunakan lalu masukkan query yang dibutuhkan.
5. Pilih kolom apa saja yang ditampilkan lalu pilih next > finish, disini saya memberi 
nama file ini dengan nama ReportM.
6. Buat query / button untuk cetak di kelas TampilanGUI, pastikan tidak ada eror.
7. Kemudian jalankan program, tampilannya akan seperti dibawah. Pastikan untuk 
menghapus query languange “Groovy” pada Report Wizard (ReportM). Lalu klik 
cetak
8. Jika tidak terdapat eror, maka kita berhasil membuat button cetak dan hasilnya 
akan seperti ini.

PBO Pertemuan Ke-9
1. Menggunakan database TampilanBuku yang sudah dibuat di UTS sebelumnya.
2. Pada bagian button Simpan, Update, dan Delete rubah query menjadi 
menggunakan persistence.
3. Pada bagian public buat query refresh supaya kita tidak perlu menjalankan
program dua kali untuk melihat hasil input data.
4. Jalankan program dan lakukan CRUD.
5. Buat report dan query untuk tombol cetak.
6. Coba untuk cetak program.

PBO Pertemuan Ke-10
1. Mengunduh Apache Common CSV 10 dan menambahkan nya ke dalam library 
di package TampilanBuku.
2. Kemudian membuat tombol Import pada GUI.
3. Lalu pada kolom query tombol Import, isi kolom tersebut dengann query agar kita 
bisa mengimport data.
4. Sebelum menjalankan program, buka notepad dan buat query untuk memasukkan 
data ke dalam program lalu simpan dengan nama PBO.
5. Kemudian jalankan program, lalu jika program sudah muncul klil Import lalu pilih 
PBO dan klik Open.
6. Sebelumnya masukkan data baru ke dalam notepad dan simpan.
7. Data berhasil masuk ke dalam program.
