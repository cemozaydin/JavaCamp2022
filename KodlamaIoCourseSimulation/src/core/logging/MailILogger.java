package core.logging;

public class MailILogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi : " + data);
    }
}
