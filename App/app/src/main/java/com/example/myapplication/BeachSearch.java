package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class BeachSearch extends AppCompatActivity {

    private Button go_back;
    String beach_list[] = {"St.Kilda", "Brighton", "Flinders"};
    int beach_images[] = {R.drawable.kilda, R.drawable.williamstwonbeach, R.drawable.williamstwonbeach};
    String popullation[] = {"Low Popullation", "High Popullation", "Medium Popullation"};
    String pollution[] = {"Low Pollution", "High Pollution", "Medium Pollution"};
    String safety[] = {"Low Safety", "High Safety", "Medium Safety"};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach_search);

        go_back = findViewById(R.id.go_back);
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BeachSearch.this, MainActivity.class);
                startActivity(intent);
            }
        });

        listView = findViewById(R.id.list_view);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), beach_list, beach_images);
        listView.setAdapter(customBaseAdapter);
    }
}