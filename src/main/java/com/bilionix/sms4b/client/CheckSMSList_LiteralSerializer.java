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

public class CheckSMSList_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_G_QNAME = new QName("SMS4B", "G");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns2_myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_R_QNAME = new QName("SMS4B", "R");
    private static final QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer ns2_myns2__int__int_Int_Serializer;

    public CheckSMSList_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }

    public CheckSMSList_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }

    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", String.class, ns2_string_TYPE_QNAME);
        ns2_myns2__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer("", int.class, ns2_int_TYPE_QNAME);
    }

    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.bilionix.sms4b.client.CheckSMSList instance = new com.bilionix.sms4b.client.CheckSMSList();
        Object member=null;
        QName elementName;
        java.util.List values;
        Object value;

        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_G_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_G_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setG((String)member);
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_R_QNAME)) {
                member = ns2_myns2__int__int_Int_Serializer.deserialize(ns1_R_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setR(((Integer)member).intValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_R_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }

        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }

    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.CheckSMSList instance = (com.bilionix.sms4b.client.CheckSMSList)obj;

    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.CheckSMSList instance = (com.bilionix.sms4b.client.CheckSMSList)obj;

        if (instance.getG() != null) {
            ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getG(), ns1_G_QNAME, null, writer, context);
        }
        if (new Integer(instance.getR()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myns2__int__int_Int_Serializer.serialize(new Integer(instance.getR()), ns1_R_QNAME, null, writer, context);
    }
}
