
package ru.fabrikant.api.multi_integration.easuz.procedureinfo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.fabrikant.api.multi_integration.easuz.procedureinfo package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.fabrikant.api.multi_integration.easuz.procedureinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProcedureInfoResponse }
     * 
     */
    public GetProcedureInfoResponse createGetProcedureInfoResponse() {
        return new GetProcedureInfoResponse();
    }

    /**
     * Create an instance of {@link GetProcedureInfo }
     * 
     */
    public GetProcedureInfo createGetProcedureInfo() {
        return new GetProcedureInfo();
    }

    /**
     * Create an instance of {@link LotInfo }
     * 
     */
    public LotInfo createLotInfo() {
        return new LotInfo();
    }

    /**
     * Create an instance of {@link GetProcedureInfoResponse.LotInfoList }
     * 
     */
    public GetProcedureInfoResponse.LotInfoList createGetProcedureInfoResponseLotInfoList() {
        return new GetProcedureInfoResponse.LotInfoList();
    }

}
