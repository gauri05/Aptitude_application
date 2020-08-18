package com.example.aptitude_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {

    TextInputLayout regname,regrollno,regphoneno,regemail,regpass,regconformpass;
    Button regBtn,regToLoginBtn;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);

        regname=findViewById(R.id.name);
        regrollno=findViewById(R.id.roll_no);
        regphoneno=findViewById(R.id.phone_no);
        regemail=findViewById(R.id.email);
        regpass=findViewById(R.id.password);
        regconformpass=findViewById(R.id.conform_pass);
        regBtn=findViewById(R.id.reg_go);
        regToLoginBtn=findViewById(R.id.reg_login_btn);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode=FirebaseDatabase.getInstance();
                reference=rootNode.getReference("Student");

                //Get all the values
                String name=regname.getEditText().getText().toString();
                String rollno=regrollno.getEditText().getText().toString();
                String phoneno=regphoneno.getEditText().getText().toString();
                String email=regemail.getEditText().getText().toString();
                String pass=regpass.getEditText().getText().toString();
                String confpass=regconformpass.getEditText().getText().toString();
                
                UserHelperClass helperClass=new UserHelperClass(name,rollno,phoneno,email,pass,confpass);
                reference.child(rollno).setValue(helperClass);
            }
        });

        regToLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplication(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}