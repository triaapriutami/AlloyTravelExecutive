package mobile.skripsi.alloytravelexecutive;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {
    private Button buttonregistrasi;
    private  Button buttonlogin;

//    EditText username, password;
//    Button btnLogin;

    EditText editText1, editText2;
    String username, password;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

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

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        LoginActivity.ViewPagerAdapter adapter = new LoginActivity.ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    public void loginmasuk(View view) {

        editText1 = (EditText) findViewById(R.id.un);
        editText2 = (EditText) findViewById(R.id.passw2);

        username = editText1.getText().toString();
        password = editText2.getText().toString();

        if ((username.equals("pengelola")) && ((password.equals("1234")))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, IsiLoginActivity.class);
            startActivity(intent);
        } else if ((username.equals("supir")) && ((password.equals("5678")))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, IsiLogin2Activity.class);
            startActivity(intent);
        }

        else if ((username.matches("")||password.matches(""))){
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