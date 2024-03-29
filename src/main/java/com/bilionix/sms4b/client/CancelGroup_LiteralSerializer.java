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
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;

import javax.xml.namespace.QName;

public class CancelGroup_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_SessionID_QNAME = new QName("SMS4B", "SessionID");
    private static final QName ns2_long_TYPE_QNAME = SchemaConstants.QNAME_TYPE_LONG;
    private CombinedSerializer ns2_myns2__long__long_Long_Serializer;
    private static final QName ns1_Group_QNAME = new QName("SMS4B", "Group");

    public CancelGroup_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }

    public CancelGroup_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }

    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myns2__long__long_Long_Serializer = (CombinedSerializer)registry.getSerializer("", long.class, ns2_long_TYPE_QNAME);
    }

    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.bilionix.sms4b.client.CancelGroup instance = new com.bilionix.sms4b.client.CancelGroup();
        Object member=null;
        QName elementName;
        java.util.List values;
        Object value;

        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_SessionID_QNAME)) {
                member = ns2_myns2__long__long_Long_Serializer.deserialize(ns1_SessionID_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setSessionID(((Long)member).longValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_SessionID_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_Group_QNAME)) {
                member = ns2_myns2__long__long_Long_Serializer.deserialize(ns1_Group_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setGroup(((Long)member).longValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_Group_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }

        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }

    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.CancelGroup instance = (com.bilionix.sms4b.client.CancelGroup)obj;

    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.CancelGroup instance = (com.bilionix.sms4b.client.CancelGroup)obj;
        
        if (new Long(instance.getSessionID()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myns2__long__long_Long_Serializer.serialize(new Long(instance.getSessionID()), ns1_SessionID_QNAME, null, writer, context);
        if (new Long(instance.getGroup()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myns2__long__long_Long_Serializer.serialize(new Long(instance.getGroup()), ns1_Group_QNAME, null, writer, context);
    }
}
