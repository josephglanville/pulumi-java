// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetManagedDatabaseManagedDatabaseGroup {
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the Managed Database Group resides.
     * 
     */
    private final String compartmentId;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
     * 
     */
    private final String id;
    /**
     * @return The name of the Managed Database.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetManagedDatabaseManagedDatabaseGroup(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name) {
        this.compartmentId = compartmentId;
        this.id = id;
        this.name = name;
    }

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the Managed Database Group resides.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the Managed Database.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseManagedDatabaseGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseManagedDatabaseGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetManagedDatabaseManagedDatabaseGroup build() {
            return new GetManagedDatabaseManagedDatabaseGroup(compartmentId, id, name);
        }
    }
}
