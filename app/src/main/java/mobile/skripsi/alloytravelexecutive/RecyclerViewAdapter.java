package mobile.skripsi.alloytravelexecutive;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import mobile.skripsi.alloytravelexecutive.model.Tiket;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private ArrayList<Tiket> rvData;

    private Context context;
    public RecyclerViewAdapter(ArrayList<Tiket> inputData){
        rvData = inputData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView Toyota1;
        public TextView Shuttle1;
        public TextView Idr1;
        public TextView Jam1;
        public TextView Tujuan;

        public ViewHolder(View v){
            super(v);
            Toyota1 = (TextView) v.findViewById(R.id.toyota1);
            Shuttle1 = (TextView) v.findViewById(R.id.shuttel1);
            Idr1 = (TextView) v.findViewById(R.id.idr1);
            Jam1 = (TextView) v.findViewById(R.id.jam1);
            Tujuan = (TextView) v.findViewById(R.id.tujuan);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.katalog, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return  vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position){
        final Tiket tiket = rvData.get(position);
        holder.Tujuan.setText(tiket.getNamaKota());
        holder.Toyota1.setText(tiket.getMerkMobil());
        holder.Shuttle1.setText(tiket.getJenisMobil());
        holder.Idr1.setText(tiket.getHargaMobil());
        holder.Jam1.setText(tiket.getJam());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PesanTiket2Activity.class);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount(){
        return rvData.size();
    }
}