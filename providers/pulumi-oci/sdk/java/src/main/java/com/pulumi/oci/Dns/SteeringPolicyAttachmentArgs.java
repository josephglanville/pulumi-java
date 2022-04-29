// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Dns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SteeringPolicyAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final SteeringPolicyAttachmentArgs Empty = new SteeringPolicyAttachmentArgs();

    /**
     * (Updatable) A user-friendly name for the steering policy attachment. Does not have to be unique and can be changed. Avoid entering confidential information.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name for the steering policy attachment. Does not have to be unique and can be changed. Avoid entering confidential information.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The attached domain within the attached zone. `domain_name` is case insensitive.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return The attached domain within the attached zone. `domain_name` is case insensitive.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * The OCID of the attached steering policy.
     * 
     */
    @Import(name="steeringPolicyId", required=true)
    private Output<String> steeringPolicyId;

    /**
     * @return The OCID of the attached steering policy.
     * 
     */
    public Output<String> steeringPolicyId() {
        return this.steeringPolicyId;
    }

    /**
     * The OCID of the attached zone.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The OCID of the attached zone.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private SteeringPolicyAttachmentArgs() {}

    private SteeringPolicyAttachmentArgs(SteeringPolicyAttachmentArgs $) {
        this.displayName = $.displayName;
        this.domainName = $.domainName;
        this.steeringPolicyId = $.steeringPolicyId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SteeringPolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SteeringPolicyAttachmentArgs $;

        public Builder() {
            $ = new SteeringPolicyAttachmentArgs();
        }

        public Builder(SteeringPolicyAttachmentArgs defaults) {
            $ = new SteeringPolicyAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName (Updatable) A user-friendly name for the steering policy attachment. Does not have to be unique and can be changed. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-friendly name for the steering policy attachment. Does not have to be unique and can be changed. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param domainName The attached domain within the attached zone. `domain_name` is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The attached domain within the attached zone. `domain_name` is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param steeringPolicyId The OCID of the attached steering policy.
         * 
         * @return builder
         * 
         */
        public Builder steeringPolicyId(Output<String> steeringPolicyId) {
            $.steeringPolicyId = steeringPolicyId;
            return this;
        }

        /**
         * @param steeringPolicyId The OCID of the attached steering policy.
         * 
         * @return builder
         * 
         */
        public Builder steeringPolicyId(String steeringPolicyId) {
            return steeringPolicyId(Output.of(steeringPolicyId));
        }

        /**
         * @param zoneId The OCID of the attached zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The OCID of the attached zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public SteeringPolicyAttachmentArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.steeringPolicyId = Objects.requireNonNull($.steeringPolicyId, "expected parameter 'steeringPolicyId' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
