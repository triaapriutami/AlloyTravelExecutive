package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IsiLoginActivity extends AppCompatActivity {
    private Button buttondatapem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_login);

        buttondatapem = (Button) findViewById(R.id.datapem);
        buttondatapem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IsiLoginActivity.this, DataPenumpangActivity.class);
                startActivity(intent);
            }
        });
    }
}
