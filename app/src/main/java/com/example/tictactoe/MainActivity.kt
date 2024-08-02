package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tictactoe.ui.theme.TicTacToeTheme

var singleUser = false

class MainActivity: AppCompatActivity() {
    lateinit var singplePlayerBtn: Button
    lateinit var multiplayerBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        singplePlayerBtn = findViewById(R.id.idBtnSinglePlayer)
        multiplayerBtn = findViewById(R.id.idBtnMultiPlayer)
        singplePlayerBtn.setOnClickListener {
            singleUser = true
            startActivity(Intent(this, GamePlayActivity::class.java))
        }
        multiplayerBtn.setOnClickListener {
            singleUser = false
            startActivity(Intent(this, MultiPlayerGameSelectionActivity::class.java))
        }
    }
}