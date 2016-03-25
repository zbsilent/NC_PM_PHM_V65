package nc.impl.phm.mbuilds.prv;


import nc.impl.pmpub.servicebase.BillBaseImpl;
import nc.impl.pmpub.servicebase.action.InsertAction;
import nc.impl.pmpub.servicebase.action.UpdateAction;
import nc.itf.phm.mbuilds.prv.IMbuildsService;
import nc.vo.phm.mbuilds.AggMbuildsHeadVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;

/**
 * 招标结果  内部服务 实现类
 * 
 * @version NC6.36
 * @author guofya
 * @time 2014-10-28 下午2:45:26
 */


public class IMbuildsServiceImpl extends BillBaseImpl<AggMbuildsHeadVO> implements IMbuildsService{
	//TODO BillBaseImpl公共后台实现类//TODO BillBaseImpl公共后台实现类
	

//	@Override
//	protected void initInsertAction(InsertAction<AggMbuildsHeadVO> action) {
//		// TODO Auto-generated method stub
//		super.initInsertAction(action);
//		//action.addBeforeRule(new CalCurrTypeBeforeRule());
//	}
	//增加前后置规则
	@Override
	protected void initInsertAction(InsertAction<AggMbuildsHeadVO> action) {
		// TODO Auto-generated method stub
		super.initInsertAction(action);
		//action.addAfterRule(rule)
	}
	//@Override
	public AggMbuildsHeadVO[] insertProBidRes(
			AggMbuildsHeadVO[] billVOs) throws BusinessException {
		// TODO Auto-generated method stub
		return this.insert(billVOs);
	}

	

	@Override
	protected void initUpdateAction(UpdateAction<AggMbuildsHeadVO> action) {
		// TODO Auto-generated method stub
		super.initUpdateAction(action);
		//action.addBeforeRule(new CalCurrTypeBeforeRule());
	}
	
	 

	//@Override
	public AggMbuildsHeadVO[] updateProBidRes(AggMbuildsHeadVO[] billVOs,AggMbuildsHeadVO[] originBillVOs) throws BusinessException {
		// TODO Auto-generated method stub
		return this.update(billVOs, originBillVOs);
	}

	//@Override
	public void deleteProBidRes(AggMbuildsHeadVO[] billVOs)
			throws BusinessException {
		// TODO Auto-generated method stub
		this.delete(billVOs);
	}

	//@Override
	public Object approveProBidRes(AggMbuildsHeadVO[] billVOs,
			PfParameterVO pfParamVO) throws BusinessException {
		// TODO Auto-generated method stub
		return this.approve(billVOs, pfParamVO);
	}

	//@Override
	public AggMbuildsHeadVO[] unapproveProBidRes(
			AggMbuildsHeadVO[] billVOs, PfParameterVO pfParamVO)
			throws BusinessException {
		// TODO Auto-generated method stub
		return this.unApprove(billVOs, pfParamVO);
	}

	//@Override
	public AggMbuildsHeadVO[] commitProBidRes(
			AggMbuildsHeadVO[] billVOs) throws BusinessException {
		// TODO Auto-generated method stub
		return this.commit(billVOs);
	}

	//@Override
	public AggMbuildsHeadVO[] uncommitProBidRes(
			AggMbuildsHeadVO[] billVOs, PfParameterVO pfParamVO)
			throws BusinessException {
		// TODO Auto-generated method stub
		return this.unCommit(billVOs, pfParamVO);
	}

}
