package com.sambil.math100;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
 private WebView view;
 @Override public void onCreate(Bundle state){super.onCreate(state);view=new WebView(this);view.setWebViewClient(new WebViewClient());view.getSettings().setJavaScriptEnabled(true);view.getSettings().setDomStorageEnabled(true);setContentView(view);view.loadUrl("file:///android_asset/index.html");}
 @Override protected void onDestroy(){if(view!=null)view.destroy();super.onDestroy();}
}
