package com.abdulwahedniaz.baryatv.ui.youtube;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class YouTubeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public YouTubeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is youtube fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}