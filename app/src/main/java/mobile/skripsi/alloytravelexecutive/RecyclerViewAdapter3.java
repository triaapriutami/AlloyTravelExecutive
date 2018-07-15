package mobile.skripsi.alloytravelexecutive;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import mobile.skripsi.alloytravelexecutive.model.Tikeet;

public class RecyclerViewAdapter3 extends RecyclerView.Adapter<RecyclerViewAdapter3.ViewHolder>{
    private ArrayList<Tikeet> rvData;

    private Context context;
    public RecyclerViewAdapter3(ArrayList<Tikeet> inputData){
        rvData = inputData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView kotaasal;
        public TextView kotatujuan;
        public TextView pergi1;
        public TextView hargaidr;
        public TextView total1;

        public ViewHolder(View v){
            super(v);
            kotaasal= (TextView) v.findViewById(R.id.kotaasal);
            kotatujuan = (TextView) v.findViewById(R.id.kotatujuan);
            pergi1 = (TextView) v.findViewById(R.id.pergi1);
            hargaidr = (TextView) v.findViewById(R.id.hargaidr1);
            total1 = (TextView) v.findViewById(R.id.total1);
        }
    }


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
            context = parent.getContext();
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pending, parent, false);
            ViewHolder vh = new ViewHolder(v);
            return  vh;
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position){
            final Tikeet tikeet= rvData.get(position);
            holder.kotaasal.setText(tikeet.getNama());
            holder.kotatujuan.setText(tikeet.getAlamat());
            holder.hargaidr.setText(tikeet.getNotelpn());
            holder.pergi1.setText(tikeet.getKeberangkatan());
            holder.total1.setText(tikeet.getJumlah());


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