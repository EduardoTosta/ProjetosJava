package com.example.loginscreen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormCadastro extends AppCompatActivity {

    // Variáveis estáticas para armazenar os dados do cadastro
    private static String registeredEmail = null;
    private static String registeredPassword = null;
    private static String registeredName = null;

    private EditText editNome, editEmail, editSenha;
    private Button btCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        //getSupportActionBar().hide();
        iniciarComponentes();

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailInput = editEmail.getText().toString();
                String passwordInput = editSenha.getText().toString();
                String nameInput = editNome.getText().toString();

                // Verificação para o registro
                if (registeredEmail == null) {
                    registeredEmail = emailInput;
                    registeredPassword = passwordInput;
                    registeredName = nameInput;
                    Toast.makeText(FormCadastro.this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
                    finish(); // Volta para a tela de login
                } else if (registeredEmail.equals(emailInput)) {
                    Toast.makeText(FormCadastro.this, "Usuário já cadastrado!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(FormCadastro.this, "Não temos mais vagas de cadastro disponíveis.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void iniciarComponentes() {
        editNome = findViewById(R.id.edit_nome);
        editEmail = findViewById(R.id.edit_email);
        editSenha = findViewById(R.id.edit_senha);
        btCadastrar = findViewById(R.id.bt_cadastrar);
    }

    // Métodos getters e setters
    public static String getRegisteredEmail() {
        return registeredEmail;
    }

    public static String getRegisteredPassword() {
        return registeredPassword;
    }

    public static String getRegisteredName() {
        return registeredName;
    }

    public static void clearRegistration() {
        registeredEmail = null;
        registeredPassword = null;
        registeredName = null;
    }
}
