package pl.mj.LoginTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Hosting Zdjęć.
//Aplikacja posiada dwa rodzaje użytkowników, których przechwuje w bazie danych - Admin oraz User
// Po zalogowaniu admin ma możliwośc dodawania zdjęć
// Zalogowany user przegląda dostępne galerie
// Użytkownik niezalogowany ma dostępną templatkę logowania

//Username: t7SVCQWMlm
//
//        Database name: t7SVCQWMlm
//
//        Password: ghIeBnRsGI
//
//        Server: remotemysql.com
//
//        Port: 3306

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
