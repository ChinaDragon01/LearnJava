package socket;

import utils.PrintlnUtils;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * WebSocket与消息推送
 * https://www.cnblogs.com/best/p/5695570.html
 *
 * java--UDP通信和TCP通信
 * https://www.cnblogs.com/-dashu/p/9564663.html
 *
 * https://blog.csdn.net/u014209205/article/details/80461122?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7Edefault-5.base&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7Edefault-5.base
 */
public class SocketServer {
    static final int port = 8099;

    public static void main(String[] args) {
        // 创建服务端socket
        try {
            ServerSocket socketServer = new ServerSocket(port);

            // 创建客户端socket
            Socket socket = null;

            while (true) {
                socket = socketServer.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
                InetAddress inetAddress = socket.getInetAddress();
                PrintlnUtils.println("当前客户端的IP：" + inetAddress);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
