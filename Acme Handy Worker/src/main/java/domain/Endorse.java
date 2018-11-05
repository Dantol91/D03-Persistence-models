
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class Endorse extends DomainEntity {

	// Constructor

	public Endorse() {
		super();
	}


	// Attributes

	// Relationships

	private Collection<Endorsement>	endorsements;


	@Valid
	@OneToMany
	public Collection<Endorsement> getEndorsements() {
		return this.endorsements;
	}

	public void setEndorsements(final Collection<Endorsement> endorsements) {
		this.endorsements = endorsements;
	}

}
