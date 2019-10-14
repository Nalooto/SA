package javaPlayer.hostCode;

import com.amazonaws.services.dynamodbv2.xspec.S;
import javaPlayer.PluginCode.IPlayerPlugin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Constructor;


public class AAPFrame {
    private String filename;

    public void init()
    {
        JFrame frame=new JFrame("hello world");
        JTextField tf=new JTextField(15);
        JButton bt1=new JButton("choose file");

        FlowLayout l1=new FlowLayout();
        frame.setLayout(l1);
        //添加控件
        frame.add(tf);
        frame.add(bt1);

        frame.setSize(500,400);
        frame.setLocation(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileDialog d=new FileDialog ((Frame)null,"choose file",FileDialog.LOAD);
                d.setVisible(true);
                String file=d.getFile();
                System.out.println(file);

                if(file!=null) filename=file;

                try{
                 tf.setText(file);
                    Class c=null;

                    String name=file.substring(file.lastIndexOf(".")+1);//type of file
                    System.out.println(name);
                    if(name.equals("wav")) {
                         c = Class.forName("javaPlayer.PluginCode.WAVPlayerPlugin");
System.out.println("1");
                    }
                    else if(name.equals("mp3"))
                    {
                         c = Class.forName("javaPlayer.PluginCode.MP3PlayerPlugin");
                    }
                    else if(name.equals("voc"))
                    {
                         c = Class.forName("javaPlayer.PluginCode.OGGPlayerPlugin");
                    }

                    System.out.println("2");
                    Constructor constructor=c.getConstructor(File.class);

                    IPlayerPlugin ipp=(IPlayerPlugin)constructor.newInstance(new File(filename));
                    ipp.typePrint();
                    System.out.println("运行到这里");
                }catch (Exception x){
                    System.out.println(x);
                    System.out.println("运行到这里");
                }

            }
        });
    }

    public static void main(String[] args) {
        new AAPFrame().init();
    }



}

