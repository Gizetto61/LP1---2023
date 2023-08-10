public class Lembretes extends Eventos
{
    public Lembretes(int diastart, int diaend, String horariostart, String horarioend)
    {
        super(diastart, diaend, horariostart, horarioend);
    }

    @Override
    public int getDiastart()
    {
        return super.getDiastart();
    }

    @Override
    public void setDiastart(int diastart)
    {
        super.setDiastart(diastart);
    }

    @Override
    public int getDiaend()
    {
        return super.getDiaend();
    }

    @Override
    public void setDiaend(int diaend)
    {
        super.setDiaend(diaend);
    }

    @Override
    public String getHorariostart()
    {
        return super.getHorariostart();
    }

    @Override
    public void setHorariostart(String horariostart)
    {
        super.setHorariostart(horariostart);
    }

    @Override
    public String getHorarioend()
    {
        return super.getHorarioend();
    }

    @Override
    public void setHorarioend(String horarioend)
    {
        super.setHorarioend(horarioend);
    }
}
