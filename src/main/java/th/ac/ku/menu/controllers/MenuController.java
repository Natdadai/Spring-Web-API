package th.ac.ku.menu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.menu.models.Menu;
import th.ac.ku.menu.services.MenuService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<Menu> getAll(){
        return menuService.getAll();
    }

    @PostMapping
    public Menu create(@RequestBody Menu menu){
        return menuService.create(menu);
    }

    @GetMapping("/{id}")
    public Menu getMenuById(@PathVariable UUID id) {
        return menuService.getMenuById(id);
    }

    @PutMapping
    public Menu update(@RequestBody Menu menu) {
        return menuService.update(menu);
    }

    @DeleteMapping("/{id}")
    public Menu delete(@PathVariable UUID id) {
        return menuService.delete(id);
    }

    @GetMapping("/name/{name}")
    public Menu getMenuByName(@PathVariable String name) {
        return menuService.getMenuByName(name);
    }

    @GetMapping("/category/{category}")
    public List<Menu> getMenuByCategory(@PathVariable String category) {
        return menuService.getMenuByCategory(category);
    }
}
