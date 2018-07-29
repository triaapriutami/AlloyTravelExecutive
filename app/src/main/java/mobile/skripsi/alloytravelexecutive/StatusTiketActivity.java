package mobile.skripsi.alloytravelexecutive;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import mobile.skripsi.alloytravelexecutive.model.StatusTiket;

public class StatusTiketActivity extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerViewAdapter5 adapter;
    private LinearLayoutManager layoutmanager;
    private ArrayList<StatusTiket> dataSet;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

//            private Button buttonsty;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_status_tiket);
//
//                buttonsty = (Button) findViewById(R.id.sty);
//                buttonsty.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent inten = new Intent(StatusTiketActivity.this, StatusTiket2Activity.class);
//                        startActivity(inten);
//                    }
//                });

        dataSet = new ArrayList<>();
        initDataSet();

        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutmanager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutmanager);

        adapter = new RecyclerViewAdapter5(dataSet);
        rvView.setAdapter(adapter);
                toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                viewPager = (ViewPager) findViewById(R.id.viewpager);
                setupViewPager(viewPager);

                tabLayout = (TabLayout) findViewById(R.id.tabs);
                tabLayout.setupWithViewPager(viewPager);
            }

    private void setupViewPager(ViewPager viewPager) {
        StatusTiketActivity.ViewPagerAdapter adapter = new StatusTiketActivity.ViewPagerAdapter(getSupportFragmentManager());
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
//
    private void initDataSet(){
        dataSet.add(new StatusTiket("tujuan:",".............","mobil:",".............","jenis mobil:",".............","jam:","...........","harga:","..........","plat:","...........","status:","..........."));

        dataSet.add(new StatusTiket("tujuan:",".............","mobil:",".............","jenis mobil:",".............","jam:","...........","harga:","..........","plat:","...........","status:","..........."));
//
//        dataSet.add(new StatusTiket("nama","kota asal","kota tujuan","no kursi","total"));
//
//        dataSet.add(new StatusTiket("nama","kota asal","kota tujuan","no kursi","total"));
    }
}
