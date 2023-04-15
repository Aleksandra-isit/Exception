import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(method1(4, 24, 5));
        System.out.println(method2("erieor", 2));
        //method3(null);
        printArray(task2(new int[] {12, 10, 8}, new int[] {24, 5, 7}));
        printArray(task3(new int[] {24, 0, 8}, new int[] {5, 0, 7}));

    }
    //проверка на отрицательный дискриминант
    public static int method1(int a, int b, int c) throws Exception {
        int D = b*b - 4*a*c;
        if (D < 0){
            throw new ArithmeticException("Отрицательный дискриминант");
        }
        return D;
    }
    //вывод символа строки
    public static char method2(String str, int index) throws Exception {
        if (index > str.length()-1){
            throw new IndexOutOfBoundsException("Символа с таким индексом не существует");
        }
        return str.charAt(index);
    }
    //вывод массива
    public static void method3(int[] arr) throws Exception {
        if (arr == null){
            throw new NullPointerException("Массива не существует");
        }
        int i = 0, k = arr.length;
        for(i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращающий новый массив, каждый элемент которого равен разности элементов
    // двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
    // как-то оповестить пользователя.
    public static int[] task2(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны. Увы и ах, ловите exception :(");
        }

        int[] res = new int[arr1.length];
        int i = 0, k = res.length;
        for (; i < k; i++){
            res[i] = arr1[i] - arr2[i];
        }
        return res;
    }
    public static void printArray(int[] arr){
        int i = 0, k = arr.length;
        for (; i < k;  i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращающий новый массив, каждый элемент которого равен частному элементов
    // двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
    // как-то оповестить пользователя.
    public static int[] task3(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны. Увы и ах, ловите exception :(");
        }
        int[] res = new int[arr1.length];
        int i = 0, k = res.length;
        for (; i < k; i++){
            if (arr2[i] == 0){
                throw new RuntimeException("Ай-ай-ай! На ноль делить нельзя!");
            }
            res[i] = arr1[i] / arr2[i];
        }
        return res;
    }
}