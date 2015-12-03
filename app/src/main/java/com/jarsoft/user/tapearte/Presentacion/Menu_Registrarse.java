package com.jarsoft.user.tapearte.Presentacion;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jarsoft.user.tapearte.Dominio.Cliente.GestorClienteMovil;
import com.jarsoft.user.tapearte.Dominio.Cliente.GestorRegistrar;
import com.jarsoft.user.tapearte.Dominio.Cliente.Usuario;
import com.jarsoft.user.tapearte.R;

/**
 * Created by user on 02/12/2015.
 */
public class Menu_Registrarse extends Activity {
    private String user = "-1";
    private String pass = "-1";
    private String mail = "-1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrar_poplayout);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int heigth = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (heigth * .6));

        final EditText usuario = (EditText) this.findViewById(R.id.textUsuario);
        final EditText email = (EditText) this.findViewById(R.id.textEmail);
        final EditText password = (EditText) this.findViewById(R.id.textPassword);

        usuario.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                user = usuario.getText().toString();
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mail = email.getText().toString();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

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

        Button OK = (Button) this.findViewById(R.id.OK);

        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!pass.equals("-1") && !user.equals("-1") && !mail.equals("-1")) {
                    GestorClienteMovil gestorClienteMovil = new GestorClienteMovil();
                    gestorClienteMovil.registrarse(user, pass, mail);
//                    Intent returnIntent = new Intent();
//                    returnIntent.putExtra("usuario", user);
//                    setResult(Activity.RESULT_OK, returnIntent);
                    finish();
                }
            }
        });

    }

}
