package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


import mobile.skripsi.alloytravelexecutive.model.StatusTiket;

public class StatusTiketActivity extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerViewAdapter5 adapter;
    private LinearLayoutManager layoutmanager;
    private ArrayList<StatusTiket> dataSet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_tiket);

        dataSet = new ArrayList<>();
        initDataSet();

        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutmanager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutmanager);

        adapter = new RecyclerViewAdapter5(dataSet);
        rvView.setAdapter(adapter);
    }

    private void initDataSet(){
        dataSet.add(new StatusTiket("nama","kota asal","kota tujuan","no kursi","total"));

        dataSet.add(new StatusTiket("nama","kota asal","kota tujuan","no kursi","total"));

        dataSet.add(new StatusTiket("nama","kota asal","kota tujuan","no kursi","total"));

        dataSet.add(new StatusTiket("nama","kota asal","kota tujuan","no kursi","total"));
    }
}
