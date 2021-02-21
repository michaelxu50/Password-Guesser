//Control center to run all other classes in the best order.

class Control {
    static Timer timer = new Timer();
    static Force force = new Force();
    static Pattern pattern = new Pattern();

    public static void main(String args[]) {
        Thread Time = new Thread() {
            public void run() {
                timer.Start();
            }
        };

        Thread Attempt = new Thread() {
            public void run() {

                boolean Try = pattern.Run();

                if (Try == false) {
                    force.Run();
                }
                timer.End();
            }
        };

        Time.start();
        Attempt.start();
    }
}

class ToAscii {
    public static void main(String args[]) {

        String rp = "John5?";
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
