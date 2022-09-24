public class Main {
    public static void main(String[] args) {
        int[] sales = {100, 50, 70, 90};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}