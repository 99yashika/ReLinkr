package com.example.relinkr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    EditText et_first,et_last,et_address,et_mob,et_dob,et_email,et_pswrd,et_city,et_pin;
    Button btn_crtacc;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        databaseHelper = DatabaseHelper.getInstance(this);
        et_first = findViewById(R.id.et_first);
        et_last = findViewById(R.id.et_last);
        et_address = findViewById(R.id.et_address);
        et_mob = findViewById(R.id.et_mob);
        et_dob = findViewById(R.id.et_dob);
        et_email = findViewById(R.id.et_email);
        et_pswrd = findViewById(R.id.et_pswrd);
        et_city = findViewById(R.id.et_city);
        et_pin = findViewById(R.id.et_pin);
        btn_crtacc = findViewById(R.id.btn_crtacc);
    }
    public void onClick(View view) {
        if (et_first.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fIll all the field", Toast.LENGTH_SHORT).show();

        } else if (et_last.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fIll all the field", Toast.LENGTH_SHORT).show();

        } else if (et_address.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fIll all the field", Toast.LENGTH_SHORT).show();

        } else if (et_mob.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fIll all the field", Toast.LENGTH_SHORT).show();
        } else if (et_dob.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fIll all the field", Toast.LENGTH_SHORT).show();

        } else if (et_email.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fIll all the field", Toast.LENGTH_SHORT).show();
        } else if (et_pswrd.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fIll all the field", Toast.LENGTH_SHORT).show();
        } else if (et_city.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fIll all the field", Toast.LENGTH_SHORT).show();
        } else if (et_pin.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fIll all the field", Toast.LENGTH_SHORT).show();
        } else {
            UserAccount input = new UserAccount(et_first.getText().toString(), et_last.getText().toString(),
                    et_address.getText().toString(), et_mob.getText().toString(), et_dob.getText().toString(),
                    et_email.getText().toString(), et_pswrd.getText().toString(),
                    et_city.getText().toString(), et_pin.getText().toString());

            if (databaseHelper.addAccountData(input)) {
                Toast.makeText(this, "Data Stored", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(this, "Data Not Stored", Toast.LENGTH_LONG).show();

            }

        }
    }
}
