package com.example.nikitenko_android_individual;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class second_films extends AppCompatActivity {

    private VideoView videoView;
    private TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_films);

        int videoRawId = R.raw.trailer_boondock_saints;

        videoView = findViewById(R.id.video2);
        String videoPath = "android.resource://" + getPackageName() + "/" + videoRawId;
        videoView.setVideoURI(Uri.parse(videoPath));
        videoView.start();

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
    }
}