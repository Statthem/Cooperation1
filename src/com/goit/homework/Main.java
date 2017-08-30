package com.goit.homework;

public class Main {
    public static void main(String[] args) {
        //Flowers[] ArrTmp= FlowerStore.sell(2,2,2);


        for(Flowers ArrElement:FlowerStore.sellSequence(3,3,3)) {
            ArrElement.show();
        }



    }
}