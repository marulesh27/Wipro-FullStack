package Day5;

class GetPropertyDemo{
public static void main (String[] args) {
String userhome= System. getProperty ("user.home");
String javaversion = System.getProperty ("java.version");
String javahome = System.getProperty ("java.home") ;
String classpath = System.getProperty ("java.class path") ;
String osname = System.getProperty ("os.name") ;
String username = System.getProperty ("user. name") ;
String userdir = System.getProperty ("user.dir") ;
System.out.println ("The user home directory is "+userhome) ;
System.out.println ("The java version is "+javaversion) ;
System.out.println ("The Java Home directory is "+javahome) ;
System.out.println ("The class path is set to "+classpath) ;
System.out.println ("The Operating System is "+osname) ;
System.out.println ("The user name is "+username) ;
System.out.println ("The working directory is "+userdir);

}
}
