package com.kuang.lesson01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/***
 * @description 测试ip
 * @author diaoxiuze
 * @date 2020/11/22 12:40
 */
public class TestInetAddress {

    public static void main(String[] args) {
        try {
            // 查询本机地址
            final InetAddress inetAddress01 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress01);
            final InetAddress inetAddress02 = InetAddress.getByName("localhost");
            System.out.println(inetAddress02);
            final InetAddress inetAddress03 = InetAddress.getLocalHost();
            System.out.println(inetAddress03);

            // 查询网站ip地址
            final InetAddress inetAddressBaiDu = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddressBaiDu);

            // 常用方法
            System.out.println(inetAddressBaiDu.getAddress());
            // 规范的名字
            System.out.println("规范的名字:" + inetAddressBaiDu.getCanonicalHostName());
            // ip
            System.out.println(inetAddressBaiDu.getHostAddress());
            // 域名，或者自己电脑的名字
            System.out.println(inetAddress01.getCanonicalHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
