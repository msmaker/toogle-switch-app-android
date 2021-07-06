package com.msmaker.tooglesswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch switchSenha;
    private ToggleButton toggleSenha;
    private TextView textResultado;
    private CheckBox checkBoxSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchSenha = findViewById(R.id.switchSenha);
        toggleSenha = findViewById(R.id.toggleSenha);
        textResultado = findViewById(R.id.textResultado);
        checkBoxSenha = findViewById(R.id.checkBoxSenha);

        adcionarListener();
    }

    public void adcionarListener() {
        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textResultado.setText("ligado");
                } else {
                    textResultado.setText("desligado");
                }

            }
        });
    }

    public void enviar(View view) {

        //if (toggleSenha.isChecked()) {
        //if (switchSenha.isChecked()) {
        if (checkBoxSenha.isChecked()) {
            textResultado.setText("Check ligado");
        } else {
            textResultado.setText("Check desligado");
        }
    }
}
