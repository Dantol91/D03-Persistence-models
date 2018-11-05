
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Finder extends DomainEntity {

	// Constructor

	public Finder() {
		super();
	}


	// Attributes

	private String	keyword;
	private double	maxPrice;
	private double	minPrice;
	private Date	startDate;
	private Date	endDate;


	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(final String keyword) {
		this.keyword = keyword;
	}

	@Valid
	public double getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(final double maxPrice) {
		this.maxPrice = maxPrice;
	}

	@Valid
	public double getMinPrice() {
		return this.minPrice;
	}

	public void setMinPrice(final double minPrice) {
		this.minPrice = minPrice;
	}

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}


	// Relationships

	private Collection<FixUpTask>	fixUpTasks;


	@NotNull
	@OneToMany
	public Collection<FixUpTask> getFixUpTasks() {
		return this.fixUpTasks;
	}

	public void setFixUpTasks(final Collection<FixUpTask> fixUpTasks) {
		this.fixUpTasks = fixUpTasks;
	}

}
