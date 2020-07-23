package HW8;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        long startTimeP = System.currentTimeMillis();
        LinkedList<Person> personLinkedList = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            Person person = new Person(RandomString.random(r.nextInt(15) + 1), RandomString.random(r.nextInt(15) + 1));
            personLinkedList.add(person);
        }
        long stopTimeP = System.currentTimeMillis();
        long elapsedTimeP = stopTimeP - startTimeP;// 5785 ms

        long startTimeA = System.currentTimeMillis();
        ArrayList <Animal> animalArrayList = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            Animal animal = new Animal(r.nextInt(15) + 1, RandomString.random(r.nextInt(15) + 1));
            animalArrayList.add(animal);
        }
        long stopTimeA = System.currentTimeMillis();
        long elapsedTimeA = stopTimeA - startTimeA;// 4100 ms


        Collections.sort(personLinkedList, new PersonPassLengthComparator());
        Collections.sort(animalArrayList, new AnimalAgeComparator());


        long startTimeP1 = System.currentTimeMillis();
        Iterator <Person> iterator = personLinkedList.iterator();
        while (iterator.hasNext()){
            if (personLinkedList.contains(iterator.next())){
                iterator.remove();
            }
        }
        long stopTimeP1 = System.currentTimeMillis();
        long elapsedTimeP1 = stopTimeP1 - startTimeP1;//191 ms


        long startTimeA1 = System.currentTimeMillis();
        for (int i = animalArrayList.size() -1; i >= 0; i--){
            animalArrayList.remove(i);
        }
        long stopTimeA1 = System.currentTimeMillis();
        long elapsedTimeA1 = stopTimeA1 - startTimeA1;//23 ms
    }
}
