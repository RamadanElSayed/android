package com.tawabsoft.taxi.driver.activities.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0002FGB\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020\'2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020\'2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002042\u0006\u00108\u001a\u000209H\u0016J+\u0010:\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010>\u001a\u00020?H\u0016\u00a2\u0006\u0002\u0010@J\u0010\u0010A\u001a\u00020\'2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u0010B\u001a\u00020\'2\b\u0010C\u001a\u0004\u0018\u00010DJ\b\u0010E\u001a\u00020\'H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR.\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/profile/ProfileActivity;", "Lcom/tawabsoft/taxi/common/components/BaseActivity;", "Lcom/tawabsoft/taxi/driver/activities/profile/adapters/ServicesRecyclerViewAdapter$OnServiceItemInteractionListener;", "()V", "binding", "Lcom/tawabsoft/taxi/driver/databinding/ActivityEditProfileBinding;", "getBinding", "()Lcom/tawabsoft/taxi/driver/databinding/ActivityEditProfileBinding;", "setBinding", "(Lcom/tawabsoft/taxi/driver/databinding/ActivityEditProfileBinding;)V", "documents", "Ljava/util/ArrayList;", "Lcom/tawabsoft/taxi/common/models/Media;", "Lkotlin/collections/ArrayList;", "getDocuments", "()Ljava/util/ArrayList;", "setDocuments", "(Ljava/util/ArrayList;)V", "documentsRecyclerViewAdapter", "Lcom/tawabsoft/taxi/driver/activities/profile/adapters/DocumentsRecyclerViewAdapter;", "getDocumentsRecyclerViewAdapter", "()Lcom/tawabsoft/taxi/driver/activities/profile/adapters/DocumentsRecyclerViewAdapter;", "setDocumentsRecyclerViewAdapter", "(Lcom/tawabsoft/taxi/driver/activities/profile/adapters/DocumentsRecyclerViewAdapter;)V", "driver", "Lcom/tawabsoft/taxi/common/models/Driver;", "getDriver", "()Lcom/tawabsoft/taxi/common/models/Driver;", "setDriver", "(Lcom/tawabsoft/taxi/common/models/Driver;)V", "imageToUpload", "Lcom/tawabsoft/taxi/driver/activities/profile/ProfileActivity$ImageToUpload;", "getImageToUpload", "()Lcom/tawabsoft/taxi/driver/activities/profile/ProfileActivity$ImageToUpload;", "setImageToUpload", "(Lcom/tawabsoft/taxi/driver/activities/profile/ProfileActivity$ImageToUpload;)V", "onProfileImageClicked", "Landroid/view/View$OnClickListener;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onChecked", "service", "Lcom/tawabsoft/taxi/common/models/Service;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onUnchecked", "onUploadDocument", "view", "Landroid/view/View;", "openPicker", "ImageToUpload", "UploadDocument", "driver_release"})
public final class ProfileActivity extends com.tawabsoft.taxi.common.components.BaseActivity implements com.tawabsoft.taxi.driver.activities.profile.adapters.ServicesRecyclerViewAdapter.OnServiceItemInteractionListener {
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.driver.databinding.ActivityEditProfileBinding binding;
    @org.jetbrains.annotations.NotNull()
    public com.tawabsoft.taxi.common.models.Driver driver;
    @org.jetbrains.annotations.NotNull()
    private com.tawabsoft.taxi.driver.activities.profile.ProfileActivity.ImageToUpload imageToUpload = com.tawabsoft.taxi.driver.activities.profile.ProfileActivity.ImageToUpload.profile;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.tawabsoft.taxi.common.models.Media> documents;
    @org.jetbrains.annotations.Nullable()
    private com.tawabsoft.taxi.driver.activities.profile.adapters.DocumentsRecyclerViewAdapter documentsRecyclerViewAdapter;
    private android.view.View.OnClickListener onProfileImageClicked;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.driver.databinding.ActivityEditProfileBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.driver.databinding.ActivityEditProfileBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.common.models.Driver getDriver() {
        return null;
    }
    
    public final void setDriver(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Driver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tawabsoft.taxi.driver.activities.profile.ProfileActivity.ImageToUpload getImageToUpload() {
        return null;
    }
    
    public final void setImageToUpload(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.driver.activities.profile.ProfileActivity.ImageToUpload p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.tawabsoft.taxi.common.models.Media> getDocuments() {
        return null;
    }
    
    public final void setDocuments(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.tawabsoft.taxi.common.models.Media> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tawabsoft.taxi.driver.activities.profile.adapters.DocumentsRecyclerViewAdapter getDocumentsRecyclerViewAdapter() {
        return null;
    }
    
    public final void setDocumentsRecyclerViewAdapter(@org.jetbrains.annotations.Nullable()
    com.tawabsoft.taxi.driver.activities.profile.adapters.DocumentsRecyclerViewAdapter p0) {
    }
    
    @java.lang.Override()
    public void onChecked(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service service) {
    }
    
    @java.lang.Override()
    public void onUnchecked(@org.jetbrains.annotations.NotNull()
    com.tawabsoft.taxi.common.models.Service service) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void openPicker() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void onUploadDocument(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public ProfileActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/profile/ProfileActivity$ImageToUpload;", "", "(Ljava/lang/String;I)V", "profile", "document", "driver_release"})
    public static enum ImageToUpload {
        /*public static final*/ profile /* = new profile() */,
        /*public static final*/ document /* = new document() */;
        
        ImageToUpload() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0007\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014J\b\u0010\f\u001a\u00020\nH\u0014J!\u0010\r\u001a\u00020\n2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003H\u0014\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/tawabsoft/taxi/driver/activities/profile/ProfileActivity$UploadDocument;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "(Lcom/tawabsoft/taxi/driver/activities/profile/ProfileActivity;)V", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/lang/String;", "onPostExecute", "", "result", "onPreExecute", "onProgressUpdate", "values", "([Ljava/lang/Void;)V", "driver_release"})
    final class UploadDocument extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.String> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.String doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.NotNull()
        java.lang.String result) {
        }
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @java.lang.Override()
        protected void onProgressUpdate(@org.jetbrains.annotations.NotNull()
        java.lang.Void... values) {
        }
        
        public UploadDocument() {
            super();
        }
    }
}