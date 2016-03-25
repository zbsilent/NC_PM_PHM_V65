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
 * 招标结果 弃审 动作脚本
 * 
 * @version NC6.36
 * @author guofya
 * @time 2014-10-28 下午3:17:22
 */
public class N_4D35_UNAPPROVE extends PMAbstractPfAction {
	@Override
	public Object runComClass(PfParameterVO paraVo) throws BusinessException {
		super.m_tmpVo = paraVo;
		IMbuildsService service = PMProxy.lookup(IMbuildsService.class);
		AggMbuildsHeadVO[] vos = service.unapproveProBidRes((AggMbuildsHeadVO[]) getVos(), paraVo);
		return vos;
	}
}
