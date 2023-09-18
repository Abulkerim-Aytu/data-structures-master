package ReviewStackRecursion.BrowserHistory;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    // two stacks and string current url
    Deque<String> historyStack, forwardStack;
    String currentPage;

    public BrowserHistory(String homePage) {
        // initialize stacks and current page;
        this.currentPage = homePage;
        historyStack=new ArrayDeque<>();
        forwardStack=new ArrayDeque<>();
    }
    public void visit(String url){
        // push current into history
        historyStack.push(currentPage);
        // current =url;
        currentPage=url;
        // clear forward stack
        forwardStack=new ArrayDeque<>();// you can use .clear() as well
    }
    public String back(int steps){
        int counter=steps;
        while(!historyStack.isEmpty() && counter>0){
            forwardStack.push(currentPage);
            currentPage=historyStack.pop();
            counter--;
        }
        return currentPage;
    }
    public String forward(int steps){
        int counter=steps;
        while(!forwardStack.isEmpty() && counter>0){
            historyStack.push(currentPage);
            currentPage=forwardStack.pop();
            counter--;
        }
        return currentPage;
    }
}
