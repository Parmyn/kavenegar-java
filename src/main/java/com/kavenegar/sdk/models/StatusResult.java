/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kavenegar.sdk.models;

import com.google.gson.JsonObject;
import com.kavenegar.sdk.enums.MessageStatus;

/**
 * @author mohsen
 */
public class StatusResult {

    int messageId;
    int statusCode;
    MessageStatus status;
    String statusText;

    protected StatusResult() {

    }

    public StatusResult(JsonObject json) {
        this.messageId = (json.get("messageid").getAsInt());
        this.statusCode = json.get("status").getAsInt();
        this.status = MessageStatus.valueOf(this.statusCode);
        this.statusText = json.get("statustext").getAsString();
    }

    public int getMessageId() {
        return messageId;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public String getStatusText() {
        return statusText;
    }
}
