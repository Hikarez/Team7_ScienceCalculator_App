# RAR Calculator

![Logo Aplikasi](app/src/main/res/drawable/logo_calculator.png)

## Deskripsi Aplikasi
RAR Calculator adalah aplikasi kalkulator saintifik untuk Android yang dirancang untuk melakukan berbagai operasi matematika dari yang sederhana hingga kompleks. Aplikasi ini dikembangkan sebagai project mata kuliah Pemrograman Mobile oleh tim yang terdiri dari 3 anggota.

## Tim Pengembang
- **Ridzkal Jamil (312310048)** - Back-end Developer
- **Delsa Pramuditia (312310019)** - Front-end Developer
- **Reza Fadlillah Ardi (312310032)** - UI/UX Designer

## Fitur Utama
- Operasi matematika dasar (tambah, kurang, kali, bagi)
- Fungsi trigonometri (sin, cos, tan, dll)
- Logaritma
- Splash screen yang menarik
- Interface yang user-friendly

## Teknologi
- Android Studio
- Java
- XML untuk layout

## Link Trello/Jira
[Link ke board SCRUM](https://rantaw.atlassian.net/jira/software/projects/MAP/boards/1?atlOrigin=eyJpIjoiOWNiNjliNGUzOGU4NGRhMTliMTIwNDhmMzQxZDAwZmIiLCJwIjoiaiJ9)

---

# Storyboard

## Storyboard Ridzkal Jamil (Back-end)

### 1. Persiapan dan Perencanaan
Pada fase ini, saya melakukan persiapan dengan:
- Membuat repository GitHub untuk kolaborasi tim
- Merancang arsitektur aplikasi dengan pendekatan MVC (Model-View-Controller)
- Membuat struktur dasar project di Android Studio
- Melakukan riset implementasi algoritma matematika di Java

### 2. Implementasi Operasi Dasar
Proses implementasi operasi dasar meliputi:
- Membuat class Calculator sebagai engine utama untuk kalkulasi
- Implementasi metode untuk operasi tambah, kurang, kali, dan bagi
- Menangani edge cases seperti pembagian dengan nol
- Unit testing untuk memastikan akurasi perhitungan

### 3. Implementasi Fungsi Trigonometri dan Logaritma
Pengembangan fungsi lanjutan mencakup:
- Implementasi fungsi trigonometri (sin, cos, tan)
- Implementasi fungsi logaritma natural dan basis 10
- Pengembangan fungsi eksponensial dan pemangkatan
- Optimasi algoritma untuk akurasi dan performa

### 4. Fitur Memori
Tahap pengembangan Fitur Memori meliputi:
- Fitur memori kalkulator untuk menyimpan hasil perhitungan
- Integrasi dengan sistem input/output pada UI

### 5. Testing dan Debugging
Proses testing dan debugging melibatkan:
- Unit testing untuk semua fungsi matematika
- Integrasi testing dengan komponen UI
- Optimasi performa dan akurasi perhitungan
- Refactoring kode untuk maintainability

### 6. Integrasi dan Finalisasi
Fase akhir pengembangan back-end:
- Integrasi penuh dengan komponen front-end
- Dokumentasi kode dan API
- Final testing menyeluruh
- Persiapan repository untuk submission

---

## Storyboard Delsa (Front-end)

### 1. Persiapan dan Layout Dasar
Tahap persiapan front-end meliputi:
- Setup project dengan layout dasar
- Implementasi struktur XML untuk tampilan kalkulator
- Penempatan elemen UI seperti display dan tombol-tombol
- Implementasi constraint layout untuk responsivitas

### 2. Splash Screen dan Navigasi
Pengembangan splash screen dan navigasi:
- Desain dan implementasi splash screen dengan logo RAR Calculator
- Implementasi animasi transisi
- Setup navigasi antar layout (jika ada)
- Handling orientasi layar (potrait/landscape)

### 3. Implementasi UI Kalkulator Utama
Proses implementasi UI utama:
- Layout tombol-tombol operasi dasar
- Layout tombol-tombol fungsi lanjutan
- Implementasi display hasil perhitungan
- Styling sesuai design guide dari UI/UX designer

### 4. Interaksi UI dan Event Handling
Pengembangan interaksi pengguna:
- Implementasi event listener untuk setiap tombol
- Handling input dari pengguna
- Validasi input dan feedback visual
- Animasi dan efek tombol saat ditekan

### 5. Integrasi dengan Back-end
Proses integrasi dengan back-end:
- Menghubungkan input UI dengan fungsi kalkulasi
- Menampilkan hasil perhitungan di display
- Handling error dan exception dari back-end
- Testing integrasi menyeluruh

### 6. Refinement dan Polishing
Fase akhir pengembangan front-end:
- Optimasi tampilan di berbagai ukuran layar
- Penyempurnaan animasi dan transisi
- Implementasi feedback visual yang lebih baik
- Final testing UX dan responsivitas

---

## Storyboard Reza (UI/UX Designer)

### 1. Riset dan Konsep Awal
Tahap awal desain UI/UX:
- Riset kalkulator saintifik yang sudah ada
- Analisis kebutuhan pengguna
- Sketsa konsep awal beberapa alternatif desain
- Pemilihan arah desain utama

### 2. Wireframing dan Layout
Proses wireframing meliputi:
- Struktur hierarki UI aplikasi
- Layout tombol kalkulator yang ergonomis
- Wireframe untuk berbagai state aplikasi
- Flow user dari splash screen hingga interaksi penuh

### 3. Visual Design dan Style Guide
Pengembangan visual design:
- Pemilihan skema warna dan palet
- Tipografi dan hierarki teks
- Desain tombol dan elemen UI
- Style guide komprehensif untuk implementasi

### 4. Logo dan Splash Screen
Desain identitas visual aplikasi:
- Konsep dan sketsa logo RAR Calculator
- Iterasi dan refinement logo
- Desain splash screen dengan animasi
- Implementasi logo pada berbagai elemen UI

### 5. Mockup Interaktif dan Prototype
Pembuatan mockup interaktif:
- High-fidelity mockup aplikasi lengkap
- Prototype interaktif untuk testing
- Simulasi flow penggunaan aplikasi
- Dokumentasi interaksi UI/UX

### 6. User Testing dan Finalisasi
Fase akhir pengembangan UI/UX:
- Pelaksanaan user testing sederhana
- Analisis feedback dan pain points
- Iterasi desain berdasarkan feedback
- Finalisasi aset visual dan dokumentasi

---

## Panduan Instalasi dan Penggunaan
1. Clone repository ini
   git clone https://github.com/Hikarez/Team7_ScienceCalculator_App.git
2. Buka project di Android Studio
3. Build dan jalankan aplikasi di emulator atau device Android

## Struktur Project
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/rarcalculator/
│   │   │   ├── MVC/
│   │   │   │   ├── [file-file java]
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   ├── [file-file XML layout]
│   │   │   ├── drawable/
│   │   │   │   ├── [aset gambar]
│   │   │   ├── values/
│   │   │   │   ├── [resource values]

## Kontribusi
Project ini dikembangkan sebagai tugas kuliah dan tidak menerima kontribusi eksternal.

## Thanks to :
Bapak dosen kami mata kuliah Pemograman Mobile 2 :
Donny Maulana, S.Kom., M.M.S.I.
