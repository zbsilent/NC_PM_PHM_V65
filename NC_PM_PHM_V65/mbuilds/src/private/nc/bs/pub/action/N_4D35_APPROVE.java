package nc.bs.pub.action;

import nc.impl.pmpub.servicebase.PMAbstractPfAction;
import nc.itf.pcm.projectbidresult.prv.IProjectBidResult;
import nc.itf.phm.mbuilds.prv.IMbuildsService;
import nc.vo.pcm.projectbidresult.ProjectBidResultBillVO;
import nc.vo.phm.mbuilds.AggMbuildsHeadVO;
import nc.vo.pm.proxy.PMProxy;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;

/**
 * 招标结果 审核 动作脚本
 * 
 * @version NC6.36
 * @author guofya
 * @time 2014-10-28 下午3:16:37
 */
public class N_4D35_APPROVE extends PMAbstractPfAction {
	@Override
	public Object runComClass(PfParameterVO vo) throws BusinessException {
		super.m_tmpVo = vo;
		Object vos = PMProxy.lookup(IMbuildsService.class).approveProBidRes(
				(AggMbuildsHeadVO[]) getVos(), vo);
		return vos;
	}
}
