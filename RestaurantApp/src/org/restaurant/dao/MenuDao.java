
package org.restaurant.dao;

import java.util.List;
import org.restaurant.model.Menu;

/**
 *
 * @author Administrator
 */
public interface MenuDao {
    
    public void addMenu();
    public List<Menu> getAllMenu();
    public void deleteMenu();
}
