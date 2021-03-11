import java.util.*;
import java.io.FileReader;

//Intelligent class that uses words to guess the password. Level 1 security. about 3 seconds to run completely.
class Word {
    //getting in input using a constructer from password.java on the password to test.
    String realpassword = "";
    Word (String code) {
        realpassword = code;
    }

    //main method
    void Run() throws Exception {
        //import filreader and scanner
        FileReader fin = new FileReader("Names.txt");
        Scanner src = new Scanner(fin);

        FileReader fin2 = new FileReader("Words.txt");
        Scanner src2 = new Scanner(fin2);

        FileReader fin3 = new FileReader("CommPass.txt");
        Scanner src3 = new Scanner(fin3);

        //define universal variables.
        String word = ""; //Text that needs to be edited
        String remove = " "; //Characters that want to be removed. •
        String add = ""; //Characters that want to replace "remove".

        //test the common passwords
        while (src3.hasNext()) {
            String test3 = src3.next();
            if (test3.equals(realpassword)) {
                System.out.println("The password is " + test3);
                System.exit(0);
            }
        }

        //tests the names plus additional characters
        while (src.hasNext()) {
            String test = src.next();
            String x = test;

            //create the characters and numbers.
            for (int a = 32; a<= 64; a++) { //1
                String as = Character.toString(a);
                for (int b = 32; b<=64; b++) { //2
                    String bs = Character.toString(b);
                    for (int c = 32; c<=64; c++) { //3
                        String cs = Character.toString(c);

                        //make ascii 32 from spaces into nothing.
                        if (a == 32) {
                            as = word.replace(remove, add);
                        }
                        if (b == 32) {
                            bs = word.replace(remove, add);
                        }
                        if (c == 32) {
                            cs = word.replace(remove, add);
                        }

                        //combine the word and the characters.
                        String characters = as + bs + cs;
                        test += characters;

                        //try the try word against the real word.
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

        //test the words plus additional characters
        while (src2.hasNext()) {
            //define universal variables.
            String test2 = src2.next();
            String y = test2;
            String word2 = "";
            String hold2 = "";

            //make the first character of each word (test2) upper case and stored in newword.
            char firstchar = test2.charAt(0);
            String holder = String.valueOf(firstchar);
            String newword = holder.toUpperCase();

            //add the rest of the word (test2) to newword
            for (int a = 1; a<test2.length(); a++) {
                char temp = test2.charAt(a);
                newword += temp;
                hold2 = newword;
            }

            //create the characters and numbers
            for (int d = 32; d<=64; d++) { //1
                String ds = Character.toString(d);
                for (int e = 32; e<=64; e++) { //2
                    String es = Character.toString(e);
                    for (int f = 32; f<=64; f++) { //3
                        String fs = Character.toString(f);

                        //turn ascii 32 (space) into nothing
                        if (d == 32) {
                            ds = word2.replace(remove, add);
                        }
                        if (e == 32) {
                            es = word2.replace(remove, add);
                        }
                        if (f == 32) {
                            fs = word2.replace(remove, add);
                        }

                        //combine the words and characters.
                        String characters2 = ds + es + fs;
                        test2 += characters2;
                        newword += characters2;

                        //test the realpassword to the lower case word plus characters
                        if (test2.equals(realpassword)) {
                            System.out.println("The password is " + test2);
                            System.exit(0);
                        }
                        else {
                            test2 = y;
                        }

                        //test the realpassword to the upper case word plus characters.
                        if (newword.equals(realpassword)) {
                            System.out.println("The password is " + newword);
                            System.exit(0);
                        }
                        else {
                            newword = hold2;
                        }
                    }
                }
            }
        }
    }
}