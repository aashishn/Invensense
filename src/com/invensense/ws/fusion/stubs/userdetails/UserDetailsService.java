
package com.invensense.ws.fusion.stubs.userdetails;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserDetailsService", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserDetailsService {


    /**
     * 
     * @param username
     * @return
     *     returns com.invensense.ws.fusion.stubs.userdetails.UserDetailsResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/findUserDetailsByUsername")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
    @RequestWrapper(localName = "findUserDetailsByUsername", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindUserDetailsByUsername")
    @ResponseWrapper(localName = "findUserDetailsByUsernameResponse", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindUserDetailsByUsernameResponse")
    public UserDetailsResult findUserDetailsByUsername(
        @WebParam(name = "Username", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
        String username)
        throws ServiceException
    ;

    /**
     * 
     * @param personNumber
     * @return
     *     returns com.invensense.ws.fusion.stubs.userdetails.UserDetailsResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/findUserDetailsByPersonNumber")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
    @RequestWrapper(localName = "findUserDetailsByPersonNumber", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindUserDetailsByPersonNumber")
    @ResponseWrapper(localName = "findUserDetailsByPersonNumberResponse", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindUserDetailsByPersonNumberResponse")
    public UserDetailsResult findUserDetailsByPersonNumber(
        @WebParam(name = "PersonNumber", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
        String personNumber)
        throws ServiceException
    ;

    /**
     * 
     * @param personId
     * @return
     *     returns com.invensense.ws.fusion.stubs.userdetails.UserDetailsResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/findUserDetailsByPersonId")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
    @RequestWrapper(localName = "findUserDetailsByPersonId", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindUserDetailsByPersonId")
    @ResponseWrapper(localName = "findUserDetailsByPersonIdResponse", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindUserDetailsByPersonIdResponse")
    public UserDetailsResult findUserDetailsByPersonId(
        @WebParam(name = "PersonId", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
        long personId)
        throws ServiceException
    ;

    /**
     * 
     * @return
     *     returns com.invensense.ws.fusion.stubs.userdetails.UserDetailsResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/findSelfUserDetails")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
    @RequestWrapper(localName = "findSelfUserDetails", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindSelfUserDetails")
    @ResponseWrapper(localName = "findSelfUserDetailsResponse", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindSelfUserDetailsResponse")
    public UserDetailsResult findSelfUserDetails()
        throws ServiceException
    ;

    /**
     * 
     * @param personId
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/findUserDetailsByPersonIdAsync")
    @Oneway
    @RequestWrapper(localName = "findUserDetailsByPersonIdAsync", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindUserDetailsByPersonIdAsync")
    public void findUserDetailsByPersonIdAsync(
        @WebParam(name = "PersonId", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
        long personId);

    /**
     * 
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/findSelfUserDetailsAsync")
    @Oneway
    @RequestWrapper(localName = "findSelfUserDetailsAsync", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindSelfUserDetailsAsync")
    public void findSelfUserDetailsAsync();

    /**
     * 
     * @param username
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/findUserDetailsByUsernameAsync")
    @Oneway
    @RequestWrapper(localName = "findUserDetailsByUsernameAsync", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindUserDetailsByUsernameAsync")
    public void findUserDetailsByUsernameAsync(
        @WebParam(name = "Username", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
        String username);

    /**
     * 
     * @param personNumber
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/findUserDetailsByPersonNumberAsync")
    @Oneway
    @RequestWrapper(localName = "findUserDetailsByPersonNumberAsync", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.FindUserDetailsByPersonNumberAsync")
    public void findUserDetailsByPersonNumberAsync(
        @WebParam(name = "PersonNumber", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
        String personNumber);

    /**
     * 
     * @param viewName
     * @param localeName
     * @return
     *     returns com.invensense.ws.fusion.stubs.userdetails.ObjAttrHints
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/getDfltObjAttrHints")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
    @RequestWrapper(localName = "getDfltObjAttrHints", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.GetDfltObjAttrHints")
    @ResponseWrapper(localName = "getDfltObjAttrHintsResponse", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.GetDfltObjAttrHintsResponse")
    public ObjAttrHints getDfltObjAttrHints(
        @WebParam(name = "viewName", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
        String viewName,
        @WebParam(name = "localeName", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
        String localeName)
        throws ServiceException
    ;

    /**
     * 
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/getServiceLastUpdateTime")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
    @RequestWrapper(localName = "getServiceLastUpdateTime", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.GetServiceLastUpdateTime")
    @ResponseWrapper(localName = "getServiceLastUpdateTimeResponse", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.GetServiceLastUpdateTimeResponse")
    public XMLGregorianCalendar getServiceLastUpdateTime()
        throws ServiceException
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.invensense.ws.fusion.stubs.userdetails.ServiceViewInfo>
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/getEntityList")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
    @RequestWrapper(localName = "getEntityList", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.GetEntityList")
    @ResponseWrapper(localName = "getEntityListResponse", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.GetEntityListResponse")
    public List<ServiceViewInfo> getEntityList()
        throws ServiceException
    ;

    /**
     * 
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/getEntityListAsync")
    @Oneway
    @RequestWrapper(localName = "getEntityListAsync", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.GetEntityListAsync")
    public void getEntityListAsync();

    /**
     * 
     * @param viewName
     * @param localeName
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/getDfltObjAttrHintsAsync")
    @Oneway
    @RequestWrapper(localName = "getDfltObjAttrHintsAsync", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.GetDfltObjAttrHintsAsync")
    public void getDfltObjAttrHintsAsync(
        @WebParam(name = "viewName", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
        String viewName,
        @WebParam(name = "localeName", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
        String localeName);

    /**
     * 
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/getServiceLastUpdateTimeAsync")
    @Oneway
    @RequestWrapper(localName = "getServiceLastUpdateTimeAsync", targetNamespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", className = "com.invensense.ws.fusion.stubs.userdetails.GetServiceLastUpdateTimeAsync")
    public void getServiceLastUpdateTimeAsync();

}
