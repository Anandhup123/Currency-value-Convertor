package com.example.currencyconverter;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class gbp extends AppCompatActivity {
    TextView paste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gbp);
        paste=findViewById(R.id.result);
        Bundle b=getIntent().getExtras();

        float pass=b.getFloat("gbpsent");
        paste.setText(Float.toString(pass));
    }
}