package com.example.hp.mvghamarachitoor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FirebaseApp.initializeApp(this);



        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if(user==null){
            Intent intent= new Intent (this,MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        }
        else{
           // FirebaseAuth.getInstance().signOut();
        }
    }

    public void onB1Click(View v){
        Intent i = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(i);
    }

    public void onB2Click(View v){
        Intent i = new Intent(Main2Activity.this,Main4Activity.class);
        startActivity(i);
    }

    public void onB3Click(View v){
        Intent i = new Intent(Main2Activity.this,Main5Activity.class);
        startActivity(i);
    }
}
