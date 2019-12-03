package com.example.relinkr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Edit_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
    }

    public void addexperience(View view) {
        Intent intent = new Intent(this,Experience.class);
        startActivity(intent);
    }

    public void addeducation(View view) {
        Intent intent = new Intent(this,Education.class);
        startActivity(intent);
    }

    public void addachievement(View view) {
        Intent intent = new Intent(this,achievement.class);
        startActivity(intent);
    }
}
