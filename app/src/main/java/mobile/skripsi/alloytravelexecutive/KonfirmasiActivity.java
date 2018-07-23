package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KonfirmasiActivity extends AppCompatActivity {
    private Button buttonkonfir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);
        buttonkonfir = (Button) findViewById(R.id.konfir);
        buttonkonfir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KonfirmasiActivity.this, InformasiTransferActivity.class);
                startActivity(intent);

            }
        });
    }
}
