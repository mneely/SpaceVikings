/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcus

 *
 */

import javax.ejb.*;


@Entity
public class TerritoryBean {
    
    @Id
    @JoinColumn(name="PLANET_TERRITORY", referenceColumnName="PLANET_NAME")
    String owner; //Possibly make this a unique int ID.


    int worth;
    int numberOfBuildings;
    int maxBuildings;




}
