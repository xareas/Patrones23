package responsabilidad.Iterador;

/**
 * Created by xareas on 7/3/16.
 */
public class Arts implements  ISubject {

    private String[] subjects;

    public Arts() {
       subjects = new String[10];
        subjects[0]="Bengali";
        subjects[1] ="English";
        subjects[2] ="Nicaragua";
        subjects[3] ="Guatemala";
        subjects[4] ="CostaRica";
        subjects[5] ="Panama";
        subjects[6] ="Ecuador";
        subjects[7] ="Argentina";
        subjects[8] ="Brasil";
        subjects[9] ="El Salvador";

    }

    @Override
    public IIterator createIterator() {
        return new ArtsIterator(subjects);
    }


    private class ArtsIterator implements IIterator {

        private String[] subjects;
        private int position;
        public ArtsIterator(String[] subjects) {
            this.subjects = subjects;
            position =0;
        }

        @Override
        public void first() {
            position=0;
        }

        @Override
        public String next() {
           return subjects[position++];
        }

        @Override
        public boolean isDone() {
           return  position>= subjects.length;
        }

        @Override
        public String currentItem() {
            return subjects[position];
        }
    }
}
