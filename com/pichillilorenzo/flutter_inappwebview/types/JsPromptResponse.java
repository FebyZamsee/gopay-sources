package com.pichillilorenzo.flutter_inappwebview.types;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Map;

public class JsPromptResponse {
    private Integer action;
    private String cancelButtonTitle;
    private String confirmButtonTitle;
    private String defaultValue;
    private boolean handledByClient;
    private String message;
    private String value;

    public JsPromptResponse(String str, String str2, String str3, String str4, boolean z, String str5, Integer num) {
        this.message = str;
        this.defaultValue = str2;
        this.confirmButtonTitle = str3;
        this.cancelButtonTitle = str4;
        this.handledByClient = z;
        this.value = str5;
        this.action = num;
    }

    public static JsPromptResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new JsPromptResponse((String) map.get(Constants.MESSAGE), (String) map.get("defaultValue"), (String) map.get("confirmButtonTitle"), (String) map.get("cancelButtonTitle"), ((Boolean) map.get("handledByClient")).booleanValue(), (String) map.get("value"), (Integer) map.get("action"));
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(String str) {
        this.defaultValue = str;
    }

    public String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }

    public void setConfirmButtonTitle(String str) {
        this.confirmButtonTitle = str;
    }

    public String getCancelButtonTitle() {
        return this.cancelButtonTitle;
    }

    public void setCancelButtonTitle(String str) {
        this.cancelButtonTitle = str;
    }

    public boolean isHandledByClient() {
        return this.handledByClient;
    }

    public void setHandledByClient(boolean z) {
        this.handledByClient = z;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public Integer getAction() {
        return this.action;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JsPromptResponse jsPromptResponse = (JsPromptResponse) obj;
        if (this.handledByClient != jsPromptResponse.handledByClient) {
            return false;
        }
        String str = this.message;
        if (str == null ? jsPromptResponse.message != null : !str.equals(jsPromptResponse.message)) {
            return false;
        }
        String str2 = this.defaultValue;
        if (str2 == null ? jsPromptResponse.defaultValue != null : !str2.equals(jsPromptResponse.defaultValue)) {
            return false;
        }
        String str3 = this.confirmButtonTitle;
        if (str3 == null ? jsPromptResponse.confirmButtonTitle != null : !str3.equals(jsPromptResponse.confirmButtonTitle)) {
            return false;
        }
        String str4 = this.cancelButtonTitle;
        if (str4 == null ? jsPromptResponse.cancelButtonTitle != null : !str4.equals(jsPromptResponse.cancelButtonTitle)) {
            return false;
        }
        String str5 = this.value;
        if (str5 == null ? jsPromptResponse.value != null : !str5.equals(jsPromptResponse.value)) {
            return false;
        }
        Integer num = this.action;
        Integer num2 = jsPromptResponse.action;
        if (num != null) {
            return num.equals(num2);
        }
        if (num2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.defaultValue;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.confirmButtonTitle;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.cancelButtonTitle;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        boolean z = this.handledByClient;
        String str5 = this.value;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        Integer num = this.action;
        if (num != null) {
            i = num.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (z ? 1 : 0)) * 31) + hashCode5) * 31) + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JsPromptResponse{message='");
        sb.append(this.message);
        sb.append("', defaultValue='");
        sb.append(this.defaultValue);
        sb.append("', confirmButtonTitle='");
        sb.append(this.confirmButtonTitle);
        sb.append("', cancelButtonTitle='");
        sb.append(this.cancelButtonTitle);
        sb.append("', handledByClient=");
        sb.append(this.handledByClient);
        sb.append(", value='");
        sb.append(this.value);
        sb.append("', action=");
        sb.append(this.action);
        sb.append('}');
        return sb.toString();
    }
}