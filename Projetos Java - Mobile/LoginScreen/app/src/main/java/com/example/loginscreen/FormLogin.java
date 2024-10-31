package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormLogin extends AppCompatActivity {

    private EditText editEmail, editSenha;
    private Button btEntrar;
    private TextView textTelaCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        //getSupportActionBar().hide();
        iniciarComponentes();

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailInput = editEmail.getText().toString();
                String senhaInput = editSenha.getText().toString();

                // Verificar credenciais
                if (emailInput.equals(FormCadastro.getRegisteredEmail()) &&
                        senhaInput.equals(FormCadastro.getRegisteredPassword())) {

                    Intent intent = new Intent(FormLogin.this, TelaPerfil.class);
                    intent.putExtra("userEmail", emailInput);
                    intent.putExtra("userName", FormCadastro.getRegisteredName());
                    startActivity(intent);
                    finish(); // Fecha a tela de login
                } else {
                    Toast.makeText(FormLogin.this, "Email ou senha inválidos.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textTelaCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(intent);
            }
        });
    }

    private void iniciarComponentes() {
        editEmail = findViewById(R.id.edit_email);
        editSenha = findViewById(R.id.edit_senha);
        btEntrar = findViewById(R.id.bt_entrar);
        textTelaCadastro = findViewById(R.id.text_tela_cadastro);
    }
}
