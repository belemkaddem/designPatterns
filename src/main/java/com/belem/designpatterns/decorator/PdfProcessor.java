package com.belem.designpatterns.decorator;

import com.belem.designpatterns.decorator.data.in.PdfGenerationData;
import com.belem.designpatterns.decorator.data.out.GeneratedPdf;

public interface PdfProcessor{

    public GeneratedPdf process(PdfGenerationData myPDFGeneratorService);
}
