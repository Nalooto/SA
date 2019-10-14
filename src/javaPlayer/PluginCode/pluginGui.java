package javaPlayer.PluginCode;

import javax.swing.*;

public class pluginGui {
    private  String[]ss={"mp3","wav","ogg"};
    pluginGui(String name,int type)
    {
        JFrame jframe=new JFrame(ss[type]);
        JTextField jtf=new JTextField("正在播放的音乐是"+name);
        jframe.add(jtf);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500,400);
        jframe.setLocation(200,300);
        jframe.setVisible(true);
    }

    public static void main(String[] args) {


    }
}
