package Practicals_OOP.Templates;

import java.util.ArrayList;
import java.util.List;

public class NumberCounter <T> {
    List list = new ArrayList<T>();
    int counter = 0;

    NumberCounter(int nums[]) {
        for (int num : nums) {
            list.add(num);
        }
    }

    //        Iterator itr=list.iterator();
//        while(itr.hasNext()) System.out.println(itr.next());
    public int calculateOddNumbers() {        counter=0;

        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
    public int calculateEvenNumbers(){        counter=0;

        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        boolean toggle =false;
        int[] numArray = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            numArray[i] = temp.charAt(i) - '0';
        }
        if(numArray.length ==1) return true;
        for (int i = numArray.length-1,  j =0; i >= 0 && j<numArray.length-1; i--, j++) {
            if(numArray[i] == numArray[j]){
                toggle = true;
            }
            else{
                toggle = false;
                break;
            }
        }
        return toggle;

    }
    public int calculatePalindromeNumbers(){
        counter=0;
        for (int i = 0; i < list.size(); i++) {
            if (isPalindrome((int) list.get(i) )) {
                counter++;
            }
        }
        return counter;
    }
}