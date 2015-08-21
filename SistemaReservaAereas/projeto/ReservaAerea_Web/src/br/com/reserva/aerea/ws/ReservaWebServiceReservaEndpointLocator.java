/**
 * ReservaWebServiceReservaEndpointLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.reserva.aerea.ws;

public class ReservaWebServiceReservaEndpointLocator extends org.apache.axis.client.Service implements br.com.reserva.aerea.ws.ReservaWebServiceReservaEndpoint {

    public ReservaWebServiceReservaEndpointLocator() {
    }


    public ReservaWebServiceReservaEndpointLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReservaWebServiceReservaEndpointLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReservaWebServiceImplPort
    private java.lang.String ReservaWebServiceImplPort_address = "http://localhost:8092/ReservaAerea_Web-0.0.1-SNAPSHOT/ReservaWebService/reservaEndpoint";

    public java.lang.String getReservaWebServiceImplPortAddress() {
        return ReservaWebServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReservaWebServiceImplPortWSDDServiceName = "ReservaWebServiceImplPort";

    public java.lang.String getReservaWebServiceImplPortWSDDServiceName() {
        return ReservaWebServiceImplPortWSDDServiceName;
    }

    public void setReservaWebServiceImplPortWSDDServiceName(java.lang.String name) {
        ReservaWebServiceImplPortWSDDServiceName = name;
    }

    public br.com.reserva.aerea.ws.ReservaWebService getReservaWebServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReservaWebServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReservaWebServiceImplPort(endpoint);
    }

    public br.com.reserva.aerea.ws.ReservaWebService getReservaWebServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.reserva.aerea.ws.ReservaWebServiceReservaEndpointSoapBindingStub _stub = new br.com.reserva.aerea.ws.ReservaWebServiceReservaEndpointSoapBindingStub(portAddress, this);
            _stub.setPortName(getReservaWebServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReservaWebServiceImplPortEndpointAddress(java.lang.String address) {
        ReservaWebServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.reserva.aerea.ws.ReservaWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.reserva.aerea.ws.ReservaWebServiceReservaEndpointSoapBindingStub _stub = new br.com.reserva.aerea.ws.ReservaWebServiceReservaEndpointSoapBindingStub(new java.net.URL(ReservaWebServiceImplPort_address), this);
                _stub.setPortName(getReservaWebServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ReservaWebServiceImplPort".equals(inputPortName)) {
            return getReservaWebServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.aerea.reserva.com.br/", "ReservaWebService/reservaEndpoint");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.aerea.reserva.com.br/", "ReservaWebServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReservaWebServiceImplPort".equals(portName)) {
            setReservaWebServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
