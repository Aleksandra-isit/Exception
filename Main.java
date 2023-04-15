import javax.imageio.IIOException;
import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task_1();
//        int[] arr = {1, 2, 3};
//        task_2(arr, 0);
//        task_3();
        System.out.println(task_4());
    }

    public static float task_1(){
        float input = 0;
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.print("Input a number: ");
            try {
                input = Float.parseFloat(in.next());
                System.out.println(input);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод");
            }
        }
        return input;
    }
    public static void task_2(int[] intArray, int index){
        try{
            if (index > intArray.length){
                throw new RuntimeException("Индекс вне диапазона");
            }
            int d = 0;
            try {
                double catchedRes1 = intArray[index] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.out.println("Catching exception: " + e);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void task_3(){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    public static String task_4(){
        String input = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input a string: ");
        try {
            input = reader.readLine();
            if (input.equals("")){
                throw  new RuntimeException("Пустые строки вводить нельзя!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return input;
    }

}