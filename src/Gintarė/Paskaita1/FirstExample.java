package Gintarė.Paskaita1;

import java.util.Scanner;

public class FirstExample {

    public static void main(String[] args) {
        System.out.println("Hi, Gintarė");
        FirstExampleSupportClass example = new FirstExampleSupportClass();
        example.sayHi();

        int sum = example.sum(10, 20);
            System.out.println(example.sum(10, 20));
            System.out.println(sum);

        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a number");
        int insertedNum = scanner.nextInt();
       System.out.println("Inserted number >>" + insertedNum);


        example.userName(scanner);

       int minus = example.minus(20,10);
       System.out.println("atimtis " + minus);


    }


}

class FirstExampleSupportClass

        public void sayHi() {
        };

        public void userName(Scanner sc){
        System.out.println("Please insert Your name");
        String name = sc.next();
        System.out.println(" Hi " + name);
        userName(name);
        }


    public void sayHi(){
        System.out.println("Labas");
    }

    public int sum(int firstNum, int secondNum);
        return firstNum + secondNum;


    public int sum(int firstNum, int secondNum, int firdNum)
        return firstNum + secondNum + firdNum;


    public void userName (String gg);
        int name = gg.length();
        System.out.println("ilgis yra "+ name);


    public float sum (float firstNum, float secondNum) {
        float aa = 2.4f;
        return firstNum + secondNum;
    }


    public int minus (int firstNum, int secondNum) {
        return firstNum - secondNum;

    }
}