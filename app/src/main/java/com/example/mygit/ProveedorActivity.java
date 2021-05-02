package com.example.mygit;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.MenuItem;


public class ProveedorActivity extends AppCompatActivity {


    EditText txtApellido, txtNombre, txtCorreo, txtDireccion, txtTelefono, txtPais, txtDni;
    private Bundle savedInstanceState;
    Button btnEnviar;


    @Override
protected void onCreate (Bundle saveInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_proveedor);
    txtNombre = findViewById(R.id.idTextNombre);
    txtApellido = findViewById(R.id.idTextApellido);
    txtDni = findViewById(R.id.idTextDni);
    txtDireccion = findViewById(R.id.idTextDireccion;
    txtCorreo = findViewById(R.id.idTextCorreo);
    txtTelefono = findViewById(R.id.idTextTelefono;
    txtPais = findViewById(R.id.idTextPais);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = txtNombre.getText().toString();
                String ape = txtApellido.getText().toString();
                String dni = txtDni.getText().toString();
                String dir = txtDireccion.getText().toString();
                String cor = txtCorreo.getText().toString();
                String tel = txtTelefono.getText().toString();
                String pai = txtPais.getText().toString();

                if (nom == 0){
                    mensaje("El nombre es obligatorio");
                    txtNombre.requestFocus();
                }else if (ape == 0){
                    mensaje("El apellido es obligatorio");
                    txtApellido.requestFocus();
                } else if (dni == 0){
                mensaje("El DNI es de 8 carateres);
                        txtDni.requestFocus();

            }else if (dir == 0){
                mensaje("La dirección es de 2 a 50 caracteres");
                    txtDireccion.requestFocus();
        }else if (cor == 0){
            mensaje("El correo es obligatorio);
                    txtCorreo.requestFocus();
                }else if (tel == 0){
                    mensaje("El correo es de 2 a 50 caracteres");
                    txtTelefono.requestFocus();
                }else if (pai == 0){
                mensaje("El Pais es obligatorio");
                    txtPais.requestFocus();
            }else{
                    String msg = "Los datos ingresados";
                    msg+="Nombre" + nom + "\n";
                    msg+="Apellido" + ape + "\n";
                    msg+="Dni" + dni + "\n";
                    msg+="Direccion" + dir + "\n";
                    msg+="Correo" + cor + "\n";
                    msg+="Telefono" + tel + "\n";
                    msg+="Pais" + pai + "\n";
                
                    mostrarMensaje(msg);
                }
                

            }
        });
}

    private void mostrarMensaje(String msg) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage(msg);
        alertDialog.setCancelable(true);
        alertDialog.show();

    }

    void mensaje(String mensaje){
    Toast toast = Toast.makeText(getApplicationContext(),mensaje, Toast.LENGTH_LONG)
            Toast1.show();
}
@Override
public boolean onCreateOptionMenu(Menu menu){
getMenuInflater().inflate(R.menu.menu_activity, menu);
return true;

}
@Override
    public boolean onOptionItemSelected(@NonNull MenuItem item)
{
    int id = item.getItemId();
    if (id == R.id.idProveedor){
        Intent intent = new Intent(this, ProveedorActivity.class);
        startActivity(intent);
        return true;

    }
        if (id == R.id.idProveedor){
            Intent intent = new Intent(this, ProveedorActivity.class);
            startActivity(intent);
            return true;
    }


}
