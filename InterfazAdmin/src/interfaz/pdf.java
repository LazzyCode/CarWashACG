/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.IOException;
/**
 *
 * @author emilio
 */
public class pdf {
    public static void addImagen(Document document) throws DocumentException, BadElementException, IOException{
        Image imagen = Image.getInstance("src/imagenes/cwm2.jpg");
        imagen.setAlignment(Element.ALIGN_CENTER);
        document.add(imagen);
    }
}
