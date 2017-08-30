package com.goit.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FlowersSaver {
	
	public static String[] divide(String s) {
        ArrayList<String> tmp = new ArrayList<String>();
        int i = 0;
        boolean f = false;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == ' ') {
                if (j > i) {
                    tmp.add(s.substring(i, j));
                }
                i = j + 1;
            }
        }
        if (i < s.length()) {
            tmp.add(s.substring(i));
        }
        return tmp.toArray(new String[tmp.size()]);
    }

    public static Flowers[] readOfFile(String FileName){

      

    	  try{
            FileReader fileReader = new FileReader(FileName);
            BufferedReader br = new BufferedReader(fileReader);
            
            String line1 = br.readLine();
            String line2 = br.readLine();
            
            int arraySize = Integer.parseInt(line1);
            
            Flowers[] flowers_arr = new Flowers[arraySize];
            

            String[] lines = divide(line2);
            
            for(int i=0;i<flowers_arr.length;i++){
            for(String ArrElement:lines) {
               
                if(ArrElement.equals("тюльпан")) flowers_arr[i] = new tulip()  ;
                if(ArrElement.equals("ромашка")) flowers_arr[i] = new chamomile()  ;
                if(ArrElement.equals("роза")) flowers_arr[i] = new rose()  ;
            }
    	  }
             return flowers_arr;
        }catch (Exception e){
            e.printStackTrace();
        } 
    	  return null;
    	  
    }
}

