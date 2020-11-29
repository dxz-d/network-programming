package com.kuang.lesson02;


import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/***
 * @description 客户端
 * @author diaoxiuze
 * @date 2020/11/22 13:32
 * @param
 * @return
 */
public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            // 1.要知道服务器的地址，端口号
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 8095;
            // 2.创建一个scoket连接
            socket = new Socket(serverIP, port);
            // 3.发送消息，IO流
            outputStream = socket.getOutputStream();
            outputStream.write("你好，欢迎学习狂神说java".getBytes());

            // 关闭连接
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
