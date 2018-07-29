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

import java.util.ArrayList;
import java.util.List;

import mobile.skripsi.alloytravelexecutive.common.Constant;

public class PesanTiket2Activity extends AppCompatActivity {

    private Button buttondp1;
    private Button buttondp2;
//    private Button buttontransfer;
//    private Button buttontransfer2;
    private Button buttonbooking;
    private String kursi="";

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_tiket2);
        kursi = getIntent().getExtras().getString(Constant.KURSI);
        buttondp1 = (Button) findViewById(R.id.dp1);
        buttondp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PesanTiket2Activity.this, PesanTiketActivity.class);
                intent.putExtra(Constant.KURSI,kursi);
                startActivity(intent);
            }
        });

        buttondp2 = (Button) findViewById(R.id.dp2);
        buttondp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PesanTiket2Activity.this, PesanTiketActivity.class);
                intent.putExtra(Constant.KURSI,kursi);
                startActivity(intent);
            }
        });

//        buttontransfer = (Button) findViewById(R.id.transfer);
//        buttontransfer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent inten = new Intent(PesanTiket2Activity.this, InformasiTransferActivity.class);
//                startActivity(inten);
//            }
//        });
//
//        buttontransfer2 = (Button) findViewById(R.id.transfer2);
//        buttontransfer2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(PesanTiket2Activity.this, KonfirmasiActivity.class);
//                startActivity(intent);
//            }
//        });

        buttonbooking = (Button) findViewById(R.id.booking);
        buttonbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PesanTiket2Activity.this, TiketActivity.class);
                intent.putExtra(Constant.KURSI,kursi);
                startActivity(intent);
            }
        });

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        PesanTiket2Activity.ViewPagerAdapter adapter = new PesanTiket2Activity.ViewPagerAdapter(getSupportFragmentManager());
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
}
