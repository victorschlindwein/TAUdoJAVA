package chapter9;

public class InheritanceTester {
    public static void main(String[] args){
        escreveNaTela();
    }

    public static void escreveNaTela(){
        Employee employee = new Employee();
        employee.setAge(26);
        var idadeDoCavalo = employee.getAge();
        System.out.println("Essa é a idade do cavalo: " + idadeDoCavalo);
    }
}
