package SistemComunicare;

public class MailTransmitter implements Transmitter {

    private static final String TYPE = " mail";
    private Message message;

    public int getBuffer() {
        return buffer;
    }

    private int buffer;

    public int getDimention() {
        return dimention;
    }

    private int dimention;

    private MailTransmitter() {
    }

    public MailTransmitter(int i) {
        this();
        this.buffer = i;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public void store(Message message) {
        this.message = message;
    }

    @Override
    public Message retrieve(Person person) {
        if (message.getReceiver().equals(person)) {
            System.out.println(
                    "Persoana " + person.getName() + " a trimis urmatorul mesaj prin posta: " + message.getString());
            return message;
        } else {
            return null;
        }
    }

}
