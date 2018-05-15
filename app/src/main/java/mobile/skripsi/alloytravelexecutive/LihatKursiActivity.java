package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LihatKursiActivity extends AppCompatActivity {
    private Button buttonselesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_kursi);

        buttonselesai = (Button) findViewById(R.id.selesai);
        buttonselesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LihatKursiActivity.this, PesanTiketActivity.class);
                startActivity(intent);
            }
        });
    }
}
