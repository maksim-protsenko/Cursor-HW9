package com.company;

public class Main {
   static String mainString = "-Еh bien, mon prince. Gênes et Lucques ne sont plus que des apanages, des поместья, de la famille Buonaparte. Non, je vous préviens, que si vous ne me dites pas, que nous avons la guerre, si vous vous permettez encore de pallier toutes les infamies, toutes les atrocités de cet Antichrist (ma parole, j'y crois) — je ne vous connais plus, vous n'êtes plus mon ami, vous n'êtes plus мой верный раб, comme vous dites.";

 public static String recursionFunction(String mainString) {
     String substring = mainString.concat(mainString.substring(1));
     return recursionFunction(substring);
 }
    public static void main(String[] args) {
        recursionFunction(mainString);
    }
}

