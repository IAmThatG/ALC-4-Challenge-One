package com.example.alc4challenge1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlcActivity extends AppCompatActivity {

    private WebView alcWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        initializeView();
        loadWebView();
    }

    private void initializeView() {
        alcWebView = findViewById(R.id.webview);
    }

    private void loadWebView() {
        WebSettings webSettings = alcWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        alcWebView.setHorizontalScrollBarEnabled(false);
        alcWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
//        setContentView(alcWebView);
        alcWebView.loadUrl("https://andela.com/alc/");
    }
}
