public class Email {

    private String domain;
    private String local_part;

    public Email(String local_part, String domain) {
        this.domain = domain;
        this.local_part = local_part;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getLocal_part() {
        return local_part;
    }

    public void setLocal_part(String local_part) {
        this.local_part = local_part;
    }

    public String getInEmailFormat() {
        return local_part + "@" + domain;
    }
}
