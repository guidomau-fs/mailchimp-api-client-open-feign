package com.brightmarket.mailchimp.api.factory;

import com.brightmarket.mailchimp.api.model.ecommerce.*;
import com.brightmarket.mailchimp.api.model.ecommerce.Order.TrackingCode;
import com.brightmarket.mailchimp.api.model.lists.CampaignDefaults;
import com.brightmarket.mailchimp.api.model.lists.Contact;

import java.util.ArrayList;
import java.util.List;


public class EntityFactory {

    public static com.brightmarket.mailchimp.api.model.lists.List createList() {
        com.brightmarket.mailchimp.api.model.lists.List list
                = new com.brightmarket.mailchimp.api.model.lists.List();

        list.setId(getARandomId());
        list.setBeamerAddress("No se");
        list.setEmailTypeOption(false);
        list.setDoubleOptin(false);
        list.setHasWelcome(false);
        list.setName("MyList");
        list.setPermissionReminder("sas");

        Contact contact = new Contact();
        contact.setAddress1("122");
        contact.setAddress2("23");
        contact.setCity("BOG");
        contact.setCompany("HOME");
        contact.setCountry("CO");
        contact.setPhone("5555555");
        contact.setState("NY");
        contact.setZip("0000000");
        list.setContact(contact);

        CampaignDefaults campaignDefaults = new CampaignDefaults();
        campaignDefaults.setFromEmail("nose@yah.com");
        campaignDefaults.setFromName("No se");
        campaignDefaults.setLanguage("Es");
        campaignDefaults.setSubject("Ola");
        list.setCampaignDefaults(campaignDefaults);

        return list;
    }

    public static Store createStore(com.brightmarket.mailchimp.api.model.lists.List list) {
        Store store = new Store();
        store.setId(getARandomId());
        store.setCurrencyCode("COP");
        store.setDomain("hola.com");
        store.setEmailAddress("guido@hola.com");
        store.setIsSyncing(true);
        store.setListId(list.getId());
        store.setListIsActive(false);
        store.setName("Guido");
        store.setPhone("3002851254");

        return store;
    }

    public static OrderLine createOrderLine(Product product) {
        OrderLine orderLine = new OrderLine();
        orderLine.setId(getARandomId());
        orderLine.setDiscount(1D);
        orderLine.setPrice(100d);
        orderLine.setProductId(product.getId());
        orderLine.setProductTitle(product.getTitle());
        orderLine.setProductVariantId(product.getVariants().get(0).getId());
        orderLine.setProductVariantTitle(product.getVariants().get(0).getTitle());
        orderLine.setQuantity(100l);
        return orderLine;
    }

    public static Order createOrder(Customer customer, List<OrderLine> lines) {

        Order order = new Order();
        order.setId(getARandomId());
        order.setCustomer(customer);
        order.setCurrencyCode("COP");
        order.setOrderTotal(10D);
        order.setLines(lines);
        order.setTrackingCode(TrackingCode.PREC);

        return order;
    }

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
