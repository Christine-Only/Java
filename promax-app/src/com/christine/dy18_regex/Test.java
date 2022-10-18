package com.christine.dy18_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str = "我爱你中国电话021-51198868联系邮箱2917748734chris@qq.com，手机号17735164540，座机4001003232";

        // 定义爬取规则 字符串形式
        String regex = "(0\\d{2,6}-\\d{6,9})|(\\w{1,30}@[a-zA-Z]{2,20}(\\.[a-zA-Z]{2,20}){1,2})|(400-?\\d{3,9})|(1[3-9]\\d{9})";

        // 把爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        // 得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
