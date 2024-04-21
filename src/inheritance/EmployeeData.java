package inheritance;

public class EmployeeData implements Comparable<EmployeeData>{
    private String firstName;
    private String lastName;
    private Integer emplID;
    private Integer deptNum;

    EmployeeData(String firstName, String lastName, Integer emplID, Integer deptNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emplID = emplID;
        this.deptNum = deptNum;
    }

    @Override
    public int compareTo(EmployeeData otherEmp1){
        String fullName;
        String otherFullName;
        int comparisonVal;

        // Compare based on department number first
        comparisonVal = deptNum.compareTo(otherEmp1.deptNum);

        // If in same organization, use name
        if (comparisonVal == 0) {
            fullName = lastName + firstName;
            otherFullName = otherEmp1.lastName + otherEmp1.firstName;
            comparisonVal = fullName.compareTo(otherFullName);
        }

        return comparisonVal;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName +
                "   \tID: " + emplID +
                "\t\tDept. #: " + deptNum;
    }

}
