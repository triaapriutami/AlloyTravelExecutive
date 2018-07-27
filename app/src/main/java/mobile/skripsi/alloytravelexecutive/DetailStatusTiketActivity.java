package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailStatusTiketActivity extends AppCompatActivity {
    private Button buttondatapenumpang1;
    private Button buttondatapenumpang2;
    private Button buttonintar;
    private Button buttonkontar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_status_tiket);
        buttondatapenumpang1 = (Button) findViewById(R.id.dp1);
        buttondatapenumpang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailStatusTiketActivity.this, Penumpang1Activity.class);
                startActivity(intent);
            }
        });
        //
        buttondatapenumpang2 = (Button) findViewById(R.id.dp2);
        buttondatapenumpang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailStatusTiketActivity.this, Penumpang2Activity.class);
                startActivity(intent);
            }
        });

        buttonintar = (Button) findViewById(R.id.intran);
        buttonintar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(DetailStatusTiketActivity.this, InformasiTransferActivity.class);
                startActivity(inten);
            }
        });

        buttonkontar = (Button) findViewById(R.id.kontran);
        buttonkontar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailStatusTiketActivity.this, KonfirmasiActivity.class);
                startActivity(intent);
            }
        });
    }
}
