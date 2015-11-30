package com.jarsoft.user.tapearte.Dominio;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.jarsoft.user.tapearte.Presentacion.Tapearte;
import com.jarsoft.user.tapearte.R;

/**
 * Created by user on 29/11/2015.
 */
public class InterfazInicial extends Fragment implements View.OnClickListener{

    private static Activity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.interfaz_inicial, container, false);
    }

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) {

        view.findViewById(R.id.Opciones).setOnClickListener(this);
        view.findViewById(R.id.Votar).setOnClickListener(this);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Votar: {
                System.out.println("Votando");
                getFragmentManager().beginTransaction().
                        add(R.id.container, Votando.newInstance())
                        .commit();
//                getFragmentManager().beginTransaction()
//                        .replace(R.id.container, Votando.newInstance())
//                        .commit();
                break;
            }
            case R.id.Opciones:{
                System.out.println("Mostrar opciones");
                PopupMenu popupMenu = new PopupMenu(activity, view);
                popupMenu.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.one:
//                                Toast.makeText(this, "Comedy Clicked", Toast.LENGTH_SHORT).show();
                                System.out.println("Uno");
                                return true;
                            case R.id.two:
//                                Toast.makeText(this, "Movies Clicked", Toast.LENGTH_SHORT).show();
                                System.out.println("Dos");
                                return true;
                            case R.id.three:
//                                Toast.makeText(this, "Music Clicked", Toast.LENGTH_SHORT).show();
                                System.out.println("tres");
                                return true;
                        }
                        return false;
                    }
                });

                popupMenu.inflate(R.menu.pop_menu);
                popupMenu.show();
                break;
            }
        }
    }

    public static InterfazInicial newInstance(Activity act) {
        activity = act;
        InterfazInicial fragment = new InterfazInicial();
        fragment.setRetainInstance(true);
        return fragment;
    }



}
