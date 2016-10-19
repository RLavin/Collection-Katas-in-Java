package com.ironyard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Raul on 10/18/16.
 */
public class katas {

    public static boolean FirstLast6(List<Integer> x){

        if(x.get(0)==6 || x.get(x.size()-1)==6) {
            return true;
        }
        else{

            return false;
        }

    }
    public static boolean sameFirstLast(List<Integer> y){

        if (y.size() >= 1 && y.get(0) == y.get(y.size() -1)){
            return true;
        }
        else{
            return false;
        }
    }


    public static void rotateLeft3(List<Integer> g) {

        // remove
        int b = g.remove(0);
        // add at position
        g.add(2, b);
    }


    public static int sumFirstPenultimate(List<Integer>numb) {
        int x = 0;
        if (numb.size() >= 2) {
            int firstElement = numb.get(0);
            int secondToLast = numb.get(numb.size() - 2);

            x = firstElement + secondToLast;
        } else {
            x =numb.get(0) + numb.get(1);
        }

         return x;

    }
    public static void mapBully(HashMap<String,String> data){

        String x = data.get("a");
        data.put("b", x);
        data.put("a", "\" \"");

    }
    public static Map mapShare(HashMap<String,String> data) {

        if (data.containsKey("a")) {
            String x = data.get("a");
            data.put("b", x);
        }

        data.remove("c");

        return data;
    }

    public static Map mapAB(HashMap<String,String> data){
         if (data.containsKey("a") && data.containsKey("b")) {
            String x = data.get("a") + data.get("b");
            data.put("ab", x);
        }
         return data;


    }

        public static Map<String, Integer> wordLen(String[] strings) {
            Map<String, Integer> map = new HashMap();
            for (String s:strings){
                map.put(s, s.length());
            }
            return map;
        }



}
