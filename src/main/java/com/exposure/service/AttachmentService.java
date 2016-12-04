package com.exposure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exposure.model.Attachment;
import com.exposure.repository.AttachmentRepository;

@Service
public class AttachmentService {
	@Autowired
	private AttachmentRepository attachmentRepo;
	
	public List<Attachment> getAttachments(long houseId){
		return attachmentRepo.findByHouseId(houseId);
	}
	
	public Iterable<Attachment> saveAttachments(List<Attachment> attachments){
		return attachmentRepo.save(attachments);
	}
}
