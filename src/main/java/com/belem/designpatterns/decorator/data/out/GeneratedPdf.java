package com.belem.designpatterns.decorator.data.out;

public class GeneratedPdf {

    private String header;
    private String footer;
    private String body;

    @Override
    public String toString() {
        return "GeneratedPdf { " + "header= " + header  +", footer= " + footer + ", body= " + body  +" }";
    }

    public String getFooter() {
        return footer;
    }
    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
}
