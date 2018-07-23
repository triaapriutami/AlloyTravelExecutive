package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button buttonregistrasi;
    private  Button buttonlogin;

//    EditText username, password;
//    Button btnLogin;

    EditText editText1, editText2;
    String text1, text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonregistrasi = (Button)findViewById(R.id.registrasi);
        buttonregistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegistrasiActivity.class);
                startActivity(intent);
            }
        });

//                buttonlogin = (Button) findViewById(R.id.login2);
//        buttonlogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LoginActivity.this, IsiLogin2Activity.class);
//                startActivity(intent);
//            }
//        });


//        username = (EditText) findViewById(R.id.username);
//        password = (EditText) findViewById(R.id.passw2);
//        buttonlogin = (Button)findViewById(R.id.login2);
//
//        buttonlogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String usernameKey = username.getText().toString();
//                String passwordKey = password.getText().toString();
//
//                if (usernameKey.equals("admin") && passwordKey.equals("123")){
//                    //jika login berhasil
//                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
//                            Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(LoginActivity.this, IsiLoginActivity.class);
//                    LoginActivity.this.startActivity(intent);
//                    finish();
//                }else {
//                    //jika login gagal
//                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
//                    builder.setMessage("Username atau Password Anda salah!")
//                            .setNegativeButton("Retry", null).create().show();
//                }
//            }
//
//        });
    }
    public void loginmasuk(View view) {

        editText1 = (EditText) findViewById(R.id.username);
        editText2 = (EditText) findViewById(R.id.passw2);
        text1 = editText1.getText().toString();
        text2 = editText1.getText().toString();

        if ((text1.contains("pengelola")) && ((text2.contains("1234")))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, IsiLoginActivity.class);
            startActivity(intent);
        } else if ((text1.contains("supir")) && ((text2.contains("5678")))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, IsiLogin2Activity.class);
            startActivity(intent);
        }

        else if ((text1.matches("")||text2.matches(""))){
            /*atau jika input text 1 dan text 2 kosong*/
            // maka akan menampilkan pesan text tost
            Toast.makeText(this,"Isikan Username dan Password", Toast.LENGTH_SHORT).show();
        }

        else {
            // jika kedua kondisi diatas tidak memenuhi
            Toast.makeText(this, "Login gagal/Username Password salah", Toast.LENGTH_SHORT).show();
        }

    }
}