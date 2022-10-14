package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        int count = 1;
        double xnew= 0;
        double xalt= 0;
        System.out.print("Number 1: ");
        double x = input.nextDouble();

        if(x > 0){
            while (x != 0 && x > 0){
                count++;
                System.out.print("Number "+count+": ");
               x = input.nextDouble();
                xalt = x;
                if (xalt > xnew){
                    xnew = xalt;
                }
                if (x <= 0) {
                    System.out.println("The largest number is "+ String.format("%.2f", xnew));
                }
            }

        } else {
            System.out.println("No number entered.");
        }

    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        int count = 0;
        int number = 1;

        System.out.print("n: ");
        int x = input.nextInt();

        if (x < 0){
            System.out.println("Invalid number!");
        }

        for(int i =0; i < x; i++){
            count++;
           for(int j = 0; j < count; j++ ){
               System.out.print(number++ +" ");
           }
            System.out.println();
        }

    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        final int ROW = 6;

        for (int i = 1; i<=ROW; i++){
            for (int j = i; j<ROW; j++){
                System.out.print(" ");
            }
            for (int w = 1; w <(i*2); w++ ){
                System.out.print("*");

            }
            System.out.println();
        }

    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner input = new Scanner(System.in);

        System.out.print("h: ");
        int h = input.nextInt();
        System.out.print("c: ");
        // char w = input.next().charAt(0);
        int s;

        int col = 1;
        int space = h/2;

     if(h % 2 != 0) {
         for (int i = 1; i <= h; i++) {

             for (int j = 1; j <= space; j++) {
                 System.out.print(" ");
             }
             if (i < h / 2 + 1) {
                 s = i;

                 space = space - 1;
             } else {
                 s = ((h + 1) - i);
                 space = space + 1;
             }
             for (int j = 1; j <= col; j++) {
                 int mid = (col / 2) +1;
                 System.out.print(s);

                 if (j < mid) {
                     s--;
                 } else{
                     s++;

                 }

             }
             System.out.println();
             if (i < (h / 2) + 1) {
                 col = col + 2;
             } else {
                 col = col - 2;
             }
         }
     } else {
         System.out.println("Invalid number!");
     }
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        int summe = 0;
        int count = 2;
        int count2 = 0;
        double average = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("Mark 1: ");
        int x = input.nextInt();

        if (x !=0 && x<6){
            list.add(x);
            if (x == 5){
                count2++;
            }
        }

        while(x > 0){
            System.out.print("Mark " + count +": ");
                x = input.nextInt();
                if (x < 6){
                    list.add(x);
                    count++;
                    if (x == 5){
                        count2++;
                    }
                } else {
                    System.out.println("Invalid mark!");
                }

        }

        if (x == 0){
            for(int l = 0; l < list.size(); l++){
                summe = summe + list.get(l);
                average = (double)summe / ((double)list.size() -1);

            }
            System.out.println("Average: "+ String.format("%.2f", average));
            System.out.println("Negative marks: " + count2);
        }

    }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int number = input.nextInt();
        int val;
        int ergebnis = 0;

        while(number > 4) {
            while (number > 0) {
                val = number % 10;
                ergebnis = ergebnis + (val * val);
                number = number / 10;
            }
            number = ergebnis;
            ergebnis = 0;
        }

            if (number == 1)
                System.out.println("Happy number!");
            else {
                System.out.println("Sad number!");
            }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}