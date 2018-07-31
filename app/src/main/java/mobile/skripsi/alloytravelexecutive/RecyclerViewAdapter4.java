package mobile.skripsi.alloytravelexecutive;

import android.content.Context;
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
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nama1;
        public TextView nama2;
        public TextView notelpon1;
        public TextView notelpon2;
        public TextView kotasal1;
        public TextView kotasal2;
        public TextView kotatujuan1;
        public TextView kotatujuan2;
        public TextView pergi1;
        public TextView pergi2;

        public ViewHolder(View v){
            super(v);
            nama1 = (TextView) v.findViewById(R.id.na1);
            nama2 = (TextView)v.findViewById(R.id.na2);
            notelpon1 = (TextView)v.findViewById(R.id.note);
            notelpon2= (TextView) v.findViewById(R.id.note2);
            kotasal1 = (TextView) v.findViewById(R.id.kotas);
            kotasal2 = (TextView)v.findViewById(R.id.kotas2);
            kotatujuan1= (TextView) v.findViewById(R.id.kotat);
            kotatujuan2 = (TextView) v.findViewById(R.id.kotat2);
            pergi1 = (TextView)v.findViewById(R.id.perg);
            pergi2 = (TextView) v.findViewById(R.id.perg2);
            }
    }


    @Override
    public RecyclerViewAdapter4.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.supir2, parent, false);
        RecyclerViewAdapter4.ViewHolder vh = new RecyclerViewAdapter4.ViewHolder(v);
        return  vh;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter4.ViewHolder holder, int position){
        final Tiket2 tiket2= rvData.get(position);
        holder.nama1.setText(tiket2.getNama1());
        holder.nama2.setText(tiket2.getNama2());
        holder.notelpon1.setText(tiket2.getNoTelpon());
        holder.notelpon2.setText(tiket2.getNoTelpon2());
        holder.kotasal1.setText(tiket2.getKotasal1());
        holder.kotasal2.setText(tiket2.getKotasal2());
        holder.kotatujuan1.setText(tiket2.getKotaTujuan1());
        holder.kotatujuan2.setText(tiket2.getKotaTujuan2());
        holder.pergi1.setText(tiket2.getPergi1());
        holder.pergi2.setText(tiket2.getPergii2());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(context, DataPenumpang2Activity.class);
//                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount(){
        return rvData.size();
    }
}
