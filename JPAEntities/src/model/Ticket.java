package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TBL_TICKET database table.
 * 
 */
@Entity
@Table(name="TBL_TICKET")
@NamedQuery(name="Ticket.findAll", query="SELECT t FROM Ticket t")
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ticketid;
	private String destinationstation;
	private String email;
	private String passengername;
	private String sourcestation;
	private Date traveldate;

	public Ticket() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTicketid() {
		return this.ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}


	public String getDestinationstation() {
		return this.destinationstation;
	}

	public void setDestinationstation(String destinationstation) {
		this.destinationstation = destinationstation;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassengername() {
		return this.passengername;
	}

	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}


	public String getSourcestation() {
		return this.sourcestation;
	}

	public void setSourcestation(String sourcestation) {
		this.sourcestation = sourcestation;
	}


	@Temporal(TemporalType.DATE)
	public Date getTraveldate() {
		return this.traveldate;
	}

	public void setTraveldate(Date traveldate) {
		this.traveldate = traveldate;
	}

}