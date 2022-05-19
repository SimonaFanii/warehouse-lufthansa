package com.sha.springbootjwtauthorization.controller;

import com.sha.springbootjwtauthorization.model.Purchase;
import com.sha.springbootjwtauthorization.security.UserPrincipal;
import com.sha.springbootjwtauthorization.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase") //pre-path
public class PurchaseController
{
    @Autowired
    private PurchaseService purchaseService;


    @PostMapping //api/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase)
    {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping //api/purchase
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrinciple)
    {
        return ResponseEntity.ok(purchaseService.findPurchaseItemsOfUser(userPrinciple.getId()));
    }}