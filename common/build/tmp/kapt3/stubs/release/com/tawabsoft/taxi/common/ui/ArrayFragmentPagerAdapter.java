package com.tawabsoft.taxi.common.ui;

import java.lang.System;

/**
 * ViewPager adapter that handles Fragments and items.
 * You can use this adapter if there is a few number of pages and no need to save states (or implement by yourself).
 * Subclasses of this class just need to implement getFragment() and return a fragment associated with position and item.
 * @param <T> item type
 * </T>
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 &*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001&B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007\"\u00028\u0000\u00a2\u0006\u0002\u0010\bB!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0017J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J!\u0010\u001a\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0015\u001a\u00020\u0016H&\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J \u0010%\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/tawabsoft/taxi/common/ui/ArrayFragmentPagerAdapter;", "T", "Lcom/tawabsoft/taxi/common/ui/ArrayPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "items", "", "(Landroidx/fragment/app/FragmentManager;[Ljava/lang/Object;)V", "", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "currentPrimaryItem", "Landroidx/fragment/app/Fragment;", "currentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "fragmentManager", "clear", "", "destroyItem", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "finishUpdate", "getFragment", "item", "(Ljava/lang/Object;I)Landroidx/fragment/app/Fragment;", "getItemId", "", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "remove", "setPrimaryItem", "Companion", "common_release"})
public abstract class ArrayFragmentPagerAdapter<T extends java.lang.Object> extends com.tawabsoft.taxi.common.ui.ArrayPagerAdapter<T> {
    private androidx.fragment.app.FragmentManager fragmentManager;
    private androidx.fragment.app.FragmentTransaction currentTransaction;
    private androidx.fragment.app.Fragment currentPrimaryItem;
    private static final java.lang.String TAG = "FragmentPagerAdapter";
    private static final boolean DEBUG = true;
    public static final com.tawabsoft.taxi.common.ui.ArrayFragmentPagerAdapter.Companion Companion = null;
    
    /**
     * Return the Fragment associated with a specified position and item.
     * @param item item of this page.
     * @param position position of this page.
     * @return fragment that represent this page.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.fragment.app.Fragment getFragment(@org.jetbrains.annotations.Nullable()
    T item, int position);
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"CommitTransaction"})
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CommitTransaction"})
    @java.lang.Override()
    public void destroyItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
    }
    
    @android.annotation.SuppressLint(value = {"CommitTransaction"})
    @java.lang.Override()
    public void remove(int position) throws java.lang.IndexOutOfBoundsException {
    }
    
    @android.annotation.SuppressLint(value = {"CommitTransaction"})
    @java.lang.Override()
    public void clear() {
    }
    
    @java.lang.Override()
    public void setPrimaryItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
    }
    
    @java.lang.Override()
    public void finishUpdate(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container) {
    }
    
    @java.lang.Override()
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
        return false;
    }
    
    private final long getItemId(int position) {
        return 0L;
    }
    
    public ArrayFragmentPagerAdapter(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager fm) {
        super(null);
    }
    
    public ArrayFragmentPagerAdapter(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
    T... items) {
        super(null);
    }
    
    public ArrayFragmentPagerAdapter(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentManager fm, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> items) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/tawabsoft/taxi/common/ui/ArrayFragmentPagerAdapter$Companion;", "", "()V", "DEBUG", "", "TAG", "", "makeFragmentName", "id", "", "common_release"})
    public static final class Companion {
        
        private final java.lang.String makeFragmentName(long id) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}