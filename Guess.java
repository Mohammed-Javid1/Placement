import java.util.Scanner;
public class Guess{
    public static void main(String args[]){
    Scanner S = new Scanner(System.in);
    int secret=33;
    int guess;
    do{
        guess= S.nextInt();
        if(guess>secret){
            System.out.println("HIGH");
        }
        else if(guess<secret){
            System.out.println("SMALL");
        }
    }while(guess!=secret);
    System.out.println("CORRECT");
    
}
}



