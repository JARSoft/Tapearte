package com.jarsoft.user.tapearte.Presentacion;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jarsoft.user.tapearte.Dominio.Cliente.GestorClienteMovil;
import com.jarsoft.user.tapearte.Dominio.Cliente.Tapa;
import com.jarsoft.user.tapearte.R;

/**
 * Created by user on 04/12/2015.
 */
public class Anadir_tapa extends Activity {

    private String nom = "-1", desc = "-1";
    private int idtapa = -1, idbar = -1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anadir_tapa_layout);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int heigth = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (heigth * .6));


        final EditText nombre = (EditText) this.findViewById(R.id.textNombre);
        final EditText identificador = (EditText) this.findViewById(R.id.textIdentificador);
        final EditText bar = (EditText) this.findViewById(R.id.textBar);
        final EditText descripcion = (EditText) this.findViewById(R.id.textDescripcion);

        nombre.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                nom = nombre.getText().toString();
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        descripcion.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                desc = descripcion.getText().toString();
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        identificador.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!identificador.getText().toString().equals(""))
                    idtapa = Integer.parseInt(identificador.getText().toString());
            }
        });

        bar.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!bar.getText().toString().equals(""))
                    idbar = Integer.parseInt(bar.getText().toString());
            }
        });

        Button OK = (Button) this.findViewById(R.id.OK);

        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!nom.equals("-1") && !desc.equals("-1") && idtapa != -1 && idbar != -1) {
                    GestorClienteMovil gestorClienteMovil = new GestorClienteMovil();
                    Tapa tapa = new Tapa(nom, idtapa, idbar, desc, 0, ((int) Math.random() * 10000)+1);
                    gestorClienteMovil.anadirTapa(tapa);
                    finish();
                }
            }
        });
    }
}
