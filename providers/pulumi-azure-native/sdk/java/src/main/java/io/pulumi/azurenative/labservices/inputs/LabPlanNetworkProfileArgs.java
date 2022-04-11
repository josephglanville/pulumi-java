// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Profile for how to handle networking for Lab Plans.
 * 
 */
public final class LabPlanNetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabPlanNetworkProfileArgs Empty = new LabPlanNetworkProfileArgs();

    /**
     * The external subnet resource id
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    public LabPlanNetworkProfileArgs(@Nullable Output<String> subnetId) {
        this.subnetId = subnetId;
    }

    private LabPlanNetworkProfileArgs() {
        this.subnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabPlanNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(LabPlanNetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }        public LabPlanNetworkProfileArgs build() {
            return new LabPlanNetworkProfileArgs(subnetId);
        }
    }
}
