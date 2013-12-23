/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcus
 */
public class ArmyUnit {

    /*
     * put unit ID table here
     */

    int Unit; // unique id for unit consult above table
    String origin;
    int armor;
    int nonArmor;
    int air;
    int ground;
    int antiArmor;
    int antiNonArmor;
    int antiAir;
    int antiGround;
    int total;
    int milRes;
    int buildRes;
    int resRes;
    int worth;





    public void ArmyUnit(int id,
    String ori,
    int arm,
    int nonArm,
    int atAir,
    int atGround,
    int defAntiArmor,
    int defAntiNonArmor,
    int defAntiAir,
    int defAntiGround,
    int number,
    int milResource,
    int buildResource,
    int resResource,
    int unitWorth){

        Unit = id;
        origin = ori;
        armor = arm;
        nonArmor = nonArm;
        air = atAir;
        ground = atGround;
        antiArmor = defAntiArmor;
        antiNonArmor = defAntiNonArmor;
        antiAir = defAntiAir;
        antiGround = defAntiGround;
        total = number;
        milRes = milResource;
        buildRes = buildResource;
        resRes = resResource;




    }

}
