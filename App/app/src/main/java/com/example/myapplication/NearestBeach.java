package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class NearestBeach extends AppCompatActivity {

    private Button go_back;
    String beach_list[] = {"St.Kilda", "Brighton", "Flinders"};
    int beach_images[] = {R.drawable.kilda, R.drawable.williamstwonbeach, R.drawable.williamstwonbeach};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest_beach);

        go_back = findViewById(R.id.go_back);
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NearestBeach.this, MainActivity.class);
                startActivity(intent);
            }
        });

        listView = findViewById(R.id.list_view);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), beach_list, beach_images);
        listView.setAdapter(customBaseAdapter);
    }
}