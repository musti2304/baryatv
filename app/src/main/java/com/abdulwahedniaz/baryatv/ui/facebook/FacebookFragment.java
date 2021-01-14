package com.abdulwahedniaz.baryatv.ui.facebook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.abdulwahedniaz.baryatv.R;

public class FacebookFragment extends Fragment {

//    private FacebookViewModel facebookViewModel;
    private String facebookUrl = "https://m.facebook.com/pg/Barya-TV-103314834794693/posts/";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        facebookViewModel =
                new ViewModelProvider(this).get(FacebookViewModel.class);
        View root = inflater.inflate(R.layout.fragment_facebook, container, false);
        final WebView webView = root.findViewById(R.id.facebookWebView);
//        facebookViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                webView.loadUrl(facebookUrl);
//            }
//        });
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(facebookUrl);
        return root;
    }
}