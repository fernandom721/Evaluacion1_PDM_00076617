package com.example.corto1_labopdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.corto1_labopdm.utils.AppConstant;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button mButton = findViewById(R.id.btn_share);

        TextView mEmail = findViewById(R.id.tv_email);
        TextView mUser = findViewById(R.id.tv_user);
        TextView mFCount = findViewById(R.id.tv_count);

        TextView mCount1 = findViewById(R.id.count_1);
        TextView mCount2 = findViewById(R.id.count_2);
        TextView mCount3 = findViewById(R.id.count_3);
        TextView mCount4 = findViewById(R.id.count_4);
        TextView mCount5 = findViewById(R.id.count_5);
        TextView mCount6 = findViewById(R.id.count_6);
        TextView mCount7 = findViewById(R.id.count_7);
        TextView mCount8 = findViewById(R.id.count_8);
        TextView mCount9 = findViewById(R.id.count_9);



        Intent mIntent = getIntent();
        if (mIntent!=null){
            mEmail.setText(mIntent.getStringExtra(AppConstant.EMAIL_KEY));
            mUser.setText(mIntent.getStringExtra(AppConstant.USER_KEY));
            mFCount.setText(mIntent.getStringExtra(AppConstant.FCOUNT_KEY));
            mCount1.setText(mIntent.getStringExtra(AppConstant.COUT1_KEY));
            mCount2.setText(mIntent.getStringExtra(AppConstant.COUT2_KEY));
            mCount3.setText(mIntent.getStringExtra(AppConstant.COUT3_KEY));
            mCount4.setText(mIntent.getStringExtra(AppConstant.COUT4_KEY));
            mCount5.setText(mIntent.getStringExtra(AppConstant.COUT5_KEY));
            mCount6.setText(mIntent.getStringExtra(AppConstant.COUT6_KEY));
            mCount7.setText(mIntent.getStringExtra(AppConstant.COUT7_KEY));
            mCount8.setText(mIntent.getStringExtra(AppConstant.COUT8_KEY));
            mCount9.setText(mIntent.getStringExtra(AppConstant.COUT9_KEY));

        }

        mButton.setOnClickListener(v->{
            String text = "User: " + mUser.getText()+ ", Email: "+mEmail.getText()+ ", Producto 1: "+ mCount1.getText()+ ", Producto 2: "+ mCount2.getText()+
                    ", Producto 3: "+ mCount2.getText()+ ", Producto 4: "+ mCount4.getText()+ ", Producto 5: "+ mCount5.getText()+ ", Producto 6:"+ mCount6.getText()+
                    ", Producto 7: "+ mCount7.getText()+ ", Producto 8: "+mCount8.getText()+ ", Producto 9: "+ mCount9.getText() +", Total de Productos: "+mFCount.getText();
            Intent sIntent=new Intent();
            sIntent.setType("text/plain");
            sIntent.setAction(Intent.ACTION_SEND);
            sIntent.putExtra(Intent.EXTRA_TEXT,text);
            startActivity(sIntent);
        });
    }
}
