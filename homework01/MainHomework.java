package lesson01.homework;


import java.util.ArrayList;
import java.util.Arrays;

public class MainHomework {
    public static void main(String[] args) {
//        String[] stringArray = {"one", "two", "three", "four", "five"};
//        //проверка метода arrayChange
//        arrayChange(stringArray, 0, 4);
//        //проверка метода arrayToArraylist
//        arrayToArraylist(stringArray);

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox = new Box<>();

        orangeBox.put(new Orange(), 10);
        appleBox.put(new Apple(), 15);

        orangeBox.getWeight(new Orange());
        appleBox.getWeight(new Apple());

        orangeBox.setBoxWeight(orangeBox.getWeight(new Orange()));
        appleBox.setBoxWeight(appleBox.getWeight(new Apple()));

        System.out.println(orangeBox.compare(appleBox));
        System.out.println("=============================================");


        System.out.println("До пересыпания: ");
        System.out.println("Первая коробка: " + orangeBox.arrayList);
        System.out.println("Вторая коробка: " + orangeBox1.arrayList);
        System.out.println("=============================================");
        orangeBox.pourItOver(orangeBox1);
        System.out.println("После пересыпания: ");
        System.out.println("Первая коробка: " + orangeBox.arrayList);
        System.out.println("Вторая коробка: " + orangeBox1.arrayList);


    }

    //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static void arrayChange(String[] arr, int i, int j) {
        System.out.println("Первоначальный массив: " + Arrays.toString(arr));
        String str = arr[i];
        arr[i] = arr[j];
        arr[j] = str;
        System.out.println("Измененный массив: " + Arrays.toString(arr));
    }

    //2. Написать метод, который преобразует массив в ArrayList;
    public static void arrayToArraylist(Object[] arr) {
        ArrayList<Object> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);
    }


}
