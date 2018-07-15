package mobile.skripsi.alloytravelexecutive;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import mobile.skripsi.alloytravelexecutive.model.Tikeet;

public class TwoFragmentActivity extends Fragment {

    private RecyclerView rvView;
    private RecyclerViewAdapter2 adapter;
    private LinearLayoutManager layoutmanager;
    private ArrayList<Tikeet> dataset;

    public TwoFragmentActivity() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_one_fragment, container, false);
        dataset = new ArrayList<>();
        initDataSet();

        rvView = (RecyclerView) v.findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutmanager = new LinearLayoutManager(getContext());
        rvView.setLayoutManager(layoutmanager);

        adapter = new RecyclerViewAdapter2(dataset);
        rvView.setAdapter(adapter);
        return v;
    }

    private void initDataSet() {
        dataset.add(new Tikeet("nama","alamat","notelpn","keberangkatan","jumlah"));

        dataset.add(new Tikeet("nama","alamat","notelpn","keberangkatan","jumlah"));

        dataset.add(new Tikeet("nama","alamat","notelpn","keberangkatan","jumlah"));

        dataset.add(new Tikeet("nama","alamat","notelpn","keberangkatan","jumlah"));
    }
}
