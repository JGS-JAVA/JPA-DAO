package edu.kh.com.jpadao.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class KHTBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title; // @Column 안쓰면 기본값 (널 허용, 유니크 안함)
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String genre;
}
