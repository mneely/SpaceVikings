/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcus
 */

import stdin.io.*;
import javax.ejb.*;


@Entity
public class Planet {

    @Id
    static String planetName;

    @Column(name="UID", nullable = false)
    static int uid; 

    public static void setName(String name){
        planetName = name;
    }

    public static String getName(){
        return planetName;
    }
    
    public static void setUID(int id){
        uid = id;
    }


    public static int getUid(){

        return uid[24]; //dummy value retrieved
    }

}

@Stateless
public class PlanetManager{

    private EntityManager EM;

    public PlanetManager(){}

    public Planet addUser(String planetName, int UID){
        Planet planet = new Planet();

        planet.setName(planetName);
        planet.setUID(UID);

        return planet;
    }

    public Planet updatePlanet(Planet planet){
        entityManager.merge(planet);
        return planet;
    }
}
