package com.example.autos;

public class Auto {
     private String  marca;
     private  String modelo;
     private int year;

     public Auto( String m, String mo, int y){
          marca=m;
          modelo=mo;
          year=y;

     }
     public Auto(){
          marca="Ferrari";
          modelo="SK5";
          year=2019;

     }

     @Override
     public String toString() {
          return "Auto{" +
                  "marca='" + marca + '\'' +
                  ", modelo='" + modelo + '\'' +
                  ", year=" + year +
                  '}';
     }
}

