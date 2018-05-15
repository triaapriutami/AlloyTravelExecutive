package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LihatJadwalActivity extends AppCompatActivity {
    private Button buttoncari;

    int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_jadwal);

        buttoncari = (Button) findViewById(R.id.cari);
        buttoncari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LihatJadwalActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }

    public void  increment(View view){ // digunakan untuk tombol tambah
        if(quantity==100){
            Toast.makeText(this,"pesan maksimal 100", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity+1;
        display(quantity);
    }

    public void decrement(View view){ // digunakan untuk tombol kurang
        if (quantity==1){
            Toast.makeText(this,"pesanan minimal 1", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity -1;
        display(quantity);
    }

    private void display(int number){ // di gunakakn untuk merubah angka
        TextView quantityTextView = (TextView)  findViewById(R.id.quantity_textview);
        quantityTextView.setText("" + number);
    }
}
