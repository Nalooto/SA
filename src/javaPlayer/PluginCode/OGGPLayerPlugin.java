package javaPlayer.PluginCode;

import java.io.File;

public class OGGPlayerPlugin implements IPlayerPlugin{
    private File file;
    public OGGPlayerPlugin(File file){
        this.file=file;
    }
    @Override
    public void typePrint(){
        System.out.println("3");
        new pluginGui(file.getName(),2);
    }
}
