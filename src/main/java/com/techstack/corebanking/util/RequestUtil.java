package com.techstack.corebanking.util;

import com.techstack.corebanking.stub.FCUBSHEADERType;
import com.techstack.corebanking.stub.UBSCOMPType;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Map;

public class RequestUtil {
    private RequestUtil() {}
    public static FCUBSHEADERType getRequestURL(Map<String, String> requestHeaders) {
        FCUBSHEADERType fcubsheader = new FCUBSHEADERType();

        // Check if requestHeaders is null
        if (requestHeaders == null) {
            throw new IllegalArgumentException("Request headers cannot be null");
        }

        fcubsheader.setSOURCE(requestHeaders.getOrDefault("SOURCE", "FCAT"));
        fcubsheader.setUBSCOMP(requestHeaders.getOrDefault("UBSCOMP", "FCUBS").equals("FCUBS") ? UBSCOMPType.FCUBS : UBSCOMPType.valueOf(requestHeaders.get("UBSCOMP")));
        fcubsheader.setMSGID(requestHeaders.getOrDefault("MSGID", ""));
        fcubsheader.setCORRELID(requestHeaders.get("CORRELID"));
        fcubsheader.setUSERID(requestHeaders.getOrDefault("USERID", "TAKEON02"));
        fcubsheader.setPASSWORD(requestHeaders.getOrDefault("PASSWORD", "Oracle@2"));
        fcubsheader.setMODULEID(requestHeaders.getOrDefault("MODULEID", ""));
        fcubsheader.setSERVICE(requestHeaders.getOrDefault("SERVICE", "FCUBSAccService"));
        fcubsheader.setBRANCH(requestHeaders.getOrDefault("BRANCH", "100"));

        // OPERATION is mandatory - throw exception if not set
        String operation = requestHeaders.get("OPERATION");
        if (operation == null || operation.trim().isEmpty()) {
            throw new IllegalArgumentException("OPERATION header is required and cannot be null or empty");
        }

        fcubsheader.setOPERATION(operation);

        return fcubsheader;
    }
}
