// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R2)
// Generated source version: 1.1.3

package com.bilionix.sms4b.client;


public class CheckSMSResult {
    protected int result;
    protected com.bilionix.sms4b.client.ArrayOfCheckSMSList list;
    
    public CheckSMSResult() {
    }
    
    public CheckSMSResult(int result, com.bilionix.sms4b.client.ArrayOfCheckSMSList list) {
        this.result = result;
        this.list = list;
    }
    
    public int getResult() {
        return result;
    }
    
    public void setResult(int result) {
        this.result = result;
    }
    
    public com.bilionix.sms4b.client.ArrayOfCheckSMSList getList() {
        return list;
    }
    
    public void setList(com.bilionix.sms4b.client.ArrayOfCheckSMSList list) {
        this.list = list;
    }
}
