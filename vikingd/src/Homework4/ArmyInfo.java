/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcus
 */
import javax.persistence.*;
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

    @Column(name="UNIT_NAME", nullable = true)
    String name;

    @Column(name="UNIT_ORIGIN", nullable = true)
    String origin;  // location where units come from


    // attacking variables
    @Column(name="ARMOR",nullable=true)
    int armor;
    @Column(name="NON_ARMOR", nullable = true)
    int nonArmor;
    @Column(name="AIR", nullable = true)
    int air;
    @Column(name="GROUND", nullable = true)
    int ground;

    // defense variables
    @Column(name="ANTI_AIR", nullable = true)
    int antiArmor;
    @Column(name="ANTI_NONARMOR", nullable = true)
    int antiNonArmor;
    @Column(name="ANTI_AIR", nullable = true)
    int antiAir;
    @Column(name="ANTI_GROUND", nullable = true)
    int antiGround;

    @Column(name="TOTAL", nullable = true)
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


    public void ArmyInfo(int a, String b, String c, int d, int e, int f, int g, int h, int i,
                            int j, int k, int l, int m, int n, int o, int p){

    unitID = a;  // unique unit ID
    name = b;
    origin = c;  // location where units come from
     armor = d;
     nonArmor = e;
     air = f;
     ground = g;
    antiArmor = h;
     antiNonArmor = i;
     antiAir= j;
     antiGround= k;
     total = l;// the total of something??
    // building resources
     milResource = m ;
     buildResource = n;
     resResource = o;
     worth = p; // the worth of the unit, calculated into users net worth.
    }

    public void ArmyInfo(int a, String b, String c, int d, int e, int f, int g){
         unitID = a;  // unique unit ID
         name = b;
         origin = c;  // location where units come from
          // building resources
     milResource =  d;
     buildResource = e;
     resResource = f;
     worth = g; // the worth of the unit, calculated into users net worth.

    }

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
