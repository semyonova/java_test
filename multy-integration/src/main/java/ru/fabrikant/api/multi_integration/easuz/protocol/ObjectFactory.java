
package ru.fabrikant.api.multi_integration.easuz.protocol;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.fabrikant.api.multi_integration.easuz.protocol package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.fabrikant.api.multi_integration.easuz.protocol
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProtocolData }
     * 
     */
    public ProtocolData createProtocolData() {
        return new ProtocolData();
    }

    /**
     * Create an instance of {@link GetProtocol }
     * 
     */
    public GetProtocol createGetProtocol() {
        return new GetProtocol();
    }

    /**
     * Create an instance of {@link GetProtocolResponse }
     * 
     */
    public GetProtocolResponse createGetProtocolResponse() {
        return new GetProtocolResponse();
    }

    /**
     * Create an instance of {@link ProtocolData.ProtocolFileList }
     * 
     */
    public ProtocolData.ProtocolFileList createProtocolDataProtocolFileList() {
        return new ProtocolData.ProtocolFileList();
    }

}
