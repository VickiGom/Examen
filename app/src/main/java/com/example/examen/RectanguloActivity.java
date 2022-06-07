package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class RectanguloActivity extends AppCompatActivity {
    private Button btnCalcular;
    private Button btnRegre;
    private TextView res;
    private TextView bas;
    private TextView alt;
    private TextView nom;
    private RadioButton are;
    private RadioButton peri;
    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        inicio();
        Intent intent = getIntent();
        String nombb = intent.getStringExtra("nombre");
        String baseee = intent.getStringExtra("base");
        String alturaaa = intent.getStringExtra("altura");
        nom.setText("Nombre: " +nombb);
        bas.setText("Base: " +baseee);
        alt.setText("Altura: "+ alturaaa);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean estado = peri.isChecked();
                boolean estado2 = are.isChecked();
                Rectangulo obg = new Rectangulo();
                obg.setAltura(Float.parseFloat(alturaaa));
                obg.setBase(Float.parseFloat(baseee));
                if(estado){
                    res.setText("Perimetro: "+String.valueOf(obg.calcularPerimetro()));

                }
                if(estado2){
                    res.setText("Area: " +String.valueOf(obg.calcularArea()));

                }

            }
        });
        btnRegre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RectanguloActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
    public void inicio(){
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        are = (RadioButton) findViewById(R.id.are);
        peri = (RadioButton) findViewById(R.id.peri);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnRegre = (Button) findViewById(R.id.btnRegre);
        res = (TextView)  findViewById(R.id.res);
        bas = (TextView)  findViewById(R.id.bas);
        alt = (TextView)  findViewById(R.id.alt);
        nom = (TextView)  findViewById(R.id.nom);

    }

}