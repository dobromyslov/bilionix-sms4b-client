// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R2)
// Generated source version: 1.1.3

package com.bilionix.sms4b.client;

public interface WSSMSoap extends java.rmi.Remote {
    public long startSession(String login, String password, short gmt) throws
         java.rmi.RemoteException;
    public int cancelGroup(long sessionID, long group) throws
         java.rmi.RemoteException;
    public int closeSession(long sessionID) throws
         java.rmi.RemoteException;
    public com.bilionix.sms4b.client.GroupSMSResult groupSMS(long sessionId, long group, String source, int encoding, String body, String off, String start, String period, com.bilionix.sms4b.client.ArrayOfGroupSMSList list) throws
         java.rmi.RemoteException;
    public com.bilionix.sms4b.client.CheckSMSResult checkSMS(long sessionId, com.bilionix.sms4b.client.ArrayOfString guids) throws
         java.rmi.RemoteException;
    public com.bilionix.sms4b.client.LoadSMSResult loadSMS(long sessionId, String changesFrom, int flags) throws
         java.rmi.RemoteException;
    public com.bilionix.sms4b.client.ParamSMSResult paramSMS(long sessionId) throws
         java.rmi.RemoteException;
    public String sendSMS(String login, String password, String source, long phone, String text) throws
         java.rmi.RemoteException;
}
