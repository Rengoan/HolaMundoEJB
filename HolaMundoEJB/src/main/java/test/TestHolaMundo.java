package test;

import beans.HolaMundoEJBRemote;
import javax.naming.Context;
import javax.naming.InitialContext;

public class TestHolaMundo {
    public static void main(String[] args){
        System.out.println("Iniciando llamada al EJB desde el cliente \n");
        
        try {
            Context jndi= new InitialContext();
             //Importamos las clases y hacemos el casteo
            HolaMundoEJBRemote holaMundoEJB = (HolaMundoEJBRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEJBImpl!beans.IHolaMundoEJBRemote");
            int resultado = holaMundoEJB.suma(7, 12);
            
        } catch (Exception e) {
        }
    }
}
