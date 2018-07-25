package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StatusTiket2Activity extends AppCompatActivity {
    private Button buttonbayar;
    private Button buttonsls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_tiket2);

        buttonbayar = (Button)findViewById(R.id.bayar);
        buttonbayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatusTiket2Activity.this, KonfirmasiActivity.class);
                startActivity(intent);
            }
        });

        buttonsls= (Button)findViewById(R.id.sls);
        buttonsls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatusTiket2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
