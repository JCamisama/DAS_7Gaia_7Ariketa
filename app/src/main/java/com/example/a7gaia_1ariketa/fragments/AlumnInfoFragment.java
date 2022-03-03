package com.example.a7gaia_1ariketa.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a7gaia_1ariketa.R;

public class AlumnInfoFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.alumn_info_layout,container,false);
        return v;
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView nombre= getView().findViewById(R.id.nombre);
        TextView apellido= getView().findViewById(R.id.apellido);
        TextView edad= getView().findViewById(R.id.edad);
    }
}
