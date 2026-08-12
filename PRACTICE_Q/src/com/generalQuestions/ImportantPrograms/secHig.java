package com.generalQuestions.ImportantPrograms;

public class secHig {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,4};
        int highest = arr[0];
        int secondHighest = arr[0];
        for(int i=1;i<arr.length;i++){
if(arr[i]>highest) {
    secondHighest = highest;
    highest= arr[i];
}
else if(arr[i]>secondHighest){
    secondHighest = arr[i];
}
        }
        System.out.println(+secondHighest);
    }
}
