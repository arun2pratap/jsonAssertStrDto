package dto;

public class Employee {
    private final String name;// = "AAAAAA";
    private final Integer exp;// = 2;
    private final String[] qualification ;//= {"MA","BA", "MBBS"};

    public Employee(String name, Integer exp, String[] qualification) {
        this.name = name;
        this.exp = exp;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public Integer getExp() {
        return exp;
    }

    public String[] getQualification() {
        return qualification;
    }
}
