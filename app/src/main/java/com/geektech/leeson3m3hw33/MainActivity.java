package com.geektech.leeson3m3hw33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> addresses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        loadData();
        AddressAdapter adapter = new AddressAdapter(addresses);
        recyclerView.setAdapter(adapter);
    }

    private void loadData(){
        addresses = new ArrayList<>();
        addresses.add("Shopokova");
        addresses.add("Sovetskaya");
        addresses.add("Gagarina");
        addresses.add("Kievskaya");
        addresses.add("Chuy");
        addresses.add("Kalyk Akieva");
        addresses.add("Umetalieva");
        addresses.add("Turusbekova");
        addresses.add("Manasa");
        addresses.add("Baitik Baatyra");
        addresses.add("Gorkogo");
        addresses.add("Togolok Moldo");
        addresses.add("Tynystanova");
        addresses.add("Logvinenko");
    }
}