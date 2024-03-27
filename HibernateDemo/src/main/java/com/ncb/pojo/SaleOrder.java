/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ncb.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
       
/**
 *
 * @author ncanh
 */
@Entity
@Table(name = "sale_order")    
@Getter
@Setter
public class SaleOrder implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String create_date;
    private String user_id;
    
//    @OneToMany(mappedBy = "sale_order",
//            fetch = FetchType.LAZY)
//    private Set<OrderDetail> orderdetails;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
