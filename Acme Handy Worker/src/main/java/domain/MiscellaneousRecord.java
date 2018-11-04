
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class MiscellaneousRecord extends DomainEntity {

	// Constructor

	public MiscellaneousRecord() {
		super();
	}


	// Attributes

	private String	title;
	private String	attachmentLink;
	private String	comment;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@URL
	public String getAttachmentLink() {
		return this.attachmentLink;
	}

	public void setAttachmentLink(final String attachmentLink) {
		this.attachmentLink = attachmentLink;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

	// Relationships

}
