package com.brightmarket.mailchimp.api.factory;

import com.brightmarket.mailchimp.api.model.ecommerce.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EntityFactory {

    public static Cart createCart(Customer customer, List<CartLine> lines) {

        Cart cart = new Cart();
        cart.setId(getARandomId());
        cart.setCustomer(customer);
        cart.setCurrencyCode("COP");
        cart.setOrderTotal(20D);
        cart.setLines(lines);

        return cart;
    }

    public static CartLine createCartLine(Product product) {
        CartLine cartLine = new CartLine();
        cartLine.setId(getARandomId());
        cartLine.setPrice(10D);
        cartLine.setProductId(product.getId());
        cartLine.setProductTitle(product.getTitle());
        cartLine.setProductVariantId(product.getVariants().get(0).getId());
        cartLine.setProductVariantTitle(product.getVariants().get(0).getTitle());
        cartLine.setQuantity(8L);
        return cartLine;
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

        customer.setId(getARandomId());
        customer.setFirstName("Ruth");
        customer.setLastName("Cramer");
        customer.setEmailAddress("nw3rwdionck@temporary-mail.net");
        customer.setOptInStatus(true);
        customer.setCompany("Lafayette Radio");
        customer.setAddress(address);

        return customer;
    }

    public static Product createProduct() {
        Product product = new Product();
        Variant variant = new Variant();
        List<Variant> variants = new ArrayList<>();
        String productId = getARandomId();

        product.setId(productId);
        product.setTitle("product " + productId + " title");
        product.setDescription("product " + productId + " description");

        variant.setId(product.getId());
        variant.setTitle(product.getTitle());

        variants.add(variant);

        product.setVariants(variants);

        return product;
    }

    public static Variant createProductVariant() {
        Variant variant = new Variant();
        String variantId = getARandomId();

        variant.setId(variantId);
        variant.setTitle("Variant " + variantId + " title");

        return variant;
    }

    private static String getARandomId() {
        return Integer.toString((int) (Math.random() * (700 - 1 + 1) + 1));
    }

}
