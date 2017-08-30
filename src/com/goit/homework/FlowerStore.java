package com.goit.homework;

public class FlowerStore {

    static int i;

    public static  Flowers[] sell(int RoseCount,int ChamomileCount, int TulipCount){

        Flowers[] flowers_arr = new Flowers[RoseCount+ChamomileCount+TulipCount];

        for(int i =0;i<RoseCount;i++){
            flowers_arr[i]=new rose();
        }

        for(int i = RoseCount;i<RoseCount+ChamomileCount;i++){
            flowers_arr[i]=new chamomile();
        }

        for(int i = RoseCount+ChamomileCount;i<RoseCount+ChamomileCount+TulipCount;i++){
            flowers_arr[i]=new tulip();
        }

        return flowers_arr;
    }

    public static int IPlusOne(){
        return i++;
    }

    public static int CountMinusOne(int count){
        return count-1;
    }
  // Кошелёк
    static private int vallet = 0;
    
    static int setVallet(int cost){
    	return vallet = vallet +cost;
    }
    
    static void showVallet(){
    	System.out.println(vallet);
    }
    
    public static Flowers[] sellSequence(int RoseCount,int ChamomileCount, int TulipCount){

        Flowers[] flowers_arr = new Flowers[RoseCount+ChamomileCount+TulipCount];

        for(i=0;i<flowers_arr.length;){

            if (RoseCount>0){
                flowers_arr[i]=new rose();
                CountMinusOne(RoseCount);
                IPlusOne();
                setVallet(rose.cost);
                //showVallet();
            }

            if (ChamomileCount>0){
                flowers_arr[i]=new chamomile();
                CountMinusOne(ChamomileCount);
                IPlusOne();
                setVallet(chamomile.cost);
               // showVallet();
            }

            if (TulipCount>0){
                flowers_arr[i]=new tulip();
                CountMinusOne(TulipCount);
                IPlusOne();
                setVallet(tulip.cost);
               // showVallet();
            }

        }

        return flowers_arr;
    }
   
    
}