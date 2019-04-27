package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity{

    EditText editLogin, editSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editLogin = (EditText) findViewById(R.id.editLogin);
        editSenha = (EditText) findViewById(R.id.editSenha);
        Button button = (Button) findViewById(R.id.btn_Entrar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = editLogin.getText().toString();
                String senha = editSenha.getText().toString();

                if (login.equals("")&& senha.equals("")){
                    alert("Login Realizado com Sucesso!!!");
                   Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);
                }else{
                    alert("ERRO!!! Login ou Senha invalidos!!!");
                }
            }
        });
    }
public void alert(String s){
      Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
}


}
