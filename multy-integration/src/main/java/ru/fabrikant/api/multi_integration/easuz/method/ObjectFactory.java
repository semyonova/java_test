
package ru.fabrikant.api.multi_integration.easuz.method;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.fabrikant.api.multi_integration.easuz.downloadfile.GetFile;
import ru.fabrikant.api.multi_integration.easuz.downloadfile.GetFileResponse;
import ru.fabrikant.api.multi_integration.easuz.prepareprocedure.PrepareAuction;
import ru.fabrikant.api.multi_integration.easuz.prepareprocedure.PrepareProcedurePurchase;
import ru.fabrikant.api.multi_integration.easuz.prepareprocedure.PrepareProcedureResponse;
import ru.fabrikant.api.multi_integration.easuz.procedureinfo.GetProcedureInfo;
import ru.fabrikant.api.multi_integration.easuz.procedureinfo.GetProcedureInfoResponse;
import ru.fabrikant.api.multi_integration.easuz.protocol.GetProtocol;
import ru.fabrikant.api.multi_integration.easuz.protocol.GetProtocolResponse;
import ru.fabrikant.api.multi_integration.easuz.uploadfile.UploadProcedureFile;
import ru.fabrikant.api.multi_integration.easuz.uploadfile.UploadProcedureFileResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.fabrikant.api.multi_integration.easuz.method package. 
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

    private final static QName _PrepareProcedurePurchase_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "PrepareProcedurePurchase");
    private final static QName _PrepareAuction_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "PrepareAuction");
    private final static QName _PrepareProcedureResponse_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "PrepareProcedureResponse");
    private final static QName _UploadProcedureFile_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "UploadProcedureFile");
    private final static QName _UploadProcedureFileResponse_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "UploadProcedureFileResponse");
    private final static QName _GetProcedureInfo_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "GetProcedureInfo");
    private final static QName _GetProcedureInfoResponse_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "GetProcedureInfoResponse");
    private final static QName _GetProtocol_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "GetProtocol");
    private final static QName _GetProtocolResponse_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "GetProtocolResponse");
    private final static QName _GetFile_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "GetFile");
    private final static QName _GetFileResponse_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "GetFileResponse");
    private final static QName _CheckRequestResponse_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "CheckRequestResponse");
    private final static QName _MessageAccepted_QNAME = new QName("http://api.fabrikant.ru/multi-integration/easuz/method", "MessageAccepted");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.fabrikant.api.multi_integration.easuz.method
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckRequest }
     * 
     */
    public CheckRequest createCheckRequest() {
        return new CheckRequest();
    }

    /**
     * Create an instance of {@link CheckRequestResponse }
     * 
     */
    public CheckRequestResponse createCheckRequestResponse() {
        return new CheckRequestResponse();
    }

    /**
     * Create an instance of {@link MessageAccepted }
     * 
     */
    public MessageAccepted createMessageAccepted() {
        return new MessageAccepted();
    }

    /**
     * Create an instance of {@link ResponseData }
     * 
     */
    public ResponseData createResponseData() {
        return new ResponseData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareProcedurePurchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "PrepareProcedurePurchase")
    public JAXBElement<PrepareProcedurePurchase> createPrepareProcedurePurchase(PrepareProcedurePurchase value) {
        return new JAXBElement<PrepareProcedurePurchase>(_PrepareProcedurePurchase_QNAME, PrepareProcedurePurchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareAuction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "PrepareAuction")
    public JAXBElement<PrepareAuction> createPrepareAuction(PrepareAuction value) {
        return new JAXBElement<PrepareAuction>(_PrepareAuction_QNAME, PrepareAuction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareProcedureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "PrepareProcedureResponse")
    public JAXBElement<PrepareProcedureResponse> createPrepareProcedureResponse(PrepareProcedureResponse value) {
        return new JAXBElement<PrepareProcedureResponse>(_PrepareProcedureResponse_QNAME, PrepareProcedureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadProcedureFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "UploadProcedureFile")
    public JAXBElement<UploadProcedureFile> createUploadProcedureFile(UploadProcedureFile value) {
        return new JAXBElement<UploadProcedureFile>(_UploadProcedureFile_QNAME, UploadProcedureFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadProcedureFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "UploadProcedureFileResponse")
    public JAXBElement<UploadProcedureFileResponse> createUploadProcedureFileResponse(UploadProcedureFileResponse value) {
        return new JAXBElement<UploadProcedureFileResponse>(_UploadProcedureFileResponse_QNAME, UploadProcedureFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcedureInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "GetProcedureInfo")
    public JAXBElement<GetProcedureInfo> createGetProcedureInfo(GetProcedureInfo value) {
        return new JAXBElement<GetProcedureInfo>(_GetProcedureInfo_QNAME, GetProcedureInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProcedureInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "GetProcedureInfoResponse")
    public JAXBElement<GetProcedureInfoResponse> createGetProcedureInfoResponse(GetProcedureInfoResponse value) {
        return new JAXBElement<GetProcedureInfoResponse>(_GetProcedureInfoResponse_QNAME, GetProcedureInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProtocol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "GetProtocol")
    public JAXBElement<GetProtocol> createGetProtocol(GetProtocol value) {
        return new JAXBElement<GetProtocol>(_GetProtocol_QNAME, GetProtocol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProtocolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "GetProtocolResponse")
    public JAXBElement<GetProtocolResponse> createGetProtocolResponse(GetProtocolResponse value) {
        return new JAXBElement<GetProtocolResponse>(_GetProtocolResponse_QNAME, GetProtocolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "GetFile")
    public JAXBElement<GetFile> createGetFile(GetFile value) {
        return new JAXBElement<GetFile>(_GetFile_QNAME, GetFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "GetFileResponse")
    public JAXBElement<GetFileResponse> createGetFileResponse(GetFileResponse value) {
        return new JAXBElement<GetFileResponse>(_GetFileResponse_QNAME, GetFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "CheckRequestResponse")
    public JAXBElement<CheckRequestResponse> createCheckRequestResponse(CheckRequestResponse value) {
        return new JAXBElement<CheckRequestResponse>(_CheckRequestResponse_QNAME, CheckRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageAccepted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.fabrikant.ru/multi-integration/easuz/method", name = "MessageAccepted")
    public JAXBElement<MessageAccepted> createMessageAccepted(MessageAccepted value) {
        return new JAXBElement<MessageAccepted>(_MessageAccepted_QNAME, MessageAccepted.class, null, value);
    }

}
