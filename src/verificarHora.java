import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class verificarHora {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
        LocalDateTime now = LocalDateTime.now();
        int hora = Integer.parseInt(dtf.format(now));
        boolean noite = false;
        boolean tarde = false;
        boolean manha = false;

        if(hora >= 19 && hora <= 23 || hora >= 0 && hora <= 5) {
            noite = true;
            System.out.println("Está de noite");
        } else {
            if(hora >= 12 && hora <=18) {
                tarde = true;
                System.out.println("Está de tarde!");
            } else {
                if(hora >= 6 && hora <=11) {
                    manha = true;
                    System.out.println("Está de manhã!");
                }
            }
        }
        //String, int, double, short, long, float, boolean
    }
}
