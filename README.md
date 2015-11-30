# apache-openaz

## Quick Instructions for Jetty 8

1.  Copy xacml directory to /opt/xacml

    $ cp -r xacml /opt/xacml

2.  Create three empty installations of Jetty 8:

    * /opt/jetty8-pap-admin
    * /opt/jetty8-pap-rest
    * /opt/jetty8-pdp-rest

3.  Configure Jetty ports

    *   /opt/jetty8-pap-admin/etc/jetty.xml

        &lt;Set name="port">&lt;Property name="jetty.port" default="9999"/>&lt;/Set>  
        &lt;Set name="confidentialPort">9998&lt;/Set>

    *   /opt/jetty8-pap-rest/etc/jetty.xml

        &lt;Set name="port">&lt;Property name="jetty.port" default="9090"/>&lt;/Set>  
        &lt;Set name="confidentialPort">9091&lt;/Set>

    *   /opt/jetty8-pdp-rest/etc/jetty.xml

        &lt;Set name="port">&lt;Property name="jetty.port" default="8080"/>&lt;/Set>  
        &lt;Set name="confidentialPort">8081&lt;/Set>

4.  Install Maven

5.  From the base source directory (containing this file), run the build command:

    $ mvn package

6.  Copy war files into Jetty webapp directories

    $ cp --force openaz-xacml-pap-admin/target/openaz-xacml-pap-admin-0.0.1-SNAPSHOT.war /opt/jetty8-pap-admin/webapps/admin.war  
    $ cp --force openaz-xacml-pap-rest/target/openaz-xacml-pap-rest-0.0.1-SNAPSHOT.war /opt/jetty8-pap-rest/webapps/pap.war  
    $ cp --force openaz-xacml-pdp-rest/target/openaz-xacml-pdp-rest-0.0.1-SNAPSHOT.war /opt/jetty8-pdp-rest/webapps/pdp.war  

7.  Run each Jetty server

