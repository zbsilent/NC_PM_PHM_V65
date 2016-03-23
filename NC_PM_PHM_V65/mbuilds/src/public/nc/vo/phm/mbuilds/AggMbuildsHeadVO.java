package nc.vo.phm.mbuilds;

import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

/**
 * 
 * 单子表/单表头/单表体聚合VO
 *
 * 创建日期:
 * @author 
 * @version NCPrj ??
 */

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.phm.mbuilds.MbuildsHeadVO")
public class  AggMbuildsHeadVO extends AbstractBill {

	/**
	 * 
	 */
	private static final long serialVersionUID = 212959299882019791L;

	public IBillMeta getMetaData() {
		// TODO Auto-generated method stub
		IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta("phm.mbuilds");
		return billMeta;
	}
 
 
	@Override
	public MbuildsHeadVO getParentVO() {
		// TODO Auto-generated method stub
		return (MbuildsHeadVO)super.getParentVO();
	}
 
}
