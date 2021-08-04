
package fr.eql.ai109.tontapat.ibusiness;

import java.util.List;

import fr.eql.ai109.tontapat.entity.Terrain;

public interface TerrainIBusiness {
	List<Terrain> findAll();
	Terrain add();
	Terrain getById(int id);
	Terrain update(Terrain terrain);
	Terrain remove(Terrain terrain);
}
