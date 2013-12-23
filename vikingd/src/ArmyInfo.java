/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcus
 */
import javax.persistence;
import java.io.Serializable;

@Entity
@Table(name="ARMY_INFO")
public class ArmyInfo implents Serializable{

    /*
     * To make database retrieval more efficient I've decided to give
     * each unit it's own unique ID which will be an Int.
     * The Following is the table of units with the corresponding ID
     *
     *
     *
     */

    @Id
    @Column(name="UNIT_ID", nullable=false )
    int unitID;  // unique unit ID

    @Column(name="UNIT_ORIGIN", nullable = false)
    String origin;  // location where units come from


    // attacking variables
    @Column(name="ARMOR",nullable=false)
    int armor;
    @Column(name="NON_ARMOR", nullable = false)
    int nonArmor;
    @Column(name="AIR", nullable = false)
    int air;
    @Column(name="GROUND", nullable = false)
    int ground;

    // defense variables
    @Column(name="ANTI_AIR", nullable = false)
    int antiArmor;
    @Column(name="ANTI_NONARMOR", nullable = false)
    int antiNonArmor;
    @Column(name="ANTI_AIR", nullable = false)
    int antiAir;
    @Column(name="ANTI_GROUND", nullable = false)
    int antiGround;

    @Column(name="TOTAL", nullable = false)
    int total;// the total of something??

    // building resources
    @Column(name="MIL_RESOURCE", nullable = false)
    int milResource;
    @Column(name="BUILD_RESOURCES", nullable = false)
    int buildResource;
    @Column(name="RES_RESOURCE", nullable = false)
    int resResource;

    @Column(name="WORTH", nullable = false)
    int worth; // the worth of the unit, calculated into users net worth.

   
    //sets the id of the unit
    public void setUID(int idNum){
        unitID = idNum;
    }

    //getters for attacking stats
    public int getAr(){
        return armor;
    }
    public int getNAr(){
        return nonArmor;
    }
    public int getAir(){
        return air;
    }
    public int getGround(){
        return ground;
    }

    //getters for defense stats
    public int getAntiArmor(){
        return antiArmor;
    }
    public int getAntiNonArmorr(){
        return antiNonArmor;
    }
    public int getAntiAir(){
        return antiAir;
    }
    public int getAntiGround(){
        return antiGround;
    }

    //attack Setters

    public void getAr(int ar){
        armor = ar;
    }
    public void getNA(int x){
        nonArmor = x;
    }
    public void getAir(int x){
        air = x;
    }
    public void getGround(int x){
       ground = x;
    }

    //getters for defense stats
    public void getAntiArmor( int x){
        antiArmor = x;
    }
    public void getAntiNonArmorr(int x){
        antiNonArmor = x;
    }
    public void getAntiAir(int x){
        antiAir =x;
    }
    public void getAntiGround(int x){
        antiGround = x;
    }

}
