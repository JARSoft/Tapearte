package com.jarsoft.user.tapearte.Presentacion;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jarsoft.user.tapearte.R;

/**
 * Created by user on 29/11/2015.
 */
public class Menu_Votar extends Activity implements View.OnClickListener  {

    private Button introducirCodigo, puntuar, button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.votando);

//        introducirCodigo = (Button) findViewById(R.id.introducirCodigo);
//        puntuar = (Button) findViewById(R.id.puntuar);
        button = (Button) findViewById(R.id.button);

//        introducirCodigo.setOnClickListener(this);
//        puntuar.setOnClickListener(this);
        button.setOnClickListener(this);

    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button: {
                finish();
                break;
            }
        }

    }
}
