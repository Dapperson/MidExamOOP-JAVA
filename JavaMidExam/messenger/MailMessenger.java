package messenger;

public class MailMessenger implements Messenger {

    boolean isSucces;
    boolean isConnectedToServer;

    void connect() {
        isConnectedToServer = true;
        System.out.println("Server Connected");
    }

    void disconnect() {
        isConnectedToServer = false;
        System.out.println("Server Disconnected");
    }

    @Override
    public void sendMessege(String receiver, String subject, String messege) {
        System.out.println("Receiver            : " + receiver);
        System.out.println("Subject             : " + subject);
        System.out.println("Messege             : " + messege);
        System.out.println("Connection Status   : " + isConnectedToServer);

        if (isConnectedToServer == true) {
            if (receiver == "") {
                isSucces = false;
                System.out.println("Status Messege      : " + isSucces);
                System.out.println("Mail not sent,\n");
            } else {
                isSucces = true;
                System.out.println("Status Messege      : " + isSucces);
                System.out.println("Mail sent,\n");
            }
        } else {
            System.out.println("Mail not sent, check your network \n");
        }
    }
}
