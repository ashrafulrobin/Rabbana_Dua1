package com.eomsbd.rabbanadua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);


        listView=findViewById(R.id.list_item);
        String[] item=getResources().getStringArray(R.array.data);

        ArrayAdapter adapter=new ArrayAdapter(ShowActivity.this,android.R.layout.simple_list_item_1,item);

        listView.setAdapter(adapter);
    }
}
