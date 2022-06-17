package msd.usecase.view.model;

/**
 * Created by bhagat on 5/21/19.
 */
public class SecondQueryOutput {
    private String question;
    private int yearstart;

    private String gender;
    private double avg_data_value;

    public SecondQueryOutput() {
    }

    public SecondQueryOutput(String question, int yearstart, String gender, double avg_data_value) {
        this.question = question;
        this.yearstart = yearstart;
        this.gender = gender;
        this.avg_data_value = avg_data_value;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getYearstart() {
        return yearstart;
    }

    public void setYearstart(int yearstart) {
        this.yearstart = yearstart;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAvg_data_value() {
        return avg_data_value;
    }

    public void setAvg_data_value(double avg_data_value) {
        this.avg_data_value = avg_data_value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SecondQueryOutput)) return false;

        SecondQueryOutput that = (SecondQueryOutput) o;

        if (getYearstart() != that.getYearstart()) return false;
        if (Double.compare(that.getAvg_data_value(), getAvg_data_value()) != 0) return false;
        if (getQuestion() != null ? !getQuestion().equals(that.getQuestion()) : that.getQuestion() != null)
            return false;
        return getGender() != null ? getGender().equals(that.getGender()) : that.getGender() == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getQuestion() != null ? getQuestion().hashCode() : 0;
        result = 31 * result + getYearstart();
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        temp = Double.doubleToLongBits(getAvg_data_value());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SecondQueryOutput{" +
                "question='" + question + '\'' +
                ", yearstart=" + yearstart +
                ", gender='" + gender + '\'' +
                ", avg_data_value=" + avg_data_value +
                '}';
    }
}
