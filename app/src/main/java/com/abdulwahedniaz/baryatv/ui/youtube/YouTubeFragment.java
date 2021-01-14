package com.abdulwahedniaz.baryatv.ui.youtube;

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

public class YouTubeFragment extends Fragment {

//    private YouTubeViewModel youTubeViewModel;
    private String youtubeUrl = "https://m.youtube.com/channel/UCB8zpklYpeJvmZsZYoecCrw";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        youTubeViewModel =
//                new ViewModelProvider(this).get(YouTubeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_youtube, container, false);
        final WebView webView = root.findViewById(R.id.youtubeWebView);
//        youTubeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                webView.loadUrl(youtubeUrl);
//            }
//        });
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.loadUrl(youtubeUrl);
        return root;
    }
}