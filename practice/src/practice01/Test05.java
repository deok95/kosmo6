package practice01;

import java.net.PasswordAuthentication;
import java.util.Properties;
import java.io.UnsupportedEncodingException;
import javax.mail.Session;
import javax.mail.MessagingException;



public class Test05 
{
	final static String user = "deok95@naver.com";
	final static String password = "0000"; 

	public static void main(String[] args) 
	{
		Properties props = new Properties();
		props.put("mail.smtp.host","smtp.naver.com");
		
		props.put("mail.smtp.port",465);
		props.put("mail.smtp.auth","true");
		
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.trust","smtp.naver.com");
		
		Session session = Session.getdefaultInstance(props,new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user,password);
			}});
		MimeMessage message = new Mimemessage(session);
		
		try 
		{
			message.setFrom(new InternetAddress(user));
			
			message.addRecipient(message.RecipientType.To, new InternetAddress(user));
			
			message.setSubject("NCS");
			
			message.setText("NCS시험 중");
			
			transport.send(message);
			System.out.println("sent to message");
		}
		catch(MessagingException e)
		{
			e.printStackTrace();
		}
		
	}

}
