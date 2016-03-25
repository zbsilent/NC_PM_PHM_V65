package nc.itf.phm.mbuilds.prv;

import nc.vo.phm.mbuilds.AggMbuildsHeadVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;

/**
 * 招标结果 内部服务接口
 * 
 * @version NC6.36
 * @author guofya
 * @time 2014-10-28 下午2:38:14
 */
public interface IMbuildsService {
	/**
	 * 新增
	 * 
	 * @param billVOs
	 * @return
	 * @throws BusinessException
	 */
	public AggMbuildsHeadVO[] insertProBidRes(AggMbuildsHeadVO[] billVOs)
			throws BusinessException;

	/**
	 * 更新
	 * 
	 * @param billVOs
	 * @param originBills
	 * @return
	 * @throws BusinessException
	 */
	public AggMbuildsHeadVO[] updateProBidRes(AggMbuildsHeadVO[] billVOs,AggMbuildsHeadVO[] originBillVOs) throws BusinessException;

	/**
	 * 删除
	 * 
	 * @param billVOs
	 * @return
	 * @throws BusinessException
	 */
	public void deleteProBidRes(AggMbuildsHeadVO[] billVOs)
			throws BusinessException;

	/**
	 * 审批
	 * 
	 * @param billVOs
	 * @param pfParamVO
	 * @return
	 * @throws BusinessException
	 */
	public Object approveProBidRes(AggMbuildsHeadVO[] billVOs,
			PfParameterVO pfParamVO) throws BusinessException;

	/**
	 * 取消审批
	 * 
	 * @param billVOs
	 * @param pfParamVO
	 * @return
	 * @throws BusinessException
	 */
	public AggMbuildsHeadVO[] unapproveProBidRes(AggMbuildsHeadVO[] billVOs,
			PfParameterVO pfParamVO) throws BusinessException;

	/**
	 * 提交
	 * 
	 * @param billVOs
	 * @return
	 * @throws BusinessException
	 */
	public AggMbuildsHeadVO[] commitProBidRes(AggMbuildsHeadVO[] billVOs)
			throws BusinessException;

	/**
	 * 收回
	 * 
	 * @param billVOs
	 * @param pfParamVO
	 * @return
	 * @throws BusinessException
	 */
	public AggMbuildsHeadVO[] uncommitProBidRes(AggMbuildsHeadVO[] billVOs,
			PfParameterVO pfParamVO) throws BusinessException;
}
