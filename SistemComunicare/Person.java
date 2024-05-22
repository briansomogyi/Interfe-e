package SistemComunicare;

public class Person {
    private String name;
    private Transmitter transmitter;

    private Person(String name, Transmitter transmitter) {
        this.name = name;
        this.transmitter = transmitter;
    }

    public Person(String string) {
        this(string, new EmailTransmitter());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transmitter getTransmitter() {
        return transmitter;
    }

    public void setTransmitter(Transmitter transmitter) {
        this.transmitter = transmitter;
    }

    private void send(Person person, Message message) {
        if (this.equals(message.getSender()) || person.getName().equals(message.getReceiver().getName())) {
            transmitter.store(message);
            System.out.println(transmitter.retrieve(person).getString());
        }
    }

    public void send(Person p2, String string) {
        this.send(p2, new Message(this, p2, string));
    }
}
