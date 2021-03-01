import java.util.Date;
import java.util.concurrent.TimeUnit;

class Timer {
    int seconds = 0;
    int minutes = 0; // Init minutes time
    int hours = 0; //Init hour time
    int display = 10; //change how often the time is displayed (number <= 60)

    void Start() {
        for (seconds = display; seconds < 100; seconds += display) {
            try {
                TimeUnit.SECONDS.sleep(display);
                if (seconds == 60) { //turns seconds into minutes
                    minutes += 1;
                    seconds = 0;
                }
                if (minutes == 60) { //turns minutes into hours
                    hours += 1;
                    minutes = 0;
                }
                if (hours == 1) { //if one hour print one hour + minutes + seconds.
                    System.out.println(hours + "hour " + minutes + ":" + seconds);
                }
                if (hours > 1) { //if more than one hour, print hour amount + hours.
                    System.out.println(hours + "hours " + minutes + ":" + seconds);
                }
                else { //if no hours, just print minutes and seconds.
                    System.out.println(minutes + ":" + seconds);
                }
            }
            catch (InterruptedException e) {
                System.err.format("It's broken");
            }
        }
    }

    void End() {
        if (seconds == 60) { //turns seconds into minutes
            minutes += 1;
            seconds = 0;
        }
        if (minutes == 60) { //turns minutes into hours
            hours += 1;
            minutes = 0;
        }
        System.out.println("Final Time " + hours + ": " + minutes + ": " + seconds);
        System.exit(0);
    }
}
