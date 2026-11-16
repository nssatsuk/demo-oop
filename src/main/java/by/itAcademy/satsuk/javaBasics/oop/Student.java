package by.itAcademy.satsuk.javaBasics.oop;

public class Student extends User{
    private Integer grant;

    public int getIncome(){
        if(grant != null){
            return grant;
        } else return 0;
    }

    public Integer getGrant() {
        return grant;
    }

    public void setGrant(Integer grant) {
        this.grant = grant;
    }
}
