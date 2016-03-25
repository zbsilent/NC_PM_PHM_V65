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
 * �б��� ���� �����ű�
 * 
 * @version NC6.36
 * @author guofya
 * @time 2014-10-28 ����3:17:31
 */
public class N_4D35_UNSAVEBILL extends PMAbstractPfAction {

	public N_4D35_UNSAVEBILL() {
		super();
	}

	@Override
	public Object runComClass(PfParameterVO pfParamVO) throws BusinessException {
		super.m_tmpVo = pfParamVO;
		IMbuildsService service = PMProxy.lookup(IMbuildsService.class);
		// �����ջط���
		AggMbuildsHeadVO[] vos = service.uncommitProBidRes((AggMbuildsHeadVO[]) getVos(), pfParamVO);
		return vos;
	}

}
