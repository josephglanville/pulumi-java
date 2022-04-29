// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetManagedDatabaseUserRoleItem {
    /**
     * @return Indicates whether the role is granted with the ADMIN OPTION (YES) or not (NO).
     * 
     */
    private final String adminOption;
    /**
     * @return Indicates how the role was granted. Possible values: YES if the role is granted commonly (CONTAINER=ALL is used) NO if the role is granted locally (CONTAINER=ALL is not used)
     * 
     */
    private final String common;
    /**
     * @return Indicates whether the role is designated as a DEFAULT ROLE for the user (YES) or not (NO).
     * 
     */
    private final String defaultRole;
    /**
     * @return Indicates whether the role is granted with the DELEGATE OPTION (YES) or not (NO).
     * 
     */
    private final String delegateOption;
    /**
     * @return Indicates whether the granted role is inherited from another container (YES) or not (NO).
     * 
     */
    private final String inherited;
    /**
     * @return A filter to return only resources that match the entire name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetManagedDatabaseUserRoleItem(
        @CustomType.Parameter("adminOption") String adminOption,
        @CustomType.Parameter("common") String common,
        @CustomType.Parameter("defaultRole") String defaultRole,
        @CustomType.Parameter("delegateOption") String delegateOption,
        @CustomType.Parameter("inherited") String inherited,
        @CustomType.Parameter("name") String name) {
        this.adminOption = adminOption;
        this.common = common;
        this.defaultRole = defaultRole;
        this.delegateOption = delegateOption;
        this.inherited = inherited;
        this.name = name;
    }

    /**
     * @return Indicates whether the role is granted with the ADMIN OPTION (YES) or not (NO).
     * 
     */
    public String adminOption() {
        return this.adminOption;
    }
    /**
     * @return Indicates how the role was granted. Possible values: YES if the role is granted commonly (CONTAINER=ALL is used) NO if the role is granted locally (CONTAINER=ALL is not used)
     * 
     */
    public String common() {
        return this.common;
    }
    /**
     * @return Indicates whether the role is designated as a DEFAULT ROLE for the user (YES) or not (NO).
     * 
     */
    public String defaultRole() {
        return this.defaultRole;
    }
    /**
     * @return Indicates whether the role is granted with the DELEGATE OPTION (YES) or not (NO).
     * 
     */
    public String delegateOption() {
        return this.delegateOption;
    }
    /**
     * @return Indicates whether the granted role is inherited from another container (YES) or not (NO).
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

    public static Builder builder(GetManagedDatabaseUserRoleItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adminOption;
        private String common;
        private String defaultRole;
        private String delegateOption;
        private String inherited;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseUserRoleItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminOption = defaults.adminOption;
    	      this.common = defaults.common;
    	      this.defaultRole = defaults.defaultRole;
    	      this.delegateOption = defaults.delegateOption;
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
        public Builder defaultRole(String defaultRole) {
            this.defaultRole = Objects.requireNonNull(defaultRole);
            return this;
        }
        public Builder delegateOption(String delegateOption) {
            this.delegateOption = Objects.requireNonNull(delegateOption);
            return this;
        }
        public Builder inherited(String inherited) {
            this.inherited = Objects.requireNonNull(inherited);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetManagedDatabaseUserRoleItem build() {
            return new GetManagedDatabaseUserRoleItem(adminOption, common, defaultRole, delegateOption, inherited, name);
        }
    }
}
