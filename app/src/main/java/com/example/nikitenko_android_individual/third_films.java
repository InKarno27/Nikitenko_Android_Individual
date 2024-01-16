package com.example.nikitenko_android_individual;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class third_films extends AppCompatActivity {

    private VideoView videoView;
    private TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_films);

        int videoRawId = R.raw.trailer_aladdin;

        videoView = findViewById(R.id.video3);
        String videoPath = "android.resource://" + getPackageName() + "/" + videoRawId;
        videoView.setVideoURI(Uri.parse(videoPath));
        videoView.start();

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
    }
}