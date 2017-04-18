package demo5;

/**
 * <pre>
 * 静态内部类 static nested class 
 * 这种方法是《Effective Java》上所推荐的
 * </pre>
 * 
 * @author mengzhang6
 *
 */
public class Singleton {
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	private Singleton() {
	}

	public static final Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
/**
 * 这种写法仍然使用JVM本身机制保证了线程安全问题；由于 SingletonHolder 是私有的，除了 getInstance()
 * 之外没有办法访问它，因此它是懒汉式的；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本
 */

