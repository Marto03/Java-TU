import javax.swing.JOptionPane;
public class Gui2Calc {
    public static void main(String[] args)
    {
        boolean flag = true;
        while(flag == true)
        {
            float x = Float.parseFloat(JOptionPane.showInputDialog("Enter number 1: "));

            float y = Float.parseFloat(JOptionPane.showInputDialog("Enter number 2: "));
            String option = JOptionPane.showInputDialog("Enter option:\n");
            switch (option) {
                case "+":
                    JOptionPane.showMessageDialog(null, x+y);//("x+y ="+x+y+'='+(x+y));
                    break;
                    
                case "-":
                    JOptionPane.showMessageDialog(null, x-y);
                    break;
                case "*":
                    JOptionPane.showMessageDialog(null, x*y);
                    break;
                case "/":
                    if(x == 0 || y == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Cant divide by 0!");
                        break;
                    }
                
                    JOptionPane.showMessageDialog(null, x/y);
                default:
                flag = false;
                    break;
            }
        }
        
        //Scanner scanner = new Scanner(System.in);
        //JOptionPane.showInternalOptionDialog();
        //JOptionPane.showMessageDialog(null, "You are "+age+" years old");

    }
}

