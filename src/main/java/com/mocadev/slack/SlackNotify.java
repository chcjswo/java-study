package com.mocadev.slack;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by chcjswo on 2019-06-27
 *
 * Blog: http://mocadev.tistory.com
 * Github: http://github.com/chcjswo
 */
public class SlackNotify {
    public static void main(String[] args) {
        try {
            slackNotify();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void slackNotify() throws IOException {
        String hooksSlack = "https://hooks.slack.com/services/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";

        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(hooksSlack);

        String message = "java에서 보내는 메시지 입니다. 간단하구만~~ 재밌구만~~~";
        String json = "{ \"username\": \"O2O\", " +
                "\"text\": \"" + message + "\", " +
                "\"icon_emoji\": \":skull:\" }";
        StringEntity entity = new StringEntity(json, "UTF-8");

        httpPost.setEntity(entity);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");

        client.execute(httpPost);
        client.close();
    }
}
