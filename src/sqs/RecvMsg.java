package sqs;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RecvMsg {

    public static String RecvMsg(AmazonSQS sqs,String url)
    {
        List<Message>messages=sqs.receiveMessage(url).getMessages();
        for(Message mes:messages)
        {

            sqs.deleteMessage(url, mes.getReceiptHandle());

            System.out.println("recv: "+mes.getBody());

            return mes.getBody();

        }
        return "no information";
    }

    public static void main(String[] args) {
        AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();

        //String PubMsg="test msg";
        String queueName="test1";
        String queueUrl=sqs.getQueueUrl(queueName).getQueueUrl();

        //RecvMsg.RecvMsg(sqs,queueUrl);

        Frame f=new Frame("RecvMsg");
        Button b=new Button("recv");
        JTextField jtf=new JTextField(15);
        f.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 40));
        b.addActionListener(e-> {
           // SendMsg(sqs,queueUrl,jtf.getText());
            jtf.setText(RecvMsg(sqs,queueUrl));
            JOptionPane.showMessageDialog(null, "recv success");
        });
        f.add(b);
        f.add(jtf);
        f.setVisible(true);
        f.setSize(400,300);

    }
}
