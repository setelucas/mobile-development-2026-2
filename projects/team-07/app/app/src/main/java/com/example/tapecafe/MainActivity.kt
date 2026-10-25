package com.example.tapecafe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tapecafe.ui.theme.TapeCafeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TapeCafeTheme {
                // SPEC-001 (FR-05): a MainActivity apenas chama a tela inicial.
                TelaInicial()
            }
        }
    }
}
