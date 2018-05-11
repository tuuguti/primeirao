package br.com.fiap.app8_passoapasso;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConfiguracoesActivity extends AppCompatActivity {
    private Button concluirConfiguracoes;

    private Button concluirConfiguracoes;
    private Switch ligar;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);
        ligar = findViewById(R.id.ligar);
        email = findViewById(R.id.email);
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        preferences.getBoolean("ligar",false);


        concluirConfiguracoes = findViewById(R.id.concluirConfiguracoes);
        concluirConfiguracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        public void onClick(View v){
            finish();
    }
    }

}
