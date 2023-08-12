public class Lista {   
    
    Nodo inicio,fin;

    
   public Lista (){

 
    inicio = null;
        fin = null;

   }

   public Boolean estaVacia (){

        if(inicio==null);

        return true;
    }

public void agregandoAlInicio(String d){

    if(estaVacia()){

    
inicio = new Nodo(d, inicio);
fin = inicio;
    }
    else
    {
        inicio = new Nodo(d, inicio);
    }
}
 
    
}