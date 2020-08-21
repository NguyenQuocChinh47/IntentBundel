package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;
import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                HocSinh hocSinh = new HocSinh("Nguyen Quoc Chinh", 1997);
                String[] array = {"1", "2", "3"};

                bundle.putString("chuoi", "Nguyen Van Chi");
                bundle.putInt("chuoi1", 1234);
                bundle.putStringArray("chuoi3", array);
                bundle.putSerializable("chuoi4", hocSinh);

                intent.putExtra("dulieu",bundle);
                startActivity(intent);
            }
        });
    }

}