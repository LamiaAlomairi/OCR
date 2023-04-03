package src;

import java.io.*;
import net.sourceforge.tess4j.*;

public class Main {

    public static void main(String[] args) {
        
        File imageFile = new File("image.png");
        Tesseract instance = new Tesseract();  
        instance.setDatapath("C:\\Users\\Lenovo\\eclipse-workspace\\OCR");

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
