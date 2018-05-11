package br.com.fiap.app8_passoapasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ConfiguracoesActivity extends AppCompatActivity {
    private Button concluirConfiguracoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);

        concluirConfiguracoes = findViewById(R.id.concluirConfiguracoes);
        concluirConfiguracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
