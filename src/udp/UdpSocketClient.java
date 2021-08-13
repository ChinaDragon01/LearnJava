package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * WebSocket与消息推送
 * https://www.cnblogs.com/best/p/5695570.html
 *
 * https://blog.csdn.net/u014209205/article/details/80461122?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7Edefault-5.base&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7Edefault-5.base
 */
public class UdpSocketClient {
    public static void main(String[] args) {
        String localIp = "10.0.52.84";
        final int port = 8099;
        // 要发送的消息
        String sendMsg = "Udp 客户端发送的消息";
        try {
            //明确目的地的IP地址
            InetAddress inetAddress = InetAddress.getByName(localIp);

            // 创建packet包对象，封装要发送的包数据和服务器地址和端口号
            DatagramPacket datagramPacket = new DatagramPacket(sendMsg.getBytes(), sendMsg.getBytes().length, inetAddress, port);

            // 创建Socket对象
            DatagramSocket datagramSocket = new DatagramSocket();

            // 发送消息到服务器
            datagramSocket.send(datagramPacket);

            // 关闭socket
            datagramSocket.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
