package com.myservice.employee

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1")
class EmployeeController {
    @GetMapping("/names")
    fun getEmployeeNames():String {
        var employeeList:List<String> = listOf("Sudip","Amit","somebody","morepeople")
        return employeeList.toString()
    }
}