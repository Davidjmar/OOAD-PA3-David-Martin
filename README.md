# OOAD-PA3-David-Martin
Hardware Rental Store

Contributor: David Martin

**OO Patterns Proposed**
 - Instantiating tools -> Factory Pattern
 - Options -> Decorator Pattern
 - Recording events -> Observer Pattern
    - In this case the Point of Sale system will be the observer to the rentals and returns
 - Instantiating customers -> Factory Pattern

**Classes To Use**
- Rental (Rentals will be intialized by a customer, deprecate the tool inventory, and store the return date)
    self.tools (number limited by the customer.type)
    self.options (add randomly -> 0 to six options)
    self.daysRented (number limited by the customer.type)
    self.totalCost (call price of tool and sum the array)
- Customer (Customers will monitor the customer id, tools rented, type of customer, the due dates of each rental)
    self.Id
    self.customerType
        Regular: *3-5 nights rent(random pick)  *1-3 tools(random pick)
        Casual: *1-2 nights rent(random pick)   *1-2 tools(random pick)
        Business: *7 nights *3 tools
    self.activeRentals
        Total rentals set by customer type
- Day (day will be an observer that monitors the events of each day, i.e. rentals bought/returned, etc..)
- Tools (Tools will monitor the tools in inventory and be randomly assigned to )
- Price (price will inherit from tools and set the price based on the kind of tool)
- Simulator (this will be the main point to run the program from)

Each day simulated the program will:
        The program will:
        - Print the day number
        - Count and list the tools and options rentals returned
            - obviously it will also add these back into the array
        - Count and list the tools and options rentals opened and actively open
            1. The program will determine a random number of customers (limited by the availale tools to rent) to come in and rent
            2. Customers will make a rental in relation to their customer-type.
        - Count and list the tools remaining in the store and their names
        - The amount of money the store made that day
