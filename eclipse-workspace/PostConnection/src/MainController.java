import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
;
public class MainController {

	public static void main(String[] args) {
		
		try {
			connessione();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void connessione() throws IOException, InterruptedException {
		
		String requestBody;
        var values = new HashMap<String, String>() {{
            put("nome", "mario");
            put ("cognome", "geppino");
            put("partitaIva", "GRT556");
        }};
        
        var objectMapper = new ObjectMapper();
       
		requestBody = objectMapper.writeValueAsString(values);

		
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest httpRequest = HttpRequest.newBuilder()
				.uri(URI.create("http://localhost:8080/admin/addNew"))
				.POST(HttpRequest.BodyPublishers.ofString(requestBody))
				.build();
		
		
        HttpResponse<String> response;
	
		response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());

		}
	
}
