package in.sudha.streamapi;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64Demo {

	public static void main(String[] args) {

		String msg="Welcome to all This is Sudha G";
		
		Encoder encoder = Base64.getEncoder();
		// converting String to byte[] and passing as input for encode( ) method
		byte[] encode = encoder.encode(msg.getBytes());
		// Converting byte[] to String
		String encodeString = new String(encode);
		System.out.println("Encodede String --"+encodeString);
		
//		String encodeToString = encoder.encodeToString(msg.getBytes());
//		System.out.println("Encodeded String --> "+encodeToString);
		
		
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeString);
		String  decodedString= new String(decode);
		System.out.println("Decoded String --> "+decodedString);
	}

}
