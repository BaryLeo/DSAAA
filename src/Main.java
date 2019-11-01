import base.Sort;

public class Main {

    public static void main(String[] args) {
        int[] ar = {1,28,3,4,5,3,9};
        Sort sort = new Sort();
        for (int i :sort.bubbleSortPro(ar)){
            System.out.println(i);
        }
    }
}
