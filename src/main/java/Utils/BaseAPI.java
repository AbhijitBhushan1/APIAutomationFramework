package Utils;


import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BaseAPI {
    public static Response sendGet (String url,Map<String,String> header) throws Exception
    {
        Response bodyresponse = new Response();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        StringBuffer body = new StringBuffer();
        header.put("Content-Type","application/json");
        try {
            HttpGet httpGet = new HttpGet(url);
            for (Map.Entry<String,String> entry:header.entrySet())
            httpGet.addHeader(entry.getKey(),entry.getValue());
            CloseableHttpResponse response = httpclient.execute(httpGet);
            try {
                if (response.getEntity() != null) {
                    String inputline;
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                    while ((inputline = bufferedReader.readLine()) != null) {
                        body.append(inputline);
                    }
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (UnsupportedOperationException e) {
                e.printStackTrace();
            }
            bodyresponse.setBody(body.toString());
            bodyresponse.setStatusline(response.getStatusLine().toString());
            bodyresponse.setStatusCode(response.getStatusLine().getStatusCode());
        }

        finally
    {
        httpclient.close();
    }
return bodyresponse;
        }
    public static Response sendPost (String url,Map<String,String> header,String payload) throws Exception
    {
        Response bodyresponse = new Response();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        StringBuffer body = new StringBuffer();
        header.put("Content-Type","application/json");
        try {
            HttpPost httpPost = new HttpPost(url);

            for (Map.Entry<String,String> entry:header.entrySet())
                httpPost.addHeader(entry.getKey(),entry.getValue());
            httpPost.setEntity(new StringEntity(payload));

            CloseableHttpResponse response = httpclient.execute(httpPost);
            try {
                if (response.getEntity() != null) {
                    String inputline;
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                    while ((inputline = bufferedReader.readLine()) != null) {
                        body.append(inputline);
                    }
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (UnsupportedOperationException e) {
                e.printStackTrace();
            }
            bodyresponse.setBody(body.toString());
            bodyresponse.setStatusline(response.getStatusLine().toString());
            bodyresponse.setStatusCode(response.getStatusLine().getStatusCode());
        }

        finally
        {
            httpclient.close();
        }
        return bodyresponse;
    }
    public static Response sendPut (String url,Map<String,String> header,String payload) throws Exception
    {
        Response bodyresponse = new Response();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        StringBuffer body = new StringBuffer();
        header.put("Content-Type","application/json");
        try {
            HttpPut httpPutost = new HttpPut(url);
            for (Map.Entry<String,String> entry:header.entrySet())
                httpPutost.addHeader(entry.getKey(),entry.getValue());
            httpPutost.setEntity(new StringEntity(payload));

            CloseableHttpResponse response = httpclient.execute(httpPutost);
            try {
                if (response.getEntity() != null) {
                    String inputline;
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                    while ((inputline = bufferedReader.readLine()) != null) {
                        body.append(inputline);
                    }
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (UnsupportedOperationException e) {
                e.printStackTrace();
            }
            bodyresponse.setBody(body.toString());
            bodyresponse.setStatusline(response.getStatusLine().toString());
            bodyresponse.setStatusCode(response.getStatusLine().getStatusCode());
        }

        finally
        {
            httpclient.close();
        }
        return bodyresponse;
    }


}
