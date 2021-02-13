import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws ArithmeticException {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt(),b=sc.nextInt(),result=a/b;
//        System.out.println("Result: "+result);

//        solve(0, 1);

//        saveToFile("myfile.txt", "str2");

//        Magazine life = new Magazine();
//
//        Magazine.Article news = life.new Article();

        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        t1.message = "1";
        t2.message = "2";
        t1.start();
        t2.start();

    }

    static void solve(int a, int b){
        System.out.print("solve ");
        if (a == 0 && b == 0) System.out.println("Any");
        else if (b % a == 0) System.out.println(-b / a);
        else System.out.println("No solution");
    }

    public static void saveToFile(String fileName, String str){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(fileName);
            pw.print(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
    }
}

