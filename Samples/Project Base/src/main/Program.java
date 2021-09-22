package main;

import CartesObj.ClassFactory;
import CartesObj.ICartesObj;
import MiTools.*;

import java.lang.reflect.InvocationTargetException;

import Baseapi.*;

public class Program extends MyCartesAPIBase
{

	public Program(MyCartesProcess owner) throws SecurityException, IllegalArgumentException, NoSuchMethodException,
			IllegalAccessException, InvocationTargetException, NoSuchFieldException, InterruptedException, Exception {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICartesObj robot = ClassFactory.createCartesObj();
	}

	@Override
	public void Close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void MergeLibrariesAndLoadVariables() throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
	}

}
