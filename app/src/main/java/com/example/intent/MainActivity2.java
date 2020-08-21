package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btn2;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn2 = findViewById(R.id.button2);
        txt = findViewById(R.id.txt);
        Intent intent = getIntent();

        Bundle bundle = intent.getBundleExtra("dulieu");
        if(bundle!=null) {
            String name = bundle.getString("chuoi");
            int number = bundle.getInt("chuoi1");
            String[] array = bundle.getStringArray("chuoi3");
            HocSinh hocSinh = (HocSinh) bundle.getSerializable("chuoi4");
            txt.setText(hocSinh.getHoTen() + "");
        }
    }

}