package com.brayce.android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView txtShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtShowCount = (TextView) findViewById(R.id.show_count);
        if (savedInstanceState != null){
            this.mCount = savedInstanceState.getInt("m_count");
            txtShowCount.setText(String.valueOf(mCount));
        }
    }

    public void showToast(View view) {
        Toast toast =  Toast.makeText(this, R.string.toast_message,Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(txtShowCount != null)
            txtShowCount.setText(String.valueOf(mCount));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("m_count", mCount);
    }
}
