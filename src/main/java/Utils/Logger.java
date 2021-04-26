package Utils;

import org.testng.ITestListener;
import io.qameta.allure.Attachment;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger implements ITestListener {
    @Attachment()
    public static String log(String message)
    {
        Date date = new Date();
        Timestamp ts=new Timestamp(date.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("[ "+formatter.format(ts)+" ]  "+message);
        return message;
    }
}
