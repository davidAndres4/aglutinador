//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.15 a las 08:11:47 PM CET 
//


package clasesJAXB;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoBooleano.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TipoBooleano"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="sí"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoBooleano")
@XmlEnum
public enum TipoBooleano {

    @XmlEnumValue("s\u00ed")
    SÍ("s\u00ed"),
    @XmlEnumValue("no")
    NO("no");
    private final String value;

    TipoBooleano(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoBooleano fromValue(String v) {
        for (TipoBooleano c: TipoBooleano.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
