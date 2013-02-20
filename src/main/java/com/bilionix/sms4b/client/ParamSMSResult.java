// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R2)
// Generated source version: 1.1.3

package com.bilionix.sms4b.client;


public class ParamSMSResult {
    protected int result;
    protected double rest;
    protected String addresses;
    protected long addrMask;
    protected String UTC;
    protected int duration;
    protected int limit;

    public ParamSMSResult() {
    }

    public ParamSMSResult(int result, double rest, String addresses, long addrMask, String UTC, int duration, int limit) {
        this.result = result;
        this.rest = rest;
        this.addresses = addresses;
        this.addrMask = addrMask;
        this.UTC = UTC;
        this.duration = duration;
        this.limit = limit;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public double getRest() {
        return rest;
    }

    public void setRest(double rest) {
        this.rest = rest;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public long getAddrMask() {
        return addrMask;
    }

    public void setAddrMask(long addrMask) {
        this.addrMask = addrMask;
    }

    public String getUTC() {
        return UTC;
    }

    public void setUTC(String UTC) {
        this.UTC = UTC;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public int getLimit() {
        return limit;
    }
    
    public void setLimit(int limit) {
        this.limit = limit;
    }
}
