import java.io.FileReader;
import java.util.*;

class Remove {
    public static void main(String args[]) {
        String word = ""; //Text that needs to be edited
        String newword = "";

        for (int x = 0; x < word.length(); x++) {
            String remove = "•"; //Characters that want to be removed.
            //String remove2 = "";
            String add = ""; //Characters that want to replace "remove".

            newword = word.replace(remove, add);
            //newword += word.replace(remove2, add);

        }
        System.out.println(newword);
    }
}

