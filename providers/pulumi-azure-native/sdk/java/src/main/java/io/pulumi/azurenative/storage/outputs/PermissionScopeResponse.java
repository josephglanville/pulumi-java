// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PermissionScopeResponse {
    /**
     * The permissions for the local user. Possible values include: Read (r), Write (w), Delete (d), List (l), and Create (c).
     * 
     */
    private final String permissions;
    /**
     * The name of resource, normally the container name or the file share name, used by the local user.
     * 
     */
    private final String resourceName;
    /**
     * The service used by the local user, e.g. blob, file.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private PermissionScopeResponse(
        @CustomType.Parameter("permissions") String permissions,
        @CustomType.Parameter("resourceName") String resourceName,
        @CustomType.Parameter("service") String service) {
        this.permissions = permissions;
        this.resourceName = resourceName;
        this.service = service;
    }

    /**
     * The permissions for the local user. Possible values include: Read (r), Write (w), Delete (d), List (l), and Create (c).
     * 
    */
    public String getPermissions() {
        return this.permissions;
    }
    /**
     * The name of resource, normally the container name or the file share name, used by the local user.
     * 
    */
    public String getPropResourceName() {
        return this.resourceName;
    }
    /**
     * The service used by the local user, e.g. blob, file.
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String permissions;
        private String resourceName;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.resourceName = defaults.resourceName;
    	      this.service = defaults.service;
        }

        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public PermissionScopeResponse build() {
            return new PermissionScopeResponse(permissions, resourceName, service);
        }
    }
}
