package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobTest {

    Job job1;
    Job job2;

    @Before
    public void jobs() {
        job1 = new Job();
        job2 = new Job();
    }


    @Test
    public void testSettingJobId() {
        assertTrue(1, job1.getId());
        assertTrue(2, job2.getId());
    }

    private void assertTrue(int i, int id) {
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job1.getName());
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
    }

    private void assertTrue(boolean b) {
    }

    @Test
    public void testJobsForEquality() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1 == job2);
    }

    @Test
    public void tooString() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("" + job1 + "", job1.toString());
    }

    @Test
    public void labels() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\n" + "ID:" + job1.getId()
                + "\n" + "Name:" + job1.getName()
                + "\n" + "Employer:" + job1.getEmployer()
                + "\n" + "Locations:" + job1.getLocation()
                + "\n" + "Position Type:" + job1.getPositionType()
                + "\n" + "Core Competency:" + job1.getCoreCompetency() + "\n", job1.toString());

    }

    @Test
    public void emptyField() {
        job1 = new Job("", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\n" + "ID:" + job1.getId()
                + "\n" + "Name:" + "Data not available"
                + "\n" + "Employer:" + job1.getEmployer()
                + "\n" + "Locations:" + job1.getLocation()
                + "\n" + "Position Type:" + job1.getPositionType()
                + "\n" + "Core Competency:" + job1.getCoreCompetency() + "\n", job1.toString());

    }
}