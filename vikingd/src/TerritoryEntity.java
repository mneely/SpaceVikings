/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcus

 *
 */

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class TerritoryEntity implements Serializable{
    
    @Id
    @JoinColumn(name="PLANET_TERRITORY", referenceColumnName="PLANET_NAME")
    long UID; //Possibly make this a unique int ID.
    @Column(name= "PLANET_NAME")
    String planetName;
    @Column(name="WORTH")
    int worth;
    @Column(name="NUMBER_OF_BUILDINGS")
    int numberOfBuildings;
    @Column(name="MAX_BUILDINGS")
    int maxBuildings;

    public void  setUID(long x){
        UID = x;
    }
    
    public long getUID(){
        return UID;
    }
    
    public void setPlanet(String x){
        planetName=x;
    }
    
    public String getPlanet(){
        return planetName;
    }
    
    public void setWorth(int x){
        worth = x;
    }
    
    public int getWorth(){
        return worth;
    }
    
    public void setBuild(int x){
        numberOfBuildings = x;
    }
    
    public int getBuild(){
        return numberOfBuildings;
    }
   

}
