package Util;
import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class EmailUtil {
	public  int SendEmail(String url,String payload) 
	{
		try {
		Properties props = new Properties();
       /* //��ȡ��ǰʱ��
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        Date date=new Date();*/

        // ����debug����
        //props.setProperty("mail.debug", "true");
        // ���ͷ�������Ҫ�����֤
        props.setProperty("mail.smtp.auth", "true");
        // �����ʼ�������������
        props.setProperty("mail.host", "smtp.qq.com");
        // �����ʼ�Э������
        props.setProperty("mail.transport.protocol", "smtp");

        //SSL����
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.ssl.socketFactory", sf);

        Session session = Session.getInstance(props);

        Message msg = new MimeMessage(session);
        msg.setSubject("Just for test");
        //StringBuilder builder = new StringBuilder();
       
        msg.setText(payload);
        //�ʼ�������
        msg.setFrom(new InternetAddress("973022448@qq.com"));

        //�����ʼ�
        
        Transport transport = session.getTransport();
        transport.connect("smtp.qq.com", "973022448@qq.com", "onjryufkkewlbcid");

        transport.sendMessage(msg, new Address[] { new InternetAddress(url) });
        transport.close();
        return 1;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
		
		
	}
    
}
