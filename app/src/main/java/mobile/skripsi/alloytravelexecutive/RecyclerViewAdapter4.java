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

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView kotaasal;
        public TextView kotatujuan;
        public TextView pergi1;
        public TextView hargaidr;
        public TextView total1;

        public ViewHolder(View v) {
            super(v);
            kotaasal = (TextView) v.findViewById(R.id.ka1);
            kotatujuan = (TextView) v.findViewById(R.id.kt1);
            pergi1 = (TextView) v.findViewById(R.id.pergi);
            hargaidr = (TextView) v.findViewById(R.id.hi);
            total1 = (TextView) v.findViewById(R.id.total);
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lunas, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Tiket2 tiket2 = rvData.get(position);
        holder.kotaasal.setText(tiket2.getNama());
        holder.kotatujuan.setText(tiket2.getAlamat());
        holder.hargaidr.setText(tiket2.getNotelpn());
        holder.pergi1.setText(tiket2.getKeberangkatan());
        holder.total1.setText(tiket2.getJumlah());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, OneFragment.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }
}
