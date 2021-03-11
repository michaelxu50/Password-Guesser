//Control center to run all other classes in the best order.
//ControlAll runs all the codes in order of complexity.
//Other classes run just one of the codes.
//ToAscii is for reference.

//class to control all password guessers in order of complexity (least to most).
class ControlAll {
    public static void main(String args[]) {
        String tryword = "Father15"; //password to try
        Timer timer = new Timer(10);
        Force force = new Force(tryword);
        Pattern pattern = new Pattern(tryword);
        Pin pin = new Pin();
        Word word = new Word(tryword);

        Thread Time = new Thread() {
            public void run() {
                timer.Start();
            }
        };

        Thread Attempt = new Thread() {
            public void run() {
                try {
                    word.Run();
                    System.out.println("Word is done");
                }
                catch (Exception e) {
                    System.out.print("It's broken");
                }
                pattern.Run();
                System.out.println("Pattern is done");
                force.Run();
                timer.End();
            }
        };

        Time.start();
        Attempt.start();
    }
}

//class to just run word.
class ControlWord {
    public static void main(String args[]) {
        Timer timer = new Timer(1);
        Word word = new Word("Neck20%"); //password that the computer attempts to find

        Thread Time = new Thread() {
            public void run() {
                timer.Start();
            }
        };

        Thread Attempt = new Thread() {
            public void run() {
                try {
                    word.Run();
                }
                catch (Exception e) {
                    System.out.println("It's broken");
                }
                timer.End();
            }
        };

        Time.start();
        Attempt.start();
    }
}
//class just to run pattern.
class ControlPattern {
    static Timer timer = new Timer(15);

    public static void main(String args[]) {
        Pattern pattern = new Pattern("Joe15!"); //password that the computer attempts to find.

        Thread Time = new Thread() {
            public void run() {
                timer.Start();
            }
        };

        Thread Attempt = new Thread() {
            public void run() {
                pattern.Run();
                timer.End();
            }
        };

        Time.start();
        Attempt.start();
    }
}

//class to run force.
class ControlForce {
    public static void main(String args[]) {
        Force force = new Force("Joe15!"); //password that the computer attempts to find.
        Timer timer = new Timer(60);

        Thread Time = new Thread() {
            public void run() {
                timer.Start();
            }
        };

        Thread Attempt = new Thread() {
            public void run() {
                force.Run();
                timer.End();
            }
        };

        Time.start();
        Attempt.start();
    }
}

//converts words to ascii as reference. NOT ACTUALLY USED.
class ToAscii {
    String rp = "";

    ToAscii(String x) {
        rp = x;
    }

    void Run() {
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
