package mobile.skripsi.alloytravelexecutive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import mobile.skripsi.alloytravelexecutive.model.Tiket;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerViewAdapter adapter;
    private LinearLayoutManager layoutmanager;
    private ArrayList<Tiket> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dataSet = new ArrayList<>();
        initDataSet();

        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutmanager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutmanager);

        adapter = new RecyclerViewAdapter(dataSet);
        rvView.setAdapter(adapter);
    }

    private void initDataSet(){
        dataSet.add(new Tiket("Jogy-Tegal(*Transit smg)","TOYOTA","SHUTTEL","125000","08.00"));
        dataSet.add(new Tiket("Jogy-Tegal(*Transit smg)","TOYOTA","SHUTTEL","125000","11.00"));
        dataSet.add(new Tiket("Jogy-Tegal(*Transit smg)","TOYOTA","SHUTTEL","125000","13.00"));
        dataSet.add(new Tiket("Jogy-Tegal(*Transit smg)","TOYOTA","SHUTTEL","125000","20.00"));
        dataSet.add(new Tiket("Jogy-Tegal(*Transit smg)","TOYOTA","SHUTTEL","125000","22.00"));

        dataSet.add(new Tiket("Tegal-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","08.00"));
        dataSet.add(new Tiket("Tegal-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","13.00"));
        dataSet.add(new Tiket("Tegal-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","20.00"));
        dataSet.add(new Tiket("Tegal-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","23.00"));

        dataSet.add(new Tiket("Kelet-Semarang","TOYOTA","TRAVEL","85000","05.00"));
        dataSet.add(new Tiket("Kelet-Semarang","TOYOTA","TRAVEL","85000","07.00"));
        dataSet.add(new Tiket("Kelet-Semarang","TOYOTA","TRAVEL","85000","13.00"));
        dataSet.add(new Tiket("Kelet-Semarang","TOYOTA","TRAVEL","85000","17.00"));

        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","06.00"));
        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","08.00"));
        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","11.00"));
        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","13.00"));
        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","15.00"));
        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","17.00"));

        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","04.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","05.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","06.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","07.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","08.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","09.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","10.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","11.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","12.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","13.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","14.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","15.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","16.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","17.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","18.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","19.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","20.00"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","21.00"));

        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","04.00"));
        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","06.00"));
        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","08.00"));
        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","10.00"));
        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","12.00"));
        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","14.00"));

        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","06.00"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","07.00"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","08.00"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","09.00"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","10.00"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","12.00"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","14.00"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","16.00"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","18.00"));

        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","05.00"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","06.00"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","08.00"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","10.00"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","12.00"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","14.00"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","16.00"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","18.00"));

        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","05.00"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","06.00"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","08.00"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","10.00"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","12.00"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","14.00"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","16.00"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","18.00"));

        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","03.00"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","05.00"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","07.00"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","10.00"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","12.00"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","13.00"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","14.00"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","15.00"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","16.00"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","17.00"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","19.00"));

        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","03.00"));
        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","05.00"));
        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","07.00"));
        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","10.00"));
        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","13.00"));
        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","15.00"));

        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","06.00"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","08.00"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","11.00"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","13.00"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","15.00"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","17.00"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","19.00"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","21.00"));

        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","03.00"));
        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","05.00"));
        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","07.00"));
        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","10.00"));
        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","13.00"));
        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","15.00"));


    }
}
