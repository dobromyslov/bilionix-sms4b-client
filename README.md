# bilionix-sms4b-client

SOAP client to sms4b.ru SMS-gateway service.
Project is based on Maven builder.

### Maven artifacts

* com.bilionix : bilionix-sms4b-client.

### Provided packages

* com.bilionix.sms4b.client.

### Usage

    String login = "your-sms4b-login";
    String password = "your-sms4b-password";
    String source = "Your-nickname";
    String phone = "+71234567890";
    String text = "Some text";

    WSSM sms4b = new WSSM_Impl();
    WSSMSoap service = sms4b.getWSSMSoap();
    String result = service.sendSMS(login, password, source, Long.parseLong(phone), text);
    if (result.equals("0") || result.indexOf("-") == 0) {
        // Error #result occured
    }
    else {
        // Successfully sent
    }

### Contacts

Viacheslav Dobromyslov viacheslav@dobromyslov.ru