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
import java.util.ArrayList;

public class ArrayOfString_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_string_QNAME = new QName("SMS4B", "string");
    private static final QName ns2_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns2_myns2_string__java_lang_String_String_Serializer;

    public ArrayOfString_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }

    public ArrayOfString_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }

    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myns2_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", String.class, ns2_string_TYPE_QNAME);
    }

    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.bilionix.sms4b.client.ArrayOfString instance = new com.bilionix.sms4b.client.ArrayOfString();
        Object member=null;
        QName elementName;
        java.util.List<Object> values;
        Object value;

        reader.nextElementContent();
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_string_QNAME))) {
            values = new ArrayList<Object>();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_string_QNAME))) {
                    value = ns2_myns2_string__java_lang_String_String_Serializer.deserialize(ns1_string_QNAME, reader, context);
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new String[values.size()];
            member = values.toArray((Object[]) member);
            instance.setString((String[])member);
        }
        else {
            instance.setString(new String[0]);
        }

        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }

    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.ArrayOfString instance = (com.bilionix.sms4b.client.ArrayOfString)obj;

    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.ArrayOfString instance = (com.bilionix.sms4b.client.ArrayOfString)obj;
        
        if (instance.getString() != null) {
            for (int i = 0; i < instance.getString().length; ++i) {
                ns2_myns2_string__java_lang_String_String_Serializer.serialize(instance.getString()[i], ns1_string_QNAME, null, writer, context);
            }
        }
    }
}
