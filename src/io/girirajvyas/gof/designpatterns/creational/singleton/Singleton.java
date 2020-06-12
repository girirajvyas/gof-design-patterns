package io.girirajvyas.gof.designpatterns.creational.singleton;

/**
 * 
 * 1. Declare static instance variable: static variable as you cannot access a
 * non-static member in a static way from getInstance method <br/>
 * 2. private constructor: to prevent initialization. Also, throw exception from
 * constructor if instance is not null to avoid instantiation via
 * reflection<br/>
 * 3. static getInstance method, name can be anything
 * 
 * @author Giriraj_Vyas
 *
 */
public class Singleton {

	/**
	 * 1. Eager Initialization Example
	 */
	// private static final Singleton INSTANCE = new Singleton();

	/**
	 * 2. for Lazy initialization, initialized as null<br>
	 * -> volatile makes sure any changes you do inside this instance are
	 * immediately visible to other threads
	 */
	private static volatile Singleton INSTANCE = null;

	/**
	 * Making constructor private prevents from initialization
	 */
	private Singleton() {
		// In case Reflection is used for initialization
		if (INSTANCE != null) {
			throw new RuntimeException("Please instantiate via getInstance() method");
		}
	}

	/**
	 * This is basic implementation of eagerly initialized singleton. <br>
	 * Drawback of this approach is: <br>
	 * 1. Even if we don't need object of this class it will always be initiated<br>
	 * 2. Slow startup of applications
	 * 
	 * @return
	 */
	public static Singleton getInstanceEagerly() {
		return INSTANCE;
	}

	/**
	 * This is basic version of Lazy initialized Singleton.<br>
	 * Here, We make method as synchronized which blocks the access of multiple
	 * threads at once. <br>
	 * <b>Not a recommended approach due to poor performance</b>
	 * 
	 * @return
	 */
	public static synchronized Singleton getInstanceLazily() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}

	/**
	 * This is advance version of Lazy initialized Singleton. Here, instance is
	 * initialized in the synchronized block inside method.
	 * 
	 * @return
	 */
	public static Singleton getInstanceLazily2() {
		// Check synchronization only if the instance is null. There will be a
		// little impact in performance only for the first time.
		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				// double check if instance is still null, It can be the case that till the time
				// thread2 reaches here, thread1 has already initialized the instance
				if (INSTANCE == null) {
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}

	/**
	 * we have to override this method to get the same object after serializing and
	 * de-serializing the same object
	 * 
	 * @return
	 */
  	protected Singleton readResolve() {
  		return INSTANCE;
  	}

	/**
	 * Bill pugh implementation
	 * 
	 * @return
	 */
	public static SingletonDemo getInstance3() {
		return InnerStaticClass.INSTANCE;
	}

	private static class InnerStaticClass {
		public static final SingletonDemo INSTANCE = new SingletonDemo();
	}

}
