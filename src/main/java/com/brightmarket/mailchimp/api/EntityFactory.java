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
}
