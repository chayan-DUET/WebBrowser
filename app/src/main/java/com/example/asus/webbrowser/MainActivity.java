package com.example.asus.webbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    WebView webView;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText);
        webView = (WebView)findViewById(R.id.webSearch);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                url = "http://"+ editText.getText().toString();
                WebSettings webSettings= webView.getSettings();
                webSettings.setBuiltInZoomControls(true);
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(url);

            }
        });
    }
}
