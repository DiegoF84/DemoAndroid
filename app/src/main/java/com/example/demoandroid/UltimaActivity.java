package com.example.demoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class UltimaActivity extends AppCompatActivity {

    private Bundle savedInstanceState;


    private Button buttonConvertir_Ultima_Activity, buttonReiniciar_Ultima_Activity;
    private RadioButton radioButton_dolar_activity_ultima , radioButtonEuro_Activity_Ultima, radioButtonReal_Activity_Ultima;
    private TextView textView_ingrese_monto_activity_ultima;
    private TextView textViewResultado_Ultima_Activity;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultima);



        buttonConvertir_Ultima_Activity   = findViewById(R.id.buttonConvertir_Ultima_Activity);
        buttonReiniciar_Ultima_Activity   = findViewById(R.id.buttonReiniciar_Ultima_Activity);
        radioButton_dolar_activity_ultima = findViewById(R.id.radioButton_dolar_activity_ultima);
        radioButtonEuro_Activity_Ultima   = findViewById(R.id.radioButtonEuro_Activity_Ultima);
        radioButtonReal_Activity_Ultima   = findViewById(R.id.radioButtonReal_Activity_Ultima);
        textView_ingrese_monto_activity_ultima    = findViewById(R.id.textView_ingrese_monto_activity_ultima);
        textViewResultado_Ultima_Activity  = findViewById(R.id.textViewResultado_Ultima_Activity);



        buttonReiniciar_Ultima_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiarControles();
            }
        });



        buttonConvertir_Ultima_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                convertirMoneda();



            }
        });



    }



    private void limpiarControles() {



        radioButton_dolar_activity_ultima.setChecked(true);
        textView_ingrese_monto_activity_ultima.setText("");
        textViewResultado_Ultima_Activity.setText("$$$");



    }



    private void convertirMoneda() {
        String nInt  = textView_ingrese_monto_activity_ultima.getText().toString();
        int monto = Integer.parseInt(nInt);
        int cotizacion = 0;



        if (radioButton_dolar_activity_ultima.isChecked()) {
            cotizacion = 121;
        }
        if (radioButtonEuro_Activity_Ultima.isChecked()) {
            cotizacion = 128;
        }
        if (radioButtonReal_Activity_Ultima.isChecked()) {
            cotizacion = 24;
        }



        textViewResultado_Ultima_Activity.setText(String.valueOf(monto * cotizacion));
    }



}

