package fourthweb;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TEST1 database table.
 * 
 */
@Entity
@NamedQuery(name="Test1.findAll", query="SELECT t FROM Test1 t")
public class Test1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long acct;
	@GeneratedValue(strategy = GenerationType.IDENTITY)



	private String name1;

	private BigDecimal startingbalance;

	public Test1() {
	}

	public long getAcct() {
		return this.acct;
	}

	public void setAcct(long acct) {
		this.acct = acct;
	}



	public String getName1() {
		return this.name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public BigDecimal getStartingbalance() {
		return this.startingbalance;
	}

	public void setStartingbalance(BigDecimal startingbalance) {
		this.startingbalance = startingbalance;
	}

}