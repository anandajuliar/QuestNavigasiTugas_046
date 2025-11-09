package com.example.questnavigasitugas_046.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Page3(
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("Laki-laki") }
    var status by remember { mutableStateOf("") }
    var isDropdownExpanded by remember { mutableStateOf(false) }
    val statusOptions = listOf("Lajang", "Kawin", "Cerai")
    var showDialog by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 16.dp)
    ) {
        Text(
            text = "Formulir Pendaftaran",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            textAlign = TextAlign.Center
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = "NAMA LENGKAP", style = MaterialTheme.typography.labelSmall)
                OutlinedTextField(
                    value = nama,
                    onValueChange = { nama = it },
                    placeholder = { Text(text = "Isikan nama lengkap") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )
            }
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = "JENIS KELAMIN", style = MaterialTheme.typography.labelSmall)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = (jenisKelamin == "Laki-laki"),
                        onClick = { jenisKelamin = "Laki-laki" }
                    )
                    Text(
                        text = "Laki-laki",
                        modifier = Modifier
                            .selectable(
                                selected = (jenisKelamin == "Laki-laki"),
                                onClick = { jenisKelamin = "Laki-laki" }
                            )
                            .padding(end = 16.dp)
                    )

                    RadioButton(
                        selected = (jenisKelamin == "Perempuan"),
                        onClick = { jenisKelamin = "Perempuan" }
                    )
                    Text(
                        text = "Perempuan",
                        modifier = Modifier.selectable(
                            selected = (jenisKelamin == "Perempuan"),
                            onClick = { jenisKelamin = "Perempuan" }
                        )
                    )
                }
            }
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = "ALAMAT", style = MaterialTheme.typography.labelSmall)
                OutlinedTextField(
                    value = alamat,
                    onValueChange = { alamat = it },
                    placeholder = { Text(text = "Isikan alamat") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )
            }
            Spacer(modifier = Modifier.height(32.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                OutlinedButton(
                    onClick = onNavigateBack,
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Kembali")
                }
                Button(
                    onClick = { showDialog = true },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF6200EE)
                    )
                ) {
                    Text(text = "Submit")
                }
            }
        }

    }
    }
@Composable
private fun DialogRow(label: String, value: String) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = label,
            color = Color.Gray,
            modifier = Modifier.weight(1f),
            fontSize = 14.sp
        )
        Text(
            text = value.ifEmpty { "-" },
            modifier = Modifier.weight(1.5f),
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}



