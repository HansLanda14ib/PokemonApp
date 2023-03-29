package com.example.pokemonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 =findViewById(R.id.img1);
        image2=findViewById(R.id.img2);
        image3=findViewById(R.id.img3);
        image4=findViewById(R.id.img4);
        image5=findViewById(R.id.img5);
        image6=findViewById(R.id.img6);


        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGreninja();
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCharizard();
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMewTwo();
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openZapdos();
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMoltres();
            }
        });
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArticuno();
            }
        });

    }
    public void openGreninja()
    {
        Intent intent1=new Intent(MainActivity.this, Greninja.class);
        startActivity(intent1);
    }

    public void openCharizard()
    {
        Intent intent1=new Intent(MainActivity.this, Charizard.class);
        startActivity(intent1);
    }

    public void openMewTwo()
    {
        Intent intent1=new Intent(MainActivity.this, Mewtwo.class);
        startActivity(intent1);
    }

    public void openZapdos()
    {
        Intent intent1=new Intent(MainActivity.this, Zapdos.class);
        startActivity(intent1);
    }

    public void openMoltres()
    {
        Intent intent1=new Intent(MainActivity.this, Moltres.class);
        startActivity(intent1);
    }

    public void openArticuno()
    {
        Intent intent1=new Intent(MainActivity.this, Articuno.class);
        startActivity(intent1);
    }
}