package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Avengers2 {
	String name;
	String heroName;
	String weapon;

	public Avengers2(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers2 [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}
	
	@Override
	public int hashCode() {
		
		//각 멤버변수의 hashCode()값을 얻어온다 반환타입은 int형이다.
		int nameHCode = this.name.hashCode();
		int heroHCode = this.heroName.hashCode();
		int weaponHCode = this.weapon.hashCode();
		System.out.println("hashCode()호출됨" + nameHCode);
		
		//멤버변수가 2개 이상이라면 고유한 주소값을 더해서 반환하면 된다.
		return nameHCode + heroHCode + weaponHCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals() 호출됨");
		
		//매개변수로 전달된 객체를 Avengers타입으로 다운캐스팅한다.
		Avengers2 avengers = (Avengers2)obj;
		
		//각각의 멤버변수가 가진 값에 대한 비교를 진행한다.
		if(this.name.equals(avengers.name)
				&& this.heroName.equals(avengers.heroName)
				&& this.weapon.equals(weapon)) {
			return true; // 값이 동일할 때 true 반환
		}
		else {
			return false;
		}
		
	}
}

public class QuHashSettea {

	public static void main(String[] args) {

		HashSet<Avengers2> set = new HashSet<Avengers2>();

		Avengers2 hero1 = new Avengers2("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers2 hero2 = new Avengers2("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers2 hero3 = new Avengers2("브루스배너", "헐크", "강한피부&점프");
		Avengers2 hero4 = new Avengers2("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers2 av : set)
		{
			System.out.println(av.toString());			
		}
		
		//이름으로 검색하기 - Iterator 활용
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 : ");
		String serachName = scanner.nextLine();
		
		boolean isFind = false; // 검색한 정보가 있는지 확인을 위한 변수
		Iterator<Avengers2> itr = set.iterator();
		while(itr.hasNext()) {
			
			Avengers2 avn = itr.next();
			
			//검색할 이름과 이터레이터를 통해 반환되는 객체의 이름을 비교
			if(serachName.equals(avn.name)) {
				System.out.println(avn);
				isFind = true; // 정보를 찾았다면 변경
			}
			
			
		}
		
		if(isFind==false) System.out.println("해당 영웅은 없어요 ㅜㅜ");
			
	}
}
