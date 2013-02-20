// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R2)
// Generated source version: 1.1.3

package com.bilionix.sms4b.client;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.literal.LiteralObjectSerializerBase;
import com.sun.xml.rpc.streaming.XMLReader;
import com.sun.xml.rpc.streaming.XMLReaderUtil;
import com.sun.xml.rpc.streaming.XMLWriter;

import javax.xml.namespace.QName;

public class GroupSMSResponse_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_GroupSMSResult_QNAME = new QName("SMS4B", "GroupSMSResult");
    private static final QName ns1_GroupSMSResult_TYPE_QNAME = new QName("SMS4B", "GroupSMSResult");
    private CombinedSerializer ns1_myGroupSMSResult_LiteralSerializer;

    public GroupSMSResponse_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }

    public GroupSMSResponse_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }

    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns1_myGroupSMSResult_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.GroupSMSResult.class, ns1_GroupSMSResult_TYPE_QNAME);
    }

    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.bilionix.sms4b.client.GroupSMSResponse instance = new com.bilionix.sms4b.client.GroupSMSResponse();
        Object member;
        QName elementName;

        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_GroupSMSResult_QNAME)) {
                member = ns1_myGroupSMSResult_LiteralSerializer.deserialize(ns1_GroupSMSResult_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setGroupSMSResult((com.bilionix.sms4b.client.GroupSMSResult)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_GroupSMSResult_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }

        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return instance;
    }

    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.GroupSMSResponse instance = (com.bilionix.sms4b.client.GroupSMSResponse)obj;

    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.GroupSMSResponse instance = (com.bilionix.sms4b.client.GroupSMSResponse)obj;
        
        if (instance.getGroupSMSResult() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns1_myGroupSMSResult_LiteralSerializer.serialize(instance.getGroupSMSResult(), ns1_GroupSMSResult_QNAME, null, writer, context);
    }
}
