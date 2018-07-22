package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class IsiLogin2Activity extends AppCompatActivity {

    private Button buttondatapen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_login2);

        buttondatapen = (Button) findViewById(R.id.datapen);
        buttondatapen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IsiLogin2Activity.this, DataPenumpang2Activity.class);
                startActivity(intent);
            }
        });
    }
}
