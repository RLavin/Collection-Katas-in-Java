package com.ironyard;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Raul on 10/18/16.
 */
public class main {
    public static void main(String[] args){
        testfirstLast6Example();
        testfirstLast6Example2();
        testfirstLast6Example3();
        testsameFirstLastExample();
        testsameFirstLastExample2();
        testsameFirstLastExample3();
        testrotateLeftExample();
        testrotateLeftExample2();
        testrotateLeftExample3();
        testreverse3Example();
        testreverse3Example2();
        testreverse3Example3();
        testsumFirstPenultimateExample();
        testsumFirstPenultimateExample2();
        testsumFirstPenultimateExample3();
        testsumFirstPenultimateExample4();
        testmapBullyExample();
        testmapBullyExample2();
        testmapBullyExample3();
        testmapShareExample();
        testmapShareExample2();
        testmapShareExample3();
        testmapABExample();
        testmapABExample2();
        testmapABExample3();
        testwordLenExample();
        testwordLenExample2();
        testwordLenExample3();
        testindexwordsExample();
        testindexwordsExample2();
        testindexwordsExample3();


    }

    private static void testfirstLast6Example() {
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(2);
        x.add(6);

        boolean result = katas.FirstLast6(x);


        System.out.printf("firstLast6(%s) -> %s\n", x, result);
    }

    private static void testfirstLast6Example2() {
        ArrayList<Integer> w = new ArrayList<Integer>();
        w.add(6);
        w.add(1);
        w.add(2);
        w.add(3);

        boolean y = katas.FirstLast6(w);


        System.out.printf("firstLast6(%s) -> %s\n", w, y);
    }

    private static void testfirstLast6Example3() {

        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(13);
        b.add(6);
        b.add(1);
        b.add(2);
        b.add(3);

        boolean a = katas.FirstLast6(b);


        System.out.printf("firstLast6(%s) -> %s\n", b, a);
    }

    private static void testsameFirstLastExample() {
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);

        boolean a = katas.sameFirstLast(c);


