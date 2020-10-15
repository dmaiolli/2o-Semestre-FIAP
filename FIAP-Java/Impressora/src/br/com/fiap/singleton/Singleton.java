package br.com.fiap.singleton;

public class Singleton {
	
    public static Singleton instance;

	private Singleton() {
        System.out.println("Objeto criado com sucesso!");
    }

    public static synchronized Singleton getInstance() {
        if(instance == null) {
        	System.out.println("Instância criada com sucesso!");
        	instance = new Singleton();
        }
        return instance;
    }

    protected void imprime() {
    	System.out.println("Impressão realizada com sucesso!");
    }
}
