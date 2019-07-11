public class IPhone extends Mobile{
    private final int limitLength = 10;
    @Override
    public void call(String message) {
        if(message.length() > limitLength) {
            System.out.println("<iPhone> Message cannot be sent");
            return;
        }
        System.out.println("<iPhone>Message : " + message);
    }

}
