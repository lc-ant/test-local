package test;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Base64;

public class GenerateKeyPair {

	public static void main(String[] args) {
		try {
			KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
			generator.initialize(2048);
			KeyPair pair = generator.generateKeyPair();
			System.out.println("public-key: " + Base64.getEncoder().encodeToString(pair.getPublic().getEncoded()));
			System.out.println("private-key: " + Base64.getEncoder().encodeToString(pair.getPrivate().getEncoded()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
