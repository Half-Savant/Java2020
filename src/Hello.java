import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
    }
}
