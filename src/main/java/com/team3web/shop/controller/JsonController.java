package com.team3web.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.team3web.shop.vo.ProductVO;

@Controller
public class JsonController {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
   
    public String getProducts(Model model) {
        // 쇼핑몰 제품 정보를 생성 (예시로 사용)
        List<ProductVO> products = createProducts();

        // 제품 정보를 JSP 파일로 전달
        model.addAttribute("products", products);

        // 제품 목록을 표시할 JSP 파일 이름 반환
        return "index"; // product.jsp 파일을 참조
    }

    private List<ProductVO> createProducts() {
        List<ProductVO> products = new ArrayList<>();
        // 여기에 쇼핑몰 제품 정보 생성 로직을 추가하세요.
        // 예를 들어, 데이터베이스에서 정보를 조회하거나 하드코딩한 정보를 사용할 수 있습니다.
        // 아래는 예시 데이터를 생성하는 코드입니다.
        
        for (int i = 1; i <= 4; i++) {
            ProductVO product = new ProductVO();
            product.setProductId(i);
            product.setName("Product " + i);
            product.setPrice(1000 * i);
            product.setStock(10);
            product.setImageUrl("/resources/img/men/amen" + i + ".png");
            product.setPcode("P00" + i);
            products.add(product);
        }

        return products;
    }
    
    

}




