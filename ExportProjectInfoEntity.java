package cn.itsource.eloan.uiweb.controller.util.excelQJD;






/**
 * 项目放款导出  数据实体
 * @author 唐琪
 *
 */
public class ExportProjectInfoEntity {
	
	private int id;						//ID	
	private int applayId;				//项目申请ID
	private int membetType;				//会员类型 0：企业会员 1：个人会员	
	private int memberId;				//会员ID	
	private int projectType;			//项目类型ID
	private String stypeName;			//项目类型名	
	private String projectNo;			//项目编号
	private String merberBillNo;		//项目登记商户订单号(环迅接口使用)
	private String projectTitle;		//项目标题
	private int guaranteeType;			//担保类型 0：企业担保 1：个人担保
	private int guaranteeId;			//担保机构ID
	private String use;					//借款用途
	private String repaySource;			//还款来源
	private long lAmount;				//借款金额
	private String sprogress;			//融资进度
	private String amount;				//借款金额
	private String salReady;			//已投金额
	private String sUnInvest;			//未投金额
	private String projectDescript;		//项目描述
	private int deadline;				//借款期限 单位：月/天
	private int deadlineType;			//期限类型 0：天标 1：月标
	private String deadlineStr;         //借款期限
	private int repayWay;				//还款方式  0：等额本息，1：先息后本 2：还本付息
	private String repayWayStr;
	private String yearrate;			//预计年化收益率(万分之)
	private String recordDateStr;		//借款发布时间
	private String startDateStr;		//投标开始时间
	private String endDateStr;			//投标结束时间
	private String borrowMng;			//借款管理费(单位：分)
	private int statu;					//项目状态  -2：待第三方登记 -1：登记中 
	private String statuStr;
	private String riskGuarantee;			//已收风险保障金(单位：分)
	private String riskGuaranteeDateStr;	//风险保障金收取时间
	private String returnRiskGuarantee;	//退还风险保障金(单位：分)
	private String 	returnRiskGuaranteeDateStr;	//风险保障金退还时间
	
	
	private String cmpName;		
	private String psnName;		//个人、企业名称（同一个，导出数据用）
	
	private int ajaxStatu;				//异步返回状态      tanke_oyp  添加
	private int loanStatu;   			//放款状态 用于项目放款    0:投标中，1：满标，2：流标，3：已放款，4：已流标
	private String loanStatuStr;
	private String checkRemark;				//项目审核意见   tanke_oyp添加
	
	private int isMortgage;// 是否抵押 0：否 1：是
	private int mngFee;//担保费率
	private String smngFee; // 担保费率
	
