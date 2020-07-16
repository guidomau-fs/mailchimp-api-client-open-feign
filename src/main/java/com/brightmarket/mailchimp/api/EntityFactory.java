package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.model.ecommerce.Cart;
import com.brightmarket.mailchimp.api.model.ecommerce.CartLine;
import com.brightmarket.mailchimp.api.model.ecommerce.Customer;
import com.brightmarket.mailchimp.api.model.ecommerce.OrderAddress;

import java.util.List;

public class EntityFactory {

    public static OrderAddress createOrderAddress() {

        OrderAddress orderAddress = new OrderAddress();
        orderAddress.setAddress1("address1");
        orderAddress.setAddress2("address2");
        orderAddress.setCity("Bogota");
        orderAddress.setProvince("Cundinamarca");
        orderAddress.setProvinceCode("CUN");
        orderAddress.setProvince("000000");
        orderAddress.setCountry("Colombia");
        orderAddress.setCountryCode("CO");

        return orderAddress;
    }

    public static Customer createCustomer(OrderAddress orderAddress) {

        Customer customer = new Customer();
        customer.setId("1");
        customer.setEmailAddress("john.doe@gmail.com");
        customer.setOptInStatus(true);
        customer.setCompany("Home");
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setOrdersCount(0L);
        customer.setTotalSpent(0D);
        customer.setAddress(orderAddress);

        return customer;
    }

    public static Cart createCart(Customer customer, List<CartLine> lines) {

        Cart cart = new Cart();
        cart.setId("1");
        cart.setCustomer(customer);
        cart.setCurrencyCode("COP");
        cart.setOrderTotal(20D);
        cart.setLines(lines);

        return cart;
    }
}
