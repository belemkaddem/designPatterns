package com.belem.designpatterns.decorator.impl;

import com.belem.designpatterns.decorator.PdfProcessor;
import com.belem.designpatterns.decorator.data.in.PdfGenerationData;
import com.belem.designpatterns.decorator.data.out.GeneratedPdf;

public class PdfGenerator implements PdfProcessor {

    @Override
    public GeneratedPdf process(PdfGenerationData myPDFGeneratorService) {
        GeneratedPdf generatedPdf= new GeneratedPdf();
        generatedPdf.setBody("Body");
        return generatedPdf;
    }
}
