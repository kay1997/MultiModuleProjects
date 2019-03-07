package za.ac.cput;


 class Business implements InsuranceCover {

    @Override
    public double coverAmount(double value) {

        double rate = 0.2;
        return value * rate;
    }
 }
