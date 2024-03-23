class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

fun copyaddress(address: Address) {
    val newAddress = Address()
    newAddress.name = address.name
    newAddress.street = address.street
    newAddress.city = address.city
    newAddress.state = address.state
    newAddress.zip = address.zip

    return newAddress
}

//getter and setter