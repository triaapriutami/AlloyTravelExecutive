package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Penumpang1Activity extends AppCompatActivity {

    private Button buttonseles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penumpang1);

        buttonseles = (Button)findViewById(R.id.seles);
        buttonseles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Penumpang1Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
