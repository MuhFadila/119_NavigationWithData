package com.example.halamannavigasi

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun HalamanContact(
    onConfirmButtonClicked: (String, String, String) -> Unit,
    onCancelButtonClicked: () -> Unit
){
    var nama by remember { mutableStateOf("") }
    var noHp by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
}