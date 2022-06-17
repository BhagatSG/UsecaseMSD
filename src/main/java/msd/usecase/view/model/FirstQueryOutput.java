package msd.usecase.view.model;

/**
 * Created by bhagat on 5/20/19.
 */

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "first_query_output")
public class FirstQueryOutput {

    private String question;
    private int yearstart;

    private String age_in_months;
    private double avg_data_value;

    public FirstQueryOutput() {
    }

    public FirstQueryOutput(String question, int yearstart, String age_in_months, double avg_data_value) {
        this.question = question;
        this.yearstart = yearstart;
        this.age_in_months = age_in_months;
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

    public String getAge_in_months() {
        return age_in_months;
    }

    public void setAge_in_months(String age_in_months) {
        this.age_in_months = age_in_months;
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
        if (!(o instanceof FirstQueryOutput)) return false;

        FirstQueryOutput that = (FirstQueryOutput) o;

        if (getYearstart() != that.getYearstart()) return false;
        if (Double.compare(that.getAvg_data_value(), getAvg_data_value()) != 0) return false;
        if (getQuestion() != null ? !getQuestion().equals(that.getQuestion()) : that.getQuestion() != null)
            return false;
        return getAge_in_months() != null ? getAge_in_months().equals(that.getAge_in_months()) : that.getAge_in_months() == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getQuestion() != null ? getQuestion().hashCode() : 0;
        result = 31 * result + getYearstart();
        result = 31 * result + (getAge_in_months() != null ? getAge_in_months().hashCode() : 0);
        temp = Double.doubleToLongBits(getAvg_data_value());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "FirstQueryOutput{" +
                "question='" + question + '\'' +
                ", yearstart=" + yearstart +
                ", age_in_months='" + age_in_months + '\'' +
                ", avg_data_value=" + avg_data_value +
                '}';
    }
}
