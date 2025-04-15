package com.SCF.SupplyChain.utility;

import java.io.BufferedWriter;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.opensymphony.xwork2.ActionSupport;


public class CommonAction extends ActionSupport  {
	private static final Logger log = LoggerFactory.getLogger(CommonAction.class);

	private static final long serialVersionUID = 1L;

	

	/*
	 * public JavaMailSender getMailSender() { return mailSender; } public void
	 * setMailSender(JavaMailSender mailSender) { this.mailSender = mailSender; }
	 */

	public String getDatetime() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
		String today_date = dateFormat.format(date);
		return today_date;
	}

	public String getDateTimeStamp() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_hh_m_ss");
		String today_date = dateFormat.format(date);
		return today_date;
	}

	public String getYesterday() {
		Date ydate = getDayBefore(new Date());
		DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
		String yesdate = dateFormat.format(ydate);
		return yesdate;
	}

	public static Date getDayBefore(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -30);
		return cal.getTime();
	}

	public void enctrace(String message) {
		FileWriter fstream = null;
		BufferedWriter prewriter = null;
		// Properties prop = getCommonDescProperty();
		try {
			String logprefix = "SQL_BPESA_";
			String strfiledir = getText("log.sql.location");
			// log.debug( "strfiledir : " + strfiledir );
			String logfilename = logprefix + getDatetime() + ".log";
			File nwfile = new File(strfiledir + "/" + logfilename);
			// log.debug( "nwfile : " + nwfile );
			File logfiledir = new File(strfiledir);
			if (logfiledir.exists()) {
				if (!nwfile.exists()) {
					nwfile.createNewFile();
				}
			} else {
				log.debug("COULD NOT UNDERSTAND THE LOG FILE PATH SPECIEFIED [ " + strfiledir + " ] ");
			}
			String yesterdaydate = getYesterday();
			String existfilename = strfiledir + logprefix + yesterdaydate + ".log";
			File f = new File(existfilename);
			if (f.exists()) {
				f.delete();
				log.debug("file_name  " + existfilename + " DELETED SUCCESSFULLY");
			}
			fstream = new FileWriter(nwfile, true);
			prewriter = new BufferedWriter(fstream);
			prewriter.write(getDateTimeStamp() + ":" + message + "\n"); // Base64.encode( getDateTimeStamp() + ":" +
																		// message+"\n");
			prewriter.close();
		} catch (Exception e) {
			// log.debug("Exception : " + e.getMessage());
			log.debug("Exception in enctrace - Common Action: ");
		} finally {
			try {
				fstream.close();
				prewriter.close();
			} catch (Exception e) {
			}
		}
	}

	public void trace(String message) {
		FileWriter fstream = null;
		BufferedWriter prewriter = null;
		// Properties prop = getCommonDescProperty();
		try {
			String logprefix = "BPESA_";
			String strfiledir = getText("log.file.location");
			// log.debug( "strfiledir : " + strfiledir );
			String logfilename = logprefix + getDatetime() + ".log";
			File nwfile = new File(strfiledir + "/" + logfilename);
			// log.debug( "nwfile : " + nwfile );
			File logfiledir = new File(strfiledir);
			if (logfiledir.exists()) {
				if (!nwfile.exists()) {
					nwfile.createNewFile();
				}
			} else {
				log.debug("COULD NOT UNDERSTAND THE LOG FILE PATH SPECIEFIED [ " + strfiledir + " ] ");
			}
			String yesterdaydate = getYesterday();
			String existfilename = strfiledir + logprefix + yesterdaydate + ".log";
			File f = new File(existfilename);
			if (f.exists()) {
				f.delete();
				log.debug("file_name  " + existfilename + " DELETED SUCCESSFULLY");
			}
			fstream = new FileWriter(nwfile, true);
			prewriter = new BufferedWriter(fstream);
			prewriter.write(getDateTimeStamp() + ":" + message + "\n");
			prewriter.close();
		} catch (Exception e) {
			log.debug("Exception : " + e.getMessage());
		} finally {
			try {
				fstream.close();
				prewriter.close();
			} catch (Exception e) {
			}
		}
	}

	String sid = "";
	/*
	 * public void addSessionintrace(DataSource dataSource,JdbcTemplate
	 * jdbcTemplate,HttpSession session){ try { String
	 * query_getuserdatils="SELECT SID FROM V$SESSION WHERE AUDSID = SYS_CONTEXT('USERENV','SESSIONID')"
	 * ; String sid = (String) jdbcTemplate.queryForObject(query_getuserdatils,
	 * String.class); String ipAddress = getRequest().getHeader("X-FORWARDED-FOR");
	 * trace(" The IP ADDERESS IS ======> "+ipAddress); if (ipAddress == null) {
	 * trace( " IP ADDRESS is NULL "); ipAddress = getRequest().getRemoteAddr();
	 * trace( " ipAddress = request.getRemoteAddr() ===> "+ipAddress); }
	 * trace("$$$$$$$$$$$$$$$$$  User ID : "+session.getAttribute("USERID")
	 * +"      Session Id  : "+
	 * sid+"   App-accessing-IP : "+ipAddress+"  $$$$$$$$$$$$$$$");
	 * enctrace("$$$$$$$$$$$$$$$$$  User ID : "+session.getAttribute("USERID")
	 * +"      Session Id  : "+
	 * sid+"   App-accessing-IP : "+ipAddress+"     Access Time   "+getDateTimeStamp
	 * ()+"  $$$$$$$$$$$$$$$"); } catch(Exception e){ log.debug("Exception : " +
	 * e.getMessage()); } }
	
	 */
	
	
	
	
	
	
	
	

	public DecimalFormat numberFormatter() {
		String strfiledir = getText("number.format");
		DecimalFormat d = new DecimalFormat(strfiledir);
		return d;

	}
	
	
	
	
	
	
	
	
	

	/*
	 * public DecimalFormat numberFormatter(String curalphacode, JdbcTemplate
	 * jdbctemplate){ String strfiledir = getText("number.format"); String currency
	 * = getCurrencyAlphaCode(curalphacode,jdbctemplate); DecimalFormat d = new
	 * DecimalFormat("'"+currency+" '"+strfiledir); return d;
	 * 
	 * }
	 */
	/*
	 * public String currencyFormatter( String curcode, JdbcTemplate jdbctemplate ){
	 * String curalphacode = this.getCurrencyAlphaCode(curcode, jdbctemplate);
	 * DecimalFormat d = new DecimalFormat("'"+curalphacode+" '0.00"); String
	 * currencyamt = d.toString(); return currencyamt;
	 * 
	 * }
	 */

	/*
	 * public String getCurrencyAlphaCode( String curalphacode, JdbcTemplate
	 * jdbctemplate) { String curcode = "NOREC"; try { String curcodenumeral =
	 * "SELECT CURRENCY_CODE FROM IFP_GLOBAL_CURRENCY WHERE  CURRENCY_CODE='"
	 * +curalphacode+"' OR NUMERIC_CODE='"+curalphacode+"'";
	 * enctrace("curcodenumeral : " + curcodenumeral ); curcode =
	 * (String)jdbctemplate.queryForObject(curcodenumeral, String.class); } catch
	 * (DataAccessException e) {
	 * 
	 * e.printStackTrace(); return curcode; }
	 * 
	 * return curcode; }
	 */

	
	
	public void log(String message) {
		// log.debug( "log msg :" +message);
		Properties prop = new Properties();
		File nwfile = null, logfiledir = null;
		try {
			prop = this.getProp("Config.properties", prop);
			String strfiledir = prop.getProperty("log.location");
			// String logfilename = prop.getProperty("service.logfilename");
			String logfilename = "WEBSERVICE_" + getDate() + ".log";// getText("service.logfilename");

			nwfile = new File(strfiledir + "/" + logfilename);
			logfiledir = new File(strfiledir);
			if (logfiledir.exists()) {
				if (!nwfile.exists()) {
					nwfile.createNewFile();
				}
			} else {
				log.debug("COULD NOT UNDERSTAND THE LOG FILE PATH SPECIEFIED [ " + strfiledir + " ] ");
			}

			FileWriter fstream = new FileWriter(nwfile, true);
			BufferedWriter prewriter = new BufferedWriter(fstream);
			prewriter.write(getDateTimeStamp() + ":" + message + "\n");
			prewriter.close();
			fstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			nwfile = null;
			logfiledir = null;
		}

	}

	public void Alllog(String message) {
		// log.debug( "log msg :" +message);
		Properties prop = new Properties();
		File nwfile = null, logfiledir = null;
		try {
			prop = this.getProp("Config.properties", prop);
			String strfiledir = prop.getProperty("Alllog.location");
			// String logfilename = prop.getProperty("service.logfilename");
			String logfilename = "All_" + getDate() + ".log";// getText("service.logfilename");

			nwfile = new File(strfiledir + "/" + logfilename);
			logfiledir = new File(strfiledir);
			if (logfiledir.exists()) {
				if (!nwfile.exists()) {
					nwfile.createNewFile();
				}
			} else {
				log.debug("COULD NOT UNDERSTAND THE LOG FILE PATH SPECIEFIED [ " + strfiledir + " ] ");
			}

			FileWriter fstream = new FileWriter(nwfile, true);
			BufferedWriter prewriter = new BufferedWriter(fstream);
			prewriter.write(getDateTimeStamp() + ":" + message + "\n");
			prewriter.close();
			fstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			nwfile = null;
			logfiledir = null;
		}

	}

	public void sqllog(String message) {
		Properties prop = new Properties();
		try {
			prop = this.getProp("Config.properties", prop);
			String strfiledir = prop.getProperty("sqllog.location");
			// String logfilename = prop.getProperty("service.logfilename");
			String logfilename = "WS_SQL_" + getDate() + ".log";// getText("service.logfilename");

			File nwfile = new File(strfiledir + "/" + logfilename);
			File logfiledir = new File(strfiledir);
			if (logfiledir.exists()) {
				if (!nwfile.exists()) {
					nwfile.createNewFile();
				}
			} else {
				log.debug("COULD NOT UNDERSTAND THE LOG FILE PATH SPECIEFIED [ " + strfiledir + " ] ");
			}

			FileWriter fstream = new FileWriter(nwfile, true);
			BufferedWriter prewriter = new BufferedWriter(fstream);
			prewriter.write(getDateTimeStamp() + ":" + message + "\n");
			prewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getDate() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String today_date = dateFormat.format(date);
		return today_date;
	}

	public Properties getProp(String filename, Properties prop) {
		InputStream is = null;
		try {
			is = this.getClass().getClassLoader().getResourceAsStream(filename);
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (Exception te) {
				log.debug("COULD NOT CLOSED FILE..." + te.getMessage());
			}
			;
		}
		return prop;
	}

	public Properties getProp(String filename) {
		InputStream is = null;
		Properties prop = new Properties();
		try {
			is = this.getClass().getClassLoader().getResourceAsStream(filename);
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (Exception te) {
				log.debug("COULD NOT CLOSED FILE..." + te.getMessage());
			}
			;
		}
		return prop;
	}

	public void isolog(String message) {
		// log.debug( "log msg :" +message);

		try {

			// Properties prop = getCommonDescProperty();
			// String strfiledir
			// ="/home/remittance/IFP_LOGS/portal";//prop.getProperty("service.logdir");

			// String strfiledir =getText("service.logfilename"); //"C:\\IFP_LOGS\\";
			Properties prop = getProp("Config.properties");

			String strfiledir = prop.getProperty("isolog.location");
			// log.debug("Getting obsolute java path : " + strfiledir );
			String logfilename = "ISOAUTO_" + getDate() + ".log";//

			File nwfile = new File(strfiledir + "/" + logfilename);
			File logfiledir = new File(strfiledir);
			if (logfiledir.exists()) {
				if (!nwfile.exists()) {
					nwfile.createNewFile();
				}
			} else {
				log.debug("COULD NOT UNDERSTAND THE LOG FILE PATH SPECIEFIED [ " + strfiledir + " ] ");
			}

			FileWriter fstream = new FileWriter(nwfile, true);
			BufferedWriter prewriter = new BufferedWriter(fstream);
			prewriter.write(getDateTimeStamp() + ":" + message + "\n");
			if (prewriter != null) {
				prewriter.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}



