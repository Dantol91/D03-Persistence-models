
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Category extends DomainEntity {

	// Constructor

	public Category() {
		super();
	}


	// Attributes

	private String	name;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}


	// Relationships

	private Collection<FixUpTask>	fixUpTasks;
	private Category				parentCategory;
	private Collection<Category>	childCategories;


	@NotNull
	public Collection<FixUpTask> getFixUpTasks() {
		return this.fixUpTasks;
	}

	public void setFixUpTasks(final Collection<FixUpTask> fixUpTasks) {
		this.fixUpTasks = fixUpTasks;
	}

	@Valid
	public Category getParentCategory() {
		return this.parentCategory;
	}

	public void setParentCategory(final Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	@NotNull
	public Collection<Category> getChildCategories() {
		return this.childCategories;
	}

	public void setChildCategories(final Collection<Category> childCategories) {
		this.childCategories = childCategories;
	}

}
