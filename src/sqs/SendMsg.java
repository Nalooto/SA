package sqs;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.SendMessageRequest;

import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class SendMsg {
    public static int SendMsg(AmazonSQS sqs,String url,String Msg)
    {
        SendMessageRequest send_msg_request=new SendMessageRequest()
                .withQueueUrl(url)
                .withMessageBody(Msg)
                .withDelaySeconds(1);

        sqs.sendMessage(send_msg_request);
        System.out.println("up success");
        return 0;
    }

    public static void main(String[] args) {
        AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
        String queueName="test1";
        String queueUrl=sqs.getQueueUrl(queueName).getQueueUrl();
        //UI
        Frame f=new Frame("SendMsg");
        Button b=new Button("send");
        JTextField jtf=new JTextField(15);
        f.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 40));
        b.addActionListener(e -> {
            SendMsg(sqs,queueUrl,jtf.getText());
            JOptionPane.showMessageDialog(null, "send success");
        });
        f.add(b);
        f.add(jtf);
        f.setVisible(true);
        f.setSize(400,300);


        //Scanner sc=new Scanner(System.in);
        //String PubMsg=sc.nextLine();



       // SendMsg.SendMsg(sqs,queueUrl,PubMsg);
    }
}
