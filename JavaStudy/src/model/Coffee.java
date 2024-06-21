package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Coffee {

		Integer coffee_id;
		String coffee_name;
		Integer coffe_price;
		
		public Coffee (Integer coffee_id, String coffee_name, Integer coffe_price) {
			this.coffee_id = coffee_id;
			this.coffee_name = coffee_name;
			this.coffe_price = coffe_price;
		}
		
		public Coffee(ResultSet rs) throws SQLException {

		coffee_id = rs.getInt(1);
		coffee_name = rs.getString(2);
		coffe_price = rs.getInt(3);
		}

		public Integer getCoffee_id() {
			return coffee_id;
		}
		public void setCoffee_id(Integer coffee_id) {
			this.coffee_id = coffee_id;
		}
		public String getCoffee_name() {
			return coffee_name;
		}
		public void setCoffee_name(String coffee_name) {
			this.coffee_name = coffee_name;
		}
		public Integer getCoffe_price() {
			return coffe_price;
		}
		public void setCoffe_price(Integer coffe_price) {
			this.coffe_price = coffe_price;
		}

		@Override
		public String toString() {
			return "Coffee2 [coffee_id=" + coffee_id + ", coffee_name=" + coffee_name + ", coffe_price=" + coffe_price
					+ "]";
		}
		
		
}


