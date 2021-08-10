package eventbus;

/**
 * Guava学习笔记：EventBus
 * https://www.cnblogs.com/peida/p/EventBus.html
 */
public class TestEvent {
    private final int message;
    public TestEvent(int message) {
        this.message = message;
        System.out.println("event message:"+message);
    }
    public int getMessage() {
        return message;
    }
}
