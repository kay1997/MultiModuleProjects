package za.ac.cput;


class Vehicle implements InsuranceCover {

    @Override
    public double coverAmount(double value) {

        double rate = 0.15;
        return value * rate;
    }
}
