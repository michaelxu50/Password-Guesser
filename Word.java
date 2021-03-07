import java.util.*;
import java.io.FileReader;

//Intelligent class that uses words to guess the password. Level 1 security.
class Word {
    public static void main(String args[]) throws Exception {
        FileReader fin = new FileReader("Names.txt");
        Scanner src = new Scanner(fin);

        FileReader fin2 = new FileReader("Words.txt");
        Scanner src2 = new Scanner(fin2);

        String realpassword = "Trevor5$";
        String word = ""; //Text that needs to be edited
        String remove = " "; //Characters that want to be removed. •
        String add = ""; //Characters that want to replace "remove".

        while (src.hasNext()) {
            String test = src.next();
            String x = test;
            for (int a = 32; a<= 64; a++) { //1
                String as = Character.toString(a);
                for (int b = 32; b<=64; b++) { //2
                    String bs = Character.toString(b);
                    for (int c = 32; c<=64; c++) { //3
                        String cs = Character.toString(c);

                        if (a == 32) {
                            as = word.replace(remove, add);
                        }
                        if (b == 32) {
                            bs = word.replace(remove, add);
                        }
                        if (c == 32) {
                            cs = word.replace(remove, add);
                        }

                        String characters = as + bs + cs;
                        test += characters;

                        if (test.equals(realpassword)) {
                            System.out.println("The password is " + test);
                            System.exit(0);
                        }
                        else {
                            test = x;
                        }
                    }
                }
            }
        }

        while (src.hasNext()) {
            String test = src.next();
            String x = test;
            for (int a = 32; a<= 64; a++) { //1
                String as = Character.toString(a);
                for (int b = 32; b<=64; b++) { //2
                    String bs = Character.toString(b);
                    for (int c = 32; c<=64; c++) { //3
                        String cs = Character.toString(c);

                        if (a == 32) {
                            as = word.replace(remove, add);
                        }
                        if (b == 32) {
                            bs = word.replace(remove, add);
                        }
                        if (c == 32) {
                            cs = word.replace(remove, add);
                        }

                        String characters = as + bs + cs;
                        test += characters;

                        if (test.equals(realpassword)) {
                            System.out.println("The password is " + test);
                            System.exit(0);
                        }
                        else {
                            test = x;
                        }
                    }
                }
            }
        }
    }
}