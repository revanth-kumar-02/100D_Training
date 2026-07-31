package day13;

import java.io.IOException;

public class runprompt {
    public static void main(String[] args) throws IOException {
        Runtime run = Runtime.getRuntime();
        Process pro = run.exec("mspaint");
    }
}