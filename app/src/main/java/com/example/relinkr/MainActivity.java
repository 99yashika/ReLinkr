package com.example.relinkr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text_md;
    TextView text_user;
    EditText etusername;
    TextView text_pswrd;
    EditText etpassword;
    Button loginbtn;
    Button signupbtn;
    Button forgetbtn;
    Cursor cursor;
    DatabaseHelper db = DatabaseHelper.getInstance(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_md = findViewById(R.id.text_md);
        text_user = findViewById(R.id.text_user);
        etusername = findViewById(R.id.etusername);
        text_pswrd = findViewById(R.id.text_pswrd);
        etpassword = findViewById(R.id.etpassword);
        loginbtn = findViewById(R.id.loginbtn);
        signupbtn = findViewById(R.id.signupbtn);
        forgetbtn = findViewById(R.id.forgetbtn);
    }
    public void MainActivity(View v) {
        Toast.makeText(this, "Successfully Login", Toast.LENGTH_LONG).show();

    }

    public void onClick(View view) {
        if (etusername.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fIll all the field", Toast.LENGTH_SHORT).show();

        } else if (etpassword.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please fIll all the field", Toast.LENGTH_SHORT).show();


        } else {


            Intent intent = new Intent(this, Dashboard.class);
            startActivity(intent);
        }
    }
    private void CheckValidity() {
        String email = "";
        String password = "";
        cursor = db.getlogin();
        if (cursor.getCount() == 0)
            Toast.makeText(getApplicationContext(), "No Data", Toast.LENGTH_SHORT).show();
        else {
            cursor.moveToFirst();
            do {
                email = cursor.getString(5);
                password = cursor.getString(6);
                if (etpassword.getText().toString().equalsIgnoreCase(password)) {
                    if (etusername.getText().toString().equalsIgnoreCase(email)) {
                        Toast.makeText(this, "Login Success", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(this,Dashboard.class);
                        startActivity(intent);

                    }
                } else {
                    Toast.makeText(this, "Enter Valid email and password", Toast.LENGTH_SHORT).show();
                }


            }
            while (cursor.moveToNext());

        }


    }


//    private void checkDatabase(){
//        DatabaseHelper databaseHelper2 = DatabaseHelper.getInstance(this);
//        Cursor cursor = databaseHelper2.getDatabaseName();
//        Cursor cursor1 =
//    }



//        Intent intent = new Intent(this,Dashboard.class);
//        startActivity(intent);
//    public void submit_data(View v){
//
//    }

    public void forgetpassword(View view) {
        Intent intent = new Intent(this,Forgetpassword.class);
        startActivity(intent);
    }

    public void createaccount(View view) {
        Intent intent = new Intent(this,CreateAccount.class);
        startActivity(intent);
    }
}

