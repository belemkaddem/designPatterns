package com.belem.designpatterns.decorator.impl;

import com.belem.designpatterns.decorator.PdfProcessor;
import com.belem.designpatterns.decorator.PdfProcessorDecorator;
import com.belem.designpatterns.decorator.data.in.PdfGenerationData;
import com.belem.designpatterns.decorator.data.out.GeneratedPdf;


public class PdfHeaderDecorator extends PdfProcessorDecorator {

    public PdfHeaderDecorator(PdfProcessor pdfProcessor) {
        super(pdfProcessor);
    }

    @Override
    public GeneratedPdf process(PdfGenerationData pdfGenerationData) {
        GeneratedPdf generatedPdf = super.process(pdfGenerationData);
        generatedPdf.setHeader("my header");
        return generatedPdf;
    }
}
