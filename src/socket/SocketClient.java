package socket;

import utils.PrintlnUtils;

import java.io.*;
import java.net.Socket;

/**
 * WebSocket与消息推送
 * https://www.cnblogs.com/best/p/5695570.html
 *
 * https://blog.csdn.net/u014209205/article/details/80461122?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7Edefault-5.base&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7Edefault-5.base
 */
public class SocketClient {//TODO Socket通信

    public static void main(String[] args) {
        String localIp = "10.0.52.84";
        final int port = 8099;
        try {
            // 和服务器创建连接
            Socket socket = new Socket(localIp, port);

            // 要发送给服务器的信息
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write("客户端发送信息");
            printWriter.flush();

            socket.shutdownOutput();



            // 从服务器接收的信息
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String info  = null;
            while ((info = bufferedReader.readLine()) != null) {
                PrintlnUtils.println("我是客户端，服务器返回信息："+info);
            }

            bufferedReader.close();
            inputStream.close();
            outputStream.close();
            printWriter.close();

            socket.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
