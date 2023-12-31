package com.codebase;
import java.util.ArrayList;


public class NumberList {
    private ArrayList<Integer> numbers;
    public NumberList(ArrayList<Integer> testNumbers) {
        this.numbers = testNumbers;
    }
    public int getNumberCount() {
        return this.numbers.size();
    }
    public int addNumber(int number) {
        this.numbers.add(number);
        return number;
    }
    public int getNumberAtIndex(int index) {
       return this.numbers.get(index);
    }
    public int getTotal(){
        int total = 0;
//        for (int i=0; i<getNumberCount();i++){
//            total += getNumberAtIndex(i);
//        }return total;
        for (int number:this.numbers) {
            total += number;
        } return total;
    }
}
