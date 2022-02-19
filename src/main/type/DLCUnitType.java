package main.type;

import arc.Core;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.TextureRegion;
import mindustry.gen.EntityMapping;
import mindustry.gen.Unit;
import mindustry.type.UnitType;

import static main.content.DLCUnitTypes.testworm;


public class DLCUnitType extends UnitType {

    public int wormLength;
    public int ringCount;
    public float ringSpacement = wormLength / ringCount;

    public TextureRegion ringRegion;


    public DLCUnitType(String name) {
        super(name);

        constructor = EntityMapping.map(this.name);

    }

    @Override
    public void load() {
        super.load();

        ringRegion = Core.atlas.find(name + "-ring");
    }

    @Override
    public void draw(Unit unit) {
        super.draw(unit); // Calling the vanilla drawing for other units

        if(unit.type == testworm) { //
            // Drawing Worm
            drawRings(unit);
        }

    }

    public void drawRings(Unit unit){

        applyColor(unit);
        for (int i = wormLength; i < wormLength; i++) {

            Draw.rect(ringRegion, unit.x, unit.y - ringSpacement*i, unit.rotation - 90);

            Draw.reset();
        }
    }
}