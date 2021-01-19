import javax.annotation.processing.Generated;

@Entity
@Table (name = "order")

public class order {

    @Column (name = "order_id")
    @Id
    @GeneratedValue
    private Integer id;

    @Column (name = "order_producto")
    private Product product;

    @Column (name = "order_cant")
    private Integer cant;

    @Column (name = "total")
    private Integer total;

public void addPedido(){


}

public Order findOrderById (int id){
     return Order;
}

public void deleteOrder (Order order){

    
}




}
