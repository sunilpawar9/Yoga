package com.geniusnine.android.yoga;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends Activity {

    private Button AddData,btnAdd;
     private EditText editTextName;
    private Firebase Reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        Reference=new Firebase("https://yoga-1ea38.firebaseio.com/");
        editTextName=(EditText)findViewById(R.id.editTextName);
        AddData=(Button)findViewById(R.id.btnadddata);
        btnAdd=(Button)findViewById(R.id.buttonadd);
        AddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase RefChild=Reference.child("Name");

                RefChild.setValue("Supriya");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editTextName.getText().toString();
                Firebase RefChild=Reference.child("Name");

                RefChild.setValue(value);
            }
        });




    }





}
