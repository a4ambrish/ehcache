package ehcache.modal;

import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



@Entity
@Table(name = "state")
@Cache(usage =  CacheConcurrencyStrategy.READ_ONLY)
public class StateDO {

	@Id
	@Column(name = "stateid")
	private int stateId;
	@Column(name = "statename")
	private String stateName;
	@Column(name = "display_order")
	private int displayOrder;
	@Column(name = "active_indicator")
	private boolean activeIndicator;
 
	@OneToMany(mappedBy="stateDO",cascade = CascadeType.ALL)
	private List<DistrictDO> districtDOList; 
	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
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

	

	public List<DistrictDO> getDistrictDOList() {
		return districtDOList;
	}

	public void setDistrictDOList(List<DistrictDO> districtDOList) {
		this.districtDOList = districtDOList;
	}
	
	

}
