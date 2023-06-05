package com.payment.service;

import com.payment.model.PaymentRequest;
import com.payment.model.PaymentResponse;

public interface PaymentService {

	 long doPayment(PaymentRequest paymentRequest);

	    PaymentResponse getPaymentDetailsByOrderId(String orderId);

}
