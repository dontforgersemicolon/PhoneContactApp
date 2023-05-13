package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.session.PlaybackState;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Contact c1 = new Contact(1, "123-123-1234", "Abraham Zaxby");
    Contact c2 = new Contact(1, "234-234-2345", "Trent McDonald");
    Contact c3 = new Contact(1, "345-345-3456", "Kacy Popeyes");
    Contact c4 = new Contact(1, "456-456-4567", "Adam Hardee");
    Contact c5 = new Contact(1, "567-567-5678", "Guipeng Yang");
    Contact c6 = new Contact(1, "678-678-6789", "Colton Horne");
    Contact c7 = new Contact(1, "789-789-7890", "Jaehong Park");
    Contact c8 = new Contact(1, "890-890-8901", "Satyaki Nan");

    Contact[] contacts = {c1, c2, c3, c4, c5, c6, c7, c8};
    //String [] arr = {"Abraham Zaxby", "Trent McDonald", "Kacy Popeyes", "Adam Chicken", "Guipeng Yang", "Jaehong Park", "Seonwoo Lee", "Johannes Winter", "Cody Clements", "Joel Landis", "Colton Horne", "Kyle Hawkins"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        com.example.a0327phonecontact.CustomAdapter c = new com.example.a0327phonecontact.CustomAdapter(contacts);
        recyclerView.setAdapter(c);
    }

}