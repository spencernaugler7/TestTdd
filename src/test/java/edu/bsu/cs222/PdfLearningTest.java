package edu.bsu.cs222;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PdfLearningTest {
    InputStream stream = getClass().getClassLoader().getResourceAsStream("testForm.pdf");

    @Test
    public void makePdf(){
        PDDocument template = null;
        try {
            template = PDDocument.load(stream);
        } catch(IOException e) {
            e.printStackTrace();
        }

        assert template != null;
        PDDocumentCatalog catalog = template.getDocumentCatalog();
        PDAcroForm form = catalog.getAcroForm();
        List<PDField> fields = form.getFields();

        Assertions.assertNotNull(fields);
    }

    @Test
    public void testModifier()
    {
        Assertions.assertEquals(AbilityScoreId.STR, AbilityScoreModifierId.STR_MOD.mainAbilityScoreId);
    }
}
