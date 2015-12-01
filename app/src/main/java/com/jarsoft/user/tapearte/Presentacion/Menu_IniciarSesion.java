package com.jarsoft.user.tapearte.Presentacion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jarsoft.user.tapearte.Dominio.Cliente.GestorClienteMovil;
import com.jarsoft.user.tapearte.R;

/**
 * Created by user on 01/12/2015.
 */
public class Menu_IniciarSesion extends Activity {

    private String user="-1";
    private String pass="-1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autenticar_poplayout);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int heigth = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (heigth * .6));

        final EditText usuario = (EditText)this.findViewById(R.id.textUsuario);
        final EditText password = (EditText)this.findViewById(R.id.textPassword);

        usuario.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                user = usuario.getText().toString();
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        password.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                pass = password.getText().toString();
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        Button OK = (Button)this.findViewById(R.id.OK);

        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!pass.equals("-1") && !user.equals("-1")) {
                    GestorClienteMovil gestorClienteMovil = new GestorClienteMovil();
                    gestorClienteMovil.autenticar(user, pass);
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra("usuario", user);
                    setResult(Activity.RESULT_OK, returnIntent);
                    finish();
                }
            }
        });

    }

}
