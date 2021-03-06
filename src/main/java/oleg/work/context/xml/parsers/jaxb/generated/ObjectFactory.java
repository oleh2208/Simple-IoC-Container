//
// This file was oleg.work.context.xml.parsers.jaxb.generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:17:51 AM EET 
//


package oleg.work.context.xml.parsers.jaxb.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * oleg.work.context.xml.parsers.jaxb.generated in the oleg.work.context.xml.parsers.jaxb.generated package.
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

    private final static QName _Context_QNAME = new QName("", "context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oleg.work.context.xml.parsers.jaxb.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SpringXmlContext }
     * 
     */
    public SpringXmlContext createSpringXmlContext() {
        return new SpringXmlContext();
    }

    /**
     * Create an instance of {@link BeanTypeProperty }
     * 
     */
    public BeanTypeProperty createBeanProperty() {
        return new BeanTypeProperty();
    }

    /**
     * Create an instance of {@link BeanType }
     * 
     */
    public BeanType createBeanType() {
        return new BeanType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpringXmlContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "context")
    public JAXBElement<SpringXmlContext> createContext(SpringXmlContext value) {
        return new JAXBElement<SpringXmlContext>(_Context_QNAME, SpringXmlContext.class, null, value);
    }

}
