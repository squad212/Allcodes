package com.humana.dhp.dhppocs.AmericanAirlines.Controller;


public class XmlRequest {
    private String xmlRequest;

    public String getXmlRequest() {
        return xmlRequest;
    }

    public void setXmlRequest(String xmlRequest) {
        this.xmlRequest = xmlRequest;
    }

    @Override
    public String toString() {
        return "XmlRequest{" +
                "xmlRequest='" + xmlRequest + '\'' +
                '}';
    }
}
