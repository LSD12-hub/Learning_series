package za.co.wethinkcode;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HttpResponse<String> response = Unirest.get("https://catfact.ninja/facts").asString(); 
        System.out.println("Response Status Code:" + response.getStatus()); 
        System.out.println("Body: " + response.getBody()); 
    }
}
