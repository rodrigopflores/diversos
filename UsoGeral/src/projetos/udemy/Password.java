package projetos.udemy;

public class Password {

    private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public int getEncryptedPassword() {
        return encryptedPassword;
    }

    public boolean letMeIn(int password){
        return encryptDecrypt(password) == encryptedPassword;
    }
}
