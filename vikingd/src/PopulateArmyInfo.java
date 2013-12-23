
/**
 *
 * @author Marcus
 */
import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Stateless
public class PopulateArmyInfo implements PopulateArmyInterface,Serializable{

	@PersistenceContext(unitName = "SPACE_VIKINGS")
	EntityManager em ;

	public PopulateArmyInfo(){}

        /* UIDs for each unit
         * 
         * 1001 - Basic Soldier
         * 1002 - Machine Gunner
         * 1003 - Flame Thrower
         * 1004 - Rocket Launcer
         *
         * 2001 - Tank
         * 2002 - Hover Tank
         * 2003 - AA Tank
         * 2004 - Nuclear Tank
         *
         * 3001 - Jet Plane
         * 3002 - Bomber
         * 3003 - Hover Jet
         * 3004 - Nuvclear Jet
         * 3005 - Satellite
         * 3006 - Super Satellite
         *
         * 4001 - Mini Cargo
         * 4002 - Maxi Cargo
         * 4003 - Small military trans
         * 4004 - Large Military trans
         *
         */


	public void populate(){
		ArmyInfo current = new ArmyInfo(1001, "Basic Soldier", "Barracks",
                                                0, 100, 0 , 100, 50, 50, 50, 50,
                                                400, 100, 0, 0, 50 );
		em.persist(current);

		current = new ArmyInfo(1002 , "Machine Gunner", "Barracks", 200,
                                        0,0,200,100,100,100,100,800,250,0,25,125);
                em.persist(current);

		current = new ArmyInfo(1003,"Flame Thrower","Barracks",0,200,0,
                                        200 ,10, 150, 0,200, 750, 225,0,50,115 );
		em.persist(current);

		current = new ArmyInfo(1004, "Rocket Launcher", "Barracks", 350,
                                        0, 0 ,350, 200, 300, 250,300, 1750, 400,
                                        0 , 100, 200  );
		em.persist(current);

		current = new ArmyInfo(2001, "Tank", "Tank Factory", 300, 50,0,
                                       300, 200, 300,100, 300, 1550, 350, 50,
                                       25, 175);
		em.persist(current);

		current = new ArmyInfo(2002, "Hover Tank", "Tank Factory", 350,
                                        100, 250,350,250,350, 300,375, 2325,475,
                                        75,75, 235 );
		em.persist(current);

		current = new ArmyInfo(2003, "AA Tank", "Tank Factory", 375,
                                        125, 0, 400, 250, 400, 250, 400, 525,
                                        200, 2275, 450, 10, 50, 225);
		em.persist(current);

		current = new ArmyInfo(2004,"Nuclear Tank", "Tank Factory", 500,
                                        75, 0, 475, 350 , 450,450,450,2750,600,
                                        125,150,350 );
		em.persist(current);

		current = new ArmyInfo(3001, "Jet Plane", "Air Base", 200, 200,
                                        400, 0, 200, 200, 200, 100, 1500, 350,
                                        75, 150, 175);
		em.persist(current);

		current = new ArmyInfo(3002, "Bomber", "Air Base", 300, 150,
                                        500, 8, 300, 350, 100, 400, 2108, 450,
                                        100, 150, 225);
		em.persist(current);


		current = new ArmyInfo(3003, "Hover Jet", "Air Base", 400, 250,
                                        600, 100, 350, 400, 400, 300, 2800, 625,
                                        125, 150, 315);
		em.persist(current);

		current = new ArmyInfo(3004, "Nuclear Jet", "Air Base", 600, 300,
                                        1000, 50, 500, 550, 300, 450, 3750, 900,
                                        250, 250, 450);
		em.persist(current);

		current = new ArmyInfo(3005, "Satellite", "Air Base", 900, 500, 500, 100);
		em.persist(current);

                current = new ArmyInfo(3006, "Super Satellite", "Air Base", 2000, 800, 1500, 300);
		em.persist(current);

                current = new ArmyInfo(4001, "MiniCargo", "Transportation Hub", 500, 250, 200, 100);
		em.persist(current);

                current = new ArmyInfo(4002, "MaximoCargo", "Transportation Hub", 800, 300, 300, 200);
		em.persist(current);

                current = new ArmyInfo(4003, "Small Military", "Transportation Hub", 700, 200, 200, 150);
		em.persist(current);

                current = new ArmyInfo(4004, "Large Military", "Transportation Hub", 900, 250, 275, 225);
		em.persist(current);

		em.close();
	}

}

