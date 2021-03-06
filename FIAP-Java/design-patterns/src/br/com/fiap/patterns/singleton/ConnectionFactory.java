package br.com.fiap.patterns.singleton;

import br.com.fiap.patterns.factory.Database;
import br.com.fiap.patterns.factory.OracleConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    private static ConnectionFactory instance;

    private ConnectionFactory() {
        System.out.println("Connection Factory criada com sucesso.");
    }

    public static synchronized ConnectionFactory getInstance() {
        if(instance == null) instance = new ConnectionFactory();
        return instance;
    }

    public Connection getConnection(Database database) throws IOException, SQLException, ClassNotFoundException {
        if(database == Database.ORACLE) return new OracleConnection().getConnection();
        if(database == Database.MYSQL) return null;
        if(database == Database.MONGO_DB) return null;
        return null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
