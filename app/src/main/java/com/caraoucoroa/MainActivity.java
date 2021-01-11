package com.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonJogar = findViewById(R.id.buttonJogar);

        buttonJogar.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

            //passar dados para a próxima tela

            int numero = new Random().nextInt(2);
            intent.putExtra("numero", numero);

            startActivity( intent );
        });
    }
}