package com.geniusnine.android.yoga;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends Activity {

    private Button AddData;
    private Firebase Reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        Reference=new Firebase("https://yoga-1ea38.firebaseio.com/");

        AddData=(Button)findViewById(R.id.btnadddata);
        AddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase RefChild=Reference.child("Name");

                RefChild.setValue("Supriya");
            }
        });
    }





}
