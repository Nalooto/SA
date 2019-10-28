package Service;
//import java.nio.channels.ScatteringByteChannel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import Util.EmailUtil;
/** 
 *  @WebService － 它是一个注解，用在类上指定将此类发布成一个ws. 
    Endpoint – 此类为端点服务类，它的方法publish用于将一个已经添加了@WebService注解对象绑定到一个地址的端口上。 

 * 
 * 
 */  
@WebService //此注解用在类上指定将此类发布成一个WebService
public class webService {
    
	public int sendEmail(String _url, String _payload) { 	
		EmailUtil emailUtil=new EmailUtil();
    	return emailUtil.SendEmail(_url, _payload);	
    }
   public  int  sendEmailBatch(String[] _url, String _payload) {
    
	   EmailUtil emailUtil=new EmailUtil();
    	for(int i=0;i<_url.length;i++)
    	{
    		if(vaildateEmailAddress(_url[i]))//检测邮箱格式
    		{
    		int cur=emailUtil.SendEmail(_url[i], _payload);
    		if(cur==0) 	
    		return 0;
    		}
    		else
    		return 0;
    		
    	
    	}
    	return 1;//群发成功
      
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
        if(matcher.matches())//判断url格式合不合法
        {
        	return true;
        }
        else 
        	System.out.println("格式有误");
        	return false;
    }
    public static void main(String[]args)
    {
    	Endpoint.publish("http://127.0.0.1:9090/Service/webService", new webService());
        System.out.println("发布成功!");
    	
    }
}
/*
wsimport -s  D:\JavaFiles\MyWebService\src -p Client -keep http://127.0.0.1:9090/Service/webService?wsdl
 D:\JavaFiles\MyWebService\src
*/