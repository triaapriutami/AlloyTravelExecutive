package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PesanTiketActivity extends AppCompatActivity {

    private Button buttonkursi;
    private Button buttonselesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_tiket);


        buttonkursi = (Button) findViewById(R.id.kursi); // mengaktifkan fungsi tombol melihat kursi
        buttonkursi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PesanTiketActivity.this, LihatKursiActivity.class);
                startActivity(intent);
            }
        });

        buttonselesai = (Button) findViewById(R.id.sel);
        buttonselesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PesanTiketActivity.this, PesanTiket2Activity.class);
                startActivity(intent);
            }
        });

    }
}
