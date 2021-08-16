import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class spring_boot_app {
    
    @RequestMapping("/")
    String Dashboard() {
        return "Hello World, We are on Home!";
    }

    public static void main(String[] args) {
        SpringApplication.run(spring_boot_app.class, args);
    }
}

// to run the app run: mvn spring-boot:run
// to build and generate a target file, add the spring boot maven plugin to the pom.xml in the root folder and run:
    // mvn package, to package the app.

    // two *.jar files will be generated. 
        // to run the non-annoted as *.jar.original
        //run the following:
            // java -jar *.jar
                    // *.jar represent the name of the file.(replace with the actual name.) 

                    