package mobile.skripsi.alloytravelexecutive;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import mobile.skripsi.alloytravelexecutive.model.Tikeet3;

/**
 * Created by Apri on 7/22/2018.
 */

public class RecyclerViewAdapter4 extends RecyclerView.Adapter<RecyclerViewAdapter4.ViewHolder>{
    private ArrayList<Tikeet3> rvData;

    private Context context;
    public RecyclerViewAdapter4(ArrayList<Tikeet3> inputData){
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
    public RecyclerViewAdapter4.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.penumpang, parent, false);
        RecyclerViewAdapter4.ViewHolder vh = new RecyclerViewAdapter4.ViewHolder(v);
        return  vh;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter4.ViewHolder holder, int position){
        final Tikeet3 tikeet3= rvData.get(position);
        holder.kotaasal.setText(tikeet3.getNama());
        holder.kotatujuan.setText(tikeet3.getAlamat());
        holder.hargaidr.setText(tikeet3.getNotelpn());
        holder.pergi1.setText(tikeet3.getKeberangkatan());
        holder.total1.setText(tikeet3.getJumlah());


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
