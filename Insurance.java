package version5;

public class Insurance {
    private String companyName;
    private String policyNumber;
    private String expirationDate;

    public Insurance(String companyName, String policyNumber, String expirationDate) {
        this.companyName = companyName;
        this.policyNumber = policyNumber;
        this.expirationDate = expirationDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String displayInsurance() {
        return "Company: " + companyName + ", Policy: " + policyNumber + ", Expiration Date: " + expirationDate;
    }
}
