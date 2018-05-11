package br.com.fiap.app8_passoapasso;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class ConfiguracoesActivity extends AppCompatActivity {
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

        ligar.setChecked(preferences.getBoolean("ligar", false));
        email.setText(preferences.getString("email",""));

        concluirConfiguracoes = findViewById(R.id.concluirConfiguracoes);
        concluirConfiguracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = getPreferences(MODE_PRIVATE).edit();
                editor.putBoolean("ligar",ligar.isChecked());
                editor.putString("email",email.getText().toString());
                editor.apply();
                finish();
            }
        });

    }

}
