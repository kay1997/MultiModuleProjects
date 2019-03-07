package za.ac.cput;


 class Home implements InsuranceCover {

    @Override
    public double coverAmount(double value) {

        double rate = 0.16;
        return value * rate;
    }
 }
