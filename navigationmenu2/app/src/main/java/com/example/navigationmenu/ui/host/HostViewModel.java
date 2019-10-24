package com.example.navigationmenu.ui.host;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HostViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HostViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("홍길동부대 업무별 담당자입니다.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}