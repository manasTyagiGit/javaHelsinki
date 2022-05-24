public class Grade 
{
    private int totalStudents, totalMarks, passingStudents, passingMarks;   
    private float passingAverage, passPerc, average;
    
    
    public Grade (int n, int s, int p, int ps)
    {
        this.average = 0;
        this.totalMarks = s;
        this.totalStudents = n;
        this.passingStudents = p;
        this.passingMarks = ps;
    }

    public float calcAverage ()
    {
        this.average = this.totalMarks / this.totalStudents;
        return this.average;
    }

    public float calcPassingAverage ()
    {
        if (this.passingStudents == 0)
        {
            return 0;
        }
        
        this.passingAverage = this.passingMarks / this.passingStudents;
        return this.passingAverage;
    }

    public float calcPassPerc ()
    {
        if (this.passingStudents == 0)
        {
            return 0.0f;
        }

        this.passPerc = 100 * passingStudents / totalStudents;
        return passPerc;
    }
}
