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

public class SendSMS_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_Login_QNAME = new QName("SMS4B", "Login");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns2_myns2_string__java_lang_String_String_Serializer;
    private static final QName ns1_Password_QNAME = new QName("SMS4B", "Password");
    private static final QName ns1_Source_QNAME = new QName("SMS4B", "Source");
    private static final QName ns1_Phone_QNAME = new QName("SMS4B", "Phone");
    private static final QName ns2_long_TYPE_QNAME = SchemaConstants.QNAME_TYPE_LONG;
    private CombinedSerializer ns2_myns2__long__long_Long_Serializer;
    private static final QName ns1_Text_QNAME = new QName("SMS4B", "Text");

    public SendSMS_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }

    public SendSMS_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }

    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", String.class, ns2_string_TYPE_QNAME);
        ns2_myns2__long__long_Long_Serializer = (CombinedSerializer)registry.getSerializer("", long.class, ns2_long_TYPE_QNAME);
    }

    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.bilionix.sms4b.client.SendSMS instance = new com.bilionix.sms4b.client.SendSMS();
        Object member=null;
        QName elementName;
        java.util.List values;
        Object value;

        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_Login_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_Login_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setLogin((String)member);
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_Password_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_Password_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setPassword((String)member);
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_Source_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_Source_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setSource((String)member);
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_Phone_QNAME)) {
                member = ns2_myns2__long__long_Long_Serializer.deserialize(ns1_Phone_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setPhone(((Long)member).longValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_Phone_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_Text_QNAME)) {
                member = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_Text_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setText((String)member);
                reader.nextElementContent();
            }
        }

        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }

    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.SendSMS instance = (com.bilionix.sms4b.client.SendSMS)obj;

    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.SendSMS instance = (com.bilionix.sms4b.client.SendSMS)obj;
        
        if (instance.getLogin() != null) {
            ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getLogin(), ns1_Login_QNAME, null, writer, context);
        }
        if (instance.getPassword() != null) {
            ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getPassword(), ns1_Password_QNAME, null, writer, context);
        }
        if (instance.getSource() != null) {
            ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getSource(), ns1_Source_QNAME, null, writer, context);
        }
        if (new Long(instance.getPhone()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myns2__long__long_Long_Serializer.serialize(new Long(instance.getPhone()), ns1_Phone_QNAME, null, writer, context);
        if (instance.getText() != null) {
            ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getText(), ns1_Text_QNAME, null, writer, context);
        }
    }
}
