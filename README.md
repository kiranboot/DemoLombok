# DemoLombok

ARCH Types
starter project
-web
-lombok


Addedd Address VO and Address Controller under Address package


Tried with below annotations from lombok on Address VO

@Data
@AllArgsConstructor
@NoArgsConstructor

and below Annotation on AddressController for logging

@Log


1. Problem: 
   End points were not reachable even after starting the boot server successfully.
   In the Debug mode break point were not working.
   
Sol.
   Address package should be next to DemoLombokApplication.java file
   
   and while startinger boot server in the log you should get Mapped 
   
   and all the endpoints you have given in the controller.
