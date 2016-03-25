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
 * �б��� ɾ�� �����ű�
 * 
 * @version NC6.36
 * @author guofya
 * @time 2014-10-28 ����3:16:53
 */
public class N_4D35_DELETE extends PMAbstractPfAction {
	@Override
	public Object runComClass(PfParameterVO paraVo) throws BusinessException {
		super.m_tmpVo = paraVo;
		PMProxy.lookup(IMbuildsService.class).deleteProBidRes(
				(AggMbuildsHeadVO[]) getVos());
		return null;
	}
}
