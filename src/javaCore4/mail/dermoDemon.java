package javaCore4.mail;

import java.util.logging.Logger;

public class dermoDemon {
}
public static interface Sendable {
    String getFrom();
    String getTo();
}
abstract class AbstractSendable implements Sendable {

    protected final String from;
    protected final String to;

    public AbstractSendable(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractSendable that = (AbstractSendable) o;

        if (!from.equals(that.from)) return false;
        if (!to.equals(that.to)) return false;

        return true;
    }

}
class MailMessage extends AbstractSendable {

    private final String message;

    public MailMessage(String from, String to, String message) {
        super(from, to);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MailMessage that = (MailMessage) o;

        if (message != null ? !message.equals(that.message) : that.message != null) return false;

        return true;
    }

}
class MailPackage extends AbstractSendable {
    private final Package content;

    public MailPackage(String from, String to, Package content) {
        super(from, to);
        this.content = content;
    }

    public Package getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MailPackage that = (MailPackage) o;

        if (!content.equals(that.content)) return false;

        return true;
    }

}
class Package {
    private final String content;
    private final int price;

    public Package(String content, int price) {
        this.content = content;
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Package aPackage = (Package) o;

        if (price != aPackage.price) return false;
        if (!content.equals(aPackage.content)) return false;

        return true;
    }
}
public static interface MailService {
    Sendable processMail(Sendable mail);
}
class RealMailService implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        // Здесь описан код настоящей системы отправки почты.
        return mail;
    }
}

public static class UntrustworthyMailWorker implements MailService {

    private final MailService[] mailServices;
    private final RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService service : mailServices) {
            mail = service.processMail(mail);
        }
        return realMailService.processMail(mail);
    }
}

public static class Spy implements MailService {

    private final Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            MailMessage message = (MailMessage) mail;

            if (AUSTIN_POWERS.equals(message.getFrom()) ||
                    AUSTIN_POWERS.equals(message.getTo())) {

                logger.warning("Detected target mail correspondence: from "
                        + message.getFrom()
                        + " to "
                        + message.getTo()
                        + " \""
                        + message.getMessage()
                        + "\"");

            } else {
                logger.info("Usual correspondence: from "
                        + message.getFrom()
                        + " to "
                        + message.getTo());
            }
        }
        return mail;
    }
}

public static class Thief implements MailService {

    private final int minPrice;
    private int stolenValue = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {

        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;

            if (mailPackage.getContent().getPrice() >= minPrice) {

                stolenValue += mailPackage.getContent().getPrice();

                return new MailPackage(
                        mailPackage.getFrom(),
                        mailPackage.getTo(),
                        new Package(
                                "stones instead of " + mailPackage.getContent().getContent(),
                                0
                        )
                );
            }
        }

        return mail;
    }
}

public static class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {

        if (mail instanceof MailPackage) {

            MailPackage mailPackage = (MailPackage) mail;
            String content = mailPackage.getContent().getContent();

            if (WEAPONS.equals(content) || BANNED_SUBSTANCE.equals(content)) {
                throw new IllegalPackageException();
            }

            if (content.contains("stones")) {
                throw new StolenPackageException();
            }
        }

        return mail;
    }
}

public static class IllegalPackageException extends RuntimeException {
}

public static class StolenPackageException extends RuntimeException {
}