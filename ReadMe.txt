JBoss Fuse Camel-Salesforce Connector DEMO
======================================================
This is a simple Camel Spring demo, to test login, query, and upsert into an Account Object in Salesforce using an External Id.

Setup and configuration
-----------------------

* Clone or download the project.

* Import into JDBS

* Goto project folder, under src/main/resources, find the salesforcedemo.properties file, and replace loginConfig parameters with your own values from Salesforce Deverloper org.
(See my blog for more detail: http://maggiechu-jboss.blogspot.com/2015/02/jboss-fuse-connecting-to-salesforce.html)
 
```
1. loginUrl
2. userName
3. password
4. clientId
5. clientSecret
```

* Right-click on src/main/resources/META-INF/spring/camel-context.xml -> Run As -> Local Camel Context (without tests)

