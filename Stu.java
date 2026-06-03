public class Stu {
    public static void main(String[] args) {
        String a = "hello world";
        
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == ' ') {
                continue; // Skips the space and moves to the next character
            }
            System.out.print(a.charAt(i));
        }
        System.out.println();
    }
}