package main.content;


import main.gen.WormEntity;
import main.type.DLCUnitType;
import mindustry.content.Fx;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.MissileBulletType;
import mindustry.gen.Sounds;
import mindustry.type.Weapon;


public class DLCUnitTypes implements ContentList {

    public static DLCUnitType testworm;

    @Override
    public void load() {
        testworm = new DLCUnitType("testworm") {{

            health = 320;
            speed = 2.2f;
            rotateSpeed = 2f;
            constructor = WormEntity::new;
            flying = false;
    //        wormLength = 60;
    //        ringCount = 10;
            weapons.add(
                    new Weapon("TestWeapon") {{
                        rotate = false;
                        x = 0;
                        y = 5;
                        inaccuracy = 0;
                        reload = 10;

                        bullet = new MissileBulletType() {{
                            buildingDamageMultiplier = 0.25f;
                            lifetime = 1000;
                            speed = 1;
                            damage = 222;
                            width = 10;
                            height = 10;
                            hitSound = Sounds.shootBig;
                            despawnEffect = Fx.explosion;
                            hitEffect = Fx.explosion;
                            shootEffect = Fx.lightningShoot;
                            smokeEffect = Fx.shockwave;
                            homingPower = 0.1f;
                        }};
                    }}
            );

        }};
    };
}