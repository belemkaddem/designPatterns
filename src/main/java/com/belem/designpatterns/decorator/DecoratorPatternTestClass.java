package com.belem.designpatterns.decorator;

import com.belem.designpatterns.decorator.data.in.PdfGenerationData;
import com.belem.designpatterns.decorator.data.out.GeneratedPdf;
import com.belem.designpatterns.decorator.impl.PdfEncryptorDecorator;
import com.belem.designpatterns.decorator.impl.PdfFooterDecorator;
import com.belem.designpatterns.decorator.impl.PdfGenerator;
import com.belem.designpatterns.decorator.impl.PdfHeaderDecorator;

public class DecoratorPatternTestClass {

    public static void main(String[] args) {
        GeneratedPdf generatedPdf = new PdfEncryptorDecorator(
                new PdfFooterDecorator(
                        new PdfHeaderDecorator(
                            new PdfGenerator()
                    )
                )
        ).process(new PdfGenerationData());
        System.out.println(generatedPdf.toString());


        GeneratedPdf generatedPdf2 = new PdfHeaderDecorator(
                new PdfEncryptorDecorator(
                        new PdfFooterDecorator(
                                new PdfGenerator()
                        )
                )
        ).process(new PdfGenerationData());
        System.out.println(generatedPdf2.toString());
    }
}
