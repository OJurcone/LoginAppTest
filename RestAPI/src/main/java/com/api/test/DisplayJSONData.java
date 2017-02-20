package com.api.test;

/**
 * Created by Orlo on 2/19/2017.
 */
public class DisplayJSONData {
    public static void main(String[] args){
        try{
            System.out.println("********************\n"+ "URL: http://jsonplaceholder.typicode.com/comments/1");
            DataComments data = RestApiTest.getData("http://jsonplaceholder.typicode.com/comments/1");
            System.out.println("result: \n"+data);
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            System.out.println("********************\n"+ "URL: http://jsonplaceholder.typicode.com/photos/1");
            Dataphotos dataphotos = RestApiTest.getDataphotos("http://jsonplaceholder.typicode.com/photos/1");
            System.out.println("result: \n"+dataphotos);
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            System.out.println("********************\n"+ "URL: http://jsonplaceholder.typicode.com/users/1");
            Datausers datausers = RestApiTest.getDatausers("http://jsonplaceholder.typicode.com/users/1");
            System.out.println("result: \n"+datausers);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
