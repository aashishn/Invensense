
package com.invensense.ws.fusion.stubs.userdetails;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserDetailsService", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", wsdlLocation = "https://eeal.hcm.us2.oraclecloud.com:443/hcmPeopleRolesV2/UserDetailsService?wsdl")
public class UserDetailsService_Service
    extends Service
{

    private final static URL USERDETAILSSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERDETAILSSERVICE_EXCEPTION;
    private final static QName USERDETAILSSERVICE_QNAME = new QName("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "UserDetailsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://eeal.hcm.us2.oraclecloud.com:443/hcmPeopleRolesV2/UserDetailsService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERDETAILSSERVICE_WSDL_LOCATION = url;
        USERDETAILSSERVICE_EXCEPTION = e;
    }

    public UserDetailsService_Service() {
        super(__getWsdlLocation(), USERDETAILSSERVICE_QNAME);
    }

    public UserDetailsService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERDETAILSSERVICE_QNAME, features);
    }

    public UserDetailsService_Service(URL wsdlLocation) {
        super(wsdlLocation, USERDETAILSSERVICE_QNAME);
    }

    public UserDetailsService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERDETAILSSERVICE_QNAME, features);
    }

    public UserDetailsService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserDetailsService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserDetailsService
     */
    @WebEndpoint(name = "UserDetailsServiceSoapHttpPort")
    public UserDetailsService getUserDetailsServiceSoapHttpPort() {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "UserDetailsServiceSoapHttpPort"), UserDetailsService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserDetailsService
     */
    @WebEndpoint(name = "UserDetailsServiceSoapHttpPort")
    public UserDetailsService getUserDetailsServiceSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/", "UserDetailsServiceSoapHttpPort"), UserDetailsService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERDETAILSSERVICE_EXCEPTION!= null) {
            throw USERDETAILSSERVICE_EXCEPTION;
        }
        return USERDETAILSSERVICE_WSDL_LOCATION;
    }

}
