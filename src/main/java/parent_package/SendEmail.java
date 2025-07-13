package parent_package;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

public class SendEmail {

    public static void main(String[] args) {

        // Sender's email credentials
        final String username = "";
        final String password = ""; // For Gmail, generate App Password

        // Receiver's email
        String toEmail = "";

        // SMTP Server properties (For Gmail)
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create MimeMessage
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Email with Multiple Inline Images");

            // List of image paths and their content IDs
            Map<String, String> imageMap = new LinkedHashMap<>();
            imageMap.put("D:\\CODE\\java\\sts\\core_java_concepts\\core_java\\src\\main\\resources\\gypsy.png", "image1");
            imageMap.put("D:\\CODE\\java\\sts\\core_java_concepts\\core_java\\src\\main\\resources\\wallpaperflare.com_wallpaper.jpg", "image2");

            // Build HTML content with multiple image references
            StringBuilder htmlBuilder = new StringBuilder();
            htmlBuilder.append("<h1>Hello!</h1>");
            htmlBuilder.append("<p>This email contains multiple inline images:</p>");
            for (String cid : imageMap.values()) {
                htmlBuilder.append("<img src='cid:").append(cid).append("'><br>");
            }

            // Create multipart for email body
            MimeMultipart multipart = new MimeMultipart("related");

            // First part - HTML body
            BodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent(htmlBuilder.toString(), "text/html");
            multipart.addBodyPart(htmlPart);

            // Add each image as a separate inline part
            for (Map.Entry<String, String> entry : imageMap.entrySet()) {
                MimeBodyPart imagePart = new MimeBodyPart();
                imagePart.attachFile(new File(entry.getKey()));
                imagePart.setHeader("Content-ID", "<" + entry.getValue() + ">");
                imagePart.setDisposition(MimeBodyPart.INLINE);
                multipart.addBodyPart(imagePart);
            }

            // Set content and send
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Email sent successfully with multiple inline images!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
