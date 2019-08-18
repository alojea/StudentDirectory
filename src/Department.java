public enum Department {
    CHEMESTRY("chem","Chemestry"),
    GEOSCIENCES("geo","Geosciences"),
    INFORMATICS("inf","Informatics"),
    LINGUISTICS("ling","Linguistics"),
    MATH("math","Mathematics"),
    PHYS("phys","Physics");

    private final String domain;
    private final String departmentName;

    Department(String domain,String departmentName){
        this.domain = domain;
        this.departmentName = departmentName;
    }

    public String getDomain(){
        return domain;
    }

    public String getDepartmentName(){
        return departmentName;
    }
}
