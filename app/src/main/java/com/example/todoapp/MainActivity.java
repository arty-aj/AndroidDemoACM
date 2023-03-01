package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ItemModel> todoItemList;
    private RecyclerView itemsRV;
    public ItemAdapter adapter;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        itemsRV = findViewById(R.id.recyclerView);

        todoItemList = new ArrayList<>();
        floatingActionButton = findViewById(R.id.floatingActionButton);

        setItems();
        adapter = new ItemAdapter(todoItemList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        itemsRV.setLayoutManager(layoutManager);
        itemsRV.setItemAnimator(new DefaultItemAnimator());
        itemsRV.setAdapter(adapter);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("A", "Add Item button pressed");
            }
        });
    }

    private void setItems(){
        todoItemList.add(new ItemModel("First todo Item", "Clean the dishes and clean dog"));
    }

}