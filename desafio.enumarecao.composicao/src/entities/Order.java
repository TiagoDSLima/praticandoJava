package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		private Date moment;
		private OrderStatus orderStatus;
		
		private List<OrderItem> orderItems = new ArrayList<>();
		private Client client;
		
		public Order(Date moment, OrderStatus orderStatus, Client client) {
			this.moment = moment;
			this.orderStatus = orderStatus;
			this.client = client;
		}

		public Date getMoment() {
			return moment;
		}

		public void setMoment(Date moment) {
			this.moment = moment;
		}

		public OrderStatus getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(OrderStatus orderStatus) {
			this.orderStatus = orderStatus;
		}

		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}
		
		public void addItems(OrderItem orderItem) {
			orderItems.add(orderItem);
		}
		
		public void removeItems(OrderItem orderItem) {
			orderItems.remove(orderItem);
		}
		
		public double total() {
			double sum = 0;
			for(OrderItem orderItem : orderItems) {
				sum += orderItem.subTotal();
			}
			return sum;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Order moment: ");
			sb.append(sdf.format(moment));
			sb.append("\nOrder Status: ");
			sb.append(orderStatus);
			sb.append("\nClient: " );
			sb.append(client);
			sb.append("Total items: \n");
			for(OrderItem orderItem : orderItems) {
				sb.append(orderItem + "\n");
			}
			sb.append("\nTotal price: $");
			sb.append(String.format("%.2f", total()));
			return sb.toString();
		}
		
		
}
