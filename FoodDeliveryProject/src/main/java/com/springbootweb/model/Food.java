package com.springbootweb.model;




import javax.persistence.*;


@Entity
@Table (name="food")
public class Food {


@Id
@Column (name="sno")
private Integer SNo;
@Column (name="name")
private String Name;
@Column (name="price")
private long Price;

public Food() {
super();
}
public Food(Integer SNo, String Name, long Price)
{
super();
this.SNo =SNo;
this.Name = Name;
this.Price = Price;
}

public void setSNo(Integer sNo) {
	SNo = sNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getPrice() {
	return Price;
}
public void setPrice(long price) {
	Price = price;
}




}
