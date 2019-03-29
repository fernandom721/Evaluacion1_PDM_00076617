package com.example.corto1_labopdm;

import android.content.Intent;
import android.media.Image;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.corto1_labopdm.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private int count1 = 0;

    private int final_count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mCount1 = findViewById(R.id.count_1);
        RelativeLayout mImage1 = findViewById(R.id.img1);
        TextView mCount2 = findViewById(R.id.count_2);
        RelativeLayout mImage2 = findViewById(R.id.img2);
        TextView mCount3 = findViewById(R.id.count_3);
        RelativeLayout mImage3 = findViewById(R.id.img3);
        TextView mCount4 = findViewById(R.id.count_4);
        RelativeLayout mImage4 = findViewById(R.id.img4);
        TextView mCount5 = findViewById(R.id.count_5);
        RelativeLayout mImage5 = findViewById(R.id.img5);
        TextView mCount6 = findViewById(R.id.count_6);
        RelativeLayout mImage6 = findViewById(R.id.img6);
        TextView mCount7 = findViewById(R.id.count_7);
        RelativeLayout mImage7 = findViewById(R.id.img7);
        TextView mCount8 = findViewById(R.id.count_8);
        RelativeLayout mImage8 = findViewById(R.id.img8);
        TextView mCount9 = findViewById(R.id.count_9);
        RelativeLayout mImage9 = findViewById(R.id.img9);

        Button mButton = findViewById(R.id.btn_share);
        EditText mUser = findViewById(R.id.et_user);
        EditText mEmail = findViewById(R.id.et_email);

        mImage1.setOnClickListener(v->{
            count1 = Integer.parseInt(mCount1.getText().toString()) +1;
            final_count+=1;
            mCount1.setText(Integer.toString(count1));
        });
        mImage2.setOnClickListener(v->{
            count1 = Integer.parseInt(mCount2.getText().toString()) +1;
            final_count+=1;
            mCount2.setText(Integer.toString(count1));
        });
        mImage3.setOnClickListener(v->{
            count1 = Integer.parseInt(mCount3.getText().toString()) +1;
            final_count+=1;
            mCount3.setText(Integer.toString(count1));
        });
        mImage4.setOnClickListener(v->{
            count1 = Integer.parseInt(mCount4.getText().toString()) +1;
            final_count+=1;
            mCount4.setText(Integer.toString(count1));
        });
        mImage5.setOnClickListener(v->{
            count1 = Integer.parseInt(mCount5.getText().toString()) +1;
            final_count+=1;
            mCount5.setText(Integer.toString(count1));
        });
        mImage6.setOnClickListener(v->{
            count1 = Integer.parseInt(mCount6.getText().toString()) +1;
            final_count+=1;
            mCount6.setText(Integer.toString(count1));
        });
        mImage7.setOnClickListener(v->{
            count1 = Integer.parseInt(mCount7.getText().toString()) +1;
            final_count+=1;
            mCount7.setText(Integer.toString(count1));
        });
        mImage8.setOnClickListener(v->{
            count1 = Integer.parseInt(mCount8.getText().toString()) +1;
            final_count+=1;
            mCount8.setText(Integer.toString(count1));
        });
        mImage9.setOnClickListener(v->{
            count1 = Integer.parseInt(mCount9.getText().toString()) +1;
            final_count+=1;
            mCount9.setText(Integer.toString(count1));
        });

        mButton.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);

            String email = mEmail.getText().toString();
            mIntent.putExtra(AppConstant.EMAIL_KEY,email);

            String user = mUser.getText().toString();
            mIntent.putExtra(AppConstant.USER_KEY,user);

            String count = Integer.toString(final_count);
            mIntent.putExtra(AppConstant.FCOUNT_KEY,count);

            mIntent.putExtra(AppConstant.COUT1_KEY,mCount1.getText().toString());
            mIntent.putExtra(AppConstant.COUT2_KEY,mCount2.getText().toString());
            mIntent.putExtra(AppConstant.COUT3_KEY,mCount3.getText().toString());
            mIntent.putExtra(AppConstant.COUT4_KEY,mCount4.getText().toString());
            mIntent.putExtra(AppConstant.COUT5_KEY,mCount5.getText().toString());
            mIntent.putExtra(AppConstant.COUT6_KEY,mCount6.getText().toString());
            mIntent.putExtra(AppConstant.COUT7_KEY,mCount7.getText().toString());
            mIntent.putExtra(AppConstant.COUT8_KEY,mCount8.getText().toString());
            mIntent.putExtra(AppConstant.COUT9_KEY,mCount9.getText().toString());



            startActivity(mIntent);
        });

    }
}
