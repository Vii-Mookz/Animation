package com.example.vii_mook.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView txvRippleWithBodrer,txvRippleWithoutBorder,txvCustomRippleWithBorder,txvCustomRippleWithOutBorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindControl();
    }

    private void bindControl() {
        txvRippleWithBodrer = (TextView) findViewById(R.id.txvRippleWithBorder);
        txvRippleWithoutBorder = (TextView) findViewById(R.id.txvRippleWithoutBorder);
        txvCustomRippleWithBorder = (TextView) findViewById(R.id.txvCustomRippleWithBorder);
        txvCustomRippleWithOutBorder = (TextView) findViewById(R.id.txvCustomRippleWithoutBorder);

        txvRippleWithBodrer.setOnClickListener(this);
        txvRippleWithoutBorder.setOnClickListener(this);
        txvCustomRippleWithBorder.setOnClickListener(this);
        txvCustomRippleWithOutBorder.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.explodeJava:
                break;


            case R.id.explodeXML:
                break;

            case R.id.slideJava:
                break;

            case R.id.slideXML:
                break;


            case R.id.fadeJava:
                break;

            case R.id.fadeXML:
                break;

            case R.id.shared_element:
                break;
        }

    }
}
