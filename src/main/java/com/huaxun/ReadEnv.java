package com.huaxun;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2016/2/29.
 */
public class ReadEnv {
    public static void main(String[] args) throws IOException {
        ReadEnv readEnv = new ReadEnv();
        readEnv.read();
    }

    public void read() throws IOException {
        String path = getClass().getClassLoader().getResource("test.properties").getPath();
        Properties prop =  new Properties();
        FileInputStream in = new FileInputStream(path);
        prop.load(in);
        System.out.println(prop.getProperty("name"));
    }
}
