// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.awsnative.lightsail.enums.InstanceAddOnStatus;
import io.pulumi.awsnative.lightsail.inputs.InstanceAutoSnapshotAddOnArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A addon associate with a resource.
 * 
 */
public final class InstanceAddOnArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAddOnArgs Empty = new InstanceAddOnArgs();

    /**
     * The add-on type
     * 
     */
    @Import(name="addOnType", required=true)
      private final Output<String> addOnType;

    public Output<String> getAddOnType() {
        return this.addOnType;
    }

    @Import(name="autoSnapshotAddOnRequest")
      private final @Nullable Output<InstanceAutoSnapshotAddOnArgs> autoSnapshotAddOnRequest;

    public Output<InstanceAutoSnapshotAddOnArgs> getAutoSnapshotAddOnRequest() {
        return this.autoSnapshotAddOnRequest == null ? Codegen.empty() : this.autoSnapshotAddOnRequest;
    }

    /**
     * Status of the Addon
     * 
     */
    @Import(name="status")
      private final @Nullable Output<InstanceAddOnStatus> status;

    public Output<InstanceAddOnStatus> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public InstanceAddOnArgs(
        Output<String> addOnType,
        @Nullable Output<InstanceAutoSnapshotAddOnArgs> autoSnapshotAddOnRequest,
        @Nullable Output<InstanceAddOnStatus> status) {
        this.addOnType = Objects.requireNonNull(addOnType, "expected parameter 'addOnType' to be non-null");
        this.autoSnapshotAddOnRequest = autoSnapshotAddOnRequest;
        this.status = status;
    }

    private InstanceAddOnArgs() {
        this.addOnType = Codegen.empty();
        this.autoSnapshotAddOnRequest = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAddOnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> addOnType;
        private @Nullable Output<InstanceAutoSnapshotAddOnArgs> autoSnapshotAddOnRequest;
        private @Nullable Output<InstanceAddOnStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAddOnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addOnType = defaults.addOnType;
    	      this.autoSnapshotAddOnRequest = defaults.autoSnapshotAddOnRequest;
    	      this.status = defaults.status;
        }

        public Builder addOnType(Output<String> addOnType) {
            this.addOnType = Objects.requireNonNull(addOnType);
            return this;
        }
        public Builder addOnType(String addOnType) {
            this.addOnType = Output.of(Objects.requireNonNull(addOnType));
            return this;
        }
        public Builder autoSnapshotAddOnRequest(@Nullable Output<InstanceAutoSnapshotAddOnArgs> autoSnapshotAddOnRequest) {
            this.autoSnapshotAddOnRequest = autoSnapshotAddOnRequest;
            return this;
        }
        public Builder autoSnapshotAddOnRequest(@Nullable InstanceAutoSnapshotAddOnArgs autoSnapshotAddOnRequest) {
            this.autoSnapshotAddOnRequest = Codegen.ofNullable(autoSnapshotAddOnRequest);
            return this;
        }
        public Builder status(@Nullable Output<InstanceAddOnStatus> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable InstanceAddOnStatus status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public InstanceAddOnArgs build() {
            return new InstanceAddOnArgs(addOnType, autoSnapshotAddOnRequest, status);
        }
    }
}
