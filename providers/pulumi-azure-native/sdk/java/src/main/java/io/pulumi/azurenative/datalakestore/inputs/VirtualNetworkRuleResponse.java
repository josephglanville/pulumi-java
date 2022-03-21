// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Data Lake Store virtual network rule information.
 * 
 */
public final class VirtualNetworkRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkRuleResponse Empty = new VirtualNetworkRuleResponse();

    /**
     * The resource identifier.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The resource name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The resource identifier for the subnet.
     * 
     */
    @Import(name="subnetId", required=true)
      private final String subnetId;

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public VirtualNetworkRuleResponse(
        String id,
        String name,
        String subnetId,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VirtualNetworkRuleResponse() {
        this.id = null;
        this.name = null;
        this.subnetId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String subnetId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.subnetId = defaults.subnetId;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public VirtualNetworkRuleResponse build() {
            return new VirtualNetworkRuleResponse(id, name, subnetId, type);
        }
    }
}
