package com.example.guest.fansite.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.guest.fansite.R;

public class MainActivity extends AppCompatActivity {

    private Button mTourDatesButton;
    private Button mMemberBiosButton;
    private Button mDiscographyButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTourDatesButton = (Button) findViewById(R.id.tourDatesButton);
        mMemberBiosButton = (Button) findViewById(R.id.memberBiosButton);
        mDiscographyButton = (Button) findViewById(R.id.discographyButton);

        mTourDatesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TourDatesActivity.class);
                startActivity(intent);
            }
        });

        mMemberBiosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MemberBiosActivity.class);
                startActivity(intent);
            }
        });

        mDiscographyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiscographyActivity.class);
                startActivity(intent);
            }
        });
    }


}
