// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePoolInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstancePoolInstanceArgs Empty = new InstancePoolInstanceArgs();

    @Import(name="autoTerminateInstanceOnDelete")
    private @Nullable Output<Boolean> autoTerminateInstanceOnDelete;

    public Optional<Output<Boolean>> autoTerminateInstanceOnDelete() {
        return Optional.ofNullable(this.autoTerminateInstanceOnDelete);
    }

    @Import(name="decrementSizeOnDelete")
    private @Nullable Output<Boolean> decrementSizeOnDelete;

    public Optional<Output<Boolean>> decrementSizeOnDelete() {
        return Optional.ofNullable(this.decrementSizeOnDelete);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool.
     * 
     */
    @Import(name="instancePoolId", required=true)
    private Output<String> instancePoolId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool.
     * 
     */
    public Output<String> instancePoolId() {
        return this.instancePoolId;
    }

    private InstancePoolInstanceArgs() {}

    private InstancePoolInstanceArgs(InstancePoolInstanceArgs $) {
        this.autoTerminateInstanceOnDelete = $.autoTerminateInstanceOnDelete;
        this.decrementSizeOnDelete = $.decrementSizeOnDelete;
        this.instanceId = $.instanceId;
        this.instancePoolId = $.instancePoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePoolInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePoolInstanceArgs $;

        public Builder() {
            $ = new InstancePoolInstanceArgs();
        }

        public Builder(InstancePoolInstanceArgs defaults) {
            $ = new InstancePoolInstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoTerminateInstanceOnDelete(@Nullable Output<Boolean> autoTerminateInstanceOnDelete) {
            $.autoTerminateInstanceOnDelete = autoTerminateInstanceOnDelete;
            return this;
        }

        public Builder autoTerminateInstanceOnDelete(Boolean autoTerminateInstanceOnDelete) {
            return autoTerminateInstanceOnDelete(Output.of(autoTerminateInstanceOnDelete));
        }

        public Builder decrementSizeOnDelete(@Nullable Output<Boolean> decrementSizeOnDelete) {
            $.decrementSizeOnDelete = decrementSizeOnDelete;
            return this;
        }

        public Builder decrementSizeOnDelete(Boolean decrementSizeOnDelete) {
            return decrementSizeOnDelete(Output.of(decrementSizeOnDelete));
        }

        /**
         * @param instanceId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param instancePoolId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder instancePoolId(Output<String> instancePoolId) {
            $.instancePoolId = instancePoolId;
            return this;
        }

        /**
         * @param instancePoolId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance pool.
         * 
         * @return builder
         * 
         */
        public Builder instancePoolId(String instancePoolId) {
            return instancePoolId(Output.of(instancePoolId));
        }

        public InstancePoolInstanceArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.instancePoolId = Objects.requireNonNull($.instancePoolId, "expected parameter 'instancePoolId' to be non-null");
            return $;
        }
    }

}
