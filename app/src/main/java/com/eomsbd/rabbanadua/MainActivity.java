package com.eomsbd.rabbanadua;


import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.eomsbd.rabbanadua.fragment.FacebookFragment;

public class MainActivity extends AppCompatActivity {

   ImageButton button;
   Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      button=(ImageButton) findViewById(R.id.facebookBTN);
      button1=findViewById(R.id.showBtn);

      button1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(MainActivity.this, ShowActivity.class));
          }
      });

      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              FragmentManager fragmentManager = getSupportFragmentManager();
              FacebookFragment requestDialogFragment = new FacebookFragment();
              requestDialogFragment.show(fragmentManager, "request_dialog");
          }
      });
    }


}
