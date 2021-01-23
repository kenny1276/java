import java.util.*;
public class password {

	public static void main(String[] args) {
		int length = 10;
		System.out.println(geek_Password( length));
	}
	static char [] geek_Password( int len) {
		System.out.println("naklju;no generira geslo( ) : ");
		System.out.print("Tvoje novo geslo je : ");
		String Capital_chares = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
		String Small_chares = "abcdefghijklmnoprstuvwxyz";
		String Numbers = "1234567890";
		String values = Capital_chares + Small_chares + Numbers;
		Random rndm_methode = new Random( );
		char [] password = new char[len];
		for (int i = 0; i < len; i++) {
			password[i] = values.charAt(rndm_methode.nextInt(values.length()));
		}
		return password;
	}
}
