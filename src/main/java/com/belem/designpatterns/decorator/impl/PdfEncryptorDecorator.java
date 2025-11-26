package com.belem.designpatterns.decorator.impl;

import com.belem.designpatterns.decorator.PdfProcessor;
import com.belem.designpatterns.decorator.PdfProcessorDecorator;
import com.belem.designpatterns.decorator.data.in.PdfGenerationData;
import com.belem.designpatterns.decorator.data.out.GeneratedPdf;

public class PdfEncryptorDecorator extends PdfProcessorDecorator {

    public PdfEncryptorDecorator(PdfProcessor pdfProcessor) {
        super(pdfProcessor);
    }

    @Override
    public GeneratedPdf process(PdfGenerationData pdfGenerationData) {
        GeneratedPdf generatedPdf = super.process(pdfGenerationData);
        generatedPdf.setBody(new StringBuilder(new String(generatedPdf.getBody())).reverse().toString());
        generatedPdf.setHeader(new StringBuilder(new String(generatedPdf.getHeader())).reverse().toString());
        generatedPdf.setFooter(new StringBuilder(new String(generatedPdf.getFooter())).reverse().toString());
        return generatedPdf;
    }
}
