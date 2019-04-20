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

public class CekTagihanFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fr_cek_tagihan, container, false);
        Button button = (Button) fragmentView.findViewById(R.id.btnCekTagihan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction =
                        CekTagihanFragment.this.getActivity().getSupportFragmentManager().beginTransaction();

                fragmentTransaction.replace(R.id.fragment_sebelum_login, new HasilTagihanFragment());
                fragmentTransaction.commit();
            }
        });
        return fragmentView;
    }

}
