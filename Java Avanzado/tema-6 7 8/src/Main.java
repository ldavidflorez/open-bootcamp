public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 0){
                System.out.println("key: " + args[i]);
            } else {
                System.out.println("value: " + args[i]);
                System.out.println();
            }
        }
    }
}
