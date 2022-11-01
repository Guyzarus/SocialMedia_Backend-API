package com.cooksys.assessment.team2.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "followers_following")
public class Followers {
	
	@ManyToMany
	private int follower_id;
	@ManyToMany
	private int following_id;

}
