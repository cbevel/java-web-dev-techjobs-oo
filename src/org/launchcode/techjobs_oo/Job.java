package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

  public Job() {
      id = nextId;
      nextId++;
  }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public String toString() {
        return "\n"+ "ID:" + this.getId()
                + "\n" + "Name:" + this.getName()
                + "\n" + "Employer:" + this.getEmployer()
                + "\n" + "Locations:"  + this.getLocation()
                + "\n" + "Position Type:" + this.getPositionType()
                + "\n" + "Core Competency:" + this.getCoreCompetency() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return name.equals(job.name) &&
                employer.equals(job.employer) &&
                location.equals(job.location) &&
                positionType.equals(job.positionType) &&
                coreCompetency.equals(job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


        public String getName() {
            if (name.equals("")) {
                return "Data not available";
            } else {
                return name;
            }
        }

        public void setName(String name) {
            this.name = name;
        }

        public Employer getEmployer() {
            if (employer.getValue().equals("")) {
                return new Employer("Data not available");
            } else {
                return employer;
            }
        }

        public void setEmployer(Employer employer) {
            this.employer = employer;
        }

        public Location getLocation() {
            if (location.getValue().equals("")) {
                return new Location("Data not available");

            } else {
                return location;
            }
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public PositionType getPositionType() {
            if (positionType.getValue().equals("")) {
                return new PositionType("Data not available");
            } else {
                return positionType;
            }
        }

        public void setPositionType(PositionType positionType) {
            this.positionType = positionType;
        }

        public CoreCompetency getCoreCompetency() {
            if (coreCompetency.getValue().equals("")) {
                return new CoreCompetency("Data not available");
            } else {
                return coreCompetency;
            }
        }

        public void setCoreCompetency(CoreCompetency coreCompetency) {
            this.coreCompetency = coreCompetency;
        }

        public int getId() {
            return id;
        }
}
