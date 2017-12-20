package ehcache.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



@Entity
@Table(name = "districts")
@Cache(usage =  CacheConcurrencyStrategy.READ_ONLY)
public class DistrictDO {

	@Id
	@Column(name = "districtid")
	private Integer districtId;
	@Column(name = "name")
	private String name;
	@Column(name = "display_order")
	private int displayOrder;
	@Column(name = "active_indicator")
	boolean activeIndicator;

	@ManyToOne
	@JoinColumn(name="stateid")
	private StateDO stateDO ;
	
	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	



	public int getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	public boolean isActiveIndicator() {
		return activeIndicator;
	}

	public void setActiveIndicator(boolean activeIndicator) {
		this.activeIndicator = activeIndicator;
	}

	

	public StateDO getStateDO() {
		return stateDO;
	}

	public void setStateDO(StateDO stateDO) {
		this.stateDO = stateDO;
	}

}
