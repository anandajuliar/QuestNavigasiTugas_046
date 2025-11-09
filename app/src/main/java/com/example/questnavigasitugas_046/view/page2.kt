package com.example.questnavigasitugas_046.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

@Composable
fun Page2(
    onNavigateToBeranda: () -> Unit,
    onNavigateToForm: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        Text(
            text = "List Daftar Peserta",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        ) }

