// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubnetGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSubnetGroupArgs Empty = new GetSubnetGroupArgs();

    /**
     * The name of the subnet group. This value must be unique as it also serves as the subnet group identifier.
     * 
     */
    @Import(name="subnetGroupName", required=true)
      private final String subnetGroupName;

    public String getSubnetGroupName() {
        return this.subnetGroupName;
    }

    public GetSubnetGroupArgs(String subnetGroupName) {
        this.subnetGroupName = Objects.requireNonNull(subnetGroupName, "expected parameter 'subnetGroupName' to be non-null");
    }

    private GetSubnetGroupArgs() {
        this.subnetGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subnetGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetGroupName = defaults.subnetGroupName;
        }

        public Builder subnetGroupName(String subnetGroupName) {
            this.subnetGroupName = Objects.requireNonNull(subnetGroupName);
            return this;
        }        public GetSubnetGroupArgs build() {
            return new GetSubnetGroupArgs(subnetGroupName);
        }
    }
}
