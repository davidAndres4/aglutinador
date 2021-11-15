//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.15 a las 08:11:47 PM CET 
//


package clasesJAXB;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para TipoRespuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoRespuesta"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;&gt;TipoCadenaLarga"&gt;
 *       &lt;attribute name="validez" type="{}TipoBooleano" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoRespuesta", propOrder = {
    "value"
})
public class TipoRespuesta {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "validez")
    protected TipoBooleano validez;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad validez.
     * 
     * @return
     *     possible object is
     *     {@link TipoBooleano }
     *     
     */
    public TipoBooleano getValidez() {
        return validez;
    }

    /**
     * Define el valor de la propiedad validez.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBooleano }
     *     
     */
    public void setValidez(TipoBooleano value) {
        this.validez = value;
    }

}
