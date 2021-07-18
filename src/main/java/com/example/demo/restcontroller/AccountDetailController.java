package com.example.demo.restcontroller;

import com.example.demo.DTO.AccountDetailDTO;
import com.example.demo.entity.AccountDetail;

import org.hibernate.mapping.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accountDetails")
public class AccountDetailController {
    @Autowired
    private AccountDetailService accountDetailService;

    @Autowired
    private ModelMapper modelMapper;

    private AccountDetailDTO convertToDTO(AccountDetail accountDetail){
        AccountDetailDTO accountDetailDTO = modelMapper.map(accountDetail, AccountDetailDTO.class);
        accountDetailDTO.setFirstname(accountDetail.getfirstname());
        accountDetailDTO.setLastname(accountDetail.getlastname());
        accountDetailDTO.setRole(accountDetail.getrole());
        accountDetailDTO.setAge(accountDetail.getage());
        accountDetailDTO.setEmail(accountDetail.getemail());
        accountDetailDTO.setPhonenum(accountDetail.getphonenum());
        accountDetailDTO.setAddress(accountDetail.getaddress());
        return accountDetailDTO;
    }

    private AccountDetail convertToEntity(AccountDetailDTO accountDetailDTO){
        AccountDetail accountDetail = modelMapper.map(accountDetailDTO, AccountDetail.class);
        accountDetail.setfirstname(accountDetailDTO.getFirstname());
        accountDetail.setlastname(accountDetailDTO.getLastname());
        accountDetail.setrole(accountDetailDTO.getRole());
        accountDetail.setage(accountDetailDTO.getAge());
        accountDetail.setemail(accountDetailDTO.getEmail());
        accountDetail.setphonenum(accountDetailDTO.getPhonenum());
        accountDetail.setaddress(accountDetailDTO.getAddress());
        accountDetail.setAvatar(accountDetailDTO.getAvatar());
        return accountDetail;
    }

    @GetMapping("/accountdetails")
    List<AccountDetailDTO> all(){
        List<AccountDetail> accountDetails = 
    }
}
