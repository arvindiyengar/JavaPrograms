import java.rmi.*;

public interface MyServerIntf1 extends Remote
{
	double sub(double a, double b) throws RemoteException;
}
