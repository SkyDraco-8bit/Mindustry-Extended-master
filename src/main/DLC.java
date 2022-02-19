package main;

import arc.util.Log;
import main.content.DLCUnitTypes;
import mindustry.Vars;
import mindustry.ctype.ContentList;
import mindustry.mod.Mod;

public class DLC extends Mod {

    public static String fullName(String name){
        return "DLC-" + name;
    }

    private final static ContentList[] required = new ContentList[] {
            new DLCUnitTypes(),
    };

    @Override
    public void loadContent() {
        Log.info("Mindustry DLC loading");
        int loaded = 0;
        for (ContentList list : required){
            try {
                list.load();
                Log.infoTag("DLC", list.getClass().getSimpleName() + " loaded!");
                loaded++;
            }catch (Exception exception){
                Log.err(exception);
                Log.info("oops failed to load");
            }
        }
        Log.infoTag("DLC", String.format("Loaded %s ContentList from %s", loaded, required.length));
        Vars.enableConsole = true;
    }

}