package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Penumpang2Activity extends AppCompatActivity {
    private Button buttonintar;
    private Button buttonkontar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penumpang2);
        buttonintar = (Button) findViewById(R.id.intran1);
        buttonintar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(Penumpang2Activity.this, InformasiTransferActivity.class);
                startActivity(inten);
            }
        });

        buttonkontar = (Button) findViewById(R.id.kontran1);
        buttonkontar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Penumpang2Activity.this, KonfirmasiActivity.class);
                startActivity(intent);
            }
        });
    }
}
