//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.15 a las 08:11:47 PM CET 
//


package clasesJAXB;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clasesJAXB package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Examen_QNAME = new QName("", "examen");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clasesJAXB
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoExamen }
     * 
     */
    public TipoExamen createTipoExamen() {
        return new TipoExamen();
    }

    /**
     * Create an instance of {@link TipoAutores }
     * 
     */
    public TipoAutores createTipoAutores() {
        return new TipoAutores();
    }

    /**
     * Create an instance of {@link TipoPreguntas }
     * 
     */
    public TipoPreguntas createTipoPreguntas() {
        return new TipoPreguntas();
    }

    /**
     * Create an instance of {@link TipoAutor }
     * 
     */
    public TipoAutor createTipoAutor() {
        return new TipoAutor();
    }

    /**
     * Create an instance of {@link TipoPregunta }
     * 
     */
    public TipoPregunta createTipoPregunta() {
        return new TipoPregunta();
    }

    /**
     * Create an instance of {@link TipoRespuesta }
     * 
     */
    public TipoRespuesta createTipoRespuesta() {
        return new TipoRespuesta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoExamen }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoExamen }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "examen")
    public JAXBElement<TipoExamen> createExamen(TipoExamen value) {
        return new JAXBElement<TipoExamen>(_Examen_QNAME, TipoExamen.class, null, value);
    }

}
