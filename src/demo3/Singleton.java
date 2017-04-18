package demo3;

/**
 * 双重检验锁（懒汉模式，线程安全）
 * 
 * @author mengzhang6
 *
 */
public class Singleton {
	/**
	 * 使用volatile，禁止指令重排序优化
	 */
	private volatile static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		// 第一次检验
		if (instance == null) {
			synchronized (Singleton.class) {
				// 第二次检验
				if (instance == null)
					instance = new Singleton();
			}
		}
		return instance;
	}

}
