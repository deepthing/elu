package com.liang.deng.util;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import org.junit.Test;


public class EMailUtil {
	private String mailhost;
	private String mailport;
	private String senderAddress;
	private String senderName;
	private String senderPassword;
	private String collectionAddress;
	private String CCAddress;

	public EMailUtil(String smtphost, String port, String address, String name, String password, String recevier,
			String cc) {
		this.mailhost = smtphost;
		// this.mailport = port;
		this.senderAddress = address;
		this.senderName = name;
		this.senderPassword = password;
		this.collectionAddress = recevier;
		this.CCAddress = cc;

	}

	@Test
	public void Send(String Subject, String Content) {
		try {
			/*
			 * 1. 得到session
			 */
			Properties props = new Properties();
			props.setProperty("mail.host", mailhost);
			props.setProperty("mail.port", mailport);
			props.setProperty("mail.smtp.auth", "true");

			Authenticator auth = new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					// return new PasswordAuthentication("physics_liang",
					// "dl1123581321");
					return new PasswordAuthentication(senderName, senderPassword);

				}
			};

			Session session = Session.getInstance(props, auth);

			/*
			 * 2. 创建MimeMessage
			 */
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(senderAddress));// 设置发件人
			List<String> collectionList = (List) Arrays.asList(collectionAddress.split("\\s*,\\s*"));

			for (int i = 0; i < collectionList.size(); i++) {
				msg.addRecipients(RecipientType.TO, collectionList.get(i));// 设置收件人
			}
			List<String> CCList = (List) Arrays.asList(CCAddress.split("\\s*,\\s*"));
			for (int i = 0; i < CCList.size(); i++) {
				msg.addRecipients(RecipientType.CC, CCList.get(i));// 设置抄送
			}

			msg.setSubject(Subject);
			msg.setContent(Content, "text/html;charset=utf-8");

			/*
			 * 3. 发
			 */
			Transport.send(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 带有附件的邮件！！！
	 */
	@Test
	public void SendWithAttchment(String Subject, String Content, List<String> attatchPath) {

		try {
			/*
			 * 1. 得到session
			 */
			Properties props = new Properties();
			props.setProperty("mail.host", mailhost);
			// props.setProperty("mail.port", mailport);
			props.setProperty("mail.smtp.auth", "true");

			Authenticator auth = new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(senderName, senderPassword);
				}
			};

			Session session = Session.getInstance(props, auth);

			/*
			 * 2. 创建MimeMessage
			 */
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(senderAddress));// 设置发件人
			List<String> collectionList = (List) Arrays.asList(collectionAddress.split("\\s*,\\s*"));
			for (int i = 0; i < collectionList.size(); i++) {
				msg.addRecipients(RecipientType.TO, collectionList.get(i));// 设置收件人
			}
			List<String> CCList = (List) Arrays.asList(CCAddress.split("\\s*,\\s*"));
			for (int i = 0; i < CCList.size(); i++) {
				msg.addRecipients(RecipientType.CC, CCList.get(i));// 设置抄送
			}

			msg.setSubject(Subject);

			////////////////////////////////////////////////////////
			/*
			 * 当发送包含附件的邮件时，邮件体就为多部件形式！ 1. 创建一个多部件的部件内容！MimeMultipart
			 * MimeMultipart就是一个集合，用来装载多个主体部件！ 2. 我们需要创建两个主体部件，一个是文本内容的，另一个是附件的。
			 * 主体部件叫MimeBodyPart 3. 把MimeMultipart设置给MimeMessage的内容！
			 */
			MimeMultipart list = new MimeMultipart();// 创建多部分内容

			// 创建MimeBodyPart
			MimeBodyPart part1 = new MimeBodyPart();
			// 设置主体部件的内容
			part1.setContent(Content, "text/html;charset=utf-8");
			// 把主体部件添加到集合中
			list.addBodyPart(part1);

			// 创建MimeBodyPart
			for (String attName : attatchPath) {
				MimeBodyPart part2 = new MimeBodyPart();
				part2.attachFile(new File(attName));// 设置附件的内容
				part2.setFileName(MimeUtility.encodeText(attName.substring(attatchPath.lastIndexOf("/") + 1)));// 设置显示的文件名称，其中encodeText用来处理中文乱码问题
				list.addBodyPart(part2);
			}
			
			msg.setContent(list);// 把它设置给邮件作为邮件的内容。

			////////////////////////////////////////////////////////

			/*
			 * 3. 发
			 */
			Transport.send(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
