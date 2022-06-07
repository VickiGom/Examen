package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSalir;
    private Button btnSiguiente;
    private Button btnLimpiar;
    private EditText txtNombre;
    private EditText txtBase;
    private EditText txtAltura;
    Rectangulo obj = new Rectangulo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar();
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salir();
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNombre.setText("");
                txtAltura.setText("");
                txtBase.setText("");
            }
        });
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNombre.getText().toString().matches("") || txtAltura.getText().toString().matches("") || txtBase.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this, "Falto capturar informacion",Toast.LENGTH_SHORT).show();

                }else{
                    String nom = txtNombre.getText().toString();
                    String base = txtBase.getText().toString();
                    String altura = txtAltura.getText().toString();
                    Intent intent = new Intent(MainActivity.this,RectanguloActivity.class);
                    //startActivityForResult(intent, 0);
                    intent.putExtra("nombre",nom);
                    intent.putExtra("base", base);
                    intent.putExtra("altura", altura);
                    startActivity(intent);



                }


            }
        });

    }

    public void iniciar(){

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtBase = (EditText) findViewById(R.id.txtBase);
        txtAltura = (EditText) findViewById(R.id.txtAltura);
        btnSalir = (Button) findViewById(R.id.btnSalir);
        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);


    }
    public void salir(){
        AlertDialog.Builder confirmar = new AlertDialog.Builder(this);
        confirmar.setTitle("Cerrar app");
        confirmar.setMessage("¿Seguro que quieres cerrar la app?");
        confirmar.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finishAffinity();
            }
        });
        confirmar.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        confirmar.show();

    }
}