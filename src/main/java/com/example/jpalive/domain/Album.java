package com.example.jpalive.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Album")
public class Album {
	
	private String artist;
	private String etc;
}
