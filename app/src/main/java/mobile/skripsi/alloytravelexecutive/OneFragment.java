package mobile.skripsi.alloytravelexecutive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mobile.skripsi.alloytravelexecutive.model.Tiket2;

public class OneFragment extends Fragment {

    private RecyclerView rvView;
    private RecyclerViewAdapter4 adapter;
    private LinearLayoutManager layoutmanager;
    private ArrayList<Tiket2> dataset;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_one_fragment2, container, false);
        dataset = new ArrayList<>();
        initDataSet();

        rvView = (RecyclerView) v.findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutmanager = new LinearLayoutManager(getContext());
        rvView.setLayoutManager(layoutmanager);

        adapter = new RecyclerViewAdapter4(dataset);
        rvView.setAdapter(adapter);
        return v;
    }


    private void initDataSet() {

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

            dataset.add(new Tiket2("nama:",".............","no.telpon:",".............","kota_asal:",".............","kota_tujuan:","...........","pergi:",".........."));

    }
}
