package beans;

import javax.ejb.Stateless;

@Stateless
public class HolaMundoEJBImpl implements HolaMundoEJBRemote{

    @Override
    public int suma(int a, int b) {
        System.out.println("Ejecutando metodo suma desde el servidor");
        return a + b;
    }
    
}
