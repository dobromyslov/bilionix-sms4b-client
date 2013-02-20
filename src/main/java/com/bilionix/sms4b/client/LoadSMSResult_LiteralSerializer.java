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

public class LoadSMSResult_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_Result_QNAME = new QName("SMS4B", "Result");
    private static final QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer ns2_myns2__int__int_Int_Serializer;
    private static final QName ns1_List_QNAME = new QName("SMS4B", "List");
    private static final QName ns1_ArrayOfSMSList_TYPE_QNAME = new QName("SMS4B", "ArrayOfSMSList");
    private CombinedSerializer ns1_myArrayOfSMSList_LiteralSerializer;

    public LoadSMSResult_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }

    public LoadSMSResult_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }

    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myns2__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer("", int.class, ns2_int_TYPE_QNAME);
        ns1_myArrayOfSMSList_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.bilionix.sms4b.client.ArrayOfSMSList.class, ns1_ArrayOfSMSList_TYPE_QNAME);
    }

    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.bilionix.sms4b.client.LoadSMSResult instance = new com.bilionix.sms4b.client.LoadSMSResult();
        Object member=null;
        QName elementName;
        java.util.List values;
        Object value;

        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_Result_QNAME)) {
                member = ns2_myns2__int__int_Int_Serializer.deserialize(ns1_Result_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setResult(((Integer)member).intValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_Result_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_List_QNAME)) {
                member = ns1_myArrayOfSMSList_LiteralSerializer.deserialize(ns1_List_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setList((com.bilionix.sms4b.client.ArrayOfSMSList)member);
                reader.nextElementContent();
            }
        }

        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }

    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.LoadSMSResult instance = (com.bilionix.sms4b.client.LoadSMSResult)obj;

    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.bilionix.sms4b.client.LoadSMSResult instance = (com.bilionix.sms4b.client.LoadSMSResult)obj;

        if (new Integer(instance.getResult()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myns2__int__int_Int_Serializer.serialize(new Integer(instance.getResult()), ns1_Result_QNAME, null, writer, context);
        if (instance.getList() != null) {
            ns1_myArrayOfSMSList_LiteralSerializer.serialize(instance.getList(), ns1_List_QNAME, null, writer, context);
        }
    }
}
