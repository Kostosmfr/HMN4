import randarray.Generate;

import java.io.PrintStream;

/**
 * Created by K_PC-S on 03.07.2017.
 */
public class Base {
    public static void main(String[] args) {

        //Проверка работы с одним объектом
       /* Generate g = new Generate();
        g.genarationRandomArray();
        g.getArrayString();
        g.swapArrayElements(g.getArray(),g.getIndexOfMaxNegativeElement(g.getArray()),
                g.getIndexOfMinPositiveElement(g.getArray()));
        g.getArrayString();
*/
        //Проверка работы с массивом объектов

        Generate[] gArray = new Generate[5];
        for(int i = 0; i < gArray.length;i++){
            gArray[i] = new Generate();
            gArray[i].genarationRandomArray();
            gArray[i].getArrayString();
            gArray[i].swapArrayElements(gArray[i].getArray(),gArray[i].getIndexOfMaxNegativeElement(gArray[i].getArray()),
                    gArray[i] .getIndexOfMinPositiveElement(gArray[i].getArray()));
            gArray[i].getArrayString();
        }



    }
}
