package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.DTO.SaleDTO;
import com.devsuperior.dsvendas.DTO.SaleSuccessDTO;
import com.devsuperior.dsvendas.DTO.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class SaleService {

   @Autowired
   private SaleRepository saleRepository;

   @Autowired
   private SellerRepository sellerRepository;

   @Transactional(readOnly = true)
   public Page<SaleDTO> findAll(Pageable pageable){
       sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
   }

   @Transactional(readOnly = true)
   public List<SaleSumDTO> amountGroupedBySeller(){
      return saleRepository.amountGroupedBySeller();

    }
    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return saleRepository.successGroupedBySeller();

    }

}
