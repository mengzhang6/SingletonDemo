package demo2;

/**
 * 懒汉模式，线程安全
 * 
 * @author mengzhang6
 *
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	/**
	 * <pre>
	 * 添加synchronized关键字,线程同步;保证了线程安全
	 * 但是它并不高效,因为在任何时候只能有一个线程调用 getInstance() 方法。
	 * 但是同步操作只需要在第一次调用时才被需要，即第一次创建单例实例对象时。
	 * </pre>
	 */
	public static synchronized Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}

}