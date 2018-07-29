package mobile.skripsi.alloytravelexecutive;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import mobile.skripsi.alloytravelexecutive.model.Tikeet2;

public class RecyclerViewAdapter3 extends RecyclerView.Adapter<RecyclerViewAdapter3.ViewHolder>{
    private ArrayList<Tikeet2> rvData;

    private Context context;
    public RecyclerViewAdapter3(ArrayList<Tikeet2> inputData){
        rvData = inputData;
    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder{
//        public TextView kotaasal;
//        public TextView kotatujuan;
//        public TextView pergi1;
//        public TextView hargaidr;
//        public TextView total1;
//
//        public ViewHolder(View v){
//            super(v);
//            kotaasal= (TextView) v.findViewById(R.id.kotaasal);
//            kotatujuan = (TextView) v.findViewById(R.id.kotatujuan);
//            pergi1 = (TextView) v.findViewById(R.id.pergi1);
//            hargaidr = (TextView) v.findViewById(R.id.hargaidr1);
//            total1 = (TextView) v.findViewById(R.id.total1);
//        }
//    }
//
//
//        @Override
//        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
//            context = parent.getContext();
//            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pending, parent, false);
//            ViewHolder vh = new ViewHolder(v);
//            return  vh;
//        }
//
//        @Override
//        public void onBindViewHolder(final ViewHolder holder, int position){
//            final Tikeet2 tikeet2= rvData.get(position);
//            holder.kotaasal.setText(tikeet2.getNama());
//            holder.kotatujuan.setText(tikeet2.getAlamat());
//            holder.hargaidr.setText(tikeet2.getNotelpn());
//            holder.pergi1.setText(tikeet2.getKeberangkatan());
//            holder.total1.setText(tikeet2.getJumlah());
//
//
//            holder.itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(context, TwoFragmentActivity.class);
//                    context.startActivity(intent);
//                }
//            });
//
//    }
//
//    @Override
//    public int getItemCount(){
//        return rvData.size();

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
    public RecyclerViewAdapter3.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pending2, parent, false);
        RecyclerViewAdapter3.ViewHolder vh = new RecyclerViewAdapter3.ViewHolder(v);
        return  vh;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter3.ViewHolder holder, int position){
        final Tikeet2 tikeet2= rvData.get(position);
        holder.tujuan.setText(tikeet2.getTujuan());
        holder.tujuan2.setText(tikeet2.getTujuan2());
        holder.mobil.setText(tikeet2.getMobil());
        holder.mobil2.setText(tikeet2.getMobil2());
        holder.jenismobil.setText(tikeet2.getJenismobil());
        holder.jenismobil2.setText(tikeet2.getJenismobil2());
        holder.harga.setText(tikeet2.getHarga());
        holder.harga2.setText(tikeet2.getHarga2());
        holder.jam.setText(tikeet2.getJam());
        holder.jam2.setText(tikeet2.getJam2());
        holder.platmobil.setText(tikeet2.getPlatmobil());
        holder.platmobil2.setText(tikeet2.getJenismobil2());
        holder.status.setText(tikeet2.getStatus());
        holder.status2.setText(tikeet2.getStatus2());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailPenumpang4Activity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount(){
        return rvData.size();
    }

}