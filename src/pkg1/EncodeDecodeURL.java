package pkg1;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class EncodeDecodeURL {
	
	public static String decode(String givenUrl) throws UnsupportedEncodingException
	{
		String decodeUrl = givenUrl;
		decodeUrl= URLDecoder.decode(givenUrl,StandardCharsets.UTF_8.name());
		return decodeUrl;
	}
	
	public static String encode(String givenUrl) throws UnsupportedEncodingException
	{
		String encodeUrl = givenUrl;
		encodeUrl= URLEncoder.encode(givenUrl,StandardCharsets.UTF_8.name());
		return encodeUrl;
	}	

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String url = "https://test.com/test/?id=111?name-hitesh";
		String eUrl=encode(url);
		System.out.println(eUrl);
		String dUrl=decode(eUrl);
		System.out.println(dUrl);

	}

}
