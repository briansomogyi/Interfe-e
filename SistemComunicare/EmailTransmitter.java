package SistemComunicare;

public class EmailTransmitter implements Transmitter {

    private static final String TYPE = "Email";
    private Message message;

    public EmailTransmitter() {
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
                    "Persoana " + person.getName() + " a trimis urmatorul mesaj pe email: " + message.getString());
            return message;
        } else {
            return null;
        }
    }

}
