import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class convert {

    public static void convertDate() {
        Date date = new Date( );
        System.out.println(date);

        Instant instant = date.toInstant();

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Almaty"));
        System.out.println(zonedDateTime);

    }
}
