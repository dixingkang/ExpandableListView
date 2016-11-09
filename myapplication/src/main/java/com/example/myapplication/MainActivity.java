package com.example.myapplication;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout activity_main;
    private Button but;
    ProgressDialog builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        builder = new ProgressDialog(this);
        builder.setMessage("正在请求。。。");
        builder.setIndeterminate(false);
        builder.setCanceledOnTouchOutside(false);
        builder.setCancelable(false);
    }

    private void initView() {
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);
        but = (Button) findViewById(R.id.but);
        but.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but:
                builder.show();
                builder.dismiss();
                break;
        }
    }

}
