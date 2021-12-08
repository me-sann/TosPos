package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SubPostActivity extends AppCompatActivity {
    private WebView myWebsite;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_post);


        myWebsite = findViewById(R.id.webView);
        WebSettings webSettings= myWebsite.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebsite.setWebViewClient(new MyWebViewClient());
        myWebsite.loadUrl("https://www.u-toyama.ac.jp/");
    }

    private static class MyWebViewClient extends WebViewClient {
        @Override
        public  boolean shouldOverrideUrlLoading(WebView view, String url) {
            //if("https://www.u-toyama.ac.jp/".equals(Uri.parse(url)getHost())){
            return false;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebsite.canGoBack()) {
            myWebsite.goBack();
            return true;
        }
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event);
    }
}

