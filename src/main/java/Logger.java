import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger;
    protected int num = 1;

    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public void log(String msg) {
        System.out.println("[" + formatter.format(new Date()) + " " + num++ + "] " + msg);
    }

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }
}