package com.snackjack.androidapp.ui.maindashboard.menu.samplefragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SampleFragmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SampleFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is sample fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}