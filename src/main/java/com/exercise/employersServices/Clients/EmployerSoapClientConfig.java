package com.exercise.employersServices.Clients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class EmployerSoapClientConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.exercise.employersServices.soap");
        return marshaller;
    }
    @Bean
    public EmployerSoapClient employerSoapClient(Jaxb2Marshaller marshaller) {
        EmployerSoapClient client = new EmployerSoapClient();
        client.setDefaultUri("http://localhost:8080/soap");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
