
package com.invensense.ws.fusion.stubs.userdetails;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/}UserDetailsResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result"
})
@XmlRootElement(name = "findSelfUserDetailsResponse", namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/")
public class FindSelfUserDetailsResponse {

    @XmlElement(namespace = "http://xmlns.oracle.com/apps/hcm/people/roles/userDetailsServiceV2/types/", required = true)
    protected UserDetailsResult result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetailsResult }
     *     
     */
    public UserDetailsResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetailsResult }
     *     
     */
    public void setResult(UserDetailsResult value) {
        this.result = value;
    }

}
