
package com.wury.soap.server.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
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
@WebService(name = "PersonWS", targetNamespace = "http://ws.server.soap.wury.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonWS {


    /**
     * 
     * @return
     *     returns java.util.List<com.wury.soap.server.ws.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersons", targetNamespace = "http://ws.server.soap.wury.com/", className = "com.wury.soap.server.ws.GetPersons")
    @ResponseWrapper(localName = "getPersonsResponse", targetNamespace = "http://ws.server.soap.wury.com/", className = "com.wury.soap.server.ws.GetPersonsResponse")
    @Action(input = "http://ws.server.soap.wury.com/PersonWS/getPersonsRequest", output = "http://ws.server.soap.wury.com/PersonWS/getPersonsResponse")
    public List<Person> getPersons();

}