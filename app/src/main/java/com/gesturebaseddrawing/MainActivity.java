package com.gesturebaseddrawing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.gesturebaseddrawing.PaintView;
import com.gesturebaseddrawing.R;

public class MainActivity extends AppCompatActivity {

    private PaintView paintView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paintView = (PaintView) findViewById(R.id.paintView);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.freeDraw:
                item.setChecked(true);
                return true;
            case R.id.line:
                item.setChecked(true);
                return true;
            case R.id.square:
                item.setChecked(true);
                return true;
            case R.id.rectangle:
                item.setChecked(true);
                return true;
            case R.id.circle:
                item.setChecked(true);
                return true;
            case R.id.triangle:
                item.setChecked(true);
                return true;
            case R.id.black:
                paintView.black();
                item.setChecked(true);
                return true;
            case R.id.red:
                paintView.red();
                item.setChecked(true);
                return true;
            case R.id.blue:
                paintView.blue();
                item.setChecked(true);
                return true;
            case R.id.green:
                paintView.green();
                item.setChecked(true);
                return true;
            case R.id.yellow:
                paintView.yellow();
                item.setChecked(true);
                return true;
            case R.id.clear:
                paintView.clear();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}