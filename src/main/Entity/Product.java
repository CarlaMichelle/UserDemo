import java.lang.invoke.InjectedProfile;

import jdk.internal.jline.internal.TestAccessible;

@Entity
@Table (name = "product")

public class product {

@Column (name = "product_id")
@Id
@GeneratedValue

private int id;

@Column (name = "product_name")
private String name;

@Column (name = "product_detail")
private String detail;

public void addProducto (){

}

public Product findByName (String name){

    return product;

}

public List<Product> findAllProduct (){

}

public void updateProduct (Product producto){

}



}