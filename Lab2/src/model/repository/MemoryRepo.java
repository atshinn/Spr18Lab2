package model.repository;

import java.util.List;

import controller.querys.criteria.QueryCriteria;

public class MemoryRepo implements Repository<Queryable> {
	
	@Override
	public void add(Queryable arg) {
		if(arg.getType() == Queryable.TYPE_STORY) {
			
		}
		
	}

	@Override
	public void remove(Queryable arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Queryable arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Queryable> query(QueryCriteria qc) {
		// TODO Auto-generated method stub
		return null;
	}

}
