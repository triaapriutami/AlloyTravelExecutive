package mobile.skripsi.alloytravelexecutive;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import mobile.skripsi.alloytravelexecutive.model.StatusTiket;
//
///**
// * Created by Apri on 7/22/2018.
// */
//
public class RecyclerViewAdapter5 extends RecyclerView.Adapter<RecyclerViewAdapter5.ViewHolder>{
private ArrayList<StatusTiket> rvData;

    private Context context;
public RecyclerViewAdapter5(ArrayList<StatusTiket> inputData){
        rvData = inputData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tujuan;
        public TextView tujuan2;
        public TextView mobil;
        public TextView mobil2;
        public TextView jenismobil;
        public TextView jenismobil2;
        public TextView harga;
        public TextView harga2;
        public TextView jam;
        public TextView jam2;
        public TextView platmobil;
        public TextView platmobil2;
        public TextView status;
        public TextView status2;

        public ViewHolder(View v){
            super(v);
            tujuan = (TextView)v.findViewById(R.id.tujuan);
            tujuan2= (TextView) v.findViewById(R.id.tujuan2);
            mobil = (TextView) v.findViewById(R.id.toyota1);
            mobil2 = (TextView)v.findViewById(R.id.mobil);
            jenismobil = (TextView) v.findViewById(R.id.shuttel1);
            jenismobil2 = (TextView)v.findViewById(R.id.jenismobil);
            harga= (TextView) v.findViewById(R.id.idr1);
            harga2 = (TextView) v.findViewById(R.id.hr);
            jam = (TextView)v.findViewById(R.id.jam1);
            jam2 = (TextView) v.findViewById(R.id.jm);
            platmobil = (TextView)v.findViewById(R.id.plat);
            platmobil2 = (TextView) v.findViewById(R.id.platm);
            status = (TextView)v.findViewById(R.id.status);
            status2= (TextView) v.findViewById(R.id.status2);

        }
    }


    @Override
    public RecyclerViewAdapter5.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.status_tiket, parent, false);
        RecyclerViewAdapter5.ViewHolder vh = new RecyclerViewAdapter5.ViewHolder(v);
        return  vh;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter5.ViewHolder holder, int position){
final StatusTiket statusTiket= rvData.get(position);
        holder.tujuan.setText(statusTiket.getTujuan());
        holder.tujuan2.setText(statusTiket.getTujuan2());
        holder.mobil.setText(statusTiket.getMobil());
        holder.mobil2.setText(statusTiket.getMobil2());
        holder.jenismobil.setText(statusTiket.getJenismobil());
        holder.jenismobil2.setText(statusTiket.getJenismobil2());
        holder.harga.setText(statusTiket.getHarga());
        holder.harga2.setText(statusTiket.getHarga2());
        holder.jam.setText(statusTiket.getJam());
        holder.jam2.setText(statusTiket.getJam2());
        holder.platmobil.setText(statusTiket.getPlatmobil());
        holder.platmobil2.setText(statusTiket.getJenismobil2());
        holder.status.setText(statusTiket.getStatus());
        holder.status2.setText(statusTiket.getStatus2());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailStatusTiketActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount(){
        return rvData.size();
    }
}
