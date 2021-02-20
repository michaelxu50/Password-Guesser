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
