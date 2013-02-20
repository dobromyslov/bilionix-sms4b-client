// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R2)
// Generated source version: 1.1.3

package com.bilionix.sms4b.client;

import com.sun.xml.rpc.client.SenderException;
import com.sun.xml.rpc.client.StreamingSenderState;
import com.sun.xml.rpc.client.http.HttpClientTransport;
import com.sun.xml.rpc.encoding.CombinedSerializer;
import com.sun.xml.rpc.encoding.InternalTypeMappingRegistry;
import com.sun.xml.rpc.encoding.SOAPDeserializationContext;
import com.sun.xml.rpc.encoding.SOAPDeserializationState;
import com.sun.xml.rpc.soap.message.InternalSOAPMessage;
import com.sun.xml.rpc.soap.message.SOAPBlockInfo;
import com.sun.xml.rpc.soap.streaming.SOAPNamespaceConstants;
import com.sun.xml.rpc.streaming.XMLReader;

import javax.xml.namespace.QName;
import javax.xml.rpc.JAXRPCException;
import javax.xml.rpc.handler.HandlerChain;
import java.rmi.RemoteException;

public class WSSMSoap_Stub
    extends com.sun.xml.rpc.client.StubBase
    implements com.bilionix.sms4b.client.WSSMSoap {
    
    
    
    /*
     *  public constructor
     */
    public WSSMSoap_Stub(HandlerChain handlerChain) {
        super(handlerChain);
        _setProperty(ENDPOINT_ADDRESS_PROPERTY, "https://sms4b.ru/ws/sms.asmx");
    }
    
    
    /*
     *  implementation of checkSMS
     */
    public com.bilionix.sms4b.client.CheckSMSResult checkSMS(long sessionId, com.bilionix.sms4b.client.ArrayOfString guids)
        throws RemoteException {

        try {

            StreamingSenderState _state = _start(_handlerChain);

            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(CheckSMS_OPCODE);

            com.bilionix.sms4b.client.CheckSMS _myCheckSMS = new com.bilionix.sms4b.client.CheckSMS();
            _myCheckSMS.setSessionId(sessionId);
            _myCheckSMS.setGuids(guids);

            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_CheckSMS_CheckSMS_QNAME);
            _bodyBlock.setValue(_myCheckSMS);
            _bodyBlock.setSerializer(ns1_myCheckSMS_LiteralSerializer);
            _request.setBody(_bodyBlock);

            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "SMS4B/CheckSMS");

            _send((String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);

            com.bilionix.sms4b.client.CheckSMSResponse _result;
            Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.bilionix.sms4b.client.CheckSMSResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.bilionix.sms4b.client.CheckSMSResponse)_responseObj;
            }

            return _result.getCheckSMSResult();

        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }

    /*
     *  implementation of startSession
     */
    public long startSession(String login, String password, short gmt)
        throws RemoteException {

        try {

            StreamingSenderState _state = _start(_handlerChain);

            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(StartSession_OPCODE);

            com.bilionix.sms4b.client.StartSession _myStartSession = new com.bilionix.sms4b.client.StartSession();
            _myStartSession.setLogin(login);
            _myStartSession.setPassword(password);
            _myStartSession.setGmt(gmt);

            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_StartSession_StartSession_QNAME);
            _bodyBlock.setValue(_myStartSession);
            _bodyBlock.setSerializer(ns1_myStartSession_LiteralSerializer);
            _request.setBody(_bodyBlock);

            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "SMS4B/StartSession");

            _send((String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);

            com.bilionix.sms4b.client.StartSessionResponse _result;
            Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.bilionix.sms4b.client.StartSessionResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.bilionix.sms4b.client.StartSessionResponse)_responseObj;
            }

            return _result.getStartSessionResult();

        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }

    /*
     *  implementation of loadSMS
     */
    public com.bilionix.sms4b.client.LoadSMSResult loadSMS(long sessionId, String changesFrom, int flags)
        throws RemoteException {

        try {

            StreamingSenderState _state = _start(_handlerChain);

            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(LoadSMS_OPCODE);

            com.bilionix.sms4b.client.LoadSMS _myLoadSMS = new com.bilionix.sms4b.client.LoadSMS();
            _myLoadSMS.setSessionId(sessionId);
            _myLoadSMS.setChangesFrom(changesFrom);
            _myLoadSMS.setFlags(flags);

            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_LoadSMS_LoadSMS_QNAME);
            _bodyBlock.setValue(_myLoadSMS);
            _bodyBlock.setSerializer(ns1_myLoadSMS_LiteralSerializer);
            _request.setBody(_bodyBlock);

            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "SMS4B/LoadSMS");

            _send((String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);

            com.bilionix.sms4b.client.LoadSMSResponse _result;
            Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.bilionix.sms4b.client.LoadSMSResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.bilionix.sms4b.client.LoadSMSResponse)_responseObj;
            }

            return _result.getLoadSMSResult();

        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }

    /*
     *  implementation of sendSMS
     */
    public String sendSMS(String login, String password, String source, long phone, String text)
        throws RemoteException {

        try {

            StreamingSenderState _state = _start(_handlerChain);

            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(SendSMS_OPCODE);

            com.bilionix.sms4b.client.SendSMS _mySendSMS = new com.bilionix.sms4b.client.SendSMS();
            _mySendSMS.setLogin(login);
            _mySendSMS.setPassword(password);
            _mySendSMS.setSource(source);
            _mySendSMS.setPhone(phone);
            _mySendSMS.setText(text);

            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_SendSMS_SendSMS_QNAME);
            _bodyBlock.setValue(_mySendSMS);
            _bodyBlock.setSerializer(ns1_mySendSMS_LiteralSerializer);
            _request.setBody(_bodyBlock);

            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "SMS4B/SendSMS");

            _send((String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);

            com.bilionix.sms4b.client.SendSMSResponse _result;
            Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.bilionix.sms4b.client.SendSMSResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.bilionix.sms4b.client.SendSMSResponse)_responseObj;
            }

            return _result.getSendSMSResult();

        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }

    /*
     *  implementation of closeSession
     */
    public int closeSession(long sessionID)
        throws RemoteException {

        try {

            StreamingSenderState _state = _start(_handlerChain);

            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(CloseSession_OPCODE);

            com.bilionix.sms4b.client.CloseSession _myCloseSession = new com.bilionix.sms4b.client.CloseSession();
            _myCloseSession.setSessionID(sessionID);

            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_CloseSession_CloseSession_QNAME);
            _bodyBlock.setValue(_myCloseSession);
            _bodyBlock.setSerializer(ns1_myCloseSession_LiteralSerializer);
            _request.setBody(_bodyBlock);

            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "SMS4B/CloseSession");

            _send((String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);

            com.bilionix.sms4b.client.CloseSessionResponse _result;
            Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.bilionix.sms4b.client.CloseSessionResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.bilionix.sms4b.client.CloseSessionResponse)_responseObj;
            }

            return _result.getCloseSessionResult();

        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }

    /*
     *  implementation of groupSMS
     */
    public com.bilionix.sms4b.client.GroupSMSResult groupSMS(long sessionId, long group, String source, int encoding, String body, String off, String start, String period, com.bilionix.sms4b.client.ArrayOfGroupSMSList list)
        throws RemoteException {

        try {

            StreamingSenderState _state = _start(_handlerChain);

            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(GroupSMS_OPCODE);

            com.bilionix.sms4b.client.GroupSMS _myGroupSMS = new com.bilionix.sms4b.client.GroupSMS();
            _myGroupSMS.setSessionId(sessionId);
            _myGroupSMS.setGroup(group);
            _myGroupSMS.setSource(source);
            _myGroupSMS.setEncoding(encoding);
            _myGroupSMS.setBody(body);
            _myGroupSMS.setOff(off);
            _myGroupSMS.setStart(start);
            _myGroupSMS.setPeriod(period);
            _myGroupSMS.setList(list);

            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_GroupSMS_GroupSMS_QNAME);
            _bodyBlock.setValue(_myGroupSMS);
            _bodyBlock.setSerializer(ns1_myGroupSMS_LiteralSerializer);
            _request.setBody(_bodyBlock);

            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "SMS4B/GroupSMS");

            _send((String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);

            com.bilionix.sms4b.client.GroupSMSResponse _result;
            Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.bilionix.sms4b.client.GroupSMSResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.bilionix.sms4b.client.GroupSMSResponse)_responseObj;
            }

            return _result.getGroupSMSResult();

        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }

    /*
     *  implementation of cancelGroup
     */
    public int cancelGroup(long sessionID, long group)
        throws RemoteException {

        try {

            StreamingSenderState _state = _start(_handlerChain);

            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(CancelGroup_OPCODE);

            com.bilionix.sms4b.client.CancelGroup _myCancelGroup = new com.bilionix.sms4b.client.CancelGroup();
            _myCancelGroup.setSessionID(sessionID);
            _myCancelGroup.setGroup(group);

            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_CancelGroup_CancelGroup_QNAME);
            _bodyBlock.setValue(_myCancelGroup);
            _bodyBlock.setSerializer(ns1_myCancelGroup_LiteralSerializer);
            _request.setBody(_bodyBlock);

            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "SMS4B/CancelGroup");

            _send((String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);

            com.bilionix.sms4b.client.CancelGroupResponse _result;
            Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.bilionix.sms4b.client.CancelGroupResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.bilionix.sms4b.client.CancelGroupResponse)_responseObj;
            }

            return _result.getCancelGroupResult();

        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }

    /*
     *  implementation of paramSMS
     */
    public com.bilionix.sms4b.client.ParamSMSResult paramSMS(long sessionId)
        throws RemoteException {

        try {

            StreamingSenderState _state = _start(_handlerChain);

            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(ParamSMS_OPCODE);

            com.bilionix.sms4b.client.ParamSMS _myParamSMS = new com.bilionix.sms4b.client.ParamSMS();
            _myParamSMS.setSessionId(sessionId);

            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_ParamSMS_ParamSMS_QNAME);
            _bodyBlock.setValue(_myParamSMS);
            _bodyBlock.setSerializer(ns1_myParamSMS_LiteralSerializer);
            _request.setBody(_bodyBlock);

            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "SMS4B/ParamSMS");

            _send((String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);

            com.bilionix.sms4b.client.ParamSMSResponse _result;
            Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.bilionix.sms4b.client.ParamSMSResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.bilionix.sms4b.client.ParamSMSResponse)_responseObj;
            }

            return _result.getParamSMSResult();

        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }


    /*
     *  this method deserializes the request/response structure in the body
     */
    protected void _readFirstBodyElement(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState  state) throws Exception {
        int opcode = state.getRequest().getOperationCode();
        switch (opcode) {
            case CheckSMS_OPCODE:
                _deserialize_CheckSMS(bodyReader, deserializationContext, state);
                break;
            case StartSession_OPCODE:
                _deserialize_StartSession(bodyReader, deserializationContext, state);
                break;
            case LoadSMS_OPCODE:
                _deserialize_LoadSMS(bodyReader, deserializationContext, state);
                break;
            case SendSMS_OPCODE:
                _deserialize_SendSMS(bodyReader, deserializationContext, state);
                break;
            case CloseSession_OPCODE:
                _deserialize_CloseSession(bodyReader, deserializationContext, state);
                break;
            case GroupSMS_OPCODE:
                _deserialize_GroupSMS(bodyReader, deserializationContext, state);
                break;
            case CancelGroup_OPCODE:
                _deserialize_CancelGroup(bodyReader, deserializationContext, state);
                break;
            case ParamSMS_OPCODE:
                _deserialize_ParamSMS(bodyReader, deserializationContext, state);
                break;
            default:
                throw new SenderException("sender.response.unrecognizedOperation", Integer.toString(opcode));
        }
    }



    /*
     * This method deserializes the body of the CheckSMS operation.
     */
    private void _deserialize_CheckSMS(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        Object myCheckSMSResponseObj =
            ns1_myCheckSMSResponse_LiteralSerializer.deserialize(ns1_CheckSMS_CheckSMSResponse_QNAME,
                bodyReader, deserializationContext);

        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_CheckSMS_CheckSMSResponse_QNAME);
        bodyBlock.setValue(myCheckSMSResponseObj);
        state.getResponse().setBody(bodyBlock);
    }

    /*
     * This method deserializes the body of the StartSession operation.
     */
    private void _deserialize_StartSession(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        Object myStartSessionResponseObj =
            ns1_myStartSessionResponse_LiteralSerializer.deserialize(ns1_StartSession_StartSessionResponse_QNAME,
                bodyReader, deserializationContext);

        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_StartSession_StartSessionResponse_QNAME);
        bodyBlock.setValue(myStartSessionResponseObj);
        state.getResponse().setBody(bodyBlock);
    }

    /*
     * This method deserializes the body of the LoadSMS operation.
     */
    private void _deserialize_LoadSMS(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        Object myLoadSMSResponseObj =
            ns1_myLoadSMSResponse_LiteralSerializer.deserialize(ns1_LoadSMS_LoadSMSResponse_QNAME,
                bodyReader, deserializationContext);

        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_LoadSMS_LoadSMSResponse_QNAME);
        bodyBlock.setValue(myLoadSMSResponseObj);
        state.getResponse().setBody(bodyBlock);
    }

    /*
     * This method deserializes the body of the SendSMS operation.
     */
    private void _deserialize_SendSMS(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        Object mySendSMSResponseObj =
            ns1_mySendSMSResponse_LiteralSerializer.deserialize(ns1_SendSMS_SendSMSResponse_QNAME,
                bodyReader, deserializationContext);

        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_SendSMS_SendSMSResponse_QNAME);
        bodyBlock.setValue(mySendSMSResponseObj);
        state.getResponse().setBody(bodyBlock);
    }

    /*
     * This method deserializes the body of the CloseSession operation.
     */
    private void _deserialize_CloseSession(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        Object myCloseSessionResponseObj =
            ns1_myCloseSessionResponse_LiteralSerializer.deserialize(ns1_CloseSession_CloseSessionResponse_QNAME,
                bodyReader, deserializationContext);

        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_CloseSession_CloseSessionResponse_QNAME);
        bodyBlock.setValue(myCloseSessionResponseObj);
        state.getResponse().setBody(bodyBlock);
    }

    /*
     * This method deserializes the body of the GroupSMS operation.
     */
    private void _deserialize_GroupSMS(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        Object myGroupSMSResponseObj =
            ns1_myGroupSMSResponse_LiteralSerializer.deserialize(ns1_GroupSMS_GroupSMSResponse_QNAME,
                bodyReader, deserializationContext);

        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_GroupSMS_GroupSMSResponse_QNAME);
        bodyBlock.setValue(myGroupSMSResponseObj);
        state.getResponse().setBody(bodyBlock);
    }

    /*
     * This method deserializes the body of the CancelGroup operation.
     */
    private void _deserialize_CancelGroup(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        Object myCancelGroupResponseObj =
            ns1_myCancelGroupResponse_LiteralSerializer.deserialize(ns1_CancelGroup_CancelGroupResponse_QNAME,
                bodyReader, deserializationContext);

        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_CancelGroup_CancelGroupResponse_QNAME);
        bodyBlock.setValue(myCancelGroupResponseObj);
        state.getResponse().setBody(bodyBlock);
    }

    /*
     * This method deserializes the body of the ParamSMS operation.
     */
    private void _deserialize_ParamSMS(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        Object myParamSMSResponseObj =
            ns1_myParamSMSResponse_LiteralSerializer.deserialize(ns1_ParamSMS_ParamSMSResponse_QNAME,
                bodyReader, deserializationContext);

        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_ParamSMS_ParamSMSResponse_QNAME);
        bodyBlock.setValue(myParamSMSResponseObj);
        state.getResponse().setBody(bodyBlock);
    }



    protected String _getDefaultEnvelopeEncodingStyle() {
        return null;
    }

    public String _getImplicitEnvelopeEncodingStyle() {
        return "";
    }

    public String _getEncodingStyle() {
        return SOAPNamespaceConstants.ENCODING;
    }

    public void _setEncodingStyle(String encodingStyle) {
        throw new UnsupportedOperationException("cannot set encoding style");
    }





    /*
     * This method returns an array containing (prefix, nsURI) pairs.
     */
    protected String[] _getNamespaceDeclarations() {
        return myNamespace_declarations;
    }

    /*
     * This method returns an array containing the names of the headers we understand.
     */
    public QName[] _getUnderstoodHeaders() {
        return understoodHeaderNames;
    }

    public void _initialize(InternalTypeMappingRegistry registry) throws Exception {
        super._initialize(registry);
        ns1_myCheckSMSResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.CheckSMSResponse.class, ns1_CheckSMSResponse_TYPE_QNAME);
        ns1_myParamSMS_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.ParamSMS.class, ns1_ParamSMS_TYPE_QNAME);
        ns1_myCloseSession_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.CloseSession.class, ns1_CloseSession_TYPE_QNAME);
        ns1_myCloseSessionResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.CloseSessionResponse.class, ns1_CloseSessionResponse_TYPE_QNAME);
        ns1_myStartSession_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.StartSession.class, ns1_StartSession_TYPE_QNAME);
        ns1_myStartSessionResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.StartSessionResponse.class, ns1_StartSessionResponse_TYPE_QNAME);
        ns1_mySendSMSResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.SendSMSResponse.class, ns1_SendSMSResponse_TYPE_QNAME);
        ns1_myGroupSMSResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.GroupSMSResponse.class, ns1_GroupSMSResponse_TYPE_QNAME);
        ns1_mySendSMS_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.SendSMS.class, ns1_SendSMS_TYPE_QNAME);
        ns1_myCancelGroup_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.CancelGroup.class, ns1_CancelGroup_TYPE_QNAME);
        ns1_myCancelGroupResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.CancelGroupResponse.class, ns1_CancelGroupResponse_TYPE_QNAME);
        ns1_myParamSMSResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.ParamSMSResponse.class, ns1_ParamSMSResponse_TYPE_QNAME);
        ns1_myLoadSMS_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.LoadSMS.class, ns1_LoadSMS_TYPE_QNAME);
        ns1_myGroupSMS_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.GroupSMS.class, ns1_GroupSMS_TYPE_QNAME);
        ns1_myLoadSMSResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.LoadSMSResponse.class, ns1_LoadSMSResponse_TYPE_QNAME);
        ns1_myCheckSMS_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.CheckSMS.class, ns1_CheckSMS_TYPE_QNAME);
    }

    private static final QName _portName = new QName("SMS4B", "WSSMSoap");
    private static final int CheckSMS_OPCODE = 0;
    private static final int StartSession_OPCODE = 1;
    private static final int LoadSMS_OPCODE = 2;
    private static final int SendSMS_OPCODE = 3;
    private static final int CloseSession_OPCODE = 4;
    private static final int GroupSMS_OPCODE = 5;
    private static final int CancelGroup_OPCODE = 6;
    private static final int ParamSMS_OPCODE = 7;
    private static final QName ns1_CheckSMS_CheckSMS_QNAME = new QName("SMS4B", "CheckSMS");
    private static final QName ns1_CheckSMS_TYPE_QNAME = new QName("SMS4B", "CheckSMS");
    private CombinedSerializer ns1_myCheckSMS_LiteralSerializer;
    private static final QName ns1_CheckSMS_CheckSMSResponse_QNAME = new QName("SMS4B", "CheckSMSResponse");
    private static final QName ns1_CheckSMSResponse_TYPE_QNAME = new QName("SMS4B", "CheckSMSResponse");
    private CombinedSerializer ns1_myCheckSMSResponse_LiteralSerializer;
    private static final QName ns1_StartSession_StartSession_QNAME = new QName("SMS4B", "StartSession");
    private static final QName ns1_StartSession_TYPE_QNAME = new QName("SMS4B", "StartSession");
    private CombinedSerializer ns1_myStartSession_LiteralSerializer;
    private static final QName ns1_StartSession_StartSessionResponse_QNAME = new QName("SMS4B", "StartSessionResponse");
    private static final QName ns1_StartSessionResponse_TYPE_QNAME = new QName("SMS4B", "StartSessionResponse");
    private CombinedSerializer ns1_myStartSessionResponse_LiteralSerializer;
    private static final QName ns1_LoadSMS_LoadSMS_QNAME = new QName("SMS4B", "LoadSMS");
    private static final QName ns1_LoadSMS_TYPE_QNAME = new QName("SMS4B", "LoadSMS");
    private CombinedSerializer ns1_myLoadSMS_LiteralSerializer;
    private static final QName ns1_LoadSMS_LoadSMSResponse_QNAME = new QName("SMS4B", "LoadSMSResponse");
    private static final QName ns1_LoadSMSResponse_TYPE_QNAME = new QName("SMS4B", "LoadSMSResponse");
    private CombinedSerializer ns1_myLoadSMSResponse_LiteralSerializer;
    private static final QName ns1_SendSMS_SendSMS_QNAME = new QName("SMS4B", "SendSMS");
    private static final QName ns1_SendSMS_TYPE_QNAME = new QName("SMS4B", "SendSMS");
    private CombinedSerializer ns1_mySendSMS_LiteralSerializer;
    private static final QName ns1_SendSMS_SendSMSResponse_QNAME = new QName("SMS4B", "SendSMSResponse");
    private static final QName ns1_SendSMSResponse_TYPE_QNAME = new QName("SMS4B", "SendSMSResponse");
    private CombinedSerializer ns1_mySendSMSResponse_LiteralSerializer;
    private static final QName ns1_CloseSession_CloseSession_QNAME = new QName("SMS4B", "CloseSession");
    private static final QName ns1_CloseSession_TYPE_QNAME = new QName("SMS4B", "CloseSession");
    private CombinedSerializer ns1_myCloseSession_LiteralSerializer;
    private static final QName ns1_CloseSession_CloseSessionResponse_QNAME = new QName("SMS4B", "CloseSessionResponse");
    private static final QName ns1_CloseSessionResponse_TYPE_QNAME = new QName("SMS4B", "CloseSessionResponse");
    private CombinedSerializer ns1_myCloseSessionResponse_LiteralSerializer;
    private static final QName ns1_GroupSMS_GroupSMS_QNAME = new QName("SMS4B", "GroupSMS");
    private static final QName ns1_GroupSMS_TYPE_QNAME = new QName("SMS4B", "GroupSMS");
    private CombinedSerializer ns1_myGroupSMS_LiteralSerializer;
    private static final QName ns1_GroupSMS_GroupSMSResponse_QNAME = new QName("SMS4B", "GroupSMSResponse");
    private static final QName ns1_GroupSMSResponse_TYPE_QNAME = new QName("SMS4B", "GroupSMSResponse");
    private CombinedSerializer ns1_myGroupSMSResponse_LiteralSerializer;
    private static final QName ns1_CancelGroup_CancelGroup_QNAME = new QName("SMS4B", "CancelGroup");
    private static final QName ns1_CancelGroup_TYPE_QNAME = new QName("SMS4B", "CancelGroup");
    private CombinedSerializer ns1_myCancelGroup_LiteralSerializer;
    private static final QName ns1_CancelGroup_CancelGroupResponse_QNAME = new QName("SMS4B", "CancelGroupResponse");
    private static final QName ns1_CancelGroupResponse_TYPE_QNAME = new QName("SMS4B", "CancelGroupResponse");
    private CombinedSerializer ns1_myCancelGroupResponse_LiteralSerializer;
    private static final QName ns1_ParamSMS_ParamSMS_QNAME = new QName("SMS4B", "ParamSMS");
    private static final QName ns1_ParamSMS_TYPE_QNAME = new QName("SMS4B", "ParamSMS");
    private CombinedSerializer ns1_myParamSMS_LiteralSerializer;
    private static final QName ns1_ParamSMS_ParamSMSResponse_QNAME = new QName("SMS4B", "ParamSMSResponse");
    private static final QName ns1_ParamSMSResponse_TYPE_QNAME = new QName("SMS4B", "ParamSMSResponse");
    private CombinedSerializer ns1_myParamSMSResponse_LiteralSerializer;
    private static final String[] myNamespace_declarations =
                                        new String[] {
                                            "ns0", "SMS4B"
                                        };
    
    private static final QName[] understoodHeaderNames = new QName[] {  };
}
