package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //deklarasi untuk tombol lihat jadwal, tenatng, tiket saya dan login
    private Button buttonlihatjadwal;
    private Button buttontentang;
    private Button buttontiketsaya;
    private Button buttonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // digunakan untuk mengaktifkan tombol lihat jadwal
        buttonlihatjadwal = (Button)findViewById(R.id.lihatjadwal);
        buttonlihatjadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LihatJadwalActivity.class);
                startActivity(intent);
            }
        });

        buttontentang = (Button) findViewById(R.id.tentang); // digunakan untuk mengaktifkan tombol tentang
        buttontentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(intent);
            }
        });

        buttontiketsaya = (Button) findViewById(R.id.pesantiket);// digunakan untuk mengaktifan tombol tiket saya
        buttontiketsaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this, TiketActivity.class);
                startActivity(inten);
            }
        });

        buttonlogin = (Button) findViewById(R.id.login); // digunakan untuk mengaktifkan tombol login
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(inten);
            }
        });
    }
}
