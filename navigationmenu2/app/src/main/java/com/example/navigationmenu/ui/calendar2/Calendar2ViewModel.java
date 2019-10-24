package com.example.navigationmenu.ui.calendar2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Calendar2ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Calendar2ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("달별 청소/ 세탁날입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}