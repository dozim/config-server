# Config-Server

This is a sample project how to configure a Spring-Cloud-Config Server and consuming it with a client.

## Server

The config-server support two profiles one for external git servers and one for accessing a local file.

Basic Auth: admin:password  
Can be overriden with (Note: The same variables are used for the client)  
config-server.credentials.username  
config-server.credentials.password  

### Profile Native 
* The profile can be activated with -Dspring.profiles.active=native
* It loads the project-folder config-repo
* The folder can be changed with the variable: $config-server.config-folder

### Profile Extern
* The profile can be activated with -Dspring.profiles.active=extern
* Set the following variables config-server.git .username .password .uri to a Git-Server

## Client

### Profile dev
* The profile can be activated with -Dspring.profiles.active=dev
* It works with the server profiles: native and extern

#### Profile independent
* The profile can be activated with -Dspring.profiles.active=independent
* To test the client without a config-server

### Profile production
* The profile can be activated with -Dspring.profiles.active=production
* TODO


