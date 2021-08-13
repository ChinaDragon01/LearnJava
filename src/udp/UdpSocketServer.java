package udp;

import utils.PrintlnUtils;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * WebSocket与消息推送
 * https://www.cnblogs.com/best/p/5695570.html
 * <p>
 * java--UDP通信和TCP通信
 * https://www.cnblogs.com/-dashu/p/9564663.html
 * <p>
 * https://blog.csdn.net/u014209205/article/details/80461122?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7Edefault-5.base&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7Edefault-5.base
 */
public class UdpSocketServer {
    public static void main(String[] args) {
        String localIp = "10.0.52.84";
        final int port = 8099;
        try {

/*
            while (true) {

                // 要接收的报文
                byte[] bytes = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

                // 创建socket并指定端口
                DatagramSocket datagramSocket = new DatagramSocket(port);

                // 接收socket客户端发送的数据。如果未收到会一致阻塞
                datagramSocket.receive(datagramPacket);
                String receiveMsg = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                PrintlnUtils.println("Udp 接收socket客户端发送的数据 datagramPacket.getLength() = " + datagramPacket.getLength());
                PrintlnUtils.println("Udp 接收socket客户端发送的数据 receiveMsg = " + receiveMsg);
                datagramSocket.close();

            }*/


            // 要接收的报文
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

            // 创建socket并指定端口
            DatagramSocket datagramSocket = new DatagramSocket(port);

            // 接收socket客户端发送的数据。如果未收到会一致阻塞
            datagramSocket.receive(datagramPacket);
            String receiveMsg = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            PrintlnUtils.println("Udp 接收socket客户端发送的数据 datagramPacket.getLength() = " + datagramPacket.getLength());
            PrintlnUtils.println("Udp 接收socket客户端发送的数据 receiveMsg = " + receiveMsg);
            datagramSocket.close();


        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
