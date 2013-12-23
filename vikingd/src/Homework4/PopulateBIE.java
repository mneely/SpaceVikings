import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Stateless
public class PopulateBIE implements PopulateBIEInterface,Serializable{

	@PersistenceContext(unitName = "SPACE_VIKINGS")
	EntityManager em ;

	public PopulateBIE(){}

	public void populate(){
		BuildingInfoEntity current = new BuildingInfoEntity("Barracks",BuildingInfoEntity.BuildingType.MILITARY,800,0,3000,1500,2,.03);
		em.persist(current);
		
		current = new BuildingInfoEntity("Tank Factory",BuildingInfoEntity.BuildingType.MILITARY,2000,100,5500,2750,3,.03);
		em.persist(current);

		current = new BuildingInfoEntity("Air Base",BuildingInfoEntity.BuildingType.MILITARY,4000,200,9000,4500,4,.03);
		em.persist(current);
		
		current = new BuildingInfoEntity("Satellite Tower",BuildingInfoEntity.BuildingType.MILITARY,1500,2000,12000,9000,3,.1);
		em.persist(current);
	
		current = new BuildingInfoEntity("Anti-Air Defense",BuildingInfoEntity.BuildingType.MILITARY,1000,50,1000,300,1,.03);
		em.persist(current);
	
		current = new BuildingInfoEntity("Anti-Ground Defense",BuildingInfoEntity.BuildingType.MILITARY,1000,50,1000,300,1,.03);
		em.persist(current);
	
		current = new BuildingInfoEntity("Military Resource",BuildingInfoEntity.BuildingType.RESOURCE,0,0,4000,2000,1,.03);
		em.persist(current);

		current = new BuildingInfoEntity("Research Resource",BuildingInfoEntity.BuildingType.RESOURCE,0,0,6000,3000,1,.03);
		em.persist(current);

		current = new BuildingInfoEntity("Building Resource",BuildingInfoEntity.BuildingType.RESOURCE,0,0,2000,1000,1,.03);
		em.persist(current);

		current = new BuildingInfoEntity("Transportation",BuildingInfoEntity.BuildingType.TRANSPORTATION,5000,2000,6000,3500,3,.04);
		em.persist(current);


		current = new BuildingInfoEntity("Military Research",BuildingInfoEntity.BuildingType.RESEARCH,6000,3000,4000,2000,3,.05);
		em.persist(current);
	
		current = new BuildingInfoEntity("Resource Research",BuildingInfoEntity.BuildingType.RESEARCH,0,8000,4000,2000,3,.05);
		em.persist(current);

		current = new BuildingInfoEntity("Transportation Research",BuildingInfoEntity.BuildingType.RESEARCH,3000,6000,4000,2000,3,.05);
		em.persist(current);

		em.close();
	}

}
