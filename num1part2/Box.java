package ru.hw.num1part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    List<T> boxWithSMTH = new ArrayList<T>();



        public void addFruit(T array){
            boxWithSMTH = (List<T>) Arrays.asList(array);
        }
        public void calculate(){

        }
}
