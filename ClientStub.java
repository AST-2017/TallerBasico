package noticia.cliente;

import noticia.NoticiaStub;
import noticia.NoticiaStub.*;

import java.rmi.RemoteException;
import java.util.Scanner;

public class ClientStub {

        public static void main(String[] args) throws RemoteException{
            Scanner teclado = new Scanner(System.in);
            NoticiaStub noticiaStub = new NoticiaStub("http://localhost:8080/axis2/services/Noticia");

            /**
             * A continuacion vamos a setear los valores.
             */

            SetTitular setTitular = new SetTitular();
            System.out.println("Ingrese un titular: ");
            String titular = teclado.nextLine();
            System.out.println("Ha ingresado como titular: " + titular);
            setTitular.setTitular(titular);


            SetDescripcion setDescripcion = new SetDescripcion();
            System.out.println("Ingrese la descripcion: ");
            String descripcion = teclado.nextLine();
            System.out.println("Ha ingresado como descripcion: " + descripcion );
            setDescripcion.setDescripcion(descripcion);

            SetUrl setUrl = new SetUrl();
            System.out.println("Ingrese la url: ");
            String url = teclado.nextLine();
            System.out.println("Ha ingresado como url: " + url);
            setUrl.setUrl(url);

            /**
             * Set de noticiaStub con los valores de cada uno
             * de los campos @Titular, @Descripcion y @Url.
             */
            noticiaStub.setTitular(setTitular);
            noticiaStub.setDescripcion(setDescripcion);
            noticiaStub.setUrl(setUrl);

            teclado.close();

            /**
             * Obtenemos las respuestas:
             */
            GetTitular getTitular = new GetTitular();
            GetTitularResponse getTitularResponse = noticiaStub.getTitular(getTitular);

            GetDescripcion getDescripcion = new GetDescripcion();
            GetDescripcionResponse getDescripcionResponse = noticiaStub.getDescripcion(getDescripcion);

            GetUrl getUrl = new GetUrl();
            GetUrlResponse getUrlResponse = noticiaStub.getUrl(getUrl);

            /**
             * Imprimimos los resultados:
             */

            System.out.println("\nEl titular recuperado es: "+ getTitularResponse.get_return());
            System.out.println("\nLa descripcion recuperada es: "+ getDescripcionResponse.get_return());
            System.out.println("\nEl URL recuperado es: "+ getUrlResponse.get_return());
        }
}
