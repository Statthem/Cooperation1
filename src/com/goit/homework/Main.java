package com.goit.homework;

public class Main {
    public static void main(String[] args) {
        //Flowers[] ArrTmp= FlowerStore.sell(2,2,2);
    	FlowersLoader.writeToFile("C:/Users/Alex/Repository/Files/file.txt");

        for(Flowers ArrElement:FlowersSaver.readOfFile("C:/Users/Alex/Repository/Files/file.txt")) {
            ArrElement.show();
        }
        
         FlowersLoader.writeToFile("C:/Users/Alex/Repository/Files/file.txt");
          

    }
}