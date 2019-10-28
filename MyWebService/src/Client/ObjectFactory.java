
package Client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Client package. 
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

    private final static QName _VaildateEmailAddress_QNAME = new QName("http://Service/", "vaildateEmailAddress");
    private final static QName _VaildateEmailAddressResponse_QNAME = new QName("http://Service/", "vaildateEmailAddressResponse");
    private final static QName _SendEmailBatchResponse_QNAME = new QName("http://Service/", "sendEmailBatchResponse");
    private final static QName _SendEmailBatch_QNAME = new QName("http://Service/", "sendEmailBatch");
    private final static QName _SendEmail_QNAME = new QName("http://Service/", "sendEmail");
    private final static QName _SendEmailResponse_QNAME = new QName("http://Service/", "sendEmailResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link VaildateEmailAddress }
     * 
     */
    public VaildateEmailAddress createVaildateEmailAddress() {
        return new VaildateEmailAddress();
    }

    /**
     * Create an instance of {@link VaildateEmailAddressResponse }
     * 
     */
    public VaildateEmailAddressResponse createVaildateEmailAddressResponse() {
        return new VaildateEmailAddressResponse();
    }

    /**
     * Create an instance of {@link SendEmailBatchResponse }
     * 
     */
    public SendEmailBatchResponse createSendEmailBatchResponse() {
        return new SendEmailBatchResponse();
    }

    /**
     * Create an instance of {@link SendEmailBatch }
     * 
     */
    public SendEmailBatch createSendEmailBatch() {
        return new SendEmailBatch();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VaildateEmailAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "vaildateEmailAddress")
    public JAXBElement<VaildateEmailAddress> createVaildateEmailAddress(VaildateEmailAddress value) {
        return new JAXBElement<VaildateEmailAddress>(_VaildateEmailAddress_QNAME, VaildateEmailAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VaildateEmailAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "vaildateEmailAddressResponse")
    public JAXBElement<VaildateEmailAddressResponse> createVaildateEmailAddressResponse(VaildateEmailAddressResponse value) {
        return new JAXBElement<VaildateEmailAddressResponse>(_VaildateEmailAddressResponse_QNAME, VaildateEmailAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailBatchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "sendEmailBatchResponse")
    public JAXBElement<SendEmailBatchResponse> createSendEmailBatchResponse(SendEmailBatchResponse value) {
        return new JAXBElement<SendEmailBatchResponse>(_SendEmailBatchResponse_QNAME, SendEmailBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "sendEmailBatch")
    public JAXBElement<SendEmailBatch> createSendEmailBatch(SendEmailBatch value) {
        return new JAXBElement<SendEmailBatch>(_SendEmailBatch_QNAME, SendEmailBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

}
