package com.example.petcam;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class PetMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petmain);

        WebView webView = (WebView)findViewById(R.id.petview);
        webView.setPadding(0,0,0,0);
        //webView.setInitialScale(100);
        webView.getSettings().setBuiltInZoomControls(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        //webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);

        String url ="121.137.214.70:8091/javascript_simple.html";
        webView.loadUrl(url);


    }
}
