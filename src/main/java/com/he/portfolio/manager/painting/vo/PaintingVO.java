package com.he.portfolio.manager.painting.vo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class PaintingVO implements Serializable {
	
	private static final long serialVersionUID = 1699596903687935935L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "idx", nullable = false)
	private Long idx;
	
	private String name;
	private String memo;
	
	
	
	
}
