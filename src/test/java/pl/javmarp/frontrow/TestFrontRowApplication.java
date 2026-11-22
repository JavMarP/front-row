package pl.javmarp.frontrow;

import org.springframework.boot.SpringApplication;

public class TestFrontRowApplication {

    public static void main( String[] args ) {
        SpringApplication.from(FrontRowApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
