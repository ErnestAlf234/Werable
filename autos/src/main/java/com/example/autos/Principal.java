package com.example.autos;

public class Principal {
    public static void main(String[] args) {
        Auto nissan = new Auto("Nissan", "SXY", 2009);
        Auto chevrolet = new Auto("Chevrolet", "Camaro", 2004);
        Auto mercedes = new Auto("Mercedes Benz", "LK5-3", 2022);
        Auto ford = new Auto("Ford", "Cheyenne", 2009);
        Auto toyota = new Auto("Toyota", "Hiece", 2007);

        Auto[] Agencia = new Auto[5];
        Agencia[0]=nissan;
        Agencia[1]=chevrolet;
        Agencia[2]=mercedes;
        Agencia[3]=ford;
        Agencia[4]=toyota;

    }

}


