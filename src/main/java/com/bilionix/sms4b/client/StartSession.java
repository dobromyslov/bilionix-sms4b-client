// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R2)
// Generated source version: 1.1.3

package com.bilionix.sms4b.client;


public class StartSession {
    protected String login;
    protected String password;
    protected short gmt;

    public StartSession() {
    }

    public StartSession(String login, String password, short gmt) {
        this.login = login;
        this.password = password;
        this.gmt = gmt;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public short getGmt() {
        return gmt;
    }
    
    public void setGmt(short gmt) {
        this.gmt = gmt;
    }
}
