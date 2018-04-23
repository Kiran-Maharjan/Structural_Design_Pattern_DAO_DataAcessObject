/*
 ---generic filter that be use for fitering male,female or teacher,student or.. 
 */
package com.kingkong.dataabstraction.filter;

import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author kiran
 */
public interface GenericFilter<T> {
    List<T> getFilter(List<T> coll);
}
