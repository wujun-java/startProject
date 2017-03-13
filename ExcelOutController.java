package cn.itsource.eloan.uiweb.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.coobird.thumbnailator.Thumbnails;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import cn.itsource.eloan.core.service.ILoginInfoService;
import cn.itsource.eloan.core.utils.ResultJSON;
import cn.itsource.eloan.core.utils.UserContext;
import cn.itsource.eloan.uiweb.controller.util.excelQJD.ExcelFactory;
import cn.itsource.eloan.uiweb.controller.util.excelQJD.ExportProjectInfoEntity;

@Controller
public class ExcelOutController {

	
		@RequestMapping("/excel")
		public String excel(HttpServletRequest request ,HttpServletResponse response){
			return "excel/excel";
		}
		@RequestMapping("/excelOut")
		public void excelOut(HttpServletRequest request ,HttpServletResponse response){
			System.out.println("333333333333333333333333333333333");
			System.out.println(request.getParameter("name"));
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
		System.out.println("===============================================");
		if(list.size() > 0){
			List<Object> lists = new ArrayList<Object>();
			String[] title={"项目编号","项目类型","项目名称","会员名称","借款金额（元）","借款到期时间","借款期限（月）","年化利率（%）","还款方式","融资进度（%）","融资金额","投标开始时间","投标结束时间","项目状态","放款状态"};
			String[] titlesEn={"id","stypeName","projectTitle","psnName","amount","endDateStr","deadline","yearrate","repayWay","sprogress","salReady","startDateStr","endDateStr","loanStatu","statu"};
			fileName = "项目放款数据";
			boakName = "项目放款数据统计";
			System.out.println("==========1=====================================");
			if(list!=null){
	  			for(int i=0;i<list.size();i++){
	  				lists.add(list.get(i));
	  				System.out.println("=====2==========================================");
	  			}
	  		}
			System.out.println("========3=======================================");
			ExcelFactory.outExcel(title, titlesEn, lists, fileName, boakName,response);
		}
		
	}


}
