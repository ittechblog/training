package com.huaxun;

/**
 * Created by Administrator on 2016/2/29.
 */
public class ReadEnv {
    public static void main(String[] args){
        ReadEnv readEnv = new ReadEnv();
        readEnv.read();
    }

    public void read(){
        String path = getClass().getClassLoader().getResource("dev.properties").getPath();
        System.out.println(path);
    }
}
