package mobile.skripsi.alloytravelexecutive;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import mobile.skripsi.alloytravelexecutive.model.Tiket2;


public class RecyclerViewAdapter4 extends RecyclerView.Adapter<RecyclerViewAdapter4.ViewHolder> {
    private ArrayList<Tiket2> rvData;

    private Context context;

    public RecyclerViewAdapter4(ArrayList<Tiket2> inputData) {
        rvData = inputData;
    }

//    public class ViewHolder extends RecyclerView.ViewHolder {
//        public TextView kotaasal;
//        public TextView kotatujuan;
//        public TextView pergi1;
//        public TextView hargaidr;
//        public TextView total1;
//
//        public ViewHolder(View v) {
//            super(v);
//            kotaasal = (TextView) v.findViewById(R.id.ka1);
//            kotatujuan = (TextView) v.findViewById(R.id.kt1);
//            pergi1 = (TextView) v.findViewById(R.id.pergi);
//            hargaidr = (TextView) v.findViewById(R.id.hi);
//            total1 = (TextView) v.findViewById(R.id.total);
//        }
//    }
//
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        context = parent.getContext();
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.supir, parent, false);
//        ViewHolder vh = new ViewHolder(v);
//        return vh;
//    }
//
//    @Override
//    public void onBindViewHolder(final ViewHolder holder, int position) {
//        final Tiket2 tiket2 = rvData.get(position);
//        holder.kotaasal.setText(tiket2.getNama());
//        holder.kotatujuan.setText(tiket2.getAlamat());
//        holder.hargaidr.setText(tiket2.getNotelpn());
//        holder.pergi1.setText(tiket2.getKeberangkatan());
//        holder.total1.setText(tiket2.getJumlah());
//
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, OneFragment.class);
//                context.startActivity(intent);
//            }
//        });
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return rvData.size();
//    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nama1;
        public TextView nama2;
        public TextView tujuan1;
        public TextView tujuan2;
        public TextView jenismobil1;
        public TextView jenismobil2;
        public TextView harga1;
        public TextView harga2;
        public TextView jam1;
        public TextView jam2;
        public TextView platmobil1;
        public TextView platmobil2;
        public TextView status1;
        public TextView status2;

        public ViewHolder(View v){
            super(v);
            nama1 = (TextView) v.findViewById(R.id.n1);
            nama2 = (TextView)v.findViewById(R.id.n2);
            tujuan1 = (TextView)v.findViewById(R.id.t1);
            tujuan2= (TextView) v.findViewById(R.id.t2);
            jenismobil1 = (TextView) v.findViewById(R.id.jemo1);
            jenismobil2 = (TextView)v.findViewById(R.id.jemo2);
            harga1= (TextView) v.findViewById(R.id.idr1);
            harga2 = (TextView) v.findViewById(R.id.hr);
            jam1 = (TextView)v.findViewById(R.id.jam1);
            jam2 = (TextView) v.findViewById(R.id.jm);
            platmobil1 = (TextView)v.findViewById(R.id.plat);
            platmobil2 = (TextView) v.findViewById(R.id.platm);
            status1 = (TextView)v.findViewById(R.id.status);
            status2= (TextView) v.findViewById(R.id.status2);

        }
    }


    @Override
    public RecyclerViewAdapter4.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.supir, parent, false);
        RecyclerViewAdapter4.ViewHolder vh = new RecyclerViewAdapter4.ViewHolder(v);
        return  vh;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter4.ViewHolder holder, int position){
        final Tiket2 tiket2= rvData.get(position);
        holder.nama1.setText(tiket2.getNama1());
        holder.nama2.setText(tiket2.getNama2());
        holder.tujuan1.setText(tiket2.getTujuan1());
        holder.tujuan2.setText(tiket2.getTujuan2());
        holder.jenismobil1.setText(tiket2.getJenismobil1());
        holder.jenismobil2.setText(tiket2.getJenismobil2());
        holder.harga1.setText(tiket2.getHarga1());
        holder.harga2.setText(tiket2.getHarga2());
        holder.jam1.setText(tiket2.getJam1());
        holder.jam2.setText(tiket2.getJam2());
        holder.platmobil1.setText(tiket2.getPlatmobil1());
        holder.platmobil2.setText(tiket2.getJenismobil2());
        holder.status1.setText(tiket2.getStatus1());
        holder.status2.setText(tiket2.getStatus2());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailPenumpangActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount(){
        return rvData.size();
    }
}
