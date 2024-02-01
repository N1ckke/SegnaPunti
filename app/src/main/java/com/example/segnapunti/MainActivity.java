package com.example.segnapunti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int team1Count = 0;
    int team2Count= 0;
    TextView team1;
    TextView team2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team1 = findViewById(R.id.show_count_team1);
        team2 = findViewById(R.id.show_count_team2);
    }
    public void countUpTeam1(View view) {
        team1Count++;
        if (team1 != null)
            team1.setText(Integer.toString(team1Count));
    }
    public void countUpTeam2(View view) {
        team2Count++;
        if (team2 != null)
            team2.setText(Integer.toString(team2Count));
    }
}