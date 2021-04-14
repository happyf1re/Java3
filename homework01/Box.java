package lesson01.homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private T obj;

    public float getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(float boxWeight) {
        this.boxWeight = boxWeight;
    }

    private float boxWeight;
    //c. Для хранения фруктов внутри коробки можете использовать ArrayList;
    ArrayList<T> arrayList = new ArrayList<>();


    //g. Не забываем про метод добавления фрукта в коробку.
    public void put(T obj, int quantity) {
        System.out.println("Кладём " + quantity + " " + obj + " в коробку");
        for (int i = 0; i < quantity; i++) {
            arrayList.add(obj);
        }
        System.out.println(arrayList);
        System.out.println("=============================");
    }

    //d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов
    // и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
    public float getWeight(T obj) {
        float boxWeight;
        float fruitWeight = obj.weight();
        boxWeight = fruitWeight * (float) arrayList.size();
//        System.out.println(boxWeight);
        return boxWeight;
    }

    //более удачный метод без параметра, не придётся использовать геттер и сеттер
    public float getWeight2() {
        float boxWeight = 0f;
        for (T o : arrayList) {
            boxWeight += o.weight();
        }
        return boxWeight;
    }

    //e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую
    // коробку с той, которую подадут в compare в качестве параметра, true - если их веса
    // равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками
    // с апельсинами);
    public boolean compare(Box<?> box) {
        return getBoxWeight() == box.getBoxWeight();
    }


    //метод compare с использованием getWeight2
    public boolean compare2(Box box) {
        return getWeight2() == box.getWeight2();
    }

    // f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
    // (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно
    // в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
    public void pourItOver(Box<T> box) {
        box.arrayList.addAll(arrayList);
        arrayList.clear();
    }
}
