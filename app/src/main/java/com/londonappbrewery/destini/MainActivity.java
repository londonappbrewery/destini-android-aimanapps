package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int storyIndex = 1;
    // TODO: Steps 4 & 8 - Declare member variables here:
    private String TAG = "BuildDestiny";
    private TextView storyTextView;
    private Button answer1, answer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        answer1 = findViewById(R.id.buttonTop);
        answer2 = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storyIndex == 1 || storyIndex == 2) {
                    storyTextView.setText(R.string.T3_Story);
                    answer1.setText(R.string.T3_Ans1);
                    answer2.setText(R.string.T3_Ans2);
                    storyIndex = 3;
                } else {
                    storyTextView.setText(R.string.T6_End);
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    storyIndex = 6;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storyIndex == 1) {
                    storyTextView.setText(R.string.T2_Story);
                    answer1.setText(R.string.T2_Ans1);
                    answer2.setText(R.string.T2_Ans2);
                    storyIndex = 2;
                } else if (storyIndex == 2) {
                    storyTextView.setText(R.string.T4_End);
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    storyIndex = 4;
                } else {
                    storyTextView.setText(R.string.T5_End);
                    answer1.setVisibility(View.GONE);
                    answer2.setVisibility(View.GONE);
                    storyIndex = 5;
                }
            }
        });

    }
}
