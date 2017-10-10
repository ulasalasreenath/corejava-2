package com.speakingcs.corejava.threads;

public class ThreadLocalDemo extends Thread{
	
	public static void main(String[] args)
	{
		Thread threadOne = new ThreadLocalDemo();
		threadOne.start();
		
		Thread threadTwo = new ThreadLocalDemo();
		threadTwo.start();
		
	}
	
	@Override
	public void run()
	{
		Context context = new Context();
		context.setTransactionId(getName());
		MyThreadLocal.set(context);
		new BusinessService().businessMethod();
		MyThreadLocal.unset();
		
		
	}

}
