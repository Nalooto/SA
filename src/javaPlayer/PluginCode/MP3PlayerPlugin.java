package javaPlayer.PluginCode;

import java.io.File;

public class MP3PlayerPlugin implements IPlayerPlugin{
    private File file;
    public MP3PlayerPlugin(File file){
        this.file=file;
    }
    @Override
    public void typePrint(){new pluginGui(file.getName(),0);}
}
