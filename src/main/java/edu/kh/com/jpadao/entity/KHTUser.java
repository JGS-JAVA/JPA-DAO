package edu.kh.com.jpadao.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class KHTUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String username;
    @Column(unique = false, nullable = false)
    private String password;
    @Column(nullable = true)
    private String imagePath;


}
