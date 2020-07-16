package com.brightmarket.mailchimp.api;

import com.brightmarket.mailchimp.api.model.ecommerce.Cart;
import com.brightmarket.mailchimp.api.model.ecommerce.CartLine;
import com.brightmarket.mailchimp.api.model.ecommerce.Customer;
import com.brightmarket.mailchimp.api.model.ecommerce.OrderAddress;

import java.util.List;

public class EntityFactory {

    public static Cart createCart(Customer customer, List<CartLine> lines) {

        Cart cart = new Cart();
        cart.setId("1");
        cart.setCustomer(customer);
        cart.setCurrencyCode("COP");
        cart.setOrderTotal(20D);
        cart.setLines(lines);

        return cart;
    }

    public static Customer createCustomer() {
        Customer customer = new Customer();
        OrderAddress address = new OrderAddress();

        address.setAddress1("2728  Clair Street");
        address.setCity("Waco");
        address.setProvince("Texas");
        address.setProvinceCode("TX");
        address.setCountryCode("US");
        address.setPostalCode("76710");

        customer.setId("1");
        customer.setFirstName("Ruth");
        customer.setLastName("Cramer");
        customer.setEmailAddress("nw3rwdionck@temporary-mail.net");
        customer.setOptInStatus(true);
        customer.setCompany("Lafayette Radio");
        customer.setAddress(address);

        return customer;
    }
}
