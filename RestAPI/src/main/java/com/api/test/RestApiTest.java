package com.api.test;

import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Orlo on 2/19/2017.
 */
public class RestApiTest {
  public static DataComments getData(String url) throws Exception {
      DefaultHttpClient httpClient = new DefaultHttpClient();
      HttpGet httpGet = new HttpGet(url);
      httpGet.addHeader("accept", "application/json");
      HttpResponse response = httpClient.execute(httpGet);
      String data = readData(response);
      Gson gson = new Gson();
      return gson.fromJson(data, DataComments.class);

  }
    public static Dataphotos getDataphotos(String url) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(url);
        httpGet.addHeader("accept", "application/json");
        HttpResponse response = httpClient.execute(httpGet);
        String dataphotos = readData(response);
        Gson gson = new Gson();
        return gson.fromJson(dataphotos, Dataphotos.class);

    }
    public static Datausers getDatausers(String url) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(url);
        httpGet.addHeader("accept", "application/json");
        HttpResponse response = httpClient.execute(httpGet);
        String datausers = readData(response);
        Gson gson = new Gson();
        return gson.fromJson(datausers, Datausers.class);

    }

  public static String readData(HttpResponse httpResponse) throws Exception {
      BufferedReader bufferedReader=null;
      try{
          bufferedReader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
          StringBuffer buffer = new StringBuffer();
          char[] dataLength = new char[1024];
          int read;
          while ((read = bufferedReader.read(dataLength)) != -1){
              buffer.append(dataLength, 0, read);
          }
          return buffer.toString();
      }catch (Exception e){
          throw e;
      }finally {
          if (bufferedReader != null)
              bufferedReader.close();
      }
  }
}
