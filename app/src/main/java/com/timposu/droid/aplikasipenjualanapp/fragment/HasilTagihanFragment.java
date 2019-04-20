package com.timposu.droid.aplikasipenjualanapp.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.timposu.droid.aplikasipenjualanapp.R;

public class HasilTagihanFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fr_hasil_tagihan, container, false);

        Button button = (Button) fragmentView.findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = HasilTagihanFragment.this.getActivity().
                        getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_sebelum_login, new CekTagihanFragment());
                ft.commit();
            }
        });

        return fragmentView;
    }
}
