public class Getter_Setter {

        public static void main(String args[]){
            Pen p1= new Pen(); 
            p1.setColor("red");
            System.out.println(p1.getColor());
            p1.setTip(5);
            System.out.println(p1.getTip());


            //  here we set a  color value  , eith the help og setter function
            p1.setColor("yello");
            System.out.println(p1.getColor());
    
        }
    }
    
    class Pen{
        private  String color;
        private  int tip;
    

        // this isgetter fiunction , this function help us to get the private color  value in main function 

        void setColor(String newcolor){
            color=newcolor;
        }

        String getColor(){
            return  this.color;
        }

        //  this is alse a getter function
        int getTip(){
            return  this.tip;
        }
    // this is setter function this function help use to set the vlaue of pivate access specifire 

        // 
        void setTip(int tip){
            this.tip=tip;
        }
    
    }

    

