import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
            throws IOException
    {
        // step 1. Loading the pdf file
        File f = new File("D:\\Attchment\\Test.pdf");
        FileInputStream fileInputStream = new FileInputStream(f);
        PDDocument pdd = PDDocument.load(fileInputStream);

        // step 2.Creating instance of AccessPermission
        // class
        AccessPermission ap = new AccessPermission();

        // step 3. Creating instance of
        // StandardProtectionPolicy
        StandardProtectionPolicy stpp
                = new StandardProtectionPolicy("abcd", "abcd", ap);

        // step 4. Setting the length of Encryption key
        stpp.setEncryptionKeyLength(128);

        // step 5. Setting the permission
        stpp.setPermissions(ap);

        // step 6. Protecting the PDF file
        pdd.protect(stpp);

        // step 7. Saving and closing the the PDF Document
        pdd.save("D:\\demo.pdf");
        pdd.close();

        System.out.println("PDF Encrypted successfully...");
    }
}
