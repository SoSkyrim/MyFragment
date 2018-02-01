package com.so.myfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.so.myfragment.fragment.AddressListFragment;
import com.so.myfragment.fragment.DiscoverFragment;
import com.so.myfragment.fragment.MeFragment;
import com.so.myfragment.fragment.WcFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_wc;
    private Button bt_address_list;
    private Button bt_discover;
    private Button bt_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_wc = (Button) findViewById(R.id.bt_wc);
        bt_address_list = (Button) findViewById(R.id.bt_address_list);
        bt_discover = (Button) findViewById(R.id.bt_discover);
        bt_me = (Button) findViewById(R.id.bt_me);

        bt_wc.setOnClickListener(this);
        bt_address_list.setOnClickListener(this);
        bt_discover.setOnClickListener(this);
        bt_me.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.bt_wc:
                fragmentTransaction.replace(R.id.ll_content, new WcFragment());
                break;
            case R.id.bt_address_list:
                fragmentTransaction.replace(R.id.ll_content, new AddressListFragment());
                break;
            case R.id.bt_discover:
                fragmentTransaction.replace(R.id.ll_content, new DiscoverFragment());
                break;
            case R.id.bt_me:
                fragmentTransaction.replace(R.id.ll_content, new MeFragment());
                break;
        }

        fragmentTransaction.commit();
    }
}
