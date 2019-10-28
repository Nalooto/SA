package Service;
//import java.nio.channels.ScatteringByteChannel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import Util.EmailUtil;
/** 
 *  @WebService �� ����һ��ע�⣬��������ָ�������෢����һ��ws. 
    Endpoint �C ����Ϊ�˵�����࣬���ķ���publish���ڽ�һ���Ѿ������@WebServiceע�����󶨵�һ����ַ�Ķ˿��ϡ� 

 * 
 * 
 */  
@WebService //��ע����������ָ�������෢����һ��WebService
public class webService {
    
	public int sendEmail(String _url, String _payload) { 	
		EmailUtil emailUtil=new EmailUtil();
    	return emailUtil.SendEmail(_url, _payload);	
    }
   public  int  sendEmailBatch(String[] _url, String _payload) {
    
	   EmailUtil emailUtil=new EmailUtil();
    	for(int i=0;i<_url.length;i++)
    	{
    		if(vaildateEmailAddress(_url[i]))//��������ʽ
    		{
    		int cur=emailUtil.SendEmail(_url[i], _payload);
    		if(cur==0) 	
    		return 0;
    		}
    		else
    		return 0;
    		
    	
    	}
    	return 1;//Ⱥ���ɹ�
      
    }

    public boolean vaildateEmailAddress(String _url)
    {
    	if(_url==null)
    	return false;
    	String rule = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
        Pattern pattern;
        Matcher matcher;
        pattern = Pattern.compile(rule);
        matcher = pattern.matcher(_url);
        if(matcher.matches())//�ж�url��ʽ�ϲ��Ϸ�
        {
        	return true;
        }
        else 
        	System.out.println("��ʽ����");
        	return false;
    }
    public static void main(String[]args)
    {
    	Endpoint.publish("http://127.0.0.1:9090/Service/webService", new webService());
        System.out.println("�����ɹ�!");
    	
    }
}
/*
wsimport -s  D:\JavaFiles\MyWebService\src -p Client -keep http://127.0.0.1:9090/Service/webService?wsdl
 D:\JavaFiles\MyWebService\src
*/