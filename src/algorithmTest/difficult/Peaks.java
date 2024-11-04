package comp1110.lab3;

public class Peaks {
    static int countPeaks(int[] numbers){
        int numb = 0;
        for(int i = 1; i < numbers.length - 1; i++){
            if((numbers[i - 1] < numbers[i]) && (numbers[i] > numbers[i + 1])){
                numb ++;
            }
        }
        return numb;
    }

    public static void main(String[] args) {
        int[] array1 = {213, 217, 274, 194, 219, 240, 207};
        System.out.println(countPeaks(array1));
        int[] array2 = {290, 217, 274, 194, 219, 200, 207};
        System.out.println(countPeaks(array2));
    }
}
