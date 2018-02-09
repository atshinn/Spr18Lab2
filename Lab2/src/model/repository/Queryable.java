package model.repository;

public interface Queryable {
	public static final int TYPE_STORY = 0,TYPE_GUEST=1,TYPE_SUB=2,TYPE_REP=3;
	
	public int getType();

	public boolean hasMember(String memName);
	
	public Object getMember(String memName);
	
	public boolean isMemberEqualTo(String memName,Queryable comparTo);
	
	public String toString();
}
