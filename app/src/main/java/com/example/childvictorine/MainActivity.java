package com.example.childvictorine;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_40;
    Button btn_10;
    Button btn_20;
    Button btn_white;
    Button btn_red;
    Button btn_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_40 = findViewById(R.id.btn_40);
        btn_10 = findViewById(R.id.btn_10);
        btn_20 = findViewById(R.id.btn_20);
        btn_white = findViewById(R.id.btn_white);
        btn_red = findViewById(R.id.btn_red);
        btn_info = findViewById(R.id.btn_info);

        btn_40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Вы выбрали правильное число", Toast.LENGTH_SHORT).show();
            }
        });

        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Вы выбрали неправильное число", Toast.LENGTH_SHORT).show();
            }
        });

        btn_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Вы выбрали неправильное число", Toast.LENGTH_SHORT).show();
            }
        });

        btn_white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Вы выбрали правильный цвет", Toast.LENGTH_SHORT).show();
            }
        });

        btn_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Вы выбрали неправильный цвет", Toast.LENGTH_SHORT).show();
            }
        });

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Информация")
                        .setMessage("Приложение создала Мулькеева Маргарита")
                        .setNegativeButton("Закрыть", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}