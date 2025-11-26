package com.belem.designpatterns.decorator;

import com.belem.designpatterns.decorator.data.in.PdfGenerationData;
import com.belem.designpatterns.decorator.data.out.GeneratedPdf;

public abstract class PdfProcessorDecorator implements PdfProcessor {

    PdfProcessor pdfProcessor;

    public PdfProcessorDecorator(PdfProcessor pdfProcessor) {
        this.pdfProcessor = pdfProcessor;
    }

    @Override
    public GeneratedPdf process(PdfGenerationData myPDFGeneratorService) {
        return pdfProcessor.process(myPDFGeneratorService);
    }
}
