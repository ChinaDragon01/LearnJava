package eventbus;

/**
 * Guava学习笔记：EventBus
 * https://www.cnblogs.com/peida/p/EventBus.html
 */
public class EventListener {
    public int lastMessage = 0;

//    @Subscribe
    public void listen(TestEvent event) {
        lastMessage = event.getMessage();
        System.out.println("Message:"+lastMessage);
    }

    public int getLastMessage() {
        return lastMessage;
    }
}
