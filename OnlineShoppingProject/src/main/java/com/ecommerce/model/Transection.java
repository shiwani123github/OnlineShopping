package com.ecommerce.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "transection")
	public class Transection {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private int transectionId;
		private Date date;
		private int total;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getTransectionId() {
			return transectionId;
		}

		public void setTransectionId(int transectionId) {
			this.transectionId = transectionId;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}
}
