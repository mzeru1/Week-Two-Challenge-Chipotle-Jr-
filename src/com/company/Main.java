package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //   ArrayList<String> rice = new ArrayList<String>();
        ArrayList<ArrayList<String>> aList = new ArrayList<ArrayList<String>>(9);
        double price = 0.0;

        ArrayList<String> rice = new ArrayList<String>();
        rice.add("white rice");
        rice.add("browen rice");
        rice.add("no rice");

        ArrayList<String> meat = new ArrayList<String>();
        String[] carni1 = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
        for (int i = 0; i < carni1.length; i++) {
            meat.add(carni1[i]);
        }

        ArrayList<String> beans = new ArrayList<String>();
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");

        ArrayList<String> salsa = new ArrayList<String>();
        String[] sauce2 = {"mild salsa","medium salsa","hot salsa","mild salsa, medium salsa, hot salsa ","no salsa"};
        for (int i = 0; i < sauce2.length; i++) {
            salsa.add(sauce2[i]);
        }
        ArrayList<String> veggies = new ArrayList<String>();
        String[] vegan3 = {"lettuce", "fajita veggies", "no veggies", "all veggies"};
        for (int i = 0; i < vegan3.length; i++) {
            veggies.add(vegan3[i]);
        }
        ArrayList<String> cheese = new ArrayList<String>();
        cheese.add("cheese");

        ArrayList<String> guac = new ArrayList<String>();
        guac.add("guac");
        guac.add("no guac");


        ArrayList<String> queso = new ArrayList<String>();
        cheese.add("no cheese");
        queso.add("queso");
        queso.add("no queso");

        ArrayList<String> sourCream = new ArrayList<String>();
        sourCream.add("sour cream");
        sourCream.add("no sour cream");


            aList.add(rice);
            aList.add(meat);
            aList.add(beans);
            aList.add(salsa);
            aList.add(veggies);
            aList.add(cheese);
            aList.add(guac);
            aList.add(queso);
            aList.add(sourCream);

        Random rand = new Random();
        int count = 0;

        for (int i = 1; i < 26; i++) {
            int randNum = rand.nextInt(5);
            ArrayList<String> order = new ArrayList<String>();

            order.add(aList.get(0).get(rand.nextInt(rice.size()))+
                    "," + aList.get(1).get(rand.nextInt(meat.size())) +
                    "," + aList.get(2).get(rand.nextInt(beans.size()))+
                    "," + aList.get(3).get(rand.nextInt(salsa.size()))+
                    "," + aList.get(4).get(rand.nextInt(veggies.size())));

            for(String eliminate:order){
                if (eliminate.contains("no")){
                    count++;
                }
                int sizes =  (5 - count);
                price = 3 + (0.5 * sizes);
                System.out.println("Burito " + i + ":" + eliminate + "\n" + "at a price of $" + price);

            }
            count = 0;

        }
    }
}