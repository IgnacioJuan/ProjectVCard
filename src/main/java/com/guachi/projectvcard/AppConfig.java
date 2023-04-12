package com.guachi.projectvcard;

import com.guachi.projectvcard.models.domain.Redes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean("itemsRedes")
    public List<Redes> registrarItems(){
        Redes item1=new Redes("Facebook", "fab fa-facebook-f", "https://www.facebook.com/");
        Redes item2=new Redes("Twitter", "fab fa-twitter", "https://twitter.com/");
        Redes item3=new Redes("LinkedIn", "fab fa-linkedin-in", "https://www.linkedin.com/");
        return Arrays.asList(item1,item2,item3);
    }
}
