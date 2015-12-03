package com.jarsoft.user.tapearte.Presentacion;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jarsoft.user.tapearte.R;

/**
 * Created by user on 02/12/2015.
 */
public class FragmentBuscarBar extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup conteiner, Bundle savedInstanceState){
        return inflater.inflate(R.layout.tercer_layout, conteiner, false);
    }
}
