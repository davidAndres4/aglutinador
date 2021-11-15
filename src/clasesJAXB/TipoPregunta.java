//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.15 a las 08:11:47 PM CET 
//


package clasesJAXB;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoPregunta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoPregunta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enunciado" type="{}TipoCadenaLarga"/&gt;
 *         &lt;element name="respuesta" type="{}TipoRespuesta" maxOccurs="4" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dificultad" type="{}TipoDificultad" /&gt;
 *       &lt;attribute name="autoria" type="{}TipoAutoria" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoPregunta", propOrder = {
    "enunciado",
    "respuesta"
})
public class TipoPregunta {

    @XmlElement(required = true)
    protected String enunciado;
    @XmlElement(required = true)
    protected List<TipoRespuesta> respuesta;
    @XmlAttribute(name = "dificultad")
    protected TipoDificultad dificultad;
    @XmlAttribute(name = "autoria")
    protected String autoria;

    /**
     * Obtiene el valor de la propiedad enunciado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * Define el valor de la propiedad enunciado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnunciado(String value) {
        this.enunciado = value;
    }

    /**
     * Gets the value of the respuesta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the respuesta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespuesta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoRespuesta }
     * 
     * 
     */
    public List<TipoRespuesta> getRespuesta() {
        if (respuesta == null) {
            respuesta = new ArrayList<TipoRespuesta>();
        }
        return this.respuesta;
    }

    /**
     * Obtiene el valor de la propiedad dificultad.
     * 
     * @return
     *     possible object is
     *     {@link TipoDificultad }
     *     
     */
    public TipoDificultad getDificultad() {
        return dificultad;
    }

    /**
     * Define el valor de la propiedad dificultad.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDificultad }
     *     
     */
    public void setDificultad(TipoDificultad value) {
        this.dificultad = value;
    }

    /**
     * Obtiene el valor de la propiedad autoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoria() {
        return autoria;
    }

    /**
     * Define el valor de la propiedad autoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoria(String value) {
        this.autoria = value;
    }

}
