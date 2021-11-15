//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.15 a las 08:11:47 PM CET 
//


package clasesJAXB;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoExamen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoExamen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autores" type="{}TipoAutores"/&gt;
 *         &lt;element name="preguntas" type="{}TipoPreguntas"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoExamen", propOrder = {
    "autores",
    "preguntas"
})
public class TipoExamen {

    @XmlElement(required = true)
    protected TipoAutores autores;
    @XmlElement(required = true)
    protected TipoPreguntas preguntas;

    /**
     * Obtiene el valor de la propiedad autores.
     * 
     * @return
     *     possible object is
     *     {@link TipoAutores }
     *     
     */
    public TipoAutores getAutores() {
        return autores;
    }

    /**
     * Define el valor de la propiedad autores.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAutores }
     *     
     */
    public void setAutores(TipoAutores value) {
        this.autores = value;
    }

    /**
     * Obtiene el valor de la propiedad preguntas.
     * 
     * @return
     *     possible object is
     *     {@link TipoPreguntas }
     *     
     */
    public TipoPreguntas getPreguntas() {
        return preguntas;
    }

    /**
     * Define el valor de la propiedad preguntas.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPreguntas }
     *     
     */
    public void setPreguntas(TipoPreguntas value) {
        this.preguntas = value;
    }

}
