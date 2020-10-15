package br.com.fiap.singleton;

public class Singleton {
	
    public static Singleton instance;

	private Singleton() {
        System.out.println("Objeto criado com sucesso!");
    }

    public static synchronized Singleton getInstance() {
        if(instance == null) {
        	System.out.println("Inst�ncia criada com sucesso!");
        	instance = new Singleton();
        }
        return instance;
    }

    protected void imprime() {
    	System.out.println("Impress�o realizada com sucesso!");
    }
}
