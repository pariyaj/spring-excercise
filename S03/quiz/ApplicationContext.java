<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">
    
    <bean id="bankIranService" class="ir.freeland.spring.selectbean.service.BSIBankiranServices"></bean>
    

  <context:annotation-config/>
  <context:component-scan base-package="ir.freeland.spring.selectbean"/>
</beans>
