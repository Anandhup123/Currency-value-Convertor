package com.example.currencyconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText Num;
    RadioButton USD,Euro,GBP,KWD;
    float usdval,euroval,gbpval,kwdval;
    Button Convert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Num=(EditText) findViewById(R.id.num);
        USD=(RadioButton) findViewById(R.id.usd);
        Euro=(RadioButton) findViewById(R.id.euro);
        GBP=(RadioButton) findViewById(R.id.gbp);
        KWD=(RadioButton) findViewById(R.id.kwd);
        Convert=(Button) findViewById(R.id.convert);
        Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (USD.isChecked()) {
                    float usddata=Float.parseFloat(Num.getText().toString());
                    usdval= (float) (usddata * 0.014);
                    Intent intent = new Intent(MainActivity.this, usd.class);
                    intent.putExtra("usdsent",usdval);
                    startActivity(intent);


                } else if (Euro.isChecked()){
                    float eurodata=Float.parseFloat(Num.getText().toString());
                    euroval= (float) (eurodata * 0.013);
                    Intent intent = new Intent(MainActivity.this, euro.class);
                    intent.putExtra("eurosent",euroval);
                    startActivity(intent);


                }
                else if (GBP.isChecked()){
                    float gbpdata=Float.parseFloat(Num.getText().toString());
                    gbpval= (float) (gbpdata * 0.011);
                    Intent intent = new Intent(MainActivity.this,gbp.class);
                    intent.putExtra("gbpsent",gbpval);
                    startActivity(intent);


                }
                else if (KWD.isChecked()){
                    float kwddata=Float.parseFloat(Num.getText().toString());
                    kwdval= (float) (kwddata * 0.004);
                    Intent intent = new Intent(MainActivity.this, kwd.class);
                    intent.putExtra("kwdsent",kwdval);
                    startActivity(intent);


                }
                if(Num.getText().toString().isEmpty() ){
                    Toast.makeText(MainActivity.this, "Please enter amount", Toast.LENGTH_SHORT).show();

                }
                if(Num.getText().toString()=="0"){
                    Toast.makeText(MainActivity.this, "Please enter valid amount", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
}