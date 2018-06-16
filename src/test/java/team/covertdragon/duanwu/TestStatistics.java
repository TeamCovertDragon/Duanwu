package team.covertdragon.duanwu;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class TestStatistics {

    @Test
    public void testVote() throws Throwable {
        URL url = new URL("http://duanwu.tritusk.info");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        IOUtils.write("flavor=salty", connection.getOutputStream(), StandardCharsets.UTF_8);
        connection.getInputStream();
        connection.disconnect();
    }

    @Test
    public void testQueryStatistics() throws Throwable {
        URL url = new URL("http://duanwu.tritusk.info");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        String json = IOUtils.readLines(connection.getInputStream(), StandardCharsets.UTF_8).get(0);
        connection.disconnect();
        System.out.println(json);
    }
}
