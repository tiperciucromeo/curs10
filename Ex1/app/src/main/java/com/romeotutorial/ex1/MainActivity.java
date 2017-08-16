package com.romeotutorial.ex1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* SHARE IMAGE
        final Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/jpg");
        final File photoFile = new File(getFilesDir(), "imagine.jpg");
        shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(photoFile));
        startActivity(Intent.createChooser(shareIntent, "Share image using"));

        */

       ///* SHARE LINK
       Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "http://codepath.com");
        startActivity(Intent.createChooser(shareIntent, "Share link using"));
   // */


       /* SHARE TEXT
        final Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        startActivity(Intent.createChooser(sendIntent, "Share text using"));
        */
    }
}
