package com.example.demo.entity;

import jarkata.persistence.*;
import jarkata.validation.constraints.*;

@Entity 
public class studentEntity {
    @Id
    @GeneratedValue(stratergy =GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message=" Name is not Valid");
    private String name;

    @Email(message="Email Format is not Valid");
    private String email;

    public void setId(Long id){
        this.id =id ;

    }
    public Long getId(){
        return id;
    }
    public studentEntity(){

    }
        public studentEntity(Long id,String name,String email){
            this.id=id;
            this.name=name;
            this.email=email;
        }
    
}
