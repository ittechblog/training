package com.huaxun.lombok;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2016/2/26.
 */
public class LomTest {

    private static final Logger logger = LoggerFactory.getLogger(LomTest.class);

    public static void main(String[] args){
        LomData lomData = new LomData();
        lomData.setAddress("1111111");
        logger.info(lomData.getAddress());
    }
}
