package com.jarsoft.user.tapearte.Dominio;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jarsoft.user.tapearte.R;

/**
 * Created by user on 29/11/2015.
 */
public class Votando extends Fragment implements View.OnClickListener  {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.votando, container, false);
    }

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) {

        view.findViewById(R.id.introducirCodigo);
        view.findViewById(R.id.puntuar);
        view.findViewById(R.id.button).setOnClickListener(this);;
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onPause() {
        super.onPause();
    }


    public static Fragment newInstance() {
        Votando fragment = new Votando();
        fragment.setRetainInstance(true);
        return fragment;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button: {
                System.out.println("boton");
                getFragmentManager().beginTransaction().hide(this).commit();
                break;
            }
        }

    }
}
