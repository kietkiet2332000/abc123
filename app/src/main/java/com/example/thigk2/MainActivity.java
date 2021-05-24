package com.example.thigk2;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private RecyclerView rcv_cloth;
    private ArrayList<Cloth> mCloths;

    private CustomAdapterCloth adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_cloth = findViewById(R.id.rcv_cloth);

        mCloths= new ArrayList<>();

        mCloths.add(new Cloth(R.drawable.code,"Google 1",10));
        mCloths.add(new Cloth(R.drawable.computer,"Google 2",20));
        mCloths.add(new Cloth(R.drawable.computer_engineer,"Google 3",30));
        mCloths.add(new Cloth(R.drawable.computer_o2,"Google 4",10));
        mCloths.add(new Cloth(R.drawable.a_teveloper_tester_can_never_be_friend,"Google 5   ",40));
        mCloths.add(new Cloth(R.drawable.google,"Google 6",50));

        adt = new CustomAdapterCloth(mCloths);
        rcv_cloth.setHasFixedSize(true);
        rcv_cloth.setAdapter(adt);
        rcv_cloth.setLayoutManager(new GridLayoutManager(this,2));






    }
}
