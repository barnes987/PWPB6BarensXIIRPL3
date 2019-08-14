package com.example.pwpb6barensxiirpl3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_main2);
        TextView t = (TextView) findViewById(R.id.text_viewdata);
        Bundle bundle=getIntent().getExtras();
        String s=bundle.getString( "name");
        t.setText(s);
    }
}
