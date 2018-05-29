package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InformasiTransferActivity extends AppCompatActivity {
    private Button buttonkontran; // mendeklarasikan tombol

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_transfer);

        buttonkontran = (Button) findViewById(R.id.kontran); // digunakan untuk mengaktifkan tombol selesai
        buttonkontran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformasiTransferActivity.this, StatusTiketActivity.class);
                startActivity(intent);
            }
        });
    }
}
