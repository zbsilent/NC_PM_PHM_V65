package nc.itf.phm.mbuilds.prv;

import nc.vo.phm.mbuilds.AggMbuildsHeadVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;

/**
 * �б��� �ڲ�����ӿ�
 * 
 * @version NC6.36
 * @author guofya
 * @time 2014-10-28 ����2:38:14
 */
public interface IMbuildsService {
	/**
	 * ����
	 * 
	 * @param billVOs
	 * @return
	 * @throws BusinessException
	 */
	public AggMbuildsHeadVO[] insertProBidRes(AggMbuildsHeadVO[] billVOs)
			throws BusinessException;

	/**
	 * ����
	 * 
	 * @param billVOs
	 * @param originBills
	 * @return
	 * @throws BusinessException
	 */
	public AggMbuildsHeadVO[] updateProBidRes(AggMbuildsHeadVO[] billVOs,AggMbuildsHeadVO[] originBillVOs) throws BusinessException;

	/**
	 * ɾ��
	 * 
	 * @param billVOs
	 * @return
	 * @throws BusinessException
	 */
	public void deleteProBidRes(AggMbuildsHeadVO[] billVOs)
			throws BusinessException;

	/**
	 * ����
	 * 
	 * @param billVOs
	 * @param pfParamVO
	 * @return
	 * @throws BusinessException
	 */
	public Object approveProBidRes(AggMbuildsHeadVO[] billVOs,
			PfParameterVO pfParamVO) throws BusinessException;

	/**
	 * ȡ������
	 * 
	 * @param billVOs
	 * @param pfParamVO
	 * @return
	 * @throws BusinessException
	 */
	public AggMbuildsHeadVO[] unapproveProBidRes(AggMbuildsHeadVO[] billVOs,
			PfParameterVO pfParamVO) throws BusinessException;

	/**
	 * �ύ
	 * 
	 * @param billVOs
	 * @return
	 * @throws BusinessException
	 */
	public AggMbuildsHeadVO[] commitProBidRes(AggMbuildsHeadVO[] billVOs)
			throws BusinessException;

	/**
	 * �ջ�
	 * 
	 * @param billVOs
	 * @param pfParamVO
	 * @return
	 * @throws BusinessException
	 */
	public AggMbuildsHeadVO[] uncommitProBidRes(AggMbuildsHeadVO[] billVOs,
			PfParameterVO pfParamVO) throws BusinessException;
}
