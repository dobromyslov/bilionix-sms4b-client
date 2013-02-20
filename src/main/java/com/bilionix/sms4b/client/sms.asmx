<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="SMS4B" xmlns:s1="SMS4B/AbstractTypes" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="SMS4B" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Web-сервис для клиента SMS</wsdl:documentation>
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="SMS4B">
      <s:element name="StartSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Login" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="Gmt" type="s:short" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="StartSessionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="StartSessionResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelGroup">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SessionID" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="Group" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelGroupResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CancelGroupResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CloseSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SessionID" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CloseSessionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CloseSessionResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GroupSMS">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SessionId" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="Group" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="Source" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="Encoding" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="Body" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Off" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Start" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Period" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="List" type="tns:ArrayOfGroupSMSList" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfGroupSMSList">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="GroupSMSList" type="tns:GroupSMSList" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GroupSMSList">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="G" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="D" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="B" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="E" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="GroupSMSResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GroupSMSResult" type="tns:GroupSMSResult" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="GroupSMSResult">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Result" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Group" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="List" type="tns:ArrayOfCheckSMSList" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCheckSMSList">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CheckSMSList" type="tns:CheckSMSList" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CheckSMSList">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="G" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="R" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="CheckSMS">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SessionId" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="Guids" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CheckSMSResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CheckSMSResult" type="tns:CheckSMSResult" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="CheckSMSResult">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Result" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="List" type="tns:ArrayOfCheckSMSList" />
        </s:sequence>
      </s:complexType>
      <s:element name="LoadSMS">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SessionId" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="ChangesFrom" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="Flags" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LoadSMSResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="LoadSMSResult" type="tns:LoadSMSResult" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="LoadSMSResult">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Result" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="List" type="tns:ArrayOfSMSList" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSMSList">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="SMSList" type="tns:SMSList" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="SMSList">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="G" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="D" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="B" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="E" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="A" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="P" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="M" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="T" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="S" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="ParamSMS">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SessionId" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ParamSMSResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ParamSMSResult" type="tns:ParamSMSResult" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ParamSMSResult">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="Result" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Rest" type="s:double" />
          <s:element minOccurs="0" maxOccurs="1" name="Addresses" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="AddrMask" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="UTC" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="Duration" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="Limit" type="s:int" />
        </s:sequence>
      </s:complexType>
      <s:element name="SendSMS">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Login" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Password" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Source" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="Phone" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="Text" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SendSMSResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SendSMSResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="long" type="s:long" />
      <s:element name="int" type="s:int" />
      <s:element name="CheckSMSResult" type="tns:CheckSMSResult" />
      <s:element name="LoadSMSResult" type="tns:LoadSMSResult" />
      <s:element name="ParamSMSResult" type="tns:ParamSMSResult" />
      <s:element name="string" nillable="true" type="s:string" />
    </s:schema>
    <s:schema targetNamespace="SMS4B/AbstractTypes">
      <s:import namespace="http://schemas.xmlsoap.org/soap/encoding/" />
      <s:complexType name="StringArray">
        <s:complexContent mixed="false">
          <s:restriction base="soapenc:Array">
            <s:sequence>
              <s:element minOccurs="0" maxOccurs="unbounded" name="String" type="s:string" />
            </s:sequence>
          </s:restriction>
        </s:complexContent>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="StartSessionSoapIn">
    <wsdl:part name="parameters" element="tns:StartSession" />
  </wsdl:message>
  <wsdl:message name="StartSessionSoapOut">
    <wsdl:part name="parameters" element="tns:StartSessionResponse" />
  </wsdl:message>
  <wsdl:message name="CancelGroupSoapIn">
    <wsdl:part name="parameters" element="tns:CancelGroup" />
  </wsdl:message>
  <wsdl:message name="CancelGroupSoapOut">
    <wsdl:part name="parameters" element="tns:CancelGroupResponse" />
  </wsdl:message>
  <wsdl:message name="CloseSessionSoapIn">
    <wsdl:part name="parameters" element="tns:CloseSession" />
  </wsdl:message>
  <wsdl:message name="CloseSessionSoapOut">
    <wsdl:part name="parameters" element="tns:CloseSessionResponse" />
  </wsdl:message>
  <wsdl:message name="GroupSMSSoapIn">
    <wsdl:part name="parameters" element="tns:GroupSMS" />
  </wsdl:message>
  <wsdl:message name="GroupSMSSoapOut">
    <wsdl:part name="parameters" element="tns:GroupSMSResponse" />
  </wsdl:message>
  <wsdl:message name="CheckSMSSoapIn">
    <wsdl:part name="parameters" element="tns:CheckSMS" />
  </wsdl:message>
  <wsdl:message name="CheckSMSSoapOut">
    <wsdl:part name="parameters" element="tns:CheckSMSResponse" />
  </wsdl:message>
  <wsdl:message name="LoadSMSSoapIn">
    <wsdl:part name="parameters" element="tns:LoadSMS" />
  </wsdl:message>
  <wsdl:message name="LoadSMSSoapOut">
    <wsdl:part name="parameters" element="tns:LoadSMSResponse" />
  </wsdl:message>
  <wsdl:message name="ParamSMSSoapIn">
    <wsdl:part name="parameters" element="tns:ParamSMS" />
  </wsdl:message>
  <wsdl:message name="ParamSMSSoapOut">
    <wsdl:part name="parameters" element="tns:ParamSMSResponse" />
  </wsdl:message>
  <wsdl:message name="SendSMSSoapIn">
    <wsdl:part name="parameters" element="tns:SendSMS" />
  </wsdl:message>
  <wsdl:message name="SendSMSSoapOut">
    <wsdl:part name="parameters" element="tns:SendSMSResponse" />
  </wsdl:message>
  <wsdl:message name="StartSessionHttpPostIn">
    <wsdl:part name="Login" type="s:string" />
    <wsdl:part name="Password" type="s:string" />
    <wsdl:part name="Gmt" type="s:string" />
  </wsdl:message>
  <wsdl:message name="StartSessionHttpPostOut">
    <wsdl:part name="Body" element="tns:long" />
  </wsdl:message>
  <wsdl:message name="CancelGroupHttpPostIn">
    <wsdl:part name="SessionID" type="s:string" />
    <wsdl:part name="Group" type="s:string" />
  </wsdl:message>
  <wsdl:message name="CancelGroupHttpPostOut">
    <wsdl:part name="Body" element="tns:int" />
  </wsdl:message>
  <wsdl:message name="CloseSessionHttpPostIn">
    <wsdl:part name="SessionID" type="s:string" />
  </wsdl:message>
  <wsdl:message name="CloseSessionHttpPostOut">
    <wsdl:part name="Body" element="tns:int" />
  </wsdl:message>
  <wsdl:message name="CheckSMSHttpPostIn">
    <wsdl:part name="SessionId" type="s:string" />
    <wsdl:part name="Guids" type="s1:StringArray" />
  </wsdl:message>
  <wsdl:message name="CheckSMSHttpPostOut">
    <wsdl:part name="Body" element="tns:CheckSMSResult" />
  </wsdl:message>
  <wsdl:message name="LoadSMSHttpPostIn">
    <wsdl:part name="SessionId" type="s:string" />
    <wsdl:part name="ChangesFrom" type="s:string" />
    <wsdl:part name="Flags" type="s:string" />
  </wsdl:message>
  <wsdl:message name="LoadSMSHttpPostOut">
    <wsdl:part name="Body" element="tns:LoadSMSResult" />
  </wsdl:message>
  <wsdl:message name="ParamSMSHttpPostIn">
    <wsdl:part name="SessionId" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ParamSMSHttpPostOut">
    <wsdl:part name="Body" element="tns:ParamSMSResult" />
  </wsdl:message>
  <wsdl:message name="SendSMSHttpPostIn">
    <wsdl:part name="Login" type="s:string" />
    <wsdl:part name="Password" type="s:string" />
    <wsdl:part name="Source" type="s:string" />
    <wsdl:part name="Phone" type="s:string" />
    <wsdl:part name="Text" type="s:string" />
  </wsdl:message>
  <wsdl:message name="SendSMSHttpPostOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:portType name="WSSMSoap">
    <wsdl:operation name="StartSession">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Открыть сессию. Возвращает код для работы с другими методами или код ошибки (&lt;0)</wsdl:documentation>
      <wsdl:input message="tns:StartSessionSoapIn" />
      <wsdl:output message="tns:StartSessionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CancelGroup">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Отменить доставку группы. Возвращается предполагаемое количество &gt;0 отмененных sms либо стандартный код ошибки. 0 означает невозможность отмены либо отсутствие sms.</wsdl:documentation>
      <wsdl:input message="tns:CancelGroupSoapIn" />
      <wsdl:output message="tns:CancelGroupSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CloseSession">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Закрыть сессию. Возвращает успешный 0 либо код ошибки</wsdl:documentation>
      <wsdl:input message="tns:CloseSessionSoapIn" />
      <wsdl:output message="tns:CloseSessionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GroupSMS">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Отправка пакета группы сообщений. При (Group=-1) создается группа. При (Group=-2) создается равномерная группа. Если возвращается Result &gt; 0 и Group &gt;=0, то принято хотя бы одно сообщение и в каждой строке List в поле R код состояния (&gt;0) либо код ошибки (&lt;0)</wsdl:documentation>
      <wsdl:input message="tns:GroupSMSSoapIn" />
      <wsdl:output message="tns:GroupSMSSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckSMS">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Проверка пакета сообщений. Если возвращается Result &gt; 0, то в списке List для каждого сообщения возвращает состояние (R&gt;0), либо код ошибки (R&lt;=0)</wsdl:documentation>
      <wsdl:input message="tns:CheckSMSSoapIn" />
      <wsdl:output message="tns:CheckSMSSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="LoadSMS">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Выдача с указанного момента ChangesFrom пакета входящих sms (при Flags = 0) либо склеенных сообщений (при Flags = 1), либо (Result=0), либо код ошибки (Result&lt;0)</wsdl:documentation>
      <wsdl:input message="tns:LoadSMSSoapIn" />
      <wsdl:output message="tns:LoadSMSSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ParamSMS">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Выдача параметров либо кода ошибки (Result&lt;0)</wsdl:documentation>
      <wsdl:input message="tns:ParamSMSSoapIn" />
      <wsdl:output message="tns:ParamSMSSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SendSMS">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Упрощенная отправка уникальных сообщений. Возвращает идентификатор сообщения либо код ошибки (&lt;=0)</wsdl:documentation>
      <wsdl:input message="tns:SendSMSSoapIn" />
      <wsdl:output message="tns:SendSMSSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="WSSMHttpPost">
    <wsdl:operation name="StartSession">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Открыть сессию. Возвращает код для работы с другими методами или код ошибки (&lt;0)</wsdl:documentation>
      <wsdl:input message="tns:StartSessionHttpPostIn" />
      <wsdl:output message="tns:StartSessionHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="CancelGroup">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Отменить доставку группы. Возвращается предполагаемое количество &gt;0 отмененных sms либо стандартный код ошибки. 0 означает невозможность отмены либо отсутствие sms.</wsdl:documentation>
      <wsdl:input message="tns:CancelGroupHttpPostIn" />
      <wsdl:output message="tns:CancelGroupHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="CloseSession">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Закрыть сессию. Возвращает успешный 0 либо код ошибки</wsdl:documentation>
      <wsdl:input message="tns:CloseSessionHttpPostIn" />
      <wsdl:output message="tns:CloseSessionHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckSMS">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Проверка пакета сообщений. Если возвращается Result &gt; 0, то в списке List для каждого сообщения возвращает состояние (R&gt;0), либо код ошибки (R&lt;=0)</wsdl:documentation>
      <wsdl:input message="tns:CheckSMSHttpPostIn" />
      <wsdl:output message="tns:CheckSMSHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="LoadSMS">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Выдача с указанного момента ChangesFrom пакета входящих sms (при Flags = 0) либо склеенных сообщений (при Flags = 1), либо (Result=0), либо код ошибки (Result&lt;0)</wsdl:documentation>
      <wsdl:input message="tns:LoadSMSHttpPostIn" />
      <wsdl:output message="tns:LoadSMSHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="ParamSMS">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Выдача параметров либо кода ошибки (Result&lt;0)</wsdl:documentation>
      <wsdl:input message="tns:ParamSMSHttpPostIn" />
      <wsdl:output message="tns:ParamSMSHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="SendSMS">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Упрощенная отправка уникальных сообщений. Возвращает идентификатор сообщения либо код ошибки (&lt;=0)</wsdl:documentation>
      <wsdl:input message="tns:SendSMSHttpPostIn" />
      <wsdl:output message="tns:SendSMSHttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="WSSMSoap" type="tns:WSSMSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="StartSession">
      <soap:operation soapAction="SMS4B/StartSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelGroup">
      <soap:operation soapAction="SMS4B/CancelGroup" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CloseSession">
      <soap:operation soapAction="SMS4B/CloseSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GroupSMS">
      <soap:operation soapAction="SMS4B/GroupSMS" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckSMS">
      <soap:operation soapAction="SMS4B/CheckSMS" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="LoadSMS">
      <soap:operation soapAction="SMS4B/LoadSMS" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ParamSMS">
      <soap:operation soapAction="SMS4B/ParamSMS" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SendSMS">
      <soap:operation soapAction="SMS4B/SendSMS" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="WSSMSoap12" type="tns:WSSMSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="StartSession">
      <soap12:operation soapAction="SMS4B/StartSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelGroup">
      <soap12:operation soapAction="SMS4B/CancelGroup" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CloseSession">
      <soap12:operation soapAction="SMS4B/CloseSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GroupSMS">
      <soap12:operation soapAction="SMS4B/GroupSMS" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckSMS">
      <soap12:operation soapAction="SMS4B/CheckSMS" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="LoadSMS">
      <soap12:operation soapAction="SMS4B/LoadSMS" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ParamSMS">
      <soap12:operation soapAction="SMS4B/ParamSMS" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SendSMS">
      <soap12:operation soapAction="SMS4B/SendSMS" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="WSSMHttpPost" type="tns:WSSMHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="StartSession">
      <http:operation location="/StartSession" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelGroup">
      <http:operation location="/CancelGroup" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CloseSession">
      <http:operation location="/CloseSession" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckSMS">
      <http:operation location="/CheckSMS" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="LoadSMS">
      <http:operation location="/LoadSMS" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ParamSMS">
      <http:operation location="/ParamSMS" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SendSMS">
      <http:operation location="/SendSMS" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="WSSM">
    <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Web-сервис для клиента SMS</wsdl:documentation>
    <wsdl:port name="WSSMSoap" binding="tns:WSSMSoap">
      <soap:address location="https://sms4b.ru/ws/sms.asmx" />
    </wsdl:port>
    <wsdl:port name="WSSMSoap12" binding="tns:WSSMSoap12">
      <soap12:address location="https://sms4b.ru/ws/sms.asmx" />
    </wsdl:port>
    <wsdl:port name="WSSMHttpPost" binding="tns:WSSMHttpPost">
      <http:address location="https://sms4b.ru/ws/sms.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>