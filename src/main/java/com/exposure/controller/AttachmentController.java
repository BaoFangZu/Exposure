package com.exposure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exposure.model.Attachment;
import com.exposure.service.AttachmentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "附件管理")
@RestController
@RequestMapping("/attachments")
public class AttachmentController {

	@Autowired
	private AttachmentService attachmentService;
	
	
	@ApiOperation("创建一个附件")
	@RequestMapping(method=RequestMethod.POST)
	public Iterable<Attachment> saveAttachments(@RequestBody List<Attachment> attachments){
		return attachmentService.saveAttachments(attachments);
	}
	
	@ApiOperation("获取附件附件")
	@RequestMapping(method=RequestMethod.GET)
	public List<Attachment> findAttachments(@RequestParam("house_id") long houseId){
		return attachmentService.getAttachments(houseId);
	}
}
