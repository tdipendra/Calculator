package com.example.dipendrathapa.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {


    EditText ed1, ed2, ed3;
    Button b1, b2, b3, b4;

    Integer res;
    float res2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        ed3 = (EditText) findViewById(R.id.editText3);

        b1 = (Button) findViewById(R.id.badd);
        b2 = (Button) findViewById(R.id.bsub);
        b3 = (Button) findViewById(R.id.bmul);
        b4 = (Button) findViewById(R.id.bdiv);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();
                res = Integer.parseInt(num1) + Integer.parseInt(num2);
                ed3.setText(Integer.toString(res));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();
                res = Integer.parseInt(num1) - Integer.parseInt(num2);
                ed3.setText(Integer.toString(res));

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();
                res = Integer.parseInt(num1) * Integer.parseInt(num2);
                ed3.setText(Integer.toString(res));
            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = ed1.getText().toString();
                String num2 = ed2.getText().toString();
                res2 = Float.parseFloat(num1) / Float.parseFloat(num2);
                ed3.setText(Float.toString(res2));
            }

        });

        });


    }
}

