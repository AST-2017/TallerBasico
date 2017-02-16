# TallerBasico 

### Practica Taller Basico de AST.


Servicio 2

1.Descargamos de Faitic: Noticias.wsdl.

2.Creamos el servicio con la herramienta wsdl2java de la siguiente forma:

    a) wsdl2java –ss –sd –uri Noticia.wsdl
    b) Nota: esto creará dos carpetas (src y resources) y un build.xml.
    
3.Modificamos el .java NoticiasSkeleton.java. 

    OJO: las variables han de ser static si queremos que se guarden valores.

4.Creamos el fichero .aar del sericio con ant y lo pegamos en webapps\axis2\WEB-INF\services:

5.Con todo esto listo, el servicio está listo para ser usado con el Cliente Java de Stubs o la Client API.

6.Creamos el cliente utilizando stubs en el cliente, para ello:

    a) wsdl2java -uri Noticia.wsdl
    b) Genera en src/noticia: NoticiaStub.java y NoticiaCallbackHandler.java
    c) Creamos un paquete noticias.Cliente
    d) Creamos ClienteStub y ClientAPI.

Notas: Si se trabaja con Mac/Ubuntu es necesario modificar el bash

    export JAVA_HOME=$(/usr/libexec/java_home)
    export AXIS2_HOME=/usr/local/binary_axis
    export AXIS_LIB=$AXIS_HOME/lib
    export ANT_HOME=/usr/local/apache_ant
    export PATH=$PATH:$ANT_HOME/bin:$AXIS2_HOME/bin:$AXIS_LIB
