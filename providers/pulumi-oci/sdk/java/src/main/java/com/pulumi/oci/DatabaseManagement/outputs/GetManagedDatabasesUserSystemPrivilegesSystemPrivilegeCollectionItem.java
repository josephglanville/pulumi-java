// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetManagedDatabasesUserSystemPrivilegesSystemPrivilegeCollectionItem {
    /**
     * @return Indicates whether the system privilege is granted with the ADMIN option (YES) or not (NO).
     * 
     */
    private final String adminOption;
    /**
     * @return Indicates how the system privilege was granted. Possible values: YES if the system privilege is granted commonly (CONTAINER=ALL is used) NO if the system privilege is granted locally (CONTAINER=ALL is not used)
     * 
     */
    private final String common;
    /**
     * @return Indicates whether the granted system privilege is inherited from another container (YES) or not (NO).
     * 
     */
    private final String inherited;
    /**
     * @return A filter to return only resources that match the entire name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetManagedDatabasesUserSystemPrivilegesSystemPrivilegeCollectionItem(
        @CustomType.Parameter("adminOption") String adminOption,
        @CustomType.Parameter("common") String common,
        @CustomType.Parameter("inherited") String inherited,
        @CustomType.Parameter("name") String name) {
        this.adminOption = adminOption;
        this.common = common;
        this.inherited = inherited;
        this.name = name;
    }

    /**
     * @return Indicates whether the system privilege is granted with the ADMIN option (YES) or not (NO).
     * 
     */
    public String adminOption() {
        return this.adminOption;
    }
    /**
     * @return Indicates how the system privilege was granted. Possible values: YES if the system privilege is granted commonly (CONTAINER=ALL is used) NO if the system privilege is granted locally (CONTAINER=ALL is not used)
     * 
     */
    public String common() {
        return this.common;
    }
    /**
     * @return Indicates whether the granted system privilege is inherited from another container (YES) or not (NO).
     * 
     */
    public String inherited() {
        return this.inherited;
    }
    /**
     * @return A filter to return only resources that match the entire name.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabasesUserSystemPrivilegesSystemPrivilegeCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adminOption;
        private String common;
        private String inherited;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabasesUserSystemPrivilegesSystemPrivilegeCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminOption = defaults.adminOption;
    	      this.common = defaults.common;
    	      this.inherited = defaults.inherited;
    	      this.name = defaults.name;
        }

        public Builder adminOption(String adminOption) {
            this.adminOption = Objects.requireNonNull(adminOption);
            return this;
        }
        public Builder common(String common) {
            this.common = Objects.requireNonNull(common);
            return this;
        }
        public Builder inherited(String inherited) {
            this.inherited = Objects.requireNonNull(inherited);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetManagedDatabasesUserSystemPrivilegesSystemPrivilegeCollectionItem build() {
            return new GetManagedDatabasesUserSystemPrivilegesSystemPrivilegeCollectionItem(adminOption, common, inherited, name);
        }
    }
}
