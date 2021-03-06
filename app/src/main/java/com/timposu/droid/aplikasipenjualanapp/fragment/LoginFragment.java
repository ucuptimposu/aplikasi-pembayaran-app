package com.timposu.droid.aplikasipenjualanapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.timposu.droid.aplikasipenjualanapp.R;
import com.timposu.droid.aplikasipenjualanapp.SetelahLoginActivity;

public class LoginFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fr_login, container, false);
        Button btnLogin = (Button) fragment.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent setelahLoginActivity = new Intent(getContext(), SetelahLoginActivity.class);
                startActivity(setelahLoginActivity);
            }
        });
        return fragment;
    }
}
