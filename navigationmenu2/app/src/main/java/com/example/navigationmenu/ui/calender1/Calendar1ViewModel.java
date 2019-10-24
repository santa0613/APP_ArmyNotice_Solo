package com.example.navigationmenu.ui.calender1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Calendar1ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Calendar1ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("부대 일정입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}