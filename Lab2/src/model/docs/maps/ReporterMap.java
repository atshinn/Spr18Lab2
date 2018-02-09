package model.docs.maps;

import java.util.concurrent.ConcurrentHashMap;

import model.repository.Queryable;

public class ReporterMap extends ConcurrentHashMap<String, Queryable> {
	private static class MapCase{
		public static final ReporterMap MAP = new ReporterMap();
	}
	
	private ReporterMap() {
		
	}
	
	public static ReporterMap get() {
		return MapCase.MAP;
	}
}
