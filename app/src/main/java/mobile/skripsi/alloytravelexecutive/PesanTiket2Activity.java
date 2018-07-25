package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PesanTiket2Activity extends AppCompatActivity {

    private Button buttondp1;
    private Button buttondp2;
//    private Button buttontransfer;
//    private Button buttontransfer2;
    private Button buttonbooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_tiket2);

        buttondp1 = (Button) findViewById(R.id.dp1);
        buttondp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PesanTiket2Activity.this, PesanTiketActivity.class);
                startActivity(intent);
            }
        });

        buttondp2 = (Button) findViewById(R.id.dp2);
        buttondp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PesanTiket2Activity.this, PesanTiketActivity.class);
                startActivity(intent);
            }
        });

//        buttontransfer = (Button) findViewById(R.id.transfer);
//        buttontransfer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent inten = new Intent(PesanTiket2Activity.this, InformasiTransferActivity.class);
//                startActivity(inten);
//            }
//        });
//
//        buttontransfer2 = (Button) findViewById(R.id.transfer2);
//        buttontransfer2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(PesanTiket2Activity.this, KonfirmasiActivity.class);
//                startActivity(intent);
//            }
//        });

        buttonbooking = (Button) findViewById(R.id.booking);
        buttonbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PesanTiket2Activity.this, TiketActivity.class);
                startActivity(intent);
            }
        });
    }
}
