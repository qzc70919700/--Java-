package generic;

public class Test {//������
	public <T extends Animal> T getAnimal(T x) {//���ͷ������޶��Ͻ�
		return x;
	}
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("����Ҫɶ��");
		Cattle cattle = test.getAnimal(new Cattle());
		System.out.println(cattle);
		Horse horse = test.getAnimal(new Horse());
		System.out.println(horse);	
	}
}
class Animal{/*���࣬������*/}
class Horse extends Animal{
	@Override
	public String toString() {
		return "����С������---";
	}
}
class Cattle extends Animal{
	@Override
	public String toString() {
		return "����Сţ������---";
	}
}
class Sheep extends Animal{
	@Override
	public String toString() {
		return "����С������---";
	}
}

class Rabbit extends Animal{
	@Override
	public String toString() {
		return "����С�ã�����---";
	}
}
class Elephant extends Animal{
	@Override
	public String toString() {
		return "����С������---";
	}
}
class Deer extends Animal{
	@Override
	public String toString() {
		return "����С¹������---";
	}
}
class Bear extends Animal{
	@Override
	public String toString() {
		return "����С�ܣ�����---";
	}
}
class Panda extends Animal{
	@Override
	public String toString() {
		return "������è������---";
	}
}
class Tiger extends Animal{
	@Override
	public String toString() {
		return "����С��������---";
	}
}