package com.jaxws.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-04-28T09:59:09.253-05:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "RetrieveUserServiceImplService",
                  wsdlLocation = "http://localhost:8080/Jaxws-demo/RetrieveUserService?wsdl",
                  targetNamespace = "http://ws.jaxws.com/")
public class RetrieveUserServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.jaxws.com/", "RetrieveUserServiceImplService");
    public final static QName RetrieveUserServiceImplPort = new QName("http://ws.jaxws.com/", "RetrieveUserServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/Jaxws-demo/RetrieveUserService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RetrieveUserServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/Jaxws-demo/RetrieveUserService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RetrieveUserServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RetrieveUserServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RetrieveUserServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public RetrieveUserServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RetrieveUserServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RetrieveUserServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns RetrieveUserService
     */
    @WebEndpoint(name = "RetrieveUserServiceImplPort")
    public RetrieveUserService getRetrieveUserServiceImplPort() {
        return super.getPort(RetrieveUserServiceImplPort, RetrieveUserService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RetrieveUserService
     */
    @WebEndpoint(name = "RetrieveUserServiceImplPort")
    public RetrieveUserService getRetrieveUserServiceImplPort(WebServiceFeature... features) {
        return super.getPort(RetrieveUserServiceImplPort, RetrieveUserService.class, features);
    }

}