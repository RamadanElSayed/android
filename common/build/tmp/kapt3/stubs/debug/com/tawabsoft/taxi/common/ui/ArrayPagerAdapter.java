package com.tawabsoft.taxi.common.ui;

import java.lang.System;

/**
 * ViewPager adapter that contain items passed from outside.
 * This is base class of other ArrayPagerAdapters in this library.
 *
 * @param <T> item type
 * </T>
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002+,B\u001b\b\u0017\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000\u00a2\u0006\u0002\u0010\u0005B\u0019\b\u0007\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0017J\u001b\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00152\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u001b\u001a\u00020\u00152\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\u0013\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0019\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001f\u001a\u00020\u0019J\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0013\u0010$\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u0000\u00a2\u0006\u0002\u0010%J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0016\u0010*\u001a\u00020\u00152\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R6\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/tawabsoft/taxi/common/ui/ArrayPagerAdapter;", "T", "Landroidx/viewpager/widget/PagerAdapter;", "items", "", "([Ljava/lang/Object;)V", "", "(Ljava/util/List;)V", "identifiedItemFactory", "Lcom/tawabsoft/taxi/common/ui/ArrayPagerAdapter$IdentifiedItemFactory;", "itemPositionChangeChecked", "Landroid/util/SparseBooleanArray;", "<set-?>", "Ljava/util/ArrayList;", "Lcom/tawabsoft/taxi/common/ui/ArrayPagerAdapter$IdentifiedItem;", "itemsWithId", "getItemsWithId", "()Ljava/util/ArrayList;", "lock", "", "add", "", "item", "(Ljava/lang/Object;)V", "index", "", "(ILjava/lang/Object;)V", "addAll", "clear", "getCount", "getItem", "position", "(I)Ljava/lang/Object;", "getItemPosition", "getItemWithId", "getItems", "getPosition", "(Ljava/lang/Object;)I", "instantiateItem", "container", "Landroid/view/ViewGroup;", "remove", "setItems", "IdentifiedItem", "IdentifiedItemFactory", "common_debug"})
public abstract class ArrayPagerAdapter<T extends java.lang.Object> extends androidx.viewpager.widget.PagerAdapter {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.tawabsoft.taxi.common.ui.ArrayPagerAdapter.IdentifiedItem<T>> itemsWithId;
    private final java.lang.Object lock = null;
    private final com.tawabsoft.taxi.common.ui.ArrayPagerAdapter.IdentifiedItemFactory<T> identifiedItemFactory = null;
    private android.util.SparseBooleanArray itemPositionChangeChecked;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.tawabsoft.taxi.common.ui.ArrayPagerAdapter.IdentifiedItem<T>> getItemsWithId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position) {
        return null;
    }
    
    /**
     * Adds the specified item at the end of the array.
     *
     * @param item The item to add at the end of the array.
     */
    public final void add(T item) {
    }
    
    /**
     * Adds the specified item at the specified position of the array.
     *
     * @param item The item to add at the specified position of the array.
     */
    public final void add(int index, T item) {
    }
    
    /**
     * Adds the specified items at the end of the array.
     *
     * @param items The items to add at the end of the array.
     */
    public final void addAll(@org.jetbrains.annotations.NotNull()
    T... items) {
    }
    
    /**
     * Adds the specified items at the end of the array.
     *
     * @param items The items to add at the end of the array.
     */
    public final void addAll(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> items) {
    }
    
    /**
     * Removes the specified item from the array.
     *
     * @param position The item position to be removed
     * @return true if this items was modified by this operation, false otherwise.
     * @throws IndexOutOfBoundsException if position < 0 || position >= getCount()
     */
    public void remove(int position) throws java.lang.IndexOutOfBoundsException {
    }
    
    /**
     * Remove all elements from the list.
     */
    public void clear() {
    }
    
    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     * data set.
     * @return The data at the specified position.
     */
    public final T getItem(int position) {
        return null;
    }
    
    /**
     * Returns the position of the specified item in the array.
     *
     * @param item The item to retrieve the position of.
     * @return The position of the specified item.
     */
    public final int getPosition(T item) {
        return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @java.lang.Override()
    public int getItemPosition(@org.jetbrains.annotations.NotNull()
    java.lang.Object item) {
        return 0;
    }
    
    /**
     * {@inheritDoc}
     */
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.ui.ArrayPagerAdapter.IdentifiedItem<T> getItemWithId(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> items) {
    }
    
    public ArrayPagerAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> items) {
        super();
    }
    
    public ArrayPagerAdapter() {
        super();
    }
    
    @java.lang.SafeVarargs()
    public ArrayPagerAdapter(@org.jetbrains.annotations.NotNull()
    T... items) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\b\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\tJ-\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u000b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\r\"\u00028\u0001H\u0007\u00a2\u0006\u0002\u0010\u000eJ \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/tawabsoft/taxi/common/ui/ArrayPagerAdapter$IdentifiedItemFactory;", "T", "", "lastId", "", "(J)V", "create", "Lcom/tawabsoft/taxi/common/ui/ArrayPagerAdapter$IdentifiedItem;", "item", "(Ljava/lang/Object;)Lcom/tawabsoft/taxi/common/ui/ArrayPagerAdapter$IdentifiedItem;", "createList", "", "items", "", "([Ljava/lang/Object;)Ljava/util/Collection;", "Ljava/util/ArrayList;", "", "common_debug"})
    public static final class IdentifiedItemFactory<T extends java.lang.Object> {
        private long lastId;
        
        @org.jetbrains.annotations.NotNull()
        public final com.tawabsoft.taxi.common.ui.ArrayPagerAdapter.IdentifiedItem<T> create(T item) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.tawabsoft.taxi.common.ui.ArrayPagerAdapter.IdentifiedItem<T>> createList(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends T> items) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.SafeVarargs()
        public final java.util.Collection<com.tawabsoft.taxi.common.ui.ArrayPagerAdapter.IdentifiedItem<T>> createList(@org.jetbrains.annotations.NotNull()
        T... items) {
            return null;
        }
        
        public IdentifiedItemFactory(long lastId) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u00028\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/tawabsoft/taxi/common/ui/ArrayPagerAdapter$IdentifiedItem;", "T", "", "id", "", "item", "(JLjava/lang/Object;)V", "getId", "()J", "setId", "(J)V", "getItem", "()Ljava/lang/Object;", "setItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "toString", "", "common_debug"})
    public static final class IdentifiedItem<T extends java.lang.Object> {
        private long id;
        private T item;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public final long getId() {
            return 0L;
        }
        
        public final void setId(long p0) {
        }
        
        public final T getItem() {
            return null;
        }
        
        public final void setItem(T p0) {
        }
        
        public IdentifiedItem(long id, T item) {
            super();
        }
    }
}