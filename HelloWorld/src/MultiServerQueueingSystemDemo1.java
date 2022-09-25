
import java.io.*;
import java.util.Random;
import javax.swing.*;
 

public class MultiServerQueueingSystemDemo1 {
    
static ServerDemo server1;
static ServerDemo server2;
static Random random;
static int direct_out = 0;
 
public static void main(String[] args)throws IOException
{
server1 = new ServerDemo();
server2 = new ServerDemo();
server1.mean_interarrival=Double.valueOf(JOptionPane.showInputDialog("Enter Mean Interarrival time:"));
 
server1.mean_service=Double.valueOf(JOptionPane.showInputDialog("Enter Mean Service time of server1:"));
server2.mean_service=Double.valueOf(JOptionPane.showInputDialog("Enter Mean Service time of server2:"));
 
int total_customer = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Customer:"));
 
System.out.println("Single-server queueing system\n");
System.out.println("Mean interarrival time  "+server1.mean_interarrival+" minutes\n");
System.out.println("Mean service time of server1 "+server1.mean_service+" minutes\n");
System.out.println("Mean service time of server2 "+server2.mean_service+" minutes\n");
System.out.println("Number of customer  "+ total_customer + "\n\n");
 
random = new Random(total_customer);
 
server1.initialize();
server2.initialize();
 
int option = JOptionPane.showConfirmDialog(null, "Are you want to end by simulation time?\nIf No it simulated by total customer.");
 
if(option==1)
{
while(server1.num_custs_delayed < total_customer)
server1_activity();
while(server2.num_in_q > 0)
server2.depart();
}
else if(option==0)
{
double sim_time = Double.valueOf(JOptionPane.showInputDialog("Enter simulation time:"));
while(server2.sim_time < sim_time)
server1_activity();
}
else
{
System.exit(0);
}
 
System.out.println("\n\nReport for server 1:\n--------------------\n");
server1.report();
System.out.println("\n\nReport for server 2:\n--------------------\n");
server2.report();
System.out.println("\n\nTime simulation ended "+ (server2.sim_time) +"\n");
System.out.println("Avarage waiting time in system "+ (server2.sim_time / server1.num_custs_delayed) +"\n");
}
 
private static void server1_activity()
{
server1.timing();
 
server1.update_time_avg_stats();
 
switch (server1.next_event_type)
{
case 1: server1.arrive(server1.sim_time+expon(server1.mean_interarrival));
break;
case 2: server1.depart();
if(random.nextDouble() <= 0.3)
server2_activity(server1.sim_time);
}
}
 
private static void server2_activity(double time)
{
server2.timing();
 
server2.update_time_avg_stats();
 
switch (server2.next_event_type)
{
case 1: server2.arrive(time);
break;
case 2: server2.depart();
server2_activity(time);
}
}
 
static double expon(double  mean)
{
return -mean * Math.log(random.nextDouble());
}
}