	private String memberName; //会员名字
	private int repayRate;//年化利率
	private String repayRateStr;//年化利率
	
	
	
	
	public String getDeadlineStr() {
		return deadlineStr;
	}
	public void setDeadlineStr(String deadlineStr) {
		this.deadlineStr = deadlineStr;
	}
	public String getRepayRateStr() {
		return repayRateStr;
	}
	public void setRepayRateStr(String repayRateStr) {
		this.repayRateStr = repayRateStr;
	}
	public String getStatuStr() {
		return statuStr;
	}
	public void setStatuStr(String statuStr) {
		this.statuStr = statuStr;
	}
	public String getLoanStatuStr() {
		return loanStatuStr;
	}
	public void setLoanStatuStr(String loanStatuStr) {
		this.loanStatuStr = loanStatuStr;
	}
	public String getRepayWayStr() {
		return repayWayStr;
	}
	public void setRepayWayStr(String repayWayStr) {
		this.repayWayStr = repayWayStr;
	}
	public int getRepayRate() {
		return repayRate;
	}
	public void setRepayRate(int repayRate) {
		this.repayRate = repayRate;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getSprogress() {
		return sprogress;
	}
	public void setSprogress(String sprogress) {
		this.sprogress = sprogress;
	}
	public String getSalReady() {
		return salReady;
	}
	public void setSalReady(String salReady) {
		this.salReady = salReady;
	}
	public String getStypeName() {
		return stypeName;
	}
	public void setStypeName(String stypeName) {
		this.stypeName = stypeName;
	}
	public String getCmpName() {
		return cmpName;
	}
	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}
	public String getPsnName() {
		return psnName;
	}
	public void setPsnName(String psnName) {
		this.psnName = psnName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getApplayId() {
		return applayId;
	}
	public void setApplayId(int applayId) {
		this.applayId = applayId;
	}
	public int getMembetType() {
		return membetType;
	}
	public void setMembetType(int membetType) {
		this.membetType = membetType;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getProjectType() {
		return projectType;
	}
	public void setProjectType(int projectType) {
		this.projectType = projectType;
	}
	public String getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}
	public String getMerberBillNo() {
		return merberBillNo;
	}
	public void setMerberBillNo(String merberBillNo) {
		this.merberBillNo = merberBillNo;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public int getGuaranteeType() {
		return guaranteeType;
	}
	public void setGuaranteeType(int guaranteeType) {
		this.guaranteeType = guaranteeType;
	}
	public int getGuaranteeId() {
		return guaranteeId;
	}
	public void setGuaranteeId(int guaranteeId) {
		this.guaranteeId = guaranteeId;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getRepaySource() {
		return repaySource;
	}
	public void setRepaySource(String repaySource) {
		this.repaySource = repaySource;
	}
	public long getlAmount() {
		return lAmount;
	}
	public void setlAmount(long lAmount) {
		this.lAmount = lAmount;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getsUnInvest() {
		return sUnInvest;
	}
	public void setsUnInvest(String sUnInvest) {
		this.sUnInvest = sUnInvest;
	}
	public String getProjectDescript() {
		return projectDescript;
	}
	public void setProjectDescript(String projectDescript) {
		this.projectDescript = projectDescript;
	}
	public int getDeadline() {
		return deadline;
	}
	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}
	public int getDeadlineType() {
		return deadlineType;
	}
	public void setDeadlineType(int deadlineType) {
		this.deadlineType = deadlineType;
	}
	public int getRepayWay() {
		return repayWay;
	}
	public void setRepayWay(int repayWay) {
		this.repayWay = repayWay;
	}
	public String getYearrate() {
		return yearrate;
	}
	public void setYearrate(String yearrate) {
		this.yearrate = yearrate;
	}
	public String getRecordDateStr() {
		return recordDateStr;
	}
	public void setRecordDateStr(String recordDateStr) {
		this.recordDateStr = recordDateStr;
	}
	public String getStartDateStr() {
		return startDateStr;
	}
	public void setStartDateStr(String startDateStr) {
		this.startDateStr = startDateStr;
	}
	public String getEndDateStr() {
		return endDateStr;
	}
	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}
	public String getBorrowMng() {
		return borrowMng;
	}
	public void setBorrowMng(String borrowMng) {
		this.borrowMng = borrowMng;
	}
	public int getStatu() {
		return statu;
	}
	public void setStatu(int statu) {
		this.statu = statu;
	}
	public String getRiskGuarantee() {
		return riskGuarantee;
	}
	public void setRiskGuarantee(String riskGuarantee) {
		this.riskGuarantee = riskGuarantee;
	}
	public String getRiskGuaranteeDateStr() {
		return riskGuaranteeDateStr;
	}
	public void setRiskGuaranteeDateStr(String riskGuaranteeDateStr) {
		this.riskGuaranteeDateStr = riskGuaranteeDateStr;
	}
	public String getReturnRiskGuarantee() {
		return returnRiskGuarantee;
	}
	public void setReturnRiskGuarantee(String returnRiskGuarantee) {
		this.returnRiskGuarantee = returnRiskGuarantee;
	}
	public String getReturnRiskGuaranteeDateStr() {
		return returnRiskGuaranteeDateStr;
	}
	public void setReturnRiskGuaranteeDateStr(String returnRiskGuaranteeDateStr) {
		this.returnRiskGuaranteeDateStr = returnRiskGuaranteeDateStr;
	}
	public int getAjaxStatu() {
		return ajaxStatu;
	}
	public void setAjaxStatu(int ajaxStatu) {
		this.ajaxStatu = ajaxStatu;
	}
	public int getLoanStatu() {
		return loanStatu;
	}
	public void setLoanStatu(int loanStatu) {
		this.loanStatu = loanStatu;
	}
	public String getCheckRemark() {
		return checkRemark;
	}
	public void setCheckRemark(String checkRemark) {
		this.checkRemark = checkRemark;
	}
	public int getIsMortgage() {
		return isMortgage;
	}
	public void setIsMortgage(int isMortgage) {
		this.isMortgage = isMortgage;
	}
	public int getMngFee() {
		return mngFee;
	}
	public void setMngFee(int mngFee) {
		this.mngFee = mngFee;
	}
	public String getSmngFee() {
		return smngFee;
	}
	public void setSmngFee(String smngFee) {
		this.smngFee = smngFee;
	}
}
