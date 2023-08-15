Design pattern
We can use the Decorator design pattern for our car rental system. We can design it using the following decorators:

Discount decorator: It can be used to apply discounts to all types of vehicles in our car rental system.

Peak season decorator: It can be used to increase the fare of all types of vehicles in our car rental system.

Damage fine decorator: When the vehicle is returned, this decorator can help in calculating the fine due to car damage.

Partially filled fuel tank fine decorator: When the vehicle is returned, this decorator can help calculate the fine due to the partially filled fuel tank.

Similarly, we can make several other decorators according to the system needs. These decorator fulfill the SRP and OCP design principles.