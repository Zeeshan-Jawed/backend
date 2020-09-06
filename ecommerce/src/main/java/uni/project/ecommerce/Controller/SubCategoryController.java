//package uni.project.ecommerce.Controller;
//import org.springframework.web.bind.annotation.*;
//import uni.project.ecommerce.DTO.SubCategoryDTO;
//import uni.project.ecommerce.Model.SubCategory;
//import uni.project.ecommerce.Service.SubCategoryService;
//
//import java.util.Set;
//
//@RestController
//@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
//@RequestMapping(value = "/api/subcategory")
//public class SubCategoryController {
//    private final SubCategoryService subCategoryService;
//
//    public SubCategoryController(SubCategoryService subCategoryService) {
//        this.subCategoryService = subCategoryService;
//    }
//
//
//    @PostMapping(value = "/")
//    public String saveSubCategory(@RequestBody SubCategoryDTO subCategoryDTO){
//        return subCategoryService.save(subCategoryDTO);
//    }
//    @GetMapping(value="/")
//    public Set<SubCategory> getSubCategory(){
//        return subCategoryService.findAll();
//    }
//    @GetMapping(value = "/{id}")
//    public SubCategory getAppUserById(@PathVariable("id") Long id){
//        return subCategoryService.findById(id);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public String deleteSubCategoryById(@PathVariable("id") Long id){
//        subCategoryService.deleteById(id);
//        return "Record Deleted";
//    }
//    @PutMapping("/{id}")
//    public String updateSubCategory(@PathVariable("id") Long id , @RequestBody SubCategoryDTO subCategoryDTO ){
//        return subCategoryService.update(id ,subCategoryDTO);
//    }
//}
