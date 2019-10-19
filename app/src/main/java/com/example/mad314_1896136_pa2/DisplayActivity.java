package com.example.mad314_1896136_pa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
TextView tvname,tvid;
    RecyclerView rvStudent;
    private StudentAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        rvStudent = findViewById(R.id.rvStudent);
        layoutManager = new LinearLayoutManager(this);
        rvStudent.setLayoutManager(layoutManager);

        mAdapter = new StudentAdapter(getApplicationContext());
        rvStudent.setAdapter(mAdapter);
        
        final StudentRepository repository = StudentRepository.getInstance();

        mAdapter.update();




    }
}
