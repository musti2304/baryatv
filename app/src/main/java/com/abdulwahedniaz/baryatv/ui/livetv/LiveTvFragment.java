package com.abdulwahedniaz.baryatv.ui.livetv;

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

public class LiveTvFragment extends Fragment {

    private LiveTvViewModel liveTvViewModel;
    private String liveTvUrl = "http://baryatv.wns.live";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        liveTvViewModel =
                new ViewModelProvider(this).get(LiveTvViewModel.class);
        View root = inflater.inflate(R.layout.fragment_live_tv, container, false);
        final WebView webView = root.findViewById(R.id.liveTvWebView);
        liveTvViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(liveTvUrl);
        return root;
    }
}