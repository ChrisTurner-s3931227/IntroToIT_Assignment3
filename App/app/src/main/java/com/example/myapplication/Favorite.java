package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Favorite extends AppCompatActivity {

    private Button go_back;
    ListView listView;
    String beach_list[] = {"St.Kilda"};
    int beach_images[] = {R.drawable.kilda};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        go_back = findViewById(R.id.go_back);
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Favorite.this, MainActivity.class);
                startActivity(intent);
            }
        });

        listView = findViewById(R.id.list_view);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), beach_list, beach_images);
        listView.setAdapter(customBaseAdapter);
    }
}