package core.logging;

public class DbILogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı : " + data);
    }
}
