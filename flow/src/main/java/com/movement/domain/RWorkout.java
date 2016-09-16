package com.movement.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.movement.dto.TextLength;


@Entity
@Table(name = "workout")
public class RWorkout extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1195501156843452445L;
	
	@ManyToOne
	private RUser owner;
	
	@Column(name="description", length=TextLength.DESCRIPTION)
	private String description;
	
	@OneToOne
	private RMedia media;
	
	/**
	 * Stores the activites that were completed during the workout
	 */
	@Embedded
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="workout_activity", joinColumns=@JoinColumn(name = "workout_id", referencedColumnName = "id"))
	@Cascade(value=CascadeType.ALL)
	private List<RActivity> activities = new ArrayList<RActivity>();
	
	@Embedded
	private RLocation location;
	
	public List<RActivity> getActivities(){
		return activities;
	}
	
	public void setActivities(List<RActivity> activities){
		this.activities = activities;
	}
	
	public RUser getOwner(){
		return owner;
	}
	
	public void setOwner(RUser owner){
		this.owner = owner;
	}
	
	public RLocation getLocation(){
		return location;
	}
	
	public void setLocation(RLocation location){
		this.location = location;
	}
	
	public RMedia getMedia(){
		return media;
	}
	
	public void setMedia(RMedia media){
		this.media = media;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
}