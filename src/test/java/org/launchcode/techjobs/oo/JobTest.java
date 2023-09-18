package org.launchcode.techjobs.oo;

import mockit.Mocked;
import mockit.Tested;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

import static org.junit.Assert.*;

public class JobTest {
    @Mocked Job job;
    @Test
    public void testSettingJobId(){
Job job = new Job();
Job anotherJob = new Job();
assertNotEquals(job.getId(), anotherJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
Job job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
   assertTrue(job.getName() instanceof String);
    assertTrue(job.getEmployer() instanceof Employer);
    assertTrue(job.getLocation() instanceof Location);
    assertTrue(job.getPositionType() instanceof PositionType);
    assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

    assertEquals("Product Tester", job.getName());
    assertEquals("ACME", job.getEmployer().toString());
    assertEquals("Desert", job.getLocation().toString());
    assertEquals("Quality Control", job.getPositionType().toString());
    assertEquals("Persistence", job.getCoreCompetency().toString());
    }


    @Test
    public void testJobsForEquality(){
        Job job = new Job();
        Job anotherJob = new Job();

        assertFalse(job.equals(anotherJob));
    }
}


