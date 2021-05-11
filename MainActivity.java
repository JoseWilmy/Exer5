package com.example.exe5_tic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText salario;
    private Button exibir_salario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salario = findViewById(R.id.salario);
        exibir_salario = findViewById(R.id.exibir_salario);



        exibir_salario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 float salario1 = Float.parseFloat(salario.getText().toString());
                  salario1 -= (salario1*7)/100;
                  salario1 += (salario1*5)/100;

                Toast.makeText(getApplicationContext() , "O seu salário é: " + salario1 , Toast.LENGTH_LONG).show();
            }
        });


    }
}