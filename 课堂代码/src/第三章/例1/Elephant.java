package 第三章.例1;

public class Elephant {//现场有及各相关实体，就定义几个相关类，每个类都要有任务，都要干事（方法function）
	                     //导演，屏幕都不干事，不相关，所以就不定义类
	
	
	private double width,height;//方法中用到的，本类的，某个对象的属性数值,?，因为方法是处理数据的
	                             //象牙多长，腿多粗，什么基因，跟enter（）没有关系，所以不定义
	private String name;
	
	
	public Elephant(String name)
	{
		super();
		this.name = name;
								
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	





	public double getWidth() {
		return width;
	}
	public void setWidth(double width) { //方法的参数变量，用于往方法中传参，双击它，看下行谁变为深色。
		this.width = width;              //参数变量width是this.width = width;中=后面的width
		                                 //this.width = width；中=左边的width是成员变量的width
		                                 //双击this.width = 中的width，会看到上面两个width变成深色
		//要给某个类的成员变量赋值，就要用这个类的对象调用它的成员方法set。比如此处，aElephant.setwidth(1.5)
		//到哪儿去调用？到main（）方法中。i=1这种给基本数据类型变量赋值的方法。再给对象的成员变量赋值时不再适用。
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public IceBox getaIceBox() {
		return aIceBox;
	}
	public void setaIceBox(IceBox aIceBox) {
		this.aIceBox = aIceBox;
	}
	
	private IceBox aIceBox;     //对象的声明方法：类名对象名
    //与局部变量不同，在方法外面定义，可以穿透任何方法，进入任何方法。
    //局部变量是方法内部定义的，必须赋值，此次叫成员变量
    //成员变量可以不处置，有默认值。int：0， double：0.0
    //boolean： false
    //双击本句中width，第五句中的width变成深色的，说明二者是一个变量
    public void enter(){
    if((width<aIceBox.width)&&(height<aIceBox.height))//对象，成员变量，表示对象的属性值
                       //NullPointException是指对象没有new

    System.out.println(this.name+"笨重地进入");
    System.out.println(this.width);  //sysout+alt+/
    System.out.println(this.height);

    System.out.println(aIceBox); //此处不会输出“新飞冰箱”，而是要输出aIcBox对象的内存名称
                                 //变量名是aIcBox，变量的取值是“新飞冰箱”，对象的名是xinfeibingxiang
                                   //对象的值是第三章.例1.IceBox@15db9742
    System.out.println(aIceBox.height); 
    System.out.println(aIceBox.width); 
    System.out.println(aIceBox.getName()); 
    }
    // 变量：三种。成员变量。参数变量，局部变量。作用：成员变量是对象的属性。参数变量为方法传参。局部变量在方法中临时使用。
    //声明位置：成员变量在所有方法之外，参数变量在方法后面的括号中，局部变量在方法中。赋值：成员变量不必须赋值，有默认值。
    //参数变量在main（）方法中传入数值。局部变量在方法中必须赋值。



}