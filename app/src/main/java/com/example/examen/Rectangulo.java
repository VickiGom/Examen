package com.example.examen;

import java.io.Serializable;

public class Rectangulo implements Serializable {
    private float base;
    private float altura;

    public Rectangulo() {

    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float calcularArea(){
            return ((this.base*this.altura));
    }           //❤🐺🌙
    public float calcularPerimetro(){
     return ((this.base*2)+(this.altura*2));
    }//Lobo solitario
                                                                                //Awooooooooooooooooo
}
