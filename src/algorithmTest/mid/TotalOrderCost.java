package comp1110.lab2;

public class TotalOrderCost {
    static double totalCost(double bookPrice, int numberOfCopies){
        if(numberOfCopies == 1)
            return bookPrice + 5.5;
        else {
            double total = (bookPrice * 0.6) * numberOfCopies + 5.5 + 2.75 * (numberOfCopies - 1);
            return total;
        }
    }

    public static void main(String[] args) {
        // bookPrice > 0, numberOfCopies >= 1 and should be an integer
        double total = totalCost(25,1);
        System.out.println(String.format("%.2f", total));
        total = totalCost(25,4);
        System.out.println(String.format("%.2f", total));
    }
}
