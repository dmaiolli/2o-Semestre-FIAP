package br.com.fiap.singleton;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		Singleton singleton = null;
		
		for(int i = 0; i < 1000; i++) {
			singleton = Singleton.getInstance();
		}
		
		singleton.imprime();
	}
}
