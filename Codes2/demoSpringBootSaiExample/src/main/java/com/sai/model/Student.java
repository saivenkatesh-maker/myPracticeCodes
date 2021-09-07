package com.sai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@Data
@NoArgsConstructor
public class Student {
@Id
@Column
private int id;
@Column
private String firstName;
@Column
private String lastName;
@Column
private String email;

//lombok will genertae the getters ,setters and to string
}
