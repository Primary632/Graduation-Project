package com.peng.elderlymanage.common;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @projectName: Graduation-Project
 * @className: AppConfig
 * @description:
 * @author: 空城丶
 * @create: 2022-03-09 15:21
 **/
    public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2021000119629796";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDqtEWDbrgrASh7jxWP50gVnsM76q/10/1Qa1ImN7lSEgAXRQ9DdXpTo90W1tlFbFl930eI+gGvMUt8k76zO6peuKccIH/w/ilBeA3KT0iTYg3+Pfo8S93J61V4h1nzvM/PTfQgi7DNftNzDjHNJFh+LE/8l1axvehvh1s9Sh+S8Sf8kGWRMJpRA6ikunDcY7waTAWjsip619XIz9HqrOMixLlfNSF3ra/O8urEVJBqFknRcogDswK/Ze2lDCJlAURy75jRpdFVvZLrkW9gpz5fXS2yBTqJriaItXC2cXDPVhZWjgXJS7tMl+CDmLJO9xU1PU1/HK6TfXQMaLysi79ZAgMBAAECggEBAMydUwjtitO7E778lBC70oU+vvhKdxL6uJnWpmy5IfBhzwB6bX8jOP0YG5RgxFSYzEBHWwcY5kUE1cmKyLNbLgGcO9vynXfNLMxtzJ/2lNAgqRBgmfrdLUNuzjngzlQG5KjXTiDdh8rvaYqh8lrk990v5p/QlH0qkixBNhLtvy8LMZmoFCH77Gj41Nqa3S9H1b497ecPE6iM1arm+RRy+Rh60gPfUilyYoiGJ1P5QsD37Pp7skR8BoXRc8kdKFJJcAc/1qT5ggY8kd5Kcm8RXzb7yE7kZzjQw7YZNScT+MbPB/kzXaatY3nTib9/nM+Wv7U7un+MOyRWrP7qc5zl7YECgYEA+WwnB/SGHSlRSw56pV2zmDvK+RBHDGs2VSWsl/FQRPAxbLZXtUiwCKj8FxNadnVhu7EuOj9y8LuDuA25L3mKrDhhSUa5Vk0Rh+ulcQVLsLl3+/amCg+3iiGRrToZkagSwrDtvXO81qGz2A3J2e0zmc3zkrHw9pLfW+GkMCzbWIkCgYEA8OTBknArMVyGz27Uewkqdx5gcpBN8yt3e3fCBQLkTnaFE2TtprcCy/hssdXQXsJag1EkkG/2zssOW87oBF2Et1SA9X35Xepd8gMNaUes1uHRrgxOdnQlxYSD1fr8wAOaRinseeFzqMvtIEm2bvctG1SGlQdTbo240Lds/aDX3FECgYBNAsquVx6NpHM4NHlD08Ge8F9ENXVqbTPyaFZ494YsMulfwpEkJRRNKDflvBEDYEzT0eoPDAYmNA+AZaRW9zUM5b+MC20wK02NZQHI+rSbFTjpsAcmNiIaYTEEhlrcsUNRn6VYCIM21eicfe1j/ywegguBsLVQvJqAWRQD1+XF2QKBgQCT2OKRXPS1jANVhsE0blC44VTym2ysJW5kwgC7kKXNHmLYn2ZYnxRBWcxkbUVBE2n4FLIrT/ybuPasFFZEb51H475ubY3CPVjBc2wkxI/pJpnJh9YUT37rNkSv7SZ5NvzVuV9hAqU44Ug9O+CTRHNTxdH/34ouXR8kQp/LHo+9sQKBgQDm9NAxQL+Olwn3l78aa9zrrX0QNCh8RQddhLExsHtcgNLvHb3ao+Ns4oy6Xdy/PcvYUjWFad6Gi4B06v7t+awNn0lET0BKNMK+BXnFD54AQ6Pab0GIJlt4R0BVEdb80HXoEEMmORuqXWWDx8QXSzaKEFVbL/CfLUxx2m0ejWL3eQ==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkBrBminW/QX9pB41Le20jP6a9rkUrPAEcOgsMcmdRCIL+y6Hhrpfky4c6x+sIFNS0Nfa60HIMNK9FffzXrMnttYt/lDmPRPKGDs90BLEFFy3wUfc74qIxfgH8eQHYIPfRVBid95X6D+lK+ovbJjfHeQh7BAS7UwlEbXFTxbsDZXlwhrtvqQ+lT6Qipr6byBmfzUu91On+enA2wJQgBkfPAbdakPPnmj6kpFZro5O3ORtQ+8e7dq6RgSV5MCubWqKwtkGZ/Hsi/uLUuFjmct2xMELD+ncjXFLuqq5aWJ9JA1gwwoQ+oC9BY4HGubcnXA8N9qmuWZdMRYEMR4FzUFyoQIDAQAB";

    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:9903/notify_url.jsp";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://localhost:9903/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";
    //↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    }


