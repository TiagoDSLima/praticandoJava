package model.services;

import java.time.LocalDate;
import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract crt,  int months) {
		double basicQuota = crt.getTotalValue() / months;
		for(int i = 1; i <= months; i++) {
			LocalDate dueDate = crt.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(interest + basicQuota);
			double quota = interest + basicQuota + fee;
			crt.getInstallments().add(new Installment(dueDate, quota));
		}
	}
}
