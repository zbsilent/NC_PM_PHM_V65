package nc.bs.pub.action;

import nc.bs.pmpub.pf.IPfExtParamConst;
import nc.bs.pmpub.util.VoStatusUtils;
import nc.impl.pmpub.servicebase.PMAbstractPfAction;
import nc.itf.pcm.projectbidresult.prv.IProjectBidResult;
import nc.itf.phm.mbuilds.prv.IMbuildsService;
import nc.vo.pcm.projectbidresult.ProjectBidResultBillVO;
import nc.vo.phm.mbuilds.AggMbuildsHeadVO;
import nc.vo.pm.proxy.PMProxy;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;

/**
 * 招标结果 删除 动作脚本
 * 
 * @version NC6.36
 * @author guofya
 * @time 2014-10-28 下午3:17:04
 */
public class N_4D35_SAVE extends PMAbstractPfAction {
	@Override
	public Object runComClass(PfParameterVO paraVo) throws BusinessException {
		super.m_tmpVo = paraVo;
		IMbuildsService service = PMProxy.lookup(IMbuildsService.class);
		AggMbuildsHeadVO[] billVOs = (AggMbuildsHeadVO[]) getVos();
		if (VoStatusUtils.isNewStatus(billVOs)) {
			service.insertProBidRes(billVOs);
		} else if (VoStatusUtils.isUpdatedStatus(billVOs)) {
			service.updateProBidRes(billVOs,(AggMbuildsHeadVO[]) paraVo.getCustomPropertyBatch().get(IPfExtParamConst.PARAM_ORIGIN_VOS));
		}
		billVOs = service.commitProBidRes(billVOs);
		return billVOs;
	}
}
