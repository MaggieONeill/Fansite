package com.example.guest.fansite.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guest.fansite.R;
import com.example.guest.fansite.models.BandMember;
import com.example.guest.fansite.models.BandMemberlib;

import org.w3c.dom.Text;

public class MemberBiosActivity extends AppCompatActivity {

    private TextView mBandMemberName;
    private TextView mBandRole;
    private TextView mBandMemberBioInfo;
    private ImageView mBandMemberImage;
    private Button mNextBandMemberButton;

    private BandMemberlib mBandMemberlib;
    private BandMember mCurrentBandMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_bios);

        mBandMemberName = (TextView) findViewById(R.id.bandMemberName);
        mBandRole = (TextView) findViewById(R.id.bandRole);
        mBandMemberBioInfo = (TextView) findViewById(R.id.bandMemberBioInfo);
        mBandMemberImage = (ImageView) findViewById(R.id.bandMemberImage);
        mNextBandMemberButton = (Button) findViewById(R.id.nextBandMemberButton);
        mBandMemberlib = new BandMemberlib();
        mCurrentBandMember = mBandMemberlib.getBandMembers().get(0);


        setLayoutContent();

        mNextBandMemberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentBandMember = mBandMemberlib.nextBandMember(mCurrentBandMember);
                setLayoutContent();
        }
        });
    }

    private void setLayoutContent() {
        mBandMemberName.setText(mCurrentBandMember.getName());
        mBandRole.setText(mCurrentBandMember.getBandRole());
        mBandMemberBioInfo.setText(mCurrentBandMember.getBandMemberBioInfo());
        mBandMemberImage.setImageResource(mCurrentBandMember.getImage());
    }


}
