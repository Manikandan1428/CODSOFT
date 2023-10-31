import javax.swing.*;
import java.awt.event.*;
class Grade implements ActionListener{
    JTextField sub1,sub2,sub3,sub4,sub5,dis;
    JLabel sub1L,sub2L,sub3L,sub4L,sub5L,disL;
    JButton avg,total,grad;

    Grade(){
        JFrame frame= new JFrame("Student grade calculator");

        sub1L = new JLabel("Enter social mark:");
        sub1L.setBounds(50, 50, 300, 20);

        sub1 = new JTextField();
        sub1.setBounds(250, 50, 200, 20);

        sub2L = new JLabel("Enter English mark:");
        sub2L.setBounds(50, 100, 350, 20);

        sub2 = new JTextField();
        sub2.setBounds(250, 100, 200, 20);

        sub3L = new JLabel("Enter the maths mark:");
        sub3L.setBounds(50, 150, 350, 20);

        sub3 = new JTextField();
        sub3.setBounds(250, 150, 200, 20);

        sub4L = new JLabel("Enter the Science mark:");
        sub4L.setBounds(50, 200, 350, 20);

        sub4 = new JTextField();
        sub4.setBounds(250, 200, 200, 20);

        sub5L = new JLabel("Enter Comp sci mark:");
        sub5L.setBounds(50, 250, 350, 20);

        sub5 = new JTextField();
        sub5.setBounds(250, 250, 200, 20);

        disL = new JLabel("Your Results:");
        disL.setBounds(50, 300, 350, 20);

        dis = new JTextField();
        dis.setEditable(false);   
        dis.setBounds(250, 300, 200, 20);

        //buttons
        avg = new JButton("AvG");
        avg.setBounds(50, 400,100 , 30);
        avg.addActionListener(this);

        total = new JButton("Total");
        total.setBounds(200, 400,100 , 30);
        total.addActionListener(this);

        grad = new JButton("Grade");
        grad.setBounds(350, 400,100 , 30);
        grad.addActionListener(this);

        
        frame.add(sub1L);frame.add(sub2L);frame.add(sub3L);frame.add(sub4L);frame.add(sub5L);frame.add(disL);
        frame.add(sub1);frame.add(sub2);frame.add(sub3);frame.add(sub4);frame.add(sub5);frame.add(dis);
        frame.add(avg);frame.add(total);frame.add(grad);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }


    public void actionPerformed (ActionEvent e){
        String s1= sub1.getText();
        String s2= sub2.getText();
        String s3= sub3.getText();
        String s4= sub4.getText();
        String s5= sub5.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int d = Integer.parseInt(s4);
        int g = Integer.parseInt(s5);

        int f=0;
        String grade;
        
        if(e.getSource()==avg){
            f=(a+b+c+d+g)/5;
            String resu=String.valueOf(f);
            dis.setText(resu);
        }
        else if(e.getSource()==total){
            f=(a+b+c+d+g);
            String resu=String.valueOf(f);
            dis.setText(resu);
        }
        else if(e.getSource()==grad){
            f=(a+b+c+d+g)/5;
            if (f>90) {
                grade = "A";
            }
            else if(f>80){
                grade="B";
            }
             else if(f>70){
                grade="C";
             }
             else if(f>60){
                grade="D";
             }
             else if(f>50){
                grade="E";
             }
             else{
                grade = "F";
             }
            
            dis.setText(grade);
        
            } 
        
    }
    public static void main(String[] args) {
       new Grade();
    }
}


