package com.example.pc.manhuawork;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pc.utils.Utils;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private ImageView leftMenu;
    private DrawerLayout drawerLayout;


    //左侧栏 栏目textview
    private TextView manhua_local;
    private TextView manhua_history;
    private TextView manhua_download;
    private TextView manhua_user;
    private TextView manhua_message;
    private TextView manhua_vip;
    private TextView manhua_wallet;
    private TextView manhua_ticket;
    private TextView manhua_order;
    private TextView manhua_night;
    private TextView manhua_setting;
    private ImageView switch_night;

    //test
    private ImageView ic_test;

    //FLAG
    private static boolean night_boolean = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        initUI();
        setListener();
    }
    private void setListener(){
        leftMenu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        manhua_local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你点击了本地漫画",Toast.LENGTH_LONG).show();
            }
        });
        manhua_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你点击了历史观看",Toast.LENGTH_LONG).show();
            }
        });
        manhua_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你点击了下载记录",Toast.LENGTH_LONG).show();
            }
        });
        manhua_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你点击了个人中心",Toast.LENGTH_LONG).show();
            }
        });
        manhua_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你点击了我的消息",Toast.LENGTH_LONG).show();
            }
        });
        manhua_vip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你点击了我的VIP",Toast.LENGTH_LONG).show();
            }
        });
        manhua_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你点击了我的钱包",Toast.LENGTH_LONG).show();
            }
        });
        manhua_ticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你点击了我的门票",Toast.LENGTH_LONG).show();
            }
        });
        manhua_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你点击了我的订单",Toast.LENGTH_LONG).show();
            }
        });
        manhua_night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(night_boolean){
                    switch_night.setImageResource(R.mipmap.switch_on);
                    night_boolean = false;
                    Utils.changeAppBrightness(MainActivity.this,90);
                }else{
                    switch_night.setImageResource(R.mipmap.switch_off);
                    Utils.changeAppBrightness(MainActivity.this,255);
                    night_boolean = true;
                }

            }
        });
        manhua_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你点击了设置",Toast.LENGTH_LONG).show();
            }
        });

        ic_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
    private void initUI(){
        leftMenu = (ImageView) findViewById(R.id.leftmenu);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);

        //左侧栏目init
        manhua_local = findViewById(R.id.local_manhua);
        manhua_history = findViewById(R.id.manhua_history);
        manhua_download = findViewById(R.id.manhua_download);
        manhua_user = findViewById(R.id.manhua_user);
        manhua_message = findViewById(R.id.manhua_message);
        manhua_vip = findViewById(R.id.manhua_vip);
        manhua_wallet = findViewById(R.id.manhua_wallet);
        manhua_ticket = findViewById(R.id.manhua_ticket);
        manhua_order = findViewById(R.id.manhua_order);
        manhua_night = findViewById(R.id.manhua_night);
        manhua_setting = findViewById(R.id.manhua_setting);
        switch_night= findViewById(R.id.manhua_night_switch);

        //test
        ic_test = findViewById(R.id.test_image);

    }

}
