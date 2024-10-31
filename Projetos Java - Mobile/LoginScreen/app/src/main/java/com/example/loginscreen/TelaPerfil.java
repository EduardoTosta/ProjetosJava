package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaPerfil extends AppCompatActivity {

    private TextView textNameUser, textEmailUser;
    private Button btDeslogar, btDelPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil);

        //getSupportActionBar().hide();
        iniciarComponentes();

        // Recebe o nome e o e-mail do usuário via Intent
        String userEmail = getIntent().getStringExtra("userEmail");
        String userName = getIntent().getStringExtra("userName");

        textNameUser.setText(userName);
        textEmailUser.setText(userEmail);

        btDeslogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPerfil.this, FormLogin.class);
                startActivity(intent);
                finish(); // Fecha a tela de perfil
            }
        });

        btDelPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FormCadastro.clearRegistration(); // Limpa os dados do cadastro
                Intent intent = new Intent(TelaPerfil.this, FormLogin.class);
                startActivity(intent);
                finish(); // Fecha a tela de perfil
            }
        });
    }

    private void iniciarComponentes() {
        textNameUser = findViewById(R.id.text_name_user);
        textEmailUser = findViewById(R.id.text_email_user);
        btDeslogar = findViewById(R.id.bt_deslogar);
        btDelPerfil = findViewById(R.id.bt_del_perfil);
    }
}
