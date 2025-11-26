package com.belem.designpatterns.decorator.data.in;

public class PdfGenerationData {

    private String fileName;
    private String filePath;
    private String HeaderContent;
    private String FooterContent;
    private String bodyContent;

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getHeaderContent() {
        return HeaderContent;
    }
    public void setHeaderContent(String headerContent) {
        HeaderContent = headerContent;
    }

    public String getFooterContent() {
        return FooterContent;
    }
    public void setFooterContent(String footerContent) {
        FooterContent = footerContent;
    }

    public String getBodyContent() {
        return bodyContent;
    }
    public void setBodyContent(String bodyContent) {
        this.bodyContent = bodyContent;
    }
}
