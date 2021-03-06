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

import mobile.skripsi.alloytravelexecutive.common.Constant;
import mobile.skripsi.alloytravelexecutive.model.Tiket;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerViewAdapter adapter;
    private LinearLayoutManager layoutmanager;
    private ArrayList<Tiket> dataSet;
    private String jmlKursi;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dataSet = new ArrayList<>();
        initDataSet();

        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutmanager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutmanager);
        if(getIntent().getExtras().getString(Constant.KURSI)!=null)jmlKursi = getIntent().getExtras().getString(Constant.KURSI);
        adapter = new RecyclerViewAdapter(dataSet,jmlKursi);
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
        Main2Activity.ViewPagerAdapter adapter = new Main2Activity.ViewPagerAdapter(getSupportFragmentManager());
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

    private void initDataSet(){
        dataSet.add(new Tiket("Jogy-Tegal(*Transit smg)","TOYOTA","SHUTTEL","125000","08.00", "H 1469 GG"));
        dataSet.add(new Tiket("Jogy-Tegal(*Transit smg)","TOYOTA","SHUTTEL","125000","11.00", " AB 1358 TY"));
        dataSet.add(new Tiket("Jogy-Tegal(*Transit smg)","TOYOTA","SHUTTEL","125000","13.00", "H 7328 XX"));
        dataSet.add(new Tiket("Jogy-Tegal(*Transit smg)","TOYOTA","SHUTTEL","125000","20.00", "H 1479 GG"));
        dataSet.add(new Tiket("Jogy-Tegal(*Transit smg)","TOYOTA","SHUTTEL","125000","22.00", "AB 1309 GD"));

        dataSet.add(new Tiket("Tegal-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","08.00", "H 1694 XX"));
        dataSet.add(new Tiket("Tegal-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","13.00", "H 888 UJ"));
        dataSet.add(new Tiket("Tegal-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","20.00", "AB 428 JI"));
        dataSet.add(new Tiket("Tegal-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","23.00", "AB 1548 HB"));

        dataSet.add(new Tiket("Kelet-Semarang","TOYOTA","TRAVEL","85000","05.00", "H 1496 NH"));
        dataSet.add(new Tiket("Kelet-Semarang","TOYOTA","TRAVEL","85000","07.00", "AB 217 SF"));
        dataSet.add(new Tiket("Kelet-Semarang","TOYOTA","TRAVEL","85000","13.00", "AB 2476 UQ"));
        dataSet.add(new Tiket("Kelet-Semarang","TOYOTA","TRAVEL","85000","17.00", "H 169 XY"));

        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","06.00", "H 146 XT"));
        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","08.00", "H 1509 GH"));
        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","11.00", "AB 1103 XY"));
        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","13.00", "H 205 BA"));
        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","15.00", "H 1469 GG"));
        dataSet.add(new Tiket("Semarang-Kelet","TOYOTA","TRAVEL","85000","17.00", "H 166 BS"));

        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","04.00", "AB 257 XT"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","05.00", "AB 710 FA"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","06.00", "H 560 G"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","07.00", "H 219 RA"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","08.00", "H 012 GF"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","09.00", "AB 407 XY"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","10.00", "AB 735 DB"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","11.00", "AB 706 HF"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","12.00", "AB 194 TR"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","13.00", "AB 500 Y"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","14.00", "AB 25 GS"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","15.00", "AB 43 XY"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","16.00", "AB 8354 TY"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","17.00", "AB 171 WE"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","18.00", "AB 548 YT"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","19.00", "AB 667 QE"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","20.00", "AB 1234 XY"));
        dataSet.add(new Tiket("Semarang-Jogya","TOYOTA","SHUTTEL","80000","21.00", "AB 5489 XY"));

        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","04.00", "H 19 XY"));
        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","06.00", "H 69 V"));
        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","08.00", "H 46 FA"));
        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","10.00", "H 5234 FB"));
        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","12.00", "H 7098 FH"));
        dataSet.add(new Tiket("Jogya-Jepara(*Transit smg)","TOYOTA","SHUTTEL","125000","14.00", "H 321 DE"));

        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","06.00", "H 60 AA"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","07.00", "H 54812 DF"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","08.00", "H 1520 WE"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","09.00", "H 300 AS"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","10.00", "H 124 BA"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","12.00", "H 484 TY"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","14.00", "H 843 XT"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","16.00", "H 703 TX"));
        dataSet.add(new Tiket("Semarang-Solo","TOYOTA","SHUTTEL","70000","18.00", "H 9080 UY"));

        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","05.00", "AB 332 SS"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","06.00", "AB 3367 AF"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","08.00", "AB 2213 ED"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","10.00", "AB 1007 HF"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","12.00", "AB 7010 SR"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","14.00", "AB 9074 DR"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","16.00", "AB 8063 KB"));
        dataSet.add(new Tiket("Solo-Semarang","TOYOTA","SHUTTEL","70000","18.00", "AB 5390 LK"));

        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","05.00", "H 180 XY"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","06.00", "H 567 FA"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","08.00", "H 342 YX"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","10.00", "H 178 DB"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","12.00", "H 912 KJ"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","14.00", "H 002 QQ"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","16.00", "H 881 ER"));
        dataSet.add(new Tiket("Solo-Jepara(*Transit smg)","TOYOTA","SHUTTEL","120000","18.00", "H 111 DE"));

        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","03.00", "AB 302 RE"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","05.00", "H 678 TR"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","07.00", "AB 156 YU"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","10.00", "H 1234 PA"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","12.00", "AB 4561 SA"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","13.00", "H 0132 DG"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","14.00", "AB 3021 LA"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","15.00", "H 7002 BO"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","16.00", "AB 1122 BW"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","17.00", "H 222 AP"));
        dataSet.add(new Tiket("Jepara-Semarang","TOYOTA","TRAVEL","50000","19.00", "AB 553 SS"));

        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","03.00", "H 469 GG"));
        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","05.00", "AB 169 GG"));
        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","07.00", "H 146 GG"));
        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","10.00", "AB 69 GG"));
        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","13.00", "H 2469 GG"));
        dataSet.add(new Tiket("Jepara-Solo(*Transit smg)","TOYOTA","SHUTTEL","120000","15.00", "AB 369 GG"));

        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","06.00", "H 4469 EE"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","08.00", "AB 569 ER"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","11.00", "H 229 TE"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","13.00", "AB 3345 AB"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","15.00", "H 5663 GR"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","17.00", "AB 8985 GC"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","19.00", "H 9898 CB"));
        dataSet.add(new Tiket("Semarang-Jepara","TOYOTA","TRAVEL","50000","21.00", "AB 0101 NN"));

        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","03.00", "H 0202 MN"));
        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","05.00", "AB 3031 LN"));
        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","07.00", "H 8056 KN"));
        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","10.00", "AB 4019 MM"));
        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","13.00", "H 5079 CM"));
        dataSet.add(new Tiket("Jepara-Jogya(*Transit smg)","TOYOTA","SHUTTEL","125000","15.00", "AB 1100 MG"));


    }
}
