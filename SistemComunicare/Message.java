package SistemComunicare;

public class Message {
    private Person sender;
    private Person receiver;
    private String string;

    public Message(Person sender, Person receiver, String string) {
        this.sender = sender;
        this.receiver = receiver;
        this.string = string;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getReceiver() {
        return receiver;
    }

    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
