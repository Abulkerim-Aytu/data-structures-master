package ReviewStackRecursion.BrowserHistory;

public class BrowserHistoryTestApp {
    public static void main(String[] args) {
        BrowserHistory bh=new BrowserHistory("www.google.com");
        bh.visit("facebook.com");
        bh.visit("leetcode.com");
        bh.visit("amazon.com");
        System.out.println("One step back is: " + bh.back(1));
        bh.visit("garmin.com");
        System.out.println("One step forward is: " + bh.forward(1));
    }
}
