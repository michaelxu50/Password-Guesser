class Remove {
    public static void main(String args[]) {
        String word = ""

        String newword = "";
        for (int x = 0; x < word.length(); x++) {
            char character = word.charAt(x); // This set character to each digit of rp.
            String remove = "God"; //•
            String remove2 = "LORD";
            String add = "Hug";

            newword = word.replace(remove, add);
            newword += word.replace(remove2, add);

        }
        System.out.println(newword);
    }
}