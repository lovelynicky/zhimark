/**
 * ReceivedDeclareServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.spring.mvc.proxy.EcoPortWebserviceClient;

public class ReceivedDeclareServiceImplServiceLocator extends org.apache.axis.client.Service implements ReceivedDeclareServiceImplService {

    public ReceivedDeclareServiceImplServiceLocator() {
    }


    public ReceivedDeclareServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReceivedDeclareServiceImplServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReceivedDeclareServiceImplPort
    private String ReceivedDeclareServiceImplPort_address = "http://122.224.230.4:18003/newyorkWS/ws/ReceivedDeclare";

    public String getReceivedDeclareServiceImplPortAddress() {
        return ReceivedDeclareServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String ReceivedDeclareServiceImplPortWSDDServiceName = "ReceivedDeclareServiceImplPort";

    public String getReceivedDeclareServiceImplPortWSDDServiceName() {
        return ReceivedDeclareServiceImplPortWSDDServiceName;
    }

    public void setReceivedDeclareServiceImplPortWSDDServiceName(String name) {
        ReceivedDeclareServiceImplPortWSDDServiceName = name;
    }

    public ReceivedDeclareService getReceivedDeclareServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReceivedDeclareServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReceivedDeclareServiceImplPort(endpoint);
    }

    public ReceivedDeclareService getReceivedDeclareServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ReceivedDeclareServiceImplServiceSoapBindingStub _stub = new ReceivedDeclareServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getReceivedDeclareServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReceivedDeclareServiceImplPortEndpointAddress(String address) {
        ReceivedDeclareServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ReceivedDeclareService.class.isAssignableFrom(serviceEndpointInterface)) {
                ReceivedDeclareServiceImplServiceSoapBindingStub _stub = new ReceivedDeclareServiceImplServiceSoapBindingStub(new java.net.URL(ReceivedDeclareServiceImplPort_address), this);
                _stub.setPortName(getReceivedDeclareServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("ReceivedDeclareServiceImplPort".equals(inputPortName)) {
            return getReceivedDeclareServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.ws.newyork.zjport.gov.cn/", "ReceivedDeclareServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.ws.newyork.zjport.gov.cn/", "ReceivedDeclareServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

if ("ReceivedDeclareServiceImplPort".equals(portName)) {
            setReceivedDeclareServiceImplPortEndpointAddress(address);
        }
        else
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
