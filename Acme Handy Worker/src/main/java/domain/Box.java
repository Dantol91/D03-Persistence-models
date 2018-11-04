
package domain;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Box extends DomainEntity {

	// Constructors

	public Box() {
		super();
	}


	// Attributes 

	private String	name;
	private boolean	systemBox;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public boolean getSystemBox() {
		return this.systemBox;
	}

	public void setSystemBox(final boolean systemBox) {
		this.systemBox = systemBox;
	}


	// Relationships

	private Collection<Message>	messages;
	private Collection<Box>		childBoxes;
	private Box					parentBox;


	@NotNull
	public Collection<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(final Collection<Message> messages) {
		this.messages = messages;
	}

	@NotNull
	public Collection<Box> getChildBoxes() {
		return this.childBoxes;
	}

	public void setChildBoxes(final Collection<Box> childBoxes) {
		this.childBoxes = childBoxes;
	}

	@NotNull
	public Box getParentBoxes() {
		return this.parentBox;
	}

	public void setParentBoxe(final Box parentBox) {
		this.parentBox = parentBox;
	}

}
