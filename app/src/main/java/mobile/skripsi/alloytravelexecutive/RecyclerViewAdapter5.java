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

/**
 * Created by Apri on 7/22/2018.
 */

public class RecyclerViewAdapter5 extends RecyclerView.Adapter<RecyclerViewAdapter5.ViewHolder>{
    private ArrayList<StatusTiket> rvData;

    private Context context;
    public RecyclerViewAdapter5(ArrayList<StatusTiket> inputData){
        rvData = inputData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nama;
        public TextView kotaasal;
        public TextView kotatujuan;
        public TextView nokursi;
        public TextView total;

        public ViewHolder(View v){
            super(v);
            nama = (TextView)v.findViewById(R.id.na);
            kotaasal= (TextView) v.findViewById(R.id.asal);
            kotatujuan = (TextView) v.findViewById(R.id.tujuan);
            nokursi = (TextView)v.findViewById(R.id.nk);
            total = (TextView) v.findViewById(R.id.t);
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
        holder.nama.setText(statusTiket.getNama());
        holder.kotaasal.setText(statusTiket.getKotaasal());
        holder.kotatujuan.setText(statusTiket.getKotatujuan());
        holder.nokursi.setText(statusTiket.getNokursi());
        holder.total.setText(statusTiket.getTotal());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TwoFragmentActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount(){
        return rvData.size();
    }
}
