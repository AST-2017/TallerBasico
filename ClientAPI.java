package noticia.cliente;

import org.apache.axis2.client.*;
import org.apache.axiom.om.*;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.AxisFault;
import java.util.Scanner;

public class ClientAPI {
    public static void main(String [] args) throws AxisFault{

        OMElement res;
        ServiceClient sc = new ServiceClient();
        Options opciones = new Options();
        opciones.setTo(new EndpointReference("http://localhost:8080/axis2/services/Noticia"));


        Scanner entrada;
        sc.setOptions(opciones);

        opciones.setAction("urn:setTitular");
        System.out.println("Introduzca un titular para enviar:");
        entrada = new Scanner(System.in);
        String titularEscrito = entrada.nextLine();
        sc.fireAndForget(createPayLoadSetTitular(titularEscrito));

        opciones.setAction("urn:setDescripcion");
        System.out.println("Introduzca una descripción para enviar:");
        String descripcionEscrita = entrada.nextLine();
        sc.fireAndForget(createPayLoadSetDescripcion(descripcionEscrita));

        opciones.setAction("urn:setUrl");
        System.out.println("Introduzca una URL para enviar:");
        String urlEscrita = entrada.nextLine();
        sc.fireAndForget(createPayLoadSetUrl(urlEscrita));

        entrada.close();

        opciones.setAction("urn:getTitular");
        System.out.println("\nEl titular recuperado es: ");
        res = sc.sendReceive(createPayLoadGetTitular());
        System.out.println(res.getFirstElement().getText());

        opciones.setAction("urn:getDescripcion");
        System.out.println("\nLa descripcion recuperada es: ");
        res = sc.sendReceive(createPayLoadGetDescripcion());
        System.out.println(res.getFirstElement().getText());

        opciones.setAction("urn:getUrl");
        System.out.println("\nEl URL recuperado es: ");
        res = sc.sendReceive(createPayLoadGetUrl());
        System.out.println(res.getFirstElement().getText());
    }

    public static OMElement createPayLoadGetTitular(){
        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = factory.createOMNamespace("http://Noticia","ns1");
        OMElement OMElement = factory.createOMElement("getTitular",omNs);
        return OMElement;
    }

    public static OMElement createPayLoadGetDescripcion(){
        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = factory.createOMNamespace("http://Noticia","ns2");
        OMElement OMElement = factory.createOMElement("getDescripcion",omNs);
        return OMElement;
    }

    public static OMElement createPayLoadGetUrl(){
        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = factory.createOMNamespace("http://Noticia","ns3");
        OMElement OMElement = factory.createOMElement("getUrl",omNs);
        return OMElement;
    }

    public static OMElement createPayLoadSetTitular(String titular){
        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = factory.createOMNamespace("http://Noticia","ns4");
        OMElement OMElement = factory.createOMElement("setTitular",omNs);
        OMElement value = factory.createOMElement("titular",omNs);
        value.setText(titular);
        OMElement.addChild(value);
        return OMElement;
    }

    public static OMElement createPayLoadSetDescripcion(String descripcion){
        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = factory.createOMNamespace("http://Noticia","ns5");
        OMElement OMElement = factory.createOMElement("setDescripcion",omNs);
        OMElement value = factory.createOMElement("descripcion",omNs);
        value.setText(descripcion);
        OMElement.addChild(value);
        return OMElement;
    }

    public static OMElement createPayLoadSetUrl(String url){
        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = factory.createOMNamespace("http://Noticia","ns6");
        OMElement OMElement = factory.createOMElement("setUrl",omNs);
        OMElement value = factory.createOMElement("url",omNs);
        value.setText(url);
        OMElement.addChild(value);
        return OMElement;
    }


}