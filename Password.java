//Control center to run all other classes in the best order.

class Control {
    static Timer timer = new Timer();
    static Force force = new Force();

    public static void main(String args[]) {
        Thread Time = new Thread() {
            public void run() {
                timer.Start();
            }
        };

        Thread Attempt = new Thread() {
            public void run() {
                String str = force.Run();
                System.out.println(str);
                timer.End();
            }
        };

        Time.start();
        Attempt.start();
    }
}
