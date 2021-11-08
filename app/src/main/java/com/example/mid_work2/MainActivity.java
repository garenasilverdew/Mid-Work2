package com.example.mid_work2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    Button button;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
        txv = findViewById(R.id.textView);
    }

    public void transfer(View v){
        double A =Double.parseDouble(editText.getText().toString());
        double B =Double.parseDouble(editText2.getText().toString());
        Double C = A/100;
        Double D = C*C;
        Double E = B/D;
        txv.setText("BMI值為"+E);
    }
}