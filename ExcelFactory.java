package cn.itsource.eloan.uiweb.controller.util.excelQJD;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;




/**
 * 导出公用 excel
 * @author 谢强
 *
 */
public class ExcelFactory{
	public static void main(String[] args) {
		List<ExportProjectInfoEntity> list=new ArrayList<ExportProjectInfoEntity>();
		for (int i = 0 ; i<=10;i++) {
			ExportProjectInfoEntity entity = new ExportProjectInfoEntity();
			entity.setId(i);
			entity.setStypeName("styname"+1);
			entity.setProjectTitle("projectTitle");
			entity.setPsnName("psnName");
			entity.setAmount("amount");
			entity.setEndDateStr("endDateStr");
			entity.setDeadline(i);
			entity.setYearrate("yearrate");
			entity.setRepayWay(i+100);
			entity.setSprogress("sprogress"+i);
			entity.setSalReady("salReady"+i);
			entity.setStartDateStr("startDateStr"+i);
			entity.setEndDateStr("endDateStr"+i);
			entity.setLoanStatu(1000+i);
			entity.setStatu(10000+i);
			list.add(entity);
		}
		String fileName = "";
		String boakName = "";
		if(list.size() > 0){
			List<Object> lists = new ArrayList<Object>();
			String[] title={"项目编号","项目类型","项目名称","会员名称","借款金额（元）","借款到期时间","借款期限（月）","年化利率（%）","还款方式","融资进度（%）","融资金额","投标开始时间","投标结束时间","项目状态","放款状态"};
			String[] titlesEn={"id","stypeName","projectTitle","psnName","amount","endDateStr","deadline","yearrate","repayWay","sprogress","salReady","startDateStr","endDateStr","loanStatu","statu"};
			fileName = "项目放款数据";
			boakName = "项目放款数据统计";
			
			if(list!=null){
	  			for(int i=0;i<list.size();i++){
	  				lists.add(list.get(i));
	  			}
	  		}
			ExcelFactory factory=new ExcelFactory();
//	  		ExcelFactory.outExcl(title, titlesEn, lists, fileName, boakName);
		}
	}
	
