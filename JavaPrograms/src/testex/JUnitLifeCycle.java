package testex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitLifeCycle {
	@BeforeClass
	public static void beforeAll() {
		System.out.println("connect to databsae");
	}
	@Before
	public void beforeEach() {
		System.out.println("Load the schema");
	}
	@After
	public void afterEach() {
		System.out.println("Drop the schema");
	}
	@AfterClass
	public static void afterAll() {
		System.out.println("Disconnect from the database");
	}
	@Test(timeout=10000)
	public void TestOne() {
		System.out.println("Test One");
	}
	@Test(timeout=1000)
	public void TestTwo() {
		System.out.println("Test Two");
	}
}
