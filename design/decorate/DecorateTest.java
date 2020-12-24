package design.decorate;

/**
 * @author KChaste Sun
 */
public class DecorateTest {

    public static void main(String[] args) {
        EmailNotify emailNotify = new EmailNotify();
        emailNotify.send("send email");

        NotifyDecorate notifyDecorate = new NotifyDecorate(emailNotify);
        notifyDecorate.send("aaa");

    }



}
