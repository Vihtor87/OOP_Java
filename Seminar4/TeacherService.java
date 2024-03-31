import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private List<Teacher> teacherList;
    private Integer maxTeacherId = 0;
    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }
    @Override
    public void initData(List<Teacher> list) {
        this.teacherList = list;
        maxTeacherId = getNewMaxTeacherId();
    }
    @Override
    public void create(String firstName, String lastName, String meddleName) {
        Teacher teacher = new Teacher(++maxTeacherId, firstName, lastName, meddleName);
        teacherList.add(teacher);
    }
    public void editTeacher(Integer teacherId, String firstName, String lastName, String meddleName){
        for (Teacher teacher: teacherList) {
            if (teacher.getTeacherId().equals(teacherId)){
                teacher.setFirstName(firstName);
                teacher.setLastName(lastName);
                teacher.setMeddleName(meddleName);
            }
        }
    }
    private Integer getNewMaxTeacherId(){
        Integer result = teacherList.get(0).getTeacherId();
        for (Teacher teacher: teacherList) {
            if (result < teacher.getTeacherId()){
                result = teacher.getTeacherId();
            }
        }
        return result;
    }
}
