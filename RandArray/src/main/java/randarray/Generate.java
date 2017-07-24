package randarray;

/**
 * Created by K_PC-S on 03.07.2017.
 */

import java.util.Arrays;
import java.util.Random;

public class Generate {
    Random random = new Random();

    int[] randomArray = new int[10];
    int maxNegativeElement = 0;
    int minPositiveElement = 10;

    /**
     * Заполнение массива случайными числами от -10 до 10
     */
    public void genarationRandomArray(){
        System.out.print("\nЗаполняем массив случайными числами от -10 до 10");
        for(int i=0;i<randomArray.length;i++){
            randomArray[i] = random.nextInt(21)-10;
        }
        System.out.println();
    }

    public void getArrayString(){
        System.out.println(Arrays.toString(randomArray));
    }

    /**
     *
     * @return randomArray
     */
    public int[] getArray(){

       return randomArray;
    }

    public int getIndexOfMaxNegativeElement(int[] numbersArray){
        int indexOfMax = -1;
        maxNegativeElement = 0;

        for(int i = 0; i<randomArray.length;i++){

            if(randomArray[i]<0 & randomArray[i]<maxNegativeElement) {
               maxNegativeElement = randomArray[i];
               indexOfMax = i;
            }
        }
        System.out.println("Максимальный отрицательный элемент массива " + maxNegativeElement + " индекс " + indexOfMax);
        return indexOfMax;
    }


    public int getIndexOfMinPositiveElement(int[] numbersArray){
        int indexOfMin = -1;
        minPositiveElement = 10;

        for(int i = 0; i<randomArray.length;i++){

            if(randomArray[i]<minPositiveElement & randomArray[i]>=0) {
                minPositiveElement = randomArray[i];
                indexOfMin = i;
            }
        }
        System.out.println("Минимальный положительный элемент массива " + minPositiveElement + " индекс " + indexOfMin);
        return indexOfMin;
    }


    public void swapArrayElements(int[] array, int indexOfMax, int indexOfMin) {

        if(indexOfMax == -1){
            System.out.println("Нет отрицательного элемента");
        }else if (indexOfMin == -1){
            System.out.println("Нет положительного элемента");
        }else {

            int iPositive = array[indexOfMin];
            int iNegative = indexOfMax;
            array[indexOfMin] = array[iNegative];
            array[indexOfMax] = iPositive;;



            System.out.printf("Поменяли местами randomArray[%2s] с randomArray[%2s](Максимальное отрицательное число %2s," +
                    " минимальное положительное %3s)%n", iNegative,iPositive, randomArray[indexOfMin], iPositive);
        }
    }

    /**
     * Поиск min и max числа в массиве и замена их друг на друга
     */
    public void swapMinMaxInArray(){
        int imin = 0, imax = 0, max = 0;
        for(int i = 0; i<randomArray.length;i++){
            if(randomArray[i]>randomArray[imax]) {
                imax = i;
                max = randomArray[imax];
            }else if(randomArray[i]<randomArray[imin])
                imin = i;
        }
        randomArray[imax] = randomArray[imin];
        randomArray[imin] = max;
        System.out.printf("Поменяли местами randomArray[%2s] с randomArray[%2s](Максимальное число %2s, минимальное %3s)%n", imax,imin, max, randomArray[imax]);

    }

}
