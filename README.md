# EncryptPDF-Java

We can encrypt any PDF using Java by using the external library PDFBox. Inside PDFBox library 2 classes are available StandardProtectionPolicy and AccessPermission Class.

Encryption Approach:

By using the PDFBox library, you will see how you can encrypt the PDF file. Encryption is used when a user wants their own data or file in protected mode.  Encryption is used as the inbuilt algorithm for encrypting the file which is simply needed credentials to access the file. 

AccessPermission class is used to protect the PDF by assigning access permission to it. This class will restrict the user from performing different operations on the PDF. Example. Printing, copying, modifying, etc.

StandardProtectionPolicy class is used to apply a password to the PDF document. 

### Add PDFBox library .jar file 2.0.21.
### Add Apache Commons Logging library 1.2.
