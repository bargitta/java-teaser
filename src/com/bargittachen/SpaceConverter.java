package com.bargittachen;

import java.security.InvalidAlgorithmParameterException;

/**
 * Created by xichen on 8/10/14.
 * 将字符串数组种的空格元素（space）转换为％20
 */
public class SpaceConverter {

    public static void convert(char[] words) throws InvalidAlgorithmParameterException {
        if(words == null) {
            throw new InvalidAlgorithmParameterException();
        }
        words = new char[]{'a', '%', '2', '0', 'c'};
    }
}
