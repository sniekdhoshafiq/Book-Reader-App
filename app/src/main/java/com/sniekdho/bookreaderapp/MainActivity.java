package com.sniekdho.bookreaderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;

public class MainActivity extends AppCompatActivity {

    PDFView pdfView;

    LottieAnimationView lottieView;

    public static String assetName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfView);
        lottieView = findViewById(R.id.animationView);

        pdfView.setVisibility(View.INVISIBLE);
        lottieView.setVisibility(View.VISIBLE);

        pdfView.fromAsset(assetName)
                .onLoad(new OnLoadCompleteListener() {
                    @Override
                    public void loadComplete(int nbPages) {

                        lottieView.setVisibility(View.GONE);
                        pdfView.setVisibility(View.VISIBLE);

                    }
                })
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .load();

    }

}