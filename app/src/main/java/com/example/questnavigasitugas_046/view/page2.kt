package com.example.questnavigasitugas_046.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f), //buat bisa ndorong ke bawah
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(listPeserta) { peserta ->
                PesertaCard(peserta = peserta)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = onNavigateToBeranda) {
                Text(text = "Beranda")
            }
            Button(onClick = onNavigateToForm) {
                Text(text = "Formulir")
            }
        }
    }
}

@Composable
fun PesertaCard(peserta: Peserta, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

