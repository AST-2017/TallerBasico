/**
 * NoticiaSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package noticia;

/**
 *  NoticiaSkeleton java skeleton for the axisService
 */
public class NoticiaSkeleton {

    private static java.lang.String titular;
    private static java.lang.String url;
    private static java.lang.String descripcion;

    /**
     * Auto generated method signature
     *
     * @param getTitular
     * @return getTitularResponse
     */
    public noticia.GetTitularResponse getTitular(noticia.GetTitular getTitular) {
        GetTitularResponse getTitularResponse = new GetTitularResponse();
        getTitularResponse.set_return(titular);
        return getTitularResponse;
    }

    /**
     * Auto generated method signature
     *
     * @param setTitular
     * @return
     */
    public void setTitular(noticia.SetTitular setTitular) {
        titular = setTitular.getTitular();
    }

    /**
     * Auto generated method signature
     *
     * @param setDescripcion
     * @return
     */
    public void setDescripcion(noticia.SetDescripcion setDescripcion) {
       descripcion = setDescripcion.getDescripcion();
    }

    /**
     * Auto generated method signature
     *
     * @param getDescripcion
     * @return getDescripcionResponse
     */
    public noticia.GetDescripcionResponse getDescripcion(noticia.GetDescripcion getDescripcion) {
        GetDescripcionResponse getDescripcionResponse = new GetDescripcionResponse();
        getDescripcionResponse.set_return(descripcion);
        return getDescripcionResponse;
    }

    /**
     * Auto generated method signature
     *
     * @param getUrl
     * @return getUrlResponse
     */
    public noticia.GetUrlResponse getUrl(noticia.GetUrl getUrl) {
        GetUrlResponse getUrlResponse = new GetUrlResponse();
        getUrlResponse.set_return(url);
        return getUrlResponse;
    }

    /**
     * Auto generated method signature
     *
     * @param setUrl
     * @return
     */
    public void setUrl(noticia.SetUrl setUrl) {
        url = setUrl.getUrl();
    }
}
