package javaPlayer.PluginCode;


import java.io.File;

public class WAVPlayerPlugin implements IPlayerPlugin{
    private File file;
    public  WAVPlayerPlugin(File file){
        this.file=file;
    }
    @Override
    public void typePrint() {
        new pluginGui(file.getName (),1);
    }
}
