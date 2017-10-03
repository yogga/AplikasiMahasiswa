package com.example.d2a.aplikasimahasiswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Mahasiswa> dataMhs;
    private RecyclerView listMhs;
    private MhsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listMhs = (RecyclerView) findViewById(R.id.list_mhs);
        adapter = new MhsAdapter(this,dataMhs);
//        Log.d("main.p", dataMhs.get(3).getNama());
        listMhs.setAdapter(adapter);
        listMhs.setLayoutManager(new LinearLayoutManager(this));
    }

    private void generateData(){
        dataMhs = new ArrayList<>();

        dataMhs.add(new Mahasiswa("A11.2014.08683", "Arif Yoga", 3.6));
        dataMhs.add(new Mahasiswa("A11.2014.08673", "Arieansyah", 3.5));
        dataMhs.add(new Mahasiswa("A11.2014.08643", "Bima Dinda", 3.4));
        dataMhs.add(new Mahasiswa("A11.2014.08663", "Arif Nursetyo", 3.3));
        dataMhs.add(new Mahasiswa("A11.2014.08653", "Panca Suharyo", 3.3));
        dataMhs.add(new Mahasiswa("A11.2014.08633", "Zia Ulkhaq", 3.2));
        dataMhs.add(new Mahasiswa("A11.2014.08623", "Candika Abdi", 3.1));
    }
}
