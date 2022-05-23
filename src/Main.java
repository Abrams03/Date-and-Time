import java.time.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        convert.convertDate();

//////////////////////////////////////////////////////////////////////
        LocalDate localDate = LocalDate.of(2003, 10, 7);
        System.out.println("\n" + localDate);
        System.out.println("Я родился");

        LocalDate newlocalDate = localDate.plusYears(40);


        Period periodB = Period.ofYears(5);

        while (localDate.getYear() < newlocalDate.getYear()) {

            localDate = localDate
                    .plus(periodB);
            System.out.println("\n" + localDate);
            System.out.println("С юбилеем!");
            }
        }
}




