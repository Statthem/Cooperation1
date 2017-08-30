package com.goit.homework;

import java.io.FileWriter;
import java.io.IOException;

public class FlowersLoader {

    public static void writeToFile(String FileName){

        Flowers[] flowers_arr = FlowerStore.sell(3,3,3);

        try{
            FileWriter fileWriter = new FileWriter(FileName); 
            fileWriter.write(""+flowers_arr.length+"\n");
           
            
            
            for(Flowers ArrElement:flowers_arr) {
                if(ArrElement instanceof rose){fileWriter.write(""+ "роза ");}
                if(ArrElement instanceof chamomile){fileWriter.write(""+ "ромашка ");}
                if(ArrElement instanceof tulip){fileWriter.write(""+ "тюльпан ");}

                fileWriter.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}