
package Client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@javax.jws.WebService(name = "webService", targetNamespace = "http://Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "vaildateEmailAddress", targetNamespace = "http://Service/", className = "Client.VaildateEmailAddress")
    @ResponseWrapper(localName = "vaildateEmailAddressResponse", targetNamespace = "http://Service/", className = "Client.VaildateEmailAddressResponse")
    @Action(input = "http://Service/webService/vaildateEmailAddressRequest", output = "http://Service/webService/vaildateEmailAddressResponse")
    public boolean vaildateEmailAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendEmailBatch", targetNamespace = "http://Service/", className = "Client.SendEmailBatch")
    @ResponseWrapper(localName = "sendEmailBatchResponse", targetNamespace = "http://Service/", className = "Client.SendEmailBatchResponse")
    @Action(input = "http://Service/webService/sendEmailBatchRequest", output = "http://Service/webService/sendEmailBatchResponse")
    public int sendEmailBatch(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendEmail", targetNamespace = "http://Service/", className = "Client.SendEmail")
    @ResponseWrapper(localName = "sendEmailResponse", targetNamespace = "http://Service/", className = "Client.SendEmailResponse")
    @Action(input = "http://Service/webService/sendEmailRequest", output = "http://Service/webService/sendEmailResponse")
    public int sendEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
