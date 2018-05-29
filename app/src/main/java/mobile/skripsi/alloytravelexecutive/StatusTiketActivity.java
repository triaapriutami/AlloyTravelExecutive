package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StatusTiketActivity extends AppCompatActivity {
   private Button buttonsty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_tiket);

        buttonsty = (Button) findViewById(R.id.sty);
        buttonsty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(StatusTiketActivity.this, PesanTiket2Activity.class);
                startActivity(inten);
            }
        });

    }
}
