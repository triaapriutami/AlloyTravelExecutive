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
import mobile.skripsi.alloytravelexecutive.model.Tikeet2;

public class RecyclerViewAdapter3 extends RecyclerView.Adapter<RecyclerViewAdapter3.ViewHolder>{
    private ArrayList<Tikeet2> rvData;

    private Context context;
    public RecyclerViewAdapter3(ArrayList<Tikeet2> inputData){
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
            final Tikeet2 tikeet2= rvData.get(position);
            holder.kotaasal.setText(tikeet2.getNama());
            holder.kotatujuan.setText(tikeet2.getAlamat());
            holder.hargaidr.setText(tikeet2.getNotelpn());
            holder.pergi1.setText(tikeet2.getKeberangkatan());
            holder.total1.setText(tikeet2.getJumlah());


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