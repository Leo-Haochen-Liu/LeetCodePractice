package comp1110.lab2;

public class Time {
    public static void main(String[] args) {
        int hour = 18;
        int minute = 07;
        int second = 59;
        // since the lab starts at 18:00
        int secstart = ((hour - 18) * 60 * 60) + ((minute - 0) * 60) + (second - 0);
        System.out.println("it has been " + secstart + " seconds since the start of the lab time");
        int secleft = (2 * 60 * 60) - secstart;
        System.out.println("there are " + secleft + " seconds remaining in the lab");
        int percent = (secstart * 100) / (2 * 60 * 60);
        System.out.println(percent + "% of the lab time has elapsed");
    }
}
