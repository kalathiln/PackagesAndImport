package academy.learnProgramming;

public class Main {
    // use psvm to get the main method automatically with intellij
    public static void main(String[] args) {
        System.out.println("args-size : "+args.length);
        System.out.println("Args 0 :"+args[0]);
        System.out.println("Args 1 :"+args[1]);

        for(int i=0; i< args.length;i++){
            System.out.println("Args ["+i+"] :"+args[i]);
        }

    }
}
