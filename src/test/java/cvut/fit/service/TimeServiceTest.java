package cvut.fit.service;

import cvut.fit.logic.service.TimeService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimeServiceTest extends TestCase {

	@Autowired
	private TimeService timeService;

	@Test
	public void contextLoads() {

		assertEquals(true, timeService.testMethod());

	}

}
