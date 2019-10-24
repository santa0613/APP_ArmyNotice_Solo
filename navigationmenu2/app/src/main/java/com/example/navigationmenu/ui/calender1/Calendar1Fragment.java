package com.example.navigationmenu.ui.calender1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.navigationmenu.R;

public class Calendar1Fragment extends Fragment {

    private Calendar1ViewModel Calendar1ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Calendar1ViewModel =
                ViewModelProviders.of(this).get(Calendar1ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_calender1, container, false);
        final TextView textView = root.findViewById(R.id.text_calender1);
        Calendar1ViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}