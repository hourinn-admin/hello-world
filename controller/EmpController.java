public class EmpController{
   private EmpService empService;
   public List<Emp> search(){
      return empService.search();
   }
}
