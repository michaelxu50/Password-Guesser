class Force {

    //public static void main(String args[]) {
    public String Run() {
        ToAscii Word = new ToAscii("John5"); //select word to convert here.
        Word.Convert();

        String passwd = "!!!!!";
        boolean accuracy = false;
        String var = "";

        for (int a = 33; a <= 126; a++) {
            String ca = Character.toString(a);
            for (int b = 33; b <= 126; b++) {
                String cb = Character.toString(b);
                for (int c = 33; c <= 126; c++) {
                    String cc = Character.toString(c);
                    for (int d = 33; d <= 126; d++) {
                        String cd = Character.toString(d);
                        for (int e = 33; e <= 126; e++) {
                            //for(int f=33; f<=126; f++) {
                            String ce = Character.toString(e);
                            //var = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c) + " " + Integer.toString(d) + " " + Integer.toString(e); //+ Integer.toString(f);
                            var = ca + cb + cc + cd + ce;
                            if (var.equals(passwd)) {
                                System.out.println("The password is " + var);
                                return var;
                                //}
                            }
                        }
                    }
                }
            }
            System.out.println("Processed " + a);
        }
        return var;
    }
}

class ToAscii {
    String rp = "";

    ToAscii(String p) {
        rp = p;
    }

    void Convert() {
        String ascii = "";
        String fin = "";

        for (int x=0; x<rp.length(); x++) {
            char character = rp.charAt(x); // This set character to each digit of rp.
            ascii = (int) character + ""; //Sets ascii to the ascii form of each character.

            if (ascii.length() == 2) {
                ascii = "0" + ascii;
            }
            fin += ascii + "";
        }
        System.out.println(fin);
    }
}

