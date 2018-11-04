
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Application extends DomainEntity {

	// Constructors

	public Application() {
		super();
	}


	// Attributes ----------------------------------------------------------------------

	private Date	registerMoment;
	private String	status;
	private double	offeredPrice;
	private String	comment;
	private String	reasonDenied;


	@Past
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	public Date getRegisterMoment() {
		return this.registerMoment;
	}

	public void setRegisterMoment(final Date registerMoment) {
		this.registerMoment = registerMoment;
	}

	@Pattern(regexp = "^PENDING|ACCEPTED|REJECTED$")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	@Min(0)
	@Valid
	public double getOfferedPrice() {
		return this.offeredPrice;
	}

	public void setOfferedPrice(final double offeredPrice) {
		this.offeredPrice = offeredPrice;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

	public String getReasonDenied() {
		return this.reasonDenied;
	}

	public void setReasonDenied(final String reasonDenied) {
		this.reasonDenied = reasonDenied;
	}


	// Relationships

	private CreditCard	creditcard;
	private HandyWorker	handyWorker;
	private FixUpTask	fixUpTask;


	@Valid
	public CreditCard getCreditcard() {
		return this.creditcard;
	}

	@NotNull
	@Valid
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	@NotNull
	@Valid
	public FixUpTask getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

	public void setCreditcard(final CreditCard creditcard) {
		this.creditcard = creditcard;
	}

}
