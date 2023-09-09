package collectionex;

import java.util.*;

class Insect{
	private String insectName;
	private int insectWeight;
	
	public Insect(String insectName, int insectWeight) {
		super();
		this.insectName=insectName;
		this.insectWeight=insectWeight;
	}

	public String getInsectName() {
		return insectName;
	}

	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}

	public int getInsectWeight() {
		return insectWeight;
	}

	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}

	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}		
} 
class Insecticides{
	public List<String> mapInsectsName(List<Insect> list){
		List<String> s=new ArrayList<String>();
		for(Insect i:list) {
			s.add(i.getInsectName());
		}
		return s;
	}	
	public List<Insect> getWeight(List<Insect>list){
		List<Insect> s1=new ArrayList<Insect>();
		for(Insect i:list) {
			int weight=i.getInsectWeight();
			if(weight>40 && weight<=100) {
				s1.add(i);
			}
		}
		return s1;
	}
}
public class InsectMain{
	public static void main(String[] args) {
		
		List<Insect> l=new ArrayList<Insect>();
		l.add(new Insect("Ant",45));
		l.add(new Insect("Cockroach",65));
		l.add(new Insect("bee",99));
		l.add(new Insect("paper wasp",11));
		Insecticides i=new Insecticides();
		System.out.println(i.mapInsectsName(l));
		
		System.out.println(i.getWeight(l));
	}

}
