package com.felipemendes.cursospring.services.email;

import org.springframework.mail.SimpleMailMessage;

import com.felipemendes.cursospring.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
