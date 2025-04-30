package dev.renting.delegations;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;


@DynamoDbBean
public class Delegation {
    private String delegationId;
    private String operations;
    private String name;
    private String address;
    private String city;
    private int availableCarQty;
    private String phone;
    private String email;

    @DynamoDbPartitionKey
    public String getDelegationId() { return delegationId; }
    public void setDelegationId(String delegationId) { this.delegationId = delegationId; }

    @DynamoDbSortKey
    public String getOperations() {return operations;}
    public void setOperations(String operations) {this.operations = operations;}


    @DynamoDbAttribute("name")
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @DynamoDbAttribute("addtress")
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @DynamoDbAttribute("city")
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    @DynamoDbAttribute("availableCarQty")
    public int getAvailableCarQty() { return availableCarQty; }
    public void setAvailableCarQty(int availableCarQty){ this.availableCarQty = availableCarQty; }

    @DynamoDbAttribute("phone")
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @DynamoDbAttribute("email")
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
