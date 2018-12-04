package com.rosyid.belajarintent;

import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view) {
        String nomor = "081229203989";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", nomor, null));
        startActivity(panggil);
    }

    public void buka(View view) {
        String url = "https://www.google.com/";
        Intent bukaBrowser = new Intent(Intent.ACTION_VIEW);
        bukaBrowser.setData(Uri.parse(url));
        startActivity(bukaBrowser);
    }

    public void kamera(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
    }

    public void tentang(View view) {
        Intent i = new Intent(getApplicationContext(), About.class);
        startActivity(i);
    }

}
