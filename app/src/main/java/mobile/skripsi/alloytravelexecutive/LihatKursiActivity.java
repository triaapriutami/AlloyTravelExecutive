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
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.ArrayList;
import java.util.List;

import mobile.skripsi.alloytravelexecutive.common.Constant;

public class LihatKursiActivity extends AppCompatActivity {
    private Button buttonselesai;
    private String kursi="";
    private CheckBox checkbox1;
    private int numberOfCheckboxesChecked;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private CheckBox checkbox4;
    private CheckBox checkbox5;
    private CheckBox checkbox6;
    private CheckBox checkbox7;
    private CheckBox checkbox8;
    private CheckBox checkbox9;
    private CheckBox checkbox10;
    private CheckBox checkbox11;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_kursi);
        kursi = getIntent().getExtras().getString(Constant.KURSI);
        buttonselesai = (Button) findViewById(R.id.selesai);
        buttonselesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LihatKursiActivity.this, PesanTiket2Activity.class);
                intent.putExtra(Constant.KURSI,getIntent().getExtras().getString(Constant.KURSI));
                startActivity(intent);
            }
        });
        numberOfCheckboxesChecked = 0;
        checkbox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkbox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkbox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkbox4 = (CheckBox)findViewById(R.id.checkBox4);
        checkbox5 = (CheckBox)findViewById(R.id.checkBox5);
        checkbox6 = (CheckBox)findViewById(R.id.checkBox6);
        checkbox7 = (CheckBox)findViewById(R.id.checkBox7);
        checkbox8 = (CheckBox)findViewById(R.id.checkBox8);
        checkbox9 = (CheckBox)findViewById(R.id.checkBox9);
        checkbox10 = (CheckBox)findViewById(R.id.checkBox10);
        checkbox11 = (CheckBox)findViewById(R.id.checkBox11);
        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= Integer.parseInt(kursi)) {
                    checkbox1.setChecked(false);
                } else {
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }
                }
            }
        });
        checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= Integer.parseInt(kursi)) {
                    checkbox2.setChecked(false);
                } else {
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }
                }
            }
        });
        checkbox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= Integer.parseInt(kursi)) {
                    checkbox3.setChecked(false);
                } else {
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }
                }
            }
        });
        checkbox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= Integer.parseInt(kursi)) {
                    checkbox4.setChecked(false);
                } else {
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }
                }
            }
        });
        checkbox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= Integer.parseInt(kursi)) {
                    checkbox5.setChecked(false);
                } else {
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }
                }
            }
        });
        checkbox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= Integer.parseInt(kursi)) {
                    checkbox6.setChecked(false);
                } else {
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }
                }
            }
        });
        checkbox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= Integer.parseInt(kursi)) {
                    checkbox7.setChecked(false);
                } else {
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }
                }
            }
        });
        checkbox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= Integer.parseInt(kursi)) {
                    checkbox8.setChecked(false);
                } else {
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }
                }
            }
        });
        checkbox9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= Integer.parseInt(kursi)) {
                    checkbox9.setChecked(false);
                } else {
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }
                }
            }
        });
        checkbox10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= Integer.parseInt(kursi)) {
                    checkbox10.setChecked(false);
                } else {
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }
                }
            }
        });
        checkbox11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked && numberOfCheckboxesChecked >= Integer.parseInt(kursi)) {
                    checkbox11.setChecked(false);
                } else {
                    if (isChecked) {
                        numberOfCheckboxesChecked++;
                    } else {
                        numberOfCheckboxesChecked--;
                    }
                }
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
        LihatKursiActivity.ViewPagerAdapter adapter = new LihatKursiActivity.ViewPagerAdapter(getSupportFragmentManager());
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
