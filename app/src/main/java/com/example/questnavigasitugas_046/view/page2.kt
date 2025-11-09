package com.example.questnavigasitugas_046.view

data class Peserta(
    val nama: String,
    val jenisKelamin: String,
    val status: String,
    val alamat: String
)

val listPeserta = listOf(
    Peserta(
        nama = "Asroni Sukirman",
        jenisKelamin = "Laki - Laki",
        status = "Cerai",
        alamat = "Sleman"
    ),
    Peserta(
        nama = "Aprilia Kurnianti",
        jenisKelamin = "Perempuan",
        status = "Lajang",
        alamat = "Bantul"
    ),
    Peserta(
        nama = "Haris Setyawan",
        jenisKelamin = "Laki - Laki",
        status = "Kawin",
        alamat = "Jogja"
    ),
    Peserta(
        nama = "Dwijoko",
        jenisKelamin = "Laki - Laki",
        status = "Kawin",
        alamat = "Jogja"
    )
)

