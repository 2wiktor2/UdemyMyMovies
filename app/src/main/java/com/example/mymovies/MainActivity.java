package com.example.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.mymovies.utils.NetworkUtils;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        JSONObject jsonObject = NetworkUtils.getJsonFromNetwork(NetworkUtils.TOP_RATED, 3);
        if (jsonObject == null) {
            Toast.makeText(this, "Произошла ошибка сети", Toast.LENGTH_SHORT).show();
        } else Toast.makeText(this, "Успешно", Toast.LENGTH_SHORT).show();
*/

    }
}
