package com.example.currencyconverter;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class euro extends AppCompatActivity {
    TextView paste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_euro);
        paste=findViewById(R.id.result);
        Bundle b=getIntent().getExtras();

        float pass=b.getFloat("eurosent");
        paste.setText(Float.toString(pass));
    }
}