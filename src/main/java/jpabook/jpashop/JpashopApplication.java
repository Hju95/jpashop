package jpabook.jpashop;

import com.fasterxml.jackson.datatype.hibernate5.jakarta.Hibernate5JakartaModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpashopApplication {

    public static void main(String[] args) {
//        Hello hello = new Hello();
//        hello.setData("hello");
//        String data = hello.getData();
//        System.out.println("data = " + data);

        SpringApplication.run(JpashopApplication.class, args);
    }

    @Bean
    Hibernate5JakartaModule hibernate5Module() {
        Hibernate5JakartaModule hibernateModule = new Hibernate5JakartaModule();
//        hibernateModule.configure(Hibernate5JakartaModule.Feature.FORCE_LAZY_LOADING, true);
        return hibernateModule;
    }


}
