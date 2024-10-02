package Client_Server_and_URL_Connection;//import java.io.IOException;
//import java.io.InputStream;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLConnection;
//

//public class Client_Server_and_URL_Connection.url_client {
//    public static void main(String[] args) throws IOException {
//        URL url = new URL("https://simple.wikipedia.org/wiki/JavaScript");
//        URLConnection conn = url.openConnection();
////        InputStream IS = conn.getInputStream();
//
//        System.out.println(conn.getContent());
//        System.out.println(conn.getURL());
//        System.out.println(conn.getContentType());
//
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class url_client {
    public static void main(String[] args) throws IOException {
        // Create a URL object
        URL url = new URL("https://api.github.com/users/ritik692");

        // Open a connection to the URL
        URLConnection conn = url.openConnection();

        // Set the User-Agent to simulate Brave browser
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36 Brave/111");

        // Optional: Cast to HttpURLConnection if needed for HTTP-specific features
        if (conn instanceof HttpURLConnection) {
            HttpURLConnection httpConn = (HttpURLConnection) conn;
            System.out.println("Response Code: " + httpConn.getResponseCode());
            System.out.println(httpConn.getResponseMessage());
//            System.out.println(httpConn.get);
        }

        // Get and print the content
        System.out.println(conn.getContent());
        System.out.println("URL: " + conn.getURL());
        System.out.println("Content-Type: " + conn.getContentType());

        InputStream IS = conn.getInputStream();
        BufferedReader bf = new BufferedReader(new InputStreamReader(IS));
        StringBuilder sb = new StringBuilder();

        String line;
        while((line = bf.readLine())!= null)
        {
            sb.append(line).append(System.lineSeparator());

        }
        System.out.println(sb.toString());

    }
}

