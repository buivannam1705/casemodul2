package Model;

public class Admin {
    private String Account;
    private String Password;

    public Admin(String taikhoan, String matkhau) {
        this.Account = taikhoan;
        this.Password = matkhau;
    }

    public Admin() {
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        this.Account = account;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    @Override
    public String toString() {
        return
                "taikhoan='" + Account + '\'' +
                ", matkhau='" + Password + '\'' +
                '}';
    }
}
