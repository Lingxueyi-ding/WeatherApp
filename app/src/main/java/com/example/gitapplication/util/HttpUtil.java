package com.example.gitapplication.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    private static final String TAG = "HttpUtil";

    //    发起请求只需要调用sendOkHttpRequest()方法，
//          传入请求地址，并注册一个回调用来处理服务器响应
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
