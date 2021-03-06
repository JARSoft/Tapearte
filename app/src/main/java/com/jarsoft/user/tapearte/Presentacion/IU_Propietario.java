package com.jarsoft.user.tapearte.Presentacion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jarsoft.user.tapearte.Presentacion.Anadir_tapa;
import com.jarsoft.user.tapearte.Presentacion.Eliminar_tapa;
import com.jarsoft.user.tapearte.R;

/**
 * Created by user on 04/12/2015.
 */
public class IU_Propietario extends Activity implements View.OnClickListener {

    private Button anadir, modifiar, eliminar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interfaz_inicial_propietario);

        anadir = (Button) findViewById(R.id.anadir);
        anadir.setOnClickListener(this);
        eliminar = (Button) findViewById(R.id.eliminar);
        eliminar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.anadir:
                startActivity(new Intent(this, Anadir_tapa.class));
                break;
            case R.id.eliminar:
                startActivity(new Intent(this, Eliminar_tapa.class));
                break;
        }
    }
}
