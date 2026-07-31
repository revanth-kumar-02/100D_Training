package day13;

public class Handlecompile {
    public static void main(String[] args) {
        String[] algorithms = {"Two Pointers","Dfs","Bfs","Intervals","Djikstra","Prims"};
        Arrays.stream(algorithms).forEach(each) -> {
            System.out.println(each);
            try {
                Thread.sleep(5000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}