package com.example.layoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLinear, btnRelative, btnConstraint, btnTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinear = findViewById(R.id.btnLinear);
        btnRelative = findViewById(R.id.btnRelative);
        btnConstraint = findViewById(R.id.btnConstraint);
        btnTable = findViewById(R.id.btnTable);

        btnLinear.setOnClickListener(v -> startActivity(new Intent(this, LinearLayoutActivity.class)));
        btnRelative.setOnClickListener(v -> startActivity(new Intent(this, RelativeLayoutActivity.class)));
        btnConstraint.setOnClickListener(v -> startActivity(new Intent(this, ConstraintLayoutActivity.class)));
        btnTable.setOnClickListener(v -> startActivity(new Intent(this, TableLayoutActivity.class)));
    }
}
