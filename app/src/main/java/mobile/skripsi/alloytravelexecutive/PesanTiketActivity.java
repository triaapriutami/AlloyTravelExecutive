package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PesanTiketActivity extends AppCompatActivity {
    private Button buttonpesan;
    private Button buttonkursi;
    private Button buttonbatal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_tiket);
        buttonpesan = (Button)findViewById(R.id.pesan);// mengaktifkan tombol untuk memesan tiket
        buttonpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PesanTiketActivity.this, TiketActivity.class);
                startActivity(intent);
            }
        });

        buttonkursi = (Button) findViewById(R.id.kursi); // mengaktifkan fungsi tombol melihat kursi
        buttonkursi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PesanTiketActivity.this, LihatKursiActivity.class);
                startActivity(intent);
            }
        });

        buttonbatal = (Button) findViewById(R.id.batal); // mengaktifkan tombol keluar
        buttonbatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
            }
        });
    }



}
