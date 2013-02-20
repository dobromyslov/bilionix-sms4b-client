// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R2)
// Generated source version: 1.1.3

package com.bilionix.sms4b.client;

import com.sun.xml.rpc.client.HandlerChainImpl;
import com.sun.xml.rpc.client.ServiceExceptionImpl;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

import javax.xml.namespace.QName;
import javax.xml.rpc.JAXRPCException;

public class WSSM_Impl extends com.sun.xml.rpc.client.BasicService implements WSSM {
    private static final QName serviceName = new QName("SMS4B", "WSSM");
    private static final QName ns1_WSSMSoap_QNAME = new QName("SMS4B", "WSSMSoap");
    private static final Class WSSMSoap_PortClass = com.bilionix.sms4b.client.WSSMSoap.class;
    
    public WSSM_Impl() {
        super(serviceName, new QName[] {
                        ns1_WSSMSoap_QNAME
                    },
            new com.bilionix.sms4b.client.WSSM_SerializerRegistry().getRegistry());
        
    }
    
    public java.rmi.Remote getPort(QName portName, Class serviceDefInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (portName.equals(ns1_WSSMSoap_QNAME) &&
                serviceDefInterface.equals(WSSMSoap_PortClass)) {
                return getWSSMSoap();
            }
        } catch (Exception e) {
            throw new ServiceExceptionImpl(new LocalizableExceptionAdapter(e));
        }
        return super.getPort(portName, serviceDefInterface);
    }

    public java.rmi.Remote getPort(Class serviceDefInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (serviceDefInterface.equals(WSSMSoap_PortClass)) {
                return getWSSMSoap();
            }
        } catch (Exception e) {
            throw new ServiceExceptionImpl(new LocalizableExceptionAdapter(e));
        }
        return super.getPort(serviceDefInterface);
    }

    public com.bilionix.sms4b.client.WSSMSoap getWSSMSoap() {
        String[] roles = new String[] {};
        HandlerChainImpl handlerChain = new HandlerChainImpl(getHandlerRegistry().getHandlerChain(ns1_WSSMSoap_QNAME));
        handlerChain.setRoles(roles);
        com.bilionix.sms4b.client.WSSMSoap_Stub stub = new com.bilionix.sms4b.client.WSSMSoap_Stub(handlerChain);
        try {
            stub._initialize(super.internalTypeRegistry);
        } catch (JAXRPCException e) {
            throw e;
        } catch (Exception e) {
            throw new JAXRPCException(e.getMessage(), e);
        }
        return stub;
    }
}