        System.out.printf("sameFirstLast(%s) -> %s\n", c, a);


    }

    private static void testsameFirstLastExample2() {
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(1);

        boolean a = katas.sameFirstLast(b);


        System.out.printf("sameFirstLast(%s) -> %s\n", b, a);


    }

    private static void testsameFirstLastExample3() {
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(1);
        b.add(2);
        b.add(1);

        boolean a = katas.sameFirstLast(b);


        System.out.printf("sameFirstLast(%s) -> %s\n", b, a);


    }

    private static void testrotateLeftExample() {

        List<Integer> j = new ArrayList<Integer>();
        j.add(1);
        j.add(2);
        j.add(3);
        List<Integer> x = new ArrayList<Integer>(j);
        katas.rotateLeft3(j);

        System.out.printf("rotateLeft3(%s) -> %s\n", x, j);





    }

    private static void testrotateLeftExample2() {

        List<Integer> j = new ArrayList<Integer>();
        j.add(5);
        j.add(11);
        j.add(9);
        List<Integer> x = new ArrayList<Integer>(j);
        katas.rotateLeft3(j);

        System.out.printf("rotateLeft3(%s) -> %s\n", x, j);


    }
    private static void testrotateLeftExample3() {

        List<Integer> j = new ArrayList<Integer>();
        j.add(7);
        j.add(0);
        j.add(0);
        List<Integer> x = new ArrayList<Integer>(j);
        katas.rotateLeft3(j);

        System.out.printf("rotateLeft3(%s) -> %s\n", x, j);

    }
    private static void testreverse3Example(){
        List<Integer> a = new ArrayList<Integer>() ;
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> x = new ArrayList<Integer>(a);
        Collections.reverse(a);
        System.out.printf("reverse3(%s) -> %s\n", x, a);

     }

     private static void testreverse3Example2(){
        List<Integer> a = new ArrayList<Integer>() ;
        a.add(5);
        a.add(11);
        a.add(9);
        List<Integer> x = new ArrayList<Integer>(a);
        Collections.reverse(a);
        System.out.printf("reverse3(%s) -> %s\n", x, a);
    }

    private static void testreverse3Example3(){
        List<Integer> a = new ArrayList<Integer>() ;
        a.add(7);
        a.add(0);
        a.add(0);
        List<Integer> x = new ArrayList<Integer>(a);
        Collections.reverse(a);
        System.out.printf("reverse3(%s) -> %s\n", x, a);
    }

    private static void testsumFirstPenultimateExample(){
        List<Integer> j = new ArrayList<Integer>();
        j.add(1);
        j.add(2);
        j.add(3);
        List<Integer> x = new ArrayList<Integer>(j);
      int a = katas.sumFirstPenultimate(j);

        System.out.printf("sumFirstPenultimate(%s) -> %s\n", x, a);

    }

    private static void testsumFirstPenultimateExample2(){
        List<Integer> j = new ArrayList<Integer>();
        j.add(1);
        j.add(1);
        List<Integer> x = new ArrayList<Integer>(j);
        int a = katas.sumFirstPenultimate(j);

        System.out.printf("sumFirstPenultimate(%s) -> %s\n", x, a);

    }

    private static void testsumFirstPenultimateExample3() {
        List<Integer> j = new ArrayList<Integer>();
        j.add(1);
        j.add(1);
        j.add(1);
        j.add(1);
        List<Integer> x = new ArrayList<Integer>(j);
        int a = katas.sumFirstPenultimate(j);

        System.out.printf("sumFirstPenultimate(%s) -> %s\n", x, a);
    }


    private static void testsumFirstPenultimateExample4() {
        List<Integer> j = new ArrayList<Integer>();
        j.add(1);
        j.add(2);
        j.add(3);
        j.add(4);
        List<Integer> x = new ArrayList<Integer>(j);
        int a = katas.sumFirstPenultimate(j);

        System.out.printf("sumFirstPenultimate(%s) -> %s\n", x, a);
    }

    private static void testmapBullyExample(){
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "dirt");
        data.put("a", "candy");
        Object x = data.clone();
        katas.mapBully(data);


        System.out.printf("mapBully(%s) -> %s\n", x, data);
    }

    private static void testmapBullyExample2(){
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "candy");
        Object x = data.clone();
        katas.mapBully(data);


        System.out.printf("mapBully(%s) -> %s\n", x, data);
    }

    private static void testmapBullyExample3(){
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "carrot");
        data.put("c", "meh");
        data.put("a", "candy");
        Object x = data.clone();
        katas.mapBully(data);

        System.out.printf("mapBully(%s) -> %s\n", x, data);
    }

    private static void testmapShareExample(){
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "bbb");
        data.put("c", "ccc");
        data.put("a", "aaa");
        Object x = data.clone();
        katas.mapShare(data);


        System.out.printf("mapShare(%s) -> %s\n", x, data);
    }

    private static void testmapShareExample2(){
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "xyz");
        data.put("c", "ccc");
        Object x = data.clone();
        katas.mapShare(data);

        System.out.printf("mapShare(%s) -> %s\n", x, data);

    }

    private static void testmapShareExample3(){
        HashMap<String, String> data = new HashMap<>();
        data.put("d", "hi");
        data.put("c", "meh");
        data.put("a", "aaa");
        Object x = data.clone();
        katas.mapShare(data);

        System.out.printf("mapShare(%s) -> %s\n", x, data);
    }

    private static void testmapABExample(){
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "There");
        data.put("a", "Hi");
        Object x = data.clone();
        katas.mapAB(data);

        System.out.printf("mapAB(%s) -> %s\n", x, data);
    }

    private static void testmapABExample2(){
        HashMap<String, String> data = new HashMap<>();
        data.put("a", "Hi");
        Object x = data.clone();
        katas.mapAB(data);

        System.out.printf("mapAB(%s) -> %s\n", x, data);
    }

    private static void testmapABExample3(){
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "There");
        Object x = data.clone();
        katas.mapAB(data);

        System.out.printf("mapAB(%s) -> %s\n", x, data);
    }

    private static void testwordLenExample(){

        String[] tmp = new String[]{"a", "bb", "a", "bb"};
        String[] saved = tmp.clone();

        Map<String, Integer> data =  katas.wordLen(tmp);

        System.out.println("wordLen(\"" + Arrays.toString(saved) + "\") -> (\""+(data)+"\")");

    }


    private static void testwordLenExample2(){

        String[] tmp = new String[]{"this", "and", "that", "and"};
        String[] saved = tmp.clone();
        Map<String, Integer> data =  katas.wordLen(tmp);

        System.out.println("wordLen(\"" + Arrays.toString(saved) + "\") -> (\""+(data)+"\")");
    }

    private static void testwordLenExample3(){

        String[] tmp = new String[]{"code", "code", "code", "bug"};
        String[] saved = tmp.clone();
        Map<String, Integer> data =  katas.wordLen(tmp);

        System.out.println("wordLen(\"" + Arrays.toString(saved) + "\") -> (\""+(data)+"\")");
    }


    private static void testindexwordsExample(){
        ArrayList<String>  data = new ArrayList<>();
        data.add("aardvark");
        data.add("apple");
        data.add("zamboni");
        data.add("phone");
        ArrayList<String>  saved = (ArrayList<String>) data.clone();

        Map<String, List>  stringList =katas.indexwords(data);
        System.out.printf("IndexWords(%s) -> %s\n", saved, stringList);

    }

    private static void testindexwordsExample2(){
        ArrayList<String>  data = new ArrayList<>();
        data.add("elephant");
        ArrayList<String>  saved = (ArrayList<String>) data.clone();

        Map<String, List>  stringList =katas.indexwords(data);
        System.out.printf("IndexWords(%s) -> %s\n", saved, stringList);

    }

    private static void testindexwordsExample3(){
        ArrayList<String>  data = new ArrayList<>();
        data.add("");
        ArrayList<String>  saved = (ArrayList<String>) data.clone();

        Map<String, List>  stringList =katas.indexwords(data);
        System.out.printf("IndexWords(%s) -> %s\n", saved, stringList);

    }


}
