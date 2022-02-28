package com.company;

import java.util.Objects;

public class Cachorro extends  Lobo{

   @Override
    public void emitirSom() {
       System.out.println("errrrrrrrrrrrrrrrrr");
    }

    public void reagir (String frase){ //sobrecarga nomes iguais, com parametros diferentes quantidadee tipo

        if ( frase.equals("toma comida") || Objects.equals(frase, "Olá")){

            System.out.println("abanar e latir");


        }else{
            System.out.println("Rosnar");

        }
    }
    public void reagir (int hora, int min){

     if (hora < 12){

         System.out.println("abanar");
     }else if (hora >= 18){

         System.out.println("ignorar");
     }else{
            System.out.println("abanar e latir");
        }
    }public void reagir (boolean dono){
    if (dono) {
        //true
        System.out.println("abanar");
    }else{
        System.out.println("Rosnar e latir");
        emitirSom();
    }

    }public void reagir (int idade, float peso){
        if (idade < 5) {
            if (peso <10){
                System.out.println("Abanar");
            }else {
                System.out.println("latir");
            }

        }else{
            if(peso <10 ){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }


    }/*public void reagir (/*float i , int s){ // parametros podem ser declarados diferente.


    //}*/

}
