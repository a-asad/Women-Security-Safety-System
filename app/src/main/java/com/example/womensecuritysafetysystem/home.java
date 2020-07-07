package com.example.womensecuritysafetysystem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimary));
        final TextView add_guardian = (TextView)findViewById(R.id.button3);
        add_guardian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_guardian = new Intent(home.this, add_guardian.class);
                startActivity(add_guardian);
            }
        });

    }
}
