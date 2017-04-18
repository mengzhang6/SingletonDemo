package demo1;

/**
 * <pre>
 * 懒汉模式，线程不安全
 * 当有多个线程并行调用 getInstance() 的时候，就会创建多个实例
 * 也就是说在多线程下不能正常工作
 * </pre>
 * 
 * @author mengzhang6
 *
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}

}
