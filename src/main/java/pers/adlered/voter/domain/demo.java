package pers.adlered.voter.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;


@PropertySource("demo.properties")
@ConfigurationProperties(prefix = "demo")
@Component
public class demo {
  //  @Value("name")
    private String name;
    @Email
    //@Value("email")
    private String email;
  //  @Value("boss")
    private Boolean boss;

    @Override
    public String toString() {
        return "demo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", boss=" + boss +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }
}

