package com.example.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private Button btn1;
    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 =(TextView)findViewById(R.id.txt_resultado);
        btn1=(Button)findViewById(R.id.btnSumar);
    }
    //ESTE METODO REALIZAA LA SUMA
    public void Sumar(View view){
        if(!et1.getText().toString().isEmpty()) {
            if(!et2.getText().toString().isEmpty()){
            int num1 = Integer.parseInt(et1.getText().toString());
            int num2 = Integer.parseInt(et2.getText().toString());
            int suma = num1 + num2;
            tv1.setText(String.valueOf(suma));
            }else{
                Toast.makeText(this, "Ha dejado campos vacios",
                        Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(this, "Ha dejado campos vacios",
                    Toast.LENGTH_LONG).show();
        }
    }
}
