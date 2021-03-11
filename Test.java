class TitleCase {
    public static void main(String args[]) {
        String word = "china";
        String lower = word;

        char firstchar = word.charAt(0);
        String holder = String.valueOf(firstchar);
        String newword = holder.toUpperCase();

        for (int a = 1; a<word.length(); a++) {
            char temp = word.charAt(a);
            newword += temp;
        }
        System.out.println(newword);
        System.out.println(lower);
    }
}