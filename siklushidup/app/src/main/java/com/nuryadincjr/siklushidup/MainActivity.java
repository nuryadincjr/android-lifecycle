package com.nuryadincjr.siklushidup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*Navigasi tombol:
      - saat memulai => onStart-onResume
      - tombil kembali, tengah, kanan => onPause-onStop
      - tombil kembali => onPause-onStop, buka lagi onReset-onStart-onResume
      - tombil tengah => onPause-onStop, buka lagi onReset-onStart-onResume
      - tombil kanan => onPause-onStop, buka lagi onReset-onStart-onResume
      - tombil kanan => onPause-onStop, bersihkan onDistroy
      - rotasi potret ke landscape => onPause-onStop-onDistroy-onStart-onResume
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Siklus hidup onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Siklus hidup onReset", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Siklus hidup onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Siklus hidup onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Siklus hidup onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Siklus hidup onDestroy", Toast.LENGTH_SHORT).show();
    }
}