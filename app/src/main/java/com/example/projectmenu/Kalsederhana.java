package com.example.projectmenu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Kalsederhana extends AppCompatActivity {

    EditText editAngka1, editAngka2;
    TextView tvHasil;
    Button tambah,kurang,bagi,kali,hapus;
    Integer angka1, angka2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalsederhana);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        editAngka1 = (EditText) findViewById(R.id.editText1);
        editAngka2 = (EditText) findViewById(R.id.editText2);
        tvHasil = (TextView) findViewById(R.id.textView2);
        tambah = (Button) findViewById(R.id.button1);
        kurang = (Button) findViewById(R.id.button2);
        bagi = (Button) findViewById(R.id.button3);
        kali = (Button) findViewById(R.id.button4);
        hapus = (Button) findViewById(R.id.button5);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HasilTambah();
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HasilKurang();
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HasilBagi();
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HasilKali();
            }
        });
        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hapus();
            }
        });
    }

    private void Hapus() {
        Intent refresh = new Intent(this, Kalsederhana.class);
        startActivity(refresh);
        this.finish();
    }

    private void HasilKali() {
        if (!editAngka1.getText().toString().isEmpty()){
            Toast.makeText(this,"isi angka pada form pertama",Toast.LENGTH_SHORT).show();
        }
        if (!editAngka2.getText().toString().isEmpty()){
            Toast.makeText(this, "isi angka pada form kedua",Toast.LENGTH_SHORT).show();
        }
        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "isi angka pada form pertama",Toast.LENGTH_SHORT).show();
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "isi angka pada form kedua",Toast.LENGTH_SHORT).show();
        }
        Integer hasil = angka1 * angka2;
        tvHasil.setText(String.valueOf(hasil));
    }

    private void HasilBagi() {
        if (!editAngka1.getText().toString().isEmpty()){
            Toast.makeText(this,"Mohon isi angka pada form pertama",Toast.LENGTH_SHORT).show();
        }
        if (!editAngka2.getText().toString().isEmpty()){
            Toast.makeText(this, "Mohon isi angka pada form kedua",Toast.LENGTH_SHORT).show();
        }
        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Mohon isi angka pada form pertama",Toast.LENGTH_SHORT).show();
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Mohon Isi angka pada form kedua",Toast.LENGTH_SHORT).show();
        }
        Integer hasil = angka1 / angka2;
        tvHasil.setText(String.valueOf(hasil));
    }

    private void HasilKurang() {
        if (!editAngka1.getText().toString().isEmpty()){
            Toast.makeText(this,"isi angka pada form pertama",Toast.LENGTH_SHORT).show();
        }
        if (!editAngka2.getText().toString().isEmpty()){
            Toast.makeText(this, "isi angka pada form kedua",Toast.LENGTH_SHORT).show();
        }
        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "isi angka pada form pertama",Toast.LENGTH_SHORT).show();
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Isi angka pada form kedua",Toast.LENGTH_SHORT).show();
        }
        Integer hasil = angka1 - angka2;
        tvHasil.setText(String.valueOf(hasil));
    }

    public void HasilTambah() {
        if (!editAngka1.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form 1", Toast.LENGTH_SHORT).show();
        }
        if (!editAngka2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Mohon isi form  2", Toast.LENGTH_SHORT).show();
        }
        try {
            angka1 = Integer.parseInt(editAngka1.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "isi angka pada form 1", Toast.LENGTH_SHORT).show();
        }
        try {
            angka2 = Integer.parseInt(editAngka2.getText().toString());
        } catch (Exception e) {
            Toast.makeText(this, "isi angka pada form 2", Toast.LENGTH_SHORT).show();
        }
        Integer hasil = angka1 + angka2;
        tvHasil.setText(String.valueOf(hasil));
    }

}