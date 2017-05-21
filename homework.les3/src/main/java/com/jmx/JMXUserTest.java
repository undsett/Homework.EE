package com.jmx;

import com.service.IUserService;
import com.service.UserService;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class JMXUserTest {
    public static void main(String[] args) throws NotCompliantMBeanException, MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {
        new User();
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        StandardMBean userService =
                new StandardMBean(new UserService(), IUserService.class);
        ObjectName userServiceObjectName = new ObjectName("user_service:name=user-service");
        server.registerMBean(userService, userServiceObjectName);

        Thread.sleep(Long.MAX_VALUE);
    }
}
