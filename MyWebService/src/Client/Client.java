package Client;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Client {
	public void init()
	{
		
	WebServiceService wss=new WebServiceService();
	WebService ws=wss.getWebServicePort();
	
        //UI
	    JPanel jp1=new JPanel();
        JFrame f=new JFrame("SendEmail");
       
        Label j1=new Label("收件人邮箱:");
        JTextField jtf1=new JTextField(15);
        jp1.add(j1);
        jp1.add(jtf1);
        
        JPanel jp2=new JPanel();
        Label j2=new Label("发送内容:");
        JTextField jtf2=new JTextField(30);
        jp2.add(j2);
        jp2.add(jtf2);
        
        JButton b=new JButton("send");
        f.setLayout(new FlowLayout());
        //群发分割
       /* String _url=jtf1.getText();
        String[]url=_url.split(",");
        List<String> tem = new ArrayList<String>(Arrays.asList(url));*/
        b.addActionListener(e -> {
        	//ws.sendEmail(_url, jtf2.getText());
           ws.sendEmailBatch(new ArrayList<String>(Arrays.asList(jtf1.getText().split(","))),jtf2.getText());
            JOptionPane.showMessageDialog(null, "finish");
        });
        f.add(jp1);
        f.add(jp2);
        f.add(b);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(500,400);
        f.setLocation(200,300);
	}
public  static void main(String []args)
{
	new Client().init();
	

}
}
