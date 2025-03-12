package swvalerian.binarysearch.booksedjvik;

import static edu.princeton.cs.algs4.StdRandom.uniformInt;

public class BinarySearchAlgos {
    /**
     * пытаюсь написать сам рекурсивный бинарный поиск
     */

    public static int rank(int key, int[] array) {
        int hi = array.length - 1;
        int low = 0;

        return rank(key, array, low, hi);
    }

    public static int rank(int key, int[] array, int low, int hi) {
        if (low > hi) return -1;

        int mid =  low + (hi - low) / 2; // защита от переполнения

        if (key > array[mid]) {
            low = mid + 1;
            return rank(key, array, low, hi);
        } else if (key < array[mid])
        {
            hi = mid - 1;
            return rank(key, array, low, hi);
        }
        else {
            return mid;
        }
    }


    public static void main(String[] args) {
        int[] array = {1,3,7,10,15,34,25,100};

        System.out.println("Заданный ключ находится по индексу: " + rank(100,array));

//        Проверяю, подключил ли я внешнюю библиотеку к проекту

        for (int i = 0; i < 100.; i++) {
            System.out.println( uniformInt(10, 2000));
        }
    }
}
