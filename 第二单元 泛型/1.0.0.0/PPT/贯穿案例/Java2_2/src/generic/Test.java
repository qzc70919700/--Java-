package generic;

public class Test {//测试类
	public <T extends Animal> T getAnimal(T x) {//泛型方法，限定上界
		return x;
	}
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("你想要啥？");
		Cattle cattle = test.getAnimal(new Cattle());
		System.out.println(cattle);
		Horse horse = test.getAnimal(new Horse());
		System.out.println(horse);	
	}
}
class Animal{/*父类，动物类*/}
class Horse extends Animal{
	@Override
	public String toString() {
		return "我是小马，主人---";
	}
}
class Cattle extends Animal{
	@Override
	public String toString() {
		return "我是小牛，主人---";
	}
}
class Sheep extends Animal{
	@Override
	public String toString() {
		return "我是小羊，主人---";
	}
}

class Rabbit extends Animal{
	@Override
	public String toString() {
		return "我是小兔，主人---";
	}
}
class Elephant extends Animal{
	@Override
	public String toString() {
		return "我是小象，主人---";
	}
}
class Deer extends Animal{
	@Override
	public String toString() {
		return "我是小鹿，主人---";
	}
}
class Bear extends Animal{
	@Override
	public String toString() {
		return "我是小熊，主人---";
	}
}
class Panda extends Animal{
	@Override
	public String toString() {
		return "我是熊猫，主人---";
	}
}
class Tiger extends Animal{
	@Override
	public String toString() {
		return "我是小虎，主人---";
	}
}