package com.example.questnavigasitugas_046.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

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
    }
