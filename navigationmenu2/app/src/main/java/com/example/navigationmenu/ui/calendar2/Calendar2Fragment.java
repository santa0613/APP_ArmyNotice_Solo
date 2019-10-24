package com.example.navigationmenu.ui.calendar2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.navigationmenu.R;

public class Calendar2Fragment extends Fragment {

    private Calendar2ViewModel Calendar2ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Calendar2ViewModel =
                ViewModelProviders.of(this).get(Calendar2ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_calender2, container, false);
        final TextView textView = root.findViewById(R.id.text_calender2);
        Calendar2ViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}