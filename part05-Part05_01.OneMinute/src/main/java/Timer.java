public class Timer {
        private ClockHand msec;
        private ClockHand sec;
        
        public Timer(){
            this.msec = new ClockHand(100);
            this.sec = new ClockHand(60);
            
        }
        public String toString(){
            return sec + ":" + msec;
        }
        public void advance(){
            this.msec.advance();
            if(this.msec.value() == 0){
                this.sec.advance();
            }
        }
}
