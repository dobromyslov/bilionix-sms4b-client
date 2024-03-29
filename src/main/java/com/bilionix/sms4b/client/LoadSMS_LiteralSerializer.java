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

public class LoadSMS_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_SessionId_QNAME = new QName("SMS4B", "SessionId");
    private static final QName ns2_long_TYPE_QNAME = SchemaConstants.QNAME_TYPE_LONG;
    private CombinedSerializer ns2_myns2__long__long_Long_Serializer;
    private static final QName ns1_ChangesFrom_QNAME = new QName("SMS4B", "ChangesFrom");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns2_myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_Flags_QNAME = new QName("SMS4B", "Flags");
    private static final QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer ns2_myns2__int__int_Int_Serializer;

    public LoadSMS_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }

    public LoadSMS_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }

    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myns2__long__long_Long_Serializer = (CombinedSerializer)registry.getSerializer("", long.class, ns2_long_TYPE_QNAME);
        ns2_myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", String.class, ns2_string_TYPE_QNAME);
        ns2_myns2__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer("", int.class, ns2_int_TYPE_QNAME);
    }

    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.bilionix.sms4b.client.LoadSMS instance = new com.bilionix.sms4b.client.LoadSMS();
        Object member=null;
        QName elementName;
        java.util.List values;
        Object value;

        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_SessionId_QNAME)) {
                member = ns2_myns2__long__long_Long_Serializer.deserialize(ns1_SessionId_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setSessionId(((Long)member).longValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_SessionId_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_ChangesFrom_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_ChangesFrom_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setChangesFrom((String)member);
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_Flags_QNAME)) {
                member = ns2_myns2__int__int_Int_Serializer.deserialize(ns1_Flags_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setFlags(((Integer)member).intValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_Flags_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }

        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }

    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.LoadSMS instance = (com.bilionix.sms4b.client.LoadSMS)obj;

    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.LoadSMS instance = (com.bilionix.sms4b.client.LoadSMS)obj;

        if (new Long(instance.getSessionId()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myns2__long__long_Long_Serializer.serialize(new Long(instance.getSessionId()), ns1_SessionId_QNAME, null, writer, context);
        if (instance.getChangesFrom() != null) {
            ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getChangesFrom(), ns1_ChangesFrom_QNAME, null, writer, context);
        }
        if (new Integer(instance.getFlags()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myns2__int__int_Int_Serializer.serialize(new Integer(instance.getFlags()), ns1_Flags_QNAME, null, writer, context);
    }
}
