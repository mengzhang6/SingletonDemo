package demo4;

/**
 * 饿汉模式，线程安全
 * 
 * @author mengzhang6
 *
 */
public class Singleton {
	// 类加载时就初始化
	private static final Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}
