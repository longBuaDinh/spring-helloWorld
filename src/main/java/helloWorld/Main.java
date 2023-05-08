package helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Account ac1 = (Account) context.getBean("account1");
        Account ac2 = (Account) context.getBean("account2");

        System.out.println("Data of Account 1: ");
        System.out.println("Id: " + ac1.getId());
        System.out.println("Name: " + ac1.getName());
        System.out.println("Balance: " + ac1.getBalance());

        System.out.println("Data of Account 2: ");
        System.out.println("Id: " + ac2.getId());
        System.out.println("Name: " + ac2.getName());
        System.out.println("Balance: " + ac2.getBalance());
    }
}
