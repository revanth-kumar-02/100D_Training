package day11;

import java.util.Arrays;

public class Warehouse {
    protected String[] goods = { "Keyboard", "Mouse", "Monitor", "Printer", "Webcam" };

    public void viewGoods() {
        System.out.println(Arrays.toString(goods));
    }

    public void illustrateReference() {
        System.out.println("Warehouse reference method called");
    }
}
