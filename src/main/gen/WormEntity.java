package main.gen;

import arc.math.geom.Vec2;
import arc.struct.Bits;
import arc.struct.Seq;
import mindustry.ai.formations.FormationMember;
import mindustry.entities.units.BuildPlan;
import mindustry.entities.units.StatusEntry;
import mindustry.entities.units.UnitController;
import mindustry.gen.Unit;
import mindustry.gen.UnitEntity;


public class WormEntity extends UnitEntity {
    public static final float warpDst = 30.0F;
    public static final Vec2 tmp1 = new Vec2();
    public static final Vec2 tmp2 = new Vec2();
    public static final Vec2[] vecs = new Vec2[]{new Vec2(), new Vec2(), new Vec2(), new Vec2()};
    public static final Seq<FormationMember> members = new Seq();
    public static final Seq<Unit> units = new Seq();
    public static final float hitDuration = 9.0F;
    public transient boolean wasFlying;
    private transient float x_TARGET_;
    private transient float x_LAST_;
    private transient float y_TARGET_;
    private transient float y_LAST_;
    protected transient boolean isRotate;
    private transient float rotation_TARGET_;
    private transient float rotation_LAST_;
    public Seq<StatusEntry> statuses = new Seq();
    public transient Bits applied;
    public transient BuildPlan lastActive;
    public transient int lastSize;
    public transient float buildAlpha;
    public transient float moveSpace;
    public transient float baseRotation;
    public UnitController controller;
    public transient float resupplyTime;
    public transient boolean wasPlayer;
    public transient boolean wasHealed;
    public transient boolean added;


    public WormEntity(){
        super();
    }







}