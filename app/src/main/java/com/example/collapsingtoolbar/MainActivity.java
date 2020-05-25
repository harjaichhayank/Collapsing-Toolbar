package com.example.collapsingtoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView.Adapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Album> arrayList = new ArrayList<>();

    Toolbar toolbar;

    int[] img = {R.drawable.movie_1,R.drawable.movie_2,R.drawable.movie_3,
            R.drawable.movie_4,R.drawable.movie_5,R.drawable.movie_6,
            R.drawable.movie_7,R.drawable.movie_8,R.drawable.movie_9,
            R.drawable.movie_10,R.drawable.movie_11,R.drawable.movie_12,
            R.drawable.movie_13,R.drawable.movie_14,R.drawable.movie_15,
            R.drawable.movie_16,R.drawable.movie_17,R.drawable.movie_18,
            R.drawable.movie_19,R.drawable.movie_20,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.ToolBar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.RecyclerView);
        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        for (int id: img){
            arrayList.add(new Album(id));
        }

        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);
    }
}