	/**
	 * excel工作表的构建工厂
	 * @param title 表头 如：String[] titles={"会员","姓名","身份证号","手机号","总融资金额","账户"};
	 * @param titlesEn 表头对应的实体属性名称 如 String[] titlesEn={"loginname","name","crad","phone","money","account"};
	 * @param lists : 数据对象
	 * @param fileName 附件文件名称 
	 * @param boakName 工作表名称（表名标题）
	 * @author 谢强
	 * 
	 */
	public static void  outExcel(String[] title,String[] titlesEn,List<Object> lists,String fileName,
									String boakName,HttpServletResponse response) {
		//创建工作流   
		ServletOutputStream os = null; 
		try {
			System.out.println("======4=========================================");
			//设置弹出对话框   
			response.setContentType("application/DOWLOAD");
			System.out.println("=========5======================================");
			try {
				 fileName = new String(fileName.getBytes(), "iso8859-1");//解决中文 文件名问题  
			} catch (Exception e) {
				e.printStackTrace();
			}
			//设置工作表的标题
			response.setHeader("Content-Disposition","attachment;filename="+fileName+".xls");
			os = response.getOutputStream();
			//初始化工作表
			WritableWorkbook wbook = null;
			wbook = Workbook.createWorkbook(os); // 建立excel文件
			WritableSheet wsheet = wbook.createSheet(boakName, 0); //工作表名称
			//设置列宽度（列从0开始）
			for(int i=0;i<title.length;i++){
				wsheet.setColumnView(i, 30);
			}
			//设置第一行高（标题）
			wsheet.setRowView(1, 600, false);
			 //合并单元格
			wsheet.mergeCells(0, 1, title.length-1, 1);//位1和3是列，2和4是行
			 //设置Excel字体
			WritableFont wfont = new WritableFont(
			WritableFont.createFont("宋体"), 10,
			WritableFont.BOLD, false,
			jxl.format.UnderlineStyle.NO_UNDERLINE,
			jxl.format.Colour.BLACK);
			 //标题字体
			WritableFont wfont_title = new WritableFont(
			WritableFont.createFont("宋体"), 14,
			WritableFont.BOLD, false,
			jxl.format.UnderlineStyle.NO_UNDERLINE,
			jxl.format.Colour.BLACK);
					   
			WritableCellFormat headerFormat = new WritableCellFormat();//表头信息
			headerFormat.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.THIN);//边框
			headerFormat.setVerticalAlignment(VerticalAlignment.CENTRE); 
			headerFormat.setAlignment(Alignment.CENTRE);
			headerFormat.setBackground(Colour.BLUE);
			headerFormat.setFont(wfont_title);
			Label tbody = new Label(0, 1,boakName ,headerFormat);
			wsheet.addCell(tbody);
					   
			WritableCellFormat titleFormat = new WritableCellFormat(wfont);
			titleFormat.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
			titleFormat.setAlignment(Alignment.CENTRE);
			titleFormat.setBackground(Colour.GRAY_25);//标题背景
			// 设置Excel表头
			for (int i = 0; i < title.length; i++) {
				Label excelTitle = new Label(i, 2, title[i], titleFormat);
				wsheet.addCell(excelTitle);//添加字段名称到excel表中
			}
			//写入数据
			int c = 3; // 用于循环时Excel的行号
			for(int i=0;i<lists.size();i++){ 
				Class clazz = lists.get(i).getClass();
				for(int j=0;j<titlesEn.length;j++){
					String str = "get"+ titlesEn[j].substring(0,1).toUpperCase()+titlesEn[j].substring(1);
					//获取方法对象
					Method getMethod=clazz.getMethod(str, new Class[]{});
					//利用get方法获取属性值
					Object value=getMethod.invoke(lists.get(i), new Object[]{});
					Label content = new Label(j, c, String.valueOf(value));
					wsheet.addCell(content);
				}
				c++;
			}
			wbook.write(); // 写入文件
			wbook.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * excel工作表的构建工厂
	 * @param title 表头 如：String[] titles={"会员","姓名","身份证号","手机号","总融资金额","账户"};
	 * @param titlesEn 表头对应的实体属性名称 如 String[] titlesEn={"loginname","name","crad","phone","money","account"};
	 * @param sInfo : 数据内容
	 * @param fileName 附件文件名称 
	 * @param boakName 工作表名称（表名标题）
	 * @author zhy
	 */
	public void outExcl(String[] title,String[][] sInfo,String fileName,String boakName,HttpServletResponse response) {
		if(title == null || title.length<=0 || sInfo == null ){
			return;
		}
		//创建工作流   
		ServletOutputStream os = null; 
		try {
			//设置弹出对话框   
			response.setContentType("application/DOWLOAD");
			try {
				 fileName = new String(fileName.getBytes(), "iso8859-1");//解决中文 文件名问题  
			} catch (Exception e) {
				e.printStackTrace();
			}
			//设置工作表的标题
			response.setHeader("Content-Disposition","attachment;filename="+fileName+".xls");
			os = response.getOutputStream();
			//初始化工作表
			WritableWorkbook wbook = null;
			wbook = Workbook.createWorkbook(os); // 建立excel文件
			WritableSheet wsheet = wbook.createSheet(boakName, 0); //工作表名称
			//设置列宽度（列从0开始）
			for(int i=0;i<title.length;i++){
				wsheet.setColumnView(i, 30);
			}
			//设置第一行高（标题）
			wsheet.setRowView(1, 600, false);
			 //合并单元格
			wsheet.mergeCells(0, 1, title.length-1, 1);//位1和3是列，2和4是行
			 //设置Excel字体
			WritableFont wfont = new WritableFont(
			WritableFont.createFont("宋体"), 10,
			WritableFont.BOLD, false,
			jxl.format.UnderlineStyle.NO_UNDERLINE,
			jxl.format.Colour.BLACK);
			 //标题字体
			WritableFont wfont_title = new WritableFont(
			WritableFont.createFont("宋体"), 14,
			WritableFont.BOLD, false,
			jxl.format.UnderlineStyle.NO_UNDERLINE,
			jxl.format.Colour.BLACK);
					   
			WritableCellFormat headerFormat = new WritableCellFormat();//表头信息
			headerFormat.setBorder(jxl.format.Border.ALL,jxl.format.BorderLineStyle.THIN);//边框
			headerFormat.setVerticalAlignment(VerticalAlignment.CENTRE); 
			headerFormat.setAlignment(Alignment.CENTRE);
			headerFormat.setBackground(Colour.YELLOW);
			headerFormat.setFont(wfont_title);
			Label tbody = new Label(0, 1,boakName ,headerFormat);
			wsheet.addCell(tbody);
					   
			WritableCellFormat titleFormat = new WritableCellFormat(wfont);
			titleFormat.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
			titleFormat.setAlignment(Alignment.CENTRE);
			titleFormat.setBackground(Colour.GRAY_25);//标题背景
			// 设置Excel表头
			for (int i = 0; i < title.length; i++) {
				Label excelTitle = new Label(i, 2, title[i], titleFormat);
				wsheet.addCell(excelTitle);//添加字段名称到excel表中
			}
			//写入数据
			int c = 3; // 用于循环时Excel的行号
			int iLen = sInfo.length;
			Object[] objects;
			int iSize = 0;
			for(int i=0;i<iLen;i++){ 
				//Class clazz = lists.get(i).getClass();
				objects = sInfo[i];
				iSize = 0;
				if(objects!=null){
					iSize = objects.length;
				}
				for(int j=0;j<iSize;j++){
					String str = (String)objects[j];
					//获取方法对象
					/*Method getMethod=clazz.getMethod(str, new Class[]{});
					//利用get方法获取属性值
					Object value=getMethod.invoke(lists.get(i), new Object[]{});*/
					Label content = new Label(j, c, str);
					wsheet.addCell(content);
				}
				c++;
			}
			wbook.write(); // 写入文件
			wbook.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
