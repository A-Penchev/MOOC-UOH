import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    public static int smallest(int[] array){
        int smallestNum=array[0];
        for(int number: array){
            if(smallestNum>number){
                smallestNum=number;
            }
        }
        return smallestNum;
    }
    public static int indexOfSmallest(int[] array){
        int smallestNum=smallest(array);
        int index=0;
        while(true){
            if(array[index]==smallestNum){
                break;
            }
            index++;
        }
        return index;
    }   
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int endIndex=table.length;
        int[] newArray = Arrays.copyOfRange(table, startIndex, endIndex);
        return indexOfSmallest(newArray) + startIndex;
       
    }
    public static void swap(int[] array, int index1, int index2) {
        int tempIndex1=array[index1];
        int tempIndex2=array[index2];
        array[index1]=tempIndex2;
        array[index2]=tempIndex1;
    }
    public static void sort(int[] array) {
        int cycleArray=0;
        for(int cycle: array){
        int smallestNumIndex=indexOfSmallestFrom(array,cycleArray);
        swap(array,smallestNumIndex,cycleArray);
        cycleArray++;
            System.out.println(array);
        }
    }

}
