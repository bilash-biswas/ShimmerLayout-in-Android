package com.example.shimmerlayoutinandroid;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class MainActivity extends AppCompatActivity {
    private ShimmerLayout shimmerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shimmerLayout = findViewById(R.id.shimmer_layout);

        shimmerLayout.startShimmerAnimation();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                shimmerLayout.stopShimmerAnimation();
            }
        }, 5000);

    }
}