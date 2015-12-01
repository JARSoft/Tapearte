package com.jarsoft.user.tapearte.Presentacion;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.jarsoft.user.tapearte.Dominio.Cliente.GestorClienteMovil;
import com.jarsoft.user.tapearte.R;

/**
 * Created by user on 29/11/2015.
 */
public class IU_Movil extends Activity implements View.OnClickListener{

    private Button opciones, votar;
    private TextView userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interfaz_inicial);

        opciones = (Button) findViewById(R.id.Opciones);
        votar = (Button) findViewById(R.id.Votar);
        userID = (TextView) findViewById(R.id.UserID);

        opciones.setOnClickListener(this);
        votar.setOnClickListener(this);

    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onClick(View view) {
        final GestorClienteMovil gestorClienteMovil = new GestorClienteMovil();

        switch (view.getId()) {
            case R.id.Votar: {
                System.out.println("Menu_Votar");

/*cosas de cliente*/
//                //prueba de componentes
//                ArrayList<String> componentes= new ArrayList<String>();
//                componentes.add("Usuario");componentes.add("Contraseña");
//                //Prueba de servidor
//                SocketMovil.realizarPeticion(componentes, 0);
//                System.out.println("Exito!");

                getFragmentManager().beginTransaction().
                        add(R.id.container, Menu_Votar.newInstance())
                        .commit();
//                getFragmentManager().beginTransaction()
//                        .replace(R.id.container, Menu_Votar.newInstance())
//                        .commit();
                break;
            }
            case R.id.Opciones:{
                System.out.println("Mostrar opciones");
                PopupMenu popupMenu = new PopupMenu(this, view);
                popupMenu.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.registrarse:
                                return true;
                            case R.id.iniciar_sesion:
                                Intent i = new Intent(IU_Movil.this, Menu_IniciarSesion.class);
                                startActivityForResult(i, 2);

                                return true;
                            case R.id.otra_cosa:

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

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 2) {
            if(resultCode == Activity.RESULT_OK){
                userID.setText(data.getStringExtra("usuario"), TextView.BufferType.EDITABLE);
                userID.setVisibility(View.VISIBLE);
                userID.setTextColor(Color.CYAN);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }

}