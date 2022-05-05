package com.gmoon.designpatterns.creational.factorymethod;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Ship {
	private String name;
	private String color;
	private String logo;
}
