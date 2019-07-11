public class AndroidMobile extends  Mobile{
    private final int limitLength = 100;
    @Override
    public void call(String message) {
        if(message.length() > limitLength) {
            System.out.println("<Android> Message cannot be sent");
            return;
        }
        System.out.println("<Android>Message : " + message);
    }
}
