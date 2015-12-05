package com.jarsoft.user.tapearte.Presentacion;

import android.app.Activity;
import android.content.Intent;
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
public class IU_Movil extends Activity implements View.OnClickListener {

    private Button opciones, votar;
    private TextView userID;
    private static String userText;

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
/*cosas de cliente*/
//                //prueba de componentes
//                ArrayList<String> componentes= new ArrayList<String>();
//                componentes.add("Usuario");componentes.add("Contraseña");
//                //Prueba de servidor
//                SocketMovil.realizarPeticion(componentes, 0);
//                System.out.println("Exito!");

                startActivity(new Intent(this, Menu_Votar.class));
//                getFragmentManager().beginTransaction()
//                        .replace(R.id.container, Menu_Votar.newInstance())
//                        .commit();
                break;
            }
            case R.id.Opciones: {
                PopupMenu popupMenu = new PopupMenu(this, view);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.registrarse:
                                startActivity(new Intent(IU_Movil.this, Menu_Registrarse.class));
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
            if (resultCode == Activity.RESULT_OK) {
                if (data.getStringExtra("usuario").equals("cliente"))
                    startActivity(new Intent(this, Tabs.class));
                else
                    startActivity(new Intent(this, IU_Propietario.class));
                finish();

            }
//            if (resultCode == Activity.RESULT_CANCELED) {
//            }
        }
    }

    public String getUserID() {
        return userText;
    }

}